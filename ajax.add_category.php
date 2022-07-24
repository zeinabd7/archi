<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->libelle = InputValidator::sanitize($_POST['libelle']);
$res = $clientSOAP->__soapCall("addCategorie", array($params));
print $res->return;
