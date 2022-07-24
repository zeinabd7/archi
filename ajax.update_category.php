<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->id = InputValidator::sanitize($_POST['id']);
$params->libelle = InputValidator::sanitize($_POST['libelle']);
$res = $clientSOAP->__soapCall("updateCategorie", array($params));
print $res->return;
