let homeCard = document.querySelector('.main__section');
let homeLink = document.querySelector('.home-nav');

homeLink.addEventListener('click', () => {
    if (homeCard.style.display === 'none') {
        homeCard.style.display = 'block';
        snackCard.style.display = 'none';
        menuCard.style.display = 'none';
        contactCard.style.display = 'none';
    } else {
        
    }
});



let snackCard = document.querySelector('.about__section');
let snackLink = document.querySelector('.snack-nav');

snackLink.addEventListener('click', () => {
    if (snackCard.style.display === 'none') {
        snackCard.style.display = 'block';
        homeCard.style.display = 'none';
        menuCard.style.display = 'none';
        contactCard.style.display = 'none';
    } else {
        snackCard.style.display = 'none';
    }
});


let menuCard = document.querySelector('.menu__section');
let menuLink = document.querySelector('.menu-nav');

menuLink.addEventListener('click', () => {
    if (menuCard.style.display === 'none') {
        menuCard.style.display = 'block';
        homeCard.style.display = 'none';
        snackCard.style.display = 'none';
        contactCard.style.display = 'none';
    } else {
        menuCard.style.display = 'none';
    }
});


let contactCard = document.querySelector('.contact__section');
let contactLink = document.querySelector('.contact-nav');

contactLink.addEventListener('click', () => {
    if (contactCard.style.display === 'none') {
        contactCard.style.display = 'block';
        homeCard.style.display = 'none';
        menuCard.style.display = 'none';
        snackCard.style.display = 'none';
    } else {
        contactCard.style.display = 'none';
    }
});

$(function () {

    $('#contact-form').submit(function(e){

        e.preventDefault();
        $('.comments').empty();
        var postdata = $('#contact-form').serialize();

        $.ajax({

            type: 'POST',
            url: 'php/contact.php',
            data: postdata,
            dataType: 'json',
            success: function(result) {

                if (result.isSuccess) {

                    $('#contact-form').append('<p class="thank-you">Votre message à bien été envoyé. Merci de nous avoir contacté.</p>');
                    $('#contact-form')[0].reset();

                } else {

                    $('#name + .comments').html(result.nameError);
                    $('#surname + .comments').html(result.surnameError);
                    $('#email + .comments').html(result.emailError);
                    $('.phone-check').html(result.phoneError);
                    $('#message + .comments').html(result.messageError);

                };

            },

        });

    });

});

