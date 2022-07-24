<?php
class ViewController
{
    public static function show(string $view)
    {
        require_once $view;
    }
}
