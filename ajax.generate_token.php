<?php
require_once 'inc/backend.inc.php';
$param = new stdClass();
$param->id_utilisateur = InputValidator::sanitize($_POST['id']);
$res = $clientSOAP->__soapCall("addToken", array($param));
print $res->return;