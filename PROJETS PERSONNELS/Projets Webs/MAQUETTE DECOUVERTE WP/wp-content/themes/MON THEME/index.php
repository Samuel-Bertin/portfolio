<?php get_header(); ?>
    <div class="row">
        <?php if(have_posts()): ?>
            <?php while(have_posts()): the_post();?>

            <div class="col-sm-6">
            
                <div class="card" style="">
                    <?php the_post_thumbnail('card-header', ['class'=>'card-img-top', 'alt' => '', 'style'=>"height:auto;"]);?>
                    <div class="card-body">
                        <h5 class="card-title"><?php the_title();?></h5>
                        <h6 class="card-subtitle mb-2"><?php the_category();?></h6>
                        <?php 
                        the_terms( get_the_ID(), 'sport' )
                        ?>
                        <p class="card-text"><?php the_excerpt();?></p>
                        <a href="<?php the_permalink( );?>" class="btn btn-primary">Voir Plus</a>
                    </div>
                </div>
            
            </div>
                
            <?php endwhile ?>
    </div>

    <div class="paginatio">
    
        <?php monTheme_pagination();?>
    
    </div>

    <?php else: ?>
        <h1>Pas d'articles</h1>
    <?php endif; ?>
    
<?php get_footer();?>