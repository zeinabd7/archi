<?php
class CategoryModel
{
    public static function getCategories($uri)
    {
        $api_url = $uri . '/readCategoryList';
        $data = Json::parse($api_url);

        return $data;
    }

}
