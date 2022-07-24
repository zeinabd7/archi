<?php
require_once 'inc/backend.inc.php';
$param = new stdClass();
$param->id = InputValidator::sanitize($_POST['id']);
$res = $clientSOAP->__soapCall("deleteCategorie", array($param));
print $res->return;
