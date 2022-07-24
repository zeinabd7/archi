<?php
class Json
{
    public static function parse($uri)
    {
        $json_data = file_get_contents($uri);
        $response_data = json_decode($json_data);
        $json = $response_data->body;
        return $json;
    }

}
