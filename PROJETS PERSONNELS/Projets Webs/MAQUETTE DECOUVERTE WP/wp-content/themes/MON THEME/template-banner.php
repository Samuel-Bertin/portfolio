<?php 
/**
 * Template Name: Page avec bannière;
 * Template Post Type: page, post;
 */

<?php get_header(); ?>

    <div class="container">

        <?php if (have_posts()): while(have_posts()): the_post();?>


            <p>Ici une bannièrere.</p>
            <h1><?php the_title();?></h1>
            <p>

                <img src="<?php the_post_thumbnail_url();?>" alt="" style="width:1fr, height: auto;">

            </p>
            <?php the_content(); ?>

        
        <?php endwhile ?>
        <?php endif; ?>

    </div>

<?php get_footer(); ?>

?>