<?php
class ArticleModel
{

    public static function getArticles(String $uri)
    {
        $api_url = $uri . '/readArticles';
        $data = Json::parse($api_url);
        // $data = array_slice($data, 0, 3);

        return $data;
    }

    public static function getArticlesByCategory(int $category_id, String $uri)
    {

        $api_url = $uri . '/readArticlesByCategory/' . $category_id . '';
        $data = Json::parse($api_url);

        return $data;

    }

    public static function getOneArticle(int $id, String $uri)
    {

        $api_url = $uri . '/readArticles/' . $id . '';
        $data = Json::parse($api_url);

        return $data;

    }

    public static function getArticleCategoryName(int $id, String $uri)
    {

        $api_url = $uri . '/readCategoryName/' . $id . '';
        $data = Json::parse($api_url);

        return $data;

    }
}
