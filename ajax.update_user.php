<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->id = InputValidator::sanitize($_POST['id']);
$params->login = InputValidator::sanitize($_POST['login']);
$params->password = $_POST['password'];
$params->role = $_POST['role'];
$res = $clientSOAP->__soapCall("updateUtilisateur", array($params));
print $res->return;
