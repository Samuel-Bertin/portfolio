$(document).ready(function() {


    const joinButton = document.querySelector('.hero-button');
    const formContainer = document.querySelector('.main-container');
    const closeformButton = document.querySelector('.closeform');

    joinButton.addEventListener("click", function (e) {

        e.preventDefault();
        formContainer.style.transform = "translateX(-330px)";
    })

    closeformButton.addEventListener("click", function (e) {
        e.preventDefault();
        formContainer.style.transform = "translateX(0)";
    })

   
    const SlidePage = document.querySelector('.slide-page');
    const firstNextBtn = document.querySelector('.first-next');
    const secPrevBtn = document.querySelector('.prev-1');
    const secNextBtn = document.querySelector('.next-1');
    const thirdPrevBtn = document.querySelector('.prev-2');
    const thirdNextBtn = document.querySelector('.next-2');
    const fourthPrevBtn = document.querySelector('.prev-3');
    const progressText = document.querySelectorAll('.step p');
    const progressCheck = document.querySelectorAll('.step .check');
    const progressBullet = document.querySelectorAll('.step .bullet');
    let max = 4;
    let current = 1; 

    function slideNext (button, value) {
        button.addEventListener("click", function (e) {
            e.preventDefault();
            SlidePage.style.marginLeft = value;
            progressBullet[current - 1 ].classList.add('active');
            progressText[current - 1 ].classList.add('active');
            progressCheck[current - 1 ].classList.add('active');
            current += 1;
        })
    }

    function slidePrev (button, value) {
        button.addEventListener("click", function (e) {
            e.preventDefault();
            SlidePage.style.marginLeft = value;
            progressBullet[current - 2 ].classList.remove('active');
            progressText[current - 2 ].classList.remove('active');
            progressCheck[current - 2 ].classList.remove('active');
            current -= 1;
        })
    }

    slideNext(firstNextBtn, "-25%");
    slideNext(secNextBtn, "-50%");
    slideNext(thirdNextBtn, "-75%");

    slidePrev(secPrevBtn, "0%");
    slidePrev(thirdPrevBtn, "-25%");
    slidePrev(fourthPrevBtn, "-50%");


    $('#contact-form').submit(function(e){

        e.preventDefault();
        $('.comments').empty();
        progressBullet[current - 1 ].classList.add('active');
        progressText[current - 1 ].classList.add('active');
        progressCheck[current - 1 ].classList.add('active');
        current += 1;
        console.log("bonjour");
        //$(this).unbind('submit').submit();
        
        var postdata = $('#contact-form').serialize();

        const genderInput = document.getElementsByName('gender');
        const firstNameInput = document.getElementById('firstname');
        const lastNameInput = document.getElementById('lastname');
        const emailInput = document.getElementById('email');
        const phoneInput = document.getElementById('phone');
        const countryInput = document.getElementById('country');
        const jobInput = document.getElementById('job');
        const heardaboutInput = document.getElementById('heardabout');
        const othercommentInput = document.getElementById('other-comment');
        // const checkboxInput = document.getElementById('checkbox');

        //const genderCheck = document.querySelector("div.gender-field i.success");
        //const genderTimes = document.querySelector("div.gender-field i.error");

        const firstnameCheck = document.querySelector("div.firstname-field i.success");
        const firstnameTimes = document.querySelector("div.firstname-field i.error");

        const lastnameCheck = document.querySelector("div.lastname-field i.success");
        const lastnameTimes = document.querySelector("div.lastname-field i.error");

        const emailCheck = document.querySelector("div.email-field i.success");
        const emailTimes = document.querySelector("div.email-field i.error");

        const phoneCheck = document.querySelector("div.phone-field i.success");
        const phoneTimes = document.querySelector("div.phone-field i.error");

        const countryCheck = document.querySelector("div.country-field i.success");
        const countryTimes = document.querySelector("div.country-field i.error");

        const jobCheck = document.querySelector("div.job-field i.success");
        const jobTimes = document.querySelector("div.job-field i.error");

        const haCheck = document.querySelector("div.ha-field i.success");
        const haTimes = document.querySelector("div.ha-field i.error");

        const ocCheck = document.querySelector("div.oc-field i.success");
        const ocTimes = document.querySelector("div.oc-field i.error");

        //const checkboxCheck = document.querySelector("div.checkbox-field i.success");
        //const checkboxTimes = document.querySelector("div.checkbox-field i.error");

        $.ajax({

            type: 'POST',
            url: 'php/signup.php',
            data: postdata,
            dataType: 'json',
            success: function (result) { 

                if (result.isSuccess) {

                    console.log('success');
                    $('.form-container').append('<p class="thank-you">Well Done !</p>');

                    setTimeout(() => {
                          console.log("World!");
                          $('#contact-form')[0].reset();
                          formContainer.style.transform = "translateX(0)";
                     }, 1000);

                    

                } else {

                    console.log('error');

                    SlidePage.style.marginLeft = "0%";
                    progressBullet[0].classList.remove('active');
                    progressText[0].classList.remove('active');
                    progressCheck[0].classList.remove('active');
                    progressBullet[1].classList.remove('active');
                    progressText[1].classList.remove('active');
                    progressCheck[1].classList.remove('active');
                    progressBullet[2].classList.remove('active');
                    progressText[2].classList.remove('active');
                    progressCheck[2].classList.remove('active');
                    progressBullet[3].classList.remove('active');
                    progressText[3].classList.remove('active');
                    progressCheck[3].classList.remove('active');
                    current = 1;
        
                    
                    function errorFunction (erreur, input, check, times) {
                        if (erreur === '') {
                            input.style.borderColor = "#39cc26";
                            check.style.display = "block";
                            times.style.display = "none";
                        } else {
                            input.style.borderColor = "#cc3126";
                            times.style.display = "block";
                            check.style.display = "none";
                        }
                    }

                    //errorFunction(result.genderError, genderInput,genderCheck, genderTimes);
                    errorFunction(result.firstnameError,firstNameInput, firstnameCheck, firstnameTimes);
                    errorFunction(result.lastnameError,lastNameInput,lastnameCheck,lastnameTimes);
                    errorFunction(result.emailError,emailInput,emailCheck,emailTimes);
                    errorFunction(result.phoneError,phoneInput,phoneCheck,phoneTimes);
                    errorFunction(result.countryError,countryInput,countryCheck,countryTimes);
                    errorFunction(result.jobError, jobInput,jobCheck, jobTimes);
                    errorFunction(result.heardaboutError, heardaboutInput, haCheck, haTimes);
                    
                    

                    //$('.gender-error').html(result.genderError);
                    $('#firstname + .comments').html(result.firstnameError);
                    $('#lastname + .comments').html(result.lastnameError);
                    $('#email + .comments').html(result.emailError);
                    $('.phone-check').html(result.phoneError);
                    $('#country + .comments').html(result.countryError);
                    $('#job + .comments').html(result.jobError);
                    $('#heardabout + .comments').html(result.heardaboutError);
                    

                };

            }
            

        });

        console.log('hello');

    });

});


