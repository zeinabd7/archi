<?php
class UserModel
{
    public static function getUsers($clientSOAP)
    {
        $res = $clientSOAP->__soapCall("getUtilisateur", array());
        return $res->return;
    }
}
