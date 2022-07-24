<?php
require_once 'inc/backend.inc.php';

$option = Inputvalidator::sanitize($_GET['option']);

if ($option == 'users') {

    if (!$_SESSION['login'] || $_SESSION['role'] != 'admin') {
        header("Location: " . URL . "/connexion");
    }
    UserController::showUserManager($clientSOAP);

} else if (!$option || $option == 'articles') {

    if (!$_SESSION['login'] && ($_SESSION['role'] != 'admin' || $_SESSION['role'] != 'editeur')) {
        header("Location: " . URL . "/connexion");
    }
    ArticleController::showArticleManager($restURI);

} else if ($option == 'categories') {

    if (!$_SESSION['login'] && ($_SESSION['role'] != 'admin' || $_SESSION['role'] != 'editeur')) {
        header("Location: " . URL . "/connexion");
    }
    CategoryController::showCategoryManager($restURI);

} elseif ($option == 'logout') {

    UserController::logout();
    header("Location: " . URL . "/connexion");

} else {
    header("Location: " . URL . "/manage/articles");
}
