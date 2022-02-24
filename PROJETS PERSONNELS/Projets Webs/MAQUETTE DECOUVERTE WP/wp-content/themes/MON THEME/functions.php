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

function monTheme_init () {
    register_taxonomy( 'sport', 'post', [
        'labels' => [
            'name' => 'Sport',
            'singular_name' => 'Sport',
            'plural_name' => 'Sports',
            'search_items' => 'Rechercher des sports',
            'all_items' => 'Tous les sports',
            'edit_item' => 'Modifier le sport',
            'update_item' => 'Mettre à jour le sport',
            'add_new_item' => 'Ajouter un sport',
            'new_item_name' => 'Ajouter un sport',
            'menu_name' => 'Sport'

        ],
        'show_in_rest' => true,
        'hierarchical' => true,
        'show_admin_column' => true,
    ] );
}


add_action('init', 'monTheme_init');
add_action('after_setup_theme', 'monTheme_support');
add_action('wp_enqueue_scripts', 'monTheme_register_assets');
add_filter('document_title_separator', 'monTheme_title_separator');
add_filter('nav_menu_css_class', 'monTheme_menu_class');
add_filter('nav_menu_link_attributes', 'monTheme_menu_link_attrributes');
 
require_once('metaboxes/sponso.php');
SponsoMetaBox::register();

?>