<?php 



function monTheme_support () {
    add_theme_support( 'title-tag');
    add_theme_support( 'post-thumbnails' );
    add_theme_support( 'menus');
    register_nav_menu('header', 'En-tête du menu');
    register_nav_menu('footer', 'Pied de page');
    add_image_size('card-header', 350, 215, true);
}

function monTheme_register_assets () {
    wp_register_style( 'bootstrap', 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css');
    wp_register_script( 'bootstrap', 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js', ['popper','jquery'], false, true);
    wp_register_script( 'popper', 'https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js', [], false, true);
    wp_deregister_script( 'jquery' );
    wp_register_script( 'jquery', 'https://code.jquery.com/jquery-3.5.1.slim.min.js', [], false, true);
    wp_enqueue_style('bootstrap');
    wp_enqueue_script('bootstrap');
}

function monTheme_title_separator () {
    return '|';
}

function monTheme_menu_class ($classes) {
    $classes[] = 'nav-item';
    return $classes;
}

function monTheme_menu_link_attrributes($attrs) {
    $attrs['class'] = 'nav-link';
    return $attrs;
}

function monTheme_pagination () {

    $pages = paginate_links(['type'=>'array']);
    if($pages === NULL) {
        return;
    }
    echo '<nav aria-label="Pagination" class="my-4">';
    echo '<ul class="pagination">';
        
        foreach($pages as $page) {
            $active = strpos($page, 'current') !==false;
            $class = 'page-item';
            if($active) {
                $class .= ' active';
            }
            echo '<li class="'. $class .'">';
            echo str_replace('page-numbers', 'page-link', $page);
            echo '</li>';
        }
    echo '</ul>';
    echo '</nav>';

}

function monTheme_add_custom_box () {
    add_meta_box('monthemesponso', 'Sponsoring', 'monTheme_render_sponso_box','post', 'side');
}

function monTheme_render_sponso_box () {
    ?>
        <input type="hidden" value="0" name="monthemesponso">
        <input type="checkbox" value="1" name="monthemesponso">
        <label for="monthemesponso">Cet article est sponsorisé ?</label>
    <?php
}

function monTheme_save_sponso ($post_id) {
    if (array_key_exists('monthemesponso', $_POST)) {
        
        if ($_POST['monthemesponso'] === '0') {
            delete_post_meta($post_id, 'monthemesponso');
        } else {
            update_post_meta($post_id, 'monthemesponso', 1);
        }
    }
}


add_action('after_setup_theme', 'monTheme_support');
add_action('wp_enqueue_scripts', 'monTheme_register_assets');
add_filter('document_title_separator', 'monTheme_title_separator');
add_filter('nav_menu_css_class', 'monTheme_menu_class');
add_filter('nav_menu_link_attributes', 'monTheme_menu_link_attrributes');
add_action('add_meta_boxes', 'monTheme_add_custom_box');
add_action('save_post','monTheme_save_sponso');     


?>