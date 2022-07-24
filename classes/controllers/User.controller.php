<?php
class UserController
{
    public static function verifyEditorPermission()
    {
        if (!$_SESSION['login'] && ($_SESSION['role'] != 'admin' || $_SESSION['role'] != 'editeur')) {
            return true;
        }
        return false;
    }

    public static function verifyAdminPermission()
    {
        if (!$_SESSION['login'] && $_SESSION['role'] != 'admin') {
            return true;
        }
        return false;
    }

    public static function logout()
    {
        session_destroy();
    }

    public static function showUserManager($clientSOAP)
    {
        $res = UserModel::getUsers($clientSOAP);
        require_once "views/users/usermanager.view.php";
    }

}
