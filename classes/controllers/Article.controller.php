<?php
class ArticleController
{
    public static function showSidebar($uri)
    {
        $categories = CategoryModel::getCategories($uri);
        require_once "views/layout/sidebar.view.php";
    }

    public static function showArticles($uri)
    {
        Self::showSidebar($uri);
        $articles = ArticleModel::getArticles($uri);
        require_once "views/articles/article.view.php";
    }

    public static function showArticlesByCategory(int $id, $uri)
    {
        Self::showSidebar($uri);
        $articles = ArticleModel::getArticlesByCategory($id, $uri);
        $categorieName = ArticleModel::getArticleCategoryName($id, $uri);
        $noArticle = false;
        if (!$articles) {
            $noArticle = true;
        }
        require_once "views/articles/article.view.php";
    }

    public static function showOneArticle(int $id, $uri)
    {
        Self::showSidebar($uri);
        $oneArticle = ArticleModel::getOneArticle($id, $uri);
        require_once "views/articles/onearticle.view.php";
    }

    public static function showArticleManager($restURI)
    {
        $data_article = ArticleModel::getArticles($restURI);
        $data_category = CategoryModel::getCategories($restURI);
        require_once "views/articles/articlemanager.view.php";
    }
}
