<?php
require 'inc/backend.inc.php';

$option = InputValidator::sanitize($_GET['option']);

if (!isset($option) || $option == "all" || $option == "" || (!str_starts_with($option, 'article/') && !is_numeric($option))) {
    ArticleController::showArticles($restURI);
} else {
    if (is_numeric($option)) {
        ArticleController::showArticlesByCategory($option, $restURI);
    } else {
        ArticleController::showOneArticle(explode("article/", $option)[1], $restURI);
    }
}
