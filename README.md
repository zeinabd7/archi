# archi


Contenu du htaccess

RewriteEngine On
RewriteRule ^readArticles$ readArticles.php [NC,L]
RewriteRule ^readArticles/([0-9_-]*)$ readArticles.php?id=$1 [NC,L]
RewriteRule ^readArticlesByCategory$ readArticlesByCategory.php [NC,L]
RewriteRule ^readArticlesByCategory/([0-9_-]*)$ readArticlesByCategory.php?id=$1 [NC,L]
RewriteRule ^readCategoryName$ readCategoryName.php [NC,L]
RewriteRule ^readCategoryName/([0-9_-]*)$ readCategoryName.php?id=$1 [NC,L]
RewriteRule ^readCategoryList$ readCategoryList.php [NC,L]
RewriteRule ^readCategoryList/([0-9_-]*)$ readCategoryList.php?id=$1 [NC,L]
