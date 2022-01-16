//CHARGEMENT FONCTION OUVERTURE FENETRE//

window.onload = () => {
    //VARIABLES//

    const canvasWidth = 900;
    const canvasHeight = 600;
    const blockSize = 30;
    const widthInBlocks = canvasWidth / blockSize;
    const heightInBlocks = canvasHeight / blockSize;
    const centerX = canvasWidth / 2;
    const centerY = canvasHeight / 2;

    let ctx;
    let canvas;
    let delay = 100;

    let snake;
    let apple;
    let score;
    let timeout;



    //CREATION FONCTION INITIALE//
    const init = () => {

        //CREATION CANVAS//
        canvas = document.createElement('canvas');

        //DEFINITION CANVAS//
        canvas.height = canvasHeight;
        canvas.width = canvasWidth;
        canvas.style.border = "20px solid #9A947C";
        canvas.style.display = "block";
        canvas.style.margin = "0 auto";
        canvas.style.backgroundColor = "#3D3A3E";


        //ATTACHEMENT DU CANVAS//
        document.body.appendChild(canvas);

        //CREATION DU CONTEXTE//
        ctx = canvas.getContext('2d');

        launch();

    }

    //CREATION FONCTION REFRESH//
    const refreshCanvas = () => {
        //FAIRE AVANCER LE SNAKE//

        snake.advance();
        score += 5;

        //CONDITION DE DEFAITE//
        if (snake.checkCollision()) {

            //GAME OVER//
            gameOver();
        }
        else {

            //SI LE SERPENT MANGE LA POMME //
            if (snake.objective(apple)) {

                score += 100;
                snake.ateApple = true;

                do {
                    //REPLACER LA POMME//
                    apple.setNewApple();
                }
                while (apple.isOnSnake(snake));


            }

            //INITIALISATION CANVAS//
            ctx.clearRect(0, 0, canvasWidth, canvasHeight);


            //DESSIN DU SCORE//
            drawScore();

            //DESSIN DU SERPENT// he
            snake.draw();

            //DESSIN APPLE//
            apple.draw();


            //APPLICATION DU DELAY//
            timeout = setTimeout(refreshCanvas, delay);
        }
    }

    //FONCTION GAMER OVER //
    const gameOver = () => {
        //ECRIRE A L'ECRAN//

        ctx.save();

        ctx.font = "bold 4em sans-serif";
        ctx.fillStyle = "#EAEADD";
        ctx.textAlign = "center";
        ctx.textBaseLine = "middle";



        ctx.fillText("GAME OVER", centerX, centerY);

        ctx.font = "bold 2em sans-serif";
        ctx.fillText("PRESS SPACEBAR TO CONTINUE", centerX, centerY - (centerY / 2));

        ctx.restore();
    }

    //FONCTION RESTART//
    const launch = () => {
        //SERPENT INITIAL//

        snake = new snakeDraw([[6, 4], [5, 4], [4, 4]], "right");

        //POMME INITIALE //
        apple = new AppleDraw([10, 10]);
        score = 0;
        clearTimeout(timeout);
        refreshCanvas();
    }

    //FONCTION AFFICHAGE DU SCORE//
    const drawScore = ()  => {

        ctx.save();

        ctx.font = "bold 2em sans-serif";
        ctx.fillStyle = "#EAEADD";

        ctx.fillText(`Score: ${score.toString()}`, 5, canvasHeight - 5);

        ctx.restore();

    }

    //CREATION DE LA FONCTION DRAW BLOCK//
    const drawBlock = (ctx, position) => {

        const x = position[0] * blockSize;
        const y = position[1] * blockSize;

        ctx.fillRect(x, y, blockSize, blockSize);

    }

    //PROPRIETES DU SERPENT//
    function snakeDraw(body, direction) {
        //ARGUMENTS//

        this.body = body;
        this.direction = direction;

        //INITIALISATION//
        this.ateApple = true;

        //METHODE DESSIN//
        this.draw = function () {

            //SAVE CONTEXT//
            ctx.save();

            //COULEUR DU DRAW//
            ctx.fillStyle = "#ffff00";

            //INITIALISATION BOUCLE//
            for (let i = 0; i < this.body.length; i++) {

                //DESSIN DE BLOC SELON BOUCLE//
                drawBlock(ctx, this.body[i]);
            }
            //RESTRORE SAVED CONTEXT//
            ctx.restore();
        };

        //METHODE AVANCER//
        this.advance = function () {
            //CREER NOUVELLE POSITION DE LA TETE//*

            const nextPosition = this.body[0].slice();

            //DIRECTIONS POSSIBLES//
            switch (this.direction) {
                case "left":
                    nextPosition[0] -= 1;
                    break;
                case "right":
                    nextPosition[0] += 1;
                    break;
                case "up":
                    nextPosition[1] -= 1;
                    break;
                case "down":
                    nextPosition[1] += 1;
                    break;
                default:
                    throw ("Invalid Direction");
            }

            this.body.unshift(nextPosition);

            //SUPPRIMER DERNIERE POSITION SERPENT//
            if (!this.ateApple) {
                this.body.pop();
            }

            else {
                this.ateApple = false;
            }

        };

        //RESTRICTIONS DES DIRECTIONS//
        this.setDirection = function (newDirection) {

            let allowedDirections;

            switch (this.direction) {
                case "left":
                case "right":
                    allowedDirections = ["up", "down"];
                    break;
                case "up":
                case "down":
                    allowedDirections = ["left", "right"];
                    break;
                default:
                    throw ("Invalid Direction");
            }

            if (allowedDirections.indexOf(newDirection) > -1) {

                this.direction = newDirection;
            }
        };

        //RESTRICTION DES COLISIONS//
        this.checkCollision = function () {
            //INITIALISATION DES constIABLES//

            let wallCollision = false;
            let snakeCollision = false;
            const head = this.body[0];
            const rest = this.body.slice(1);
            const snakeX = head[0];
            const snakeY = head[1];
            const minX = 0;
            const minY = 0;
            const maxX = widthInBlocks - 1;
            const maxY = heightInBlocks - 1;
            const horizontalCol = snakeX < minX || snakeX > maxX;
            const verticalCol = snakeY < minY || snakeY > maxY;

            // COLLISION AVEC UN MUR//
            if (horizontalCol || verticalCol) {
                wallCollision = true;
            }

            //COLLISION AVEC LE CORPS DU SERPENT//
            for (let i = 0; i < rest.length; i++) {
                if (snakeX === rest[i][0] && snakeY === rest[i][1]) {
                    snakeCollision = true;
                }
            }

            return wallCollision || snakeCollision;
        };

        //COLLISION AVEC LA POMME//
        this.objective = function (applePosition) {

            const headPosition = this.body[0];
            if (headPosition[0] === applePosition.position[0] && headPosition[1] === applePosition.position[1]) {
                return true;
            }

            else {
                return false;
            };
        };

        //LE SERPENT GRANDIT QUAND IL MANGE//
    }

    // PROPRIETES DE LA POMME //
    function AppleDraw(position) {
        //ARGUMENTS//

        this.position = position;

        //METHODE DRAW//
        this.draw = function () {

            const radius = blockSize / 2;
            const x = this.position[0] * blockSize + radius;
            const y = this.position[1] * blockSize + radius;

            //SAVE CONTEXT//
            ctx.save();

            //COULEUR DU DRAW//
            ctx.fillStyle = "#33cc33";

            //CREATION D'UNE SPHERE POUR LA POMME//
            ctx.beginPath();

            ctx.arc(x, y, radius, 0, Math.PI * 2, true);
            ctx.fill();

            //RESTORE CONTEXT//
            ctx.restore();
        };

        //METHODE CREER NOUVELLE POMME//
        this.setNewApple = function () {
            const newX = Math.round(Math.random() * (widthInBlocks - 1));
            const newY = Math.round(Math.random() * (heightInBlocks - 1));
            this.position = [newX, newY];
        };

        //SI JAMAIS LA POMME EST CREE SUR LE SERPENT//
        this.isOnSnake = function (snakeToCheck) {
            let isOnSnake = false;

            for (let i = 0; i < snakeToCheck.body.length; i++) {
                if (this.position[0] === snakeToCheck.body[i][0] && this.position[1] === snakeToCheck.body[i][1]) {
                    isOnSnake = true;
                }
            }

            return isOnSnake;
        };
    }

    //RECUPERATION DES EVENEMENTS //
    document.onkeydown = (e) => {

        const key = e.keyCode;
        let newDirection;
        switch (key) {
            case 37:
                newDirection = "left";
                break;
            case 38:
                newDirection = "up";
                break;
            case 39:
                newDirection = "right";
                break;
            case 40:
                newDirection = "down";
                break;
            case 32:
                launch();
                return;
            default:
                return;
        }

        snake.setDirection(newDirection);

    };

    //APPEL FONCTION INIT//

    init();

}