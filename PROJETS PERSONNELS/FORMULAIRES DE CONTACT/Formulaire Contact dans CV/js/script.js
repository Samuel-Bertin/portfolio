$(function(){

    $(".navbar a, footer a").on("click", function(event){

        event.preventDefault();
        var hash = this.hash;

        $("body, html").animate({scrollTop: $(hash).offset().top},900, function(){
            window.location.hash = hash ;
        })

    });


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


})