<?php
class InputValidator
{
    public static function sanitize($data)
    {
        $str = htmlspecialchars(
            stripslashes(
                nl2br(
                    trim(
                        $data
                    )
                )
            )
        );
        return $str;
    }
}
