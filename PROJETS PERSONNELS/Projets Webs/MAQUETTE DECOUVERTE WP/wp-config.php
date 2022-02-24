<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'dbwp' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '`G`{Fg)D!C)X{LZdW&sRg;5(kEnc_d Rp4A5qp|6mVz=s&z%:((a}OYjLD`z#M]B' );
define( 'SECURE_AUTH_KEY',  '2sSa{k:aC=N+3gk`FE8Y`PL9h`5^9`N)+vp`v?dsz]pP qqZ;T<A:pKPm07Ho }b' );
define( 'LOGGED_IN_KEY',    'hptXFW7~X.TOVj<yKv3y2cCZ@U2gR@i&&Hi6.^T@.E^IO0[1HwN}^[>Cd!N;}0cb' );
define( 'NONCE_KEY',        '@0^ZM;PZ-L}8PiT?V,O}l:CiB4>1Gre5tYWJ1Vnnzxva<]mh>3f_!j-@&u$PcBVl' );
define( 'AUTH_SALT',        'z6k Q,J&Km3K[OVy[.b g_p_F/N`NH5FMq?Hn5)&C/d-D#oSHtZ{s [Dv|Qj97pp' );
define( 'SECURE_AUTH_SALT', '9XN-^@^ 3]~0:|8_<$X/9zcnb0@J]UxNF*(NSS73|Sh,McLpK]dym?ct6:..3<J!' );
define( 'LOGGED_IN_SALT',   'W:NX}oLP1&+4JQm7WSQ<1K21/p_^m5Fi91qasN0i|:R$S@loHVE..Nq{&EBy0iY$' );
define( 'NONCE_SALT',       'zrBj;K?nqJVVf<1pwxFnhp(9*Zt<qlZmJoX:g81RJIBexqVO;37zUs]SYC}SKi:8' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
