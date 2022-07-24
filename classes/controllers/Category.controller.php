<?php
class CategoryController
{
    public static function showHeaderWithCategories($db)
    {
        $categories = CategoryModel::getCategories($db);
        require_once "views/layout/sidebar.view.php";
    }

    public static function showCategoryManager($restURI)
    {
        $api_url = $restURI . '/readCategoryList';
        $data = Json::parse($api_url);
        require_once "views/articles/categorymanager.view.php";
    }
}
