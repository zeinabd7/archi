# archi

Contenu du htaccess

RewriteEngine on
RewriteCond %{REQUEST_FILENAME}.php -f
RewriteRule ^(.*)$ $1.php [L]

RewriteEngine On
RewriteRule ^news/([^(.*)$]+) index.php?option=$1
RewriteRule ^manage/([^(.*)$]+) admin.php?option=$1
