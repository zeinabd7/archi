<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->login = InputValidator::sanitize($_POST['login']);
$params->password = $_POST['password'];
$params->role = $_POST['role'];
$res = $clientSOAP->__soapCall("addUtilisateur", array($params));
print $res->return;
