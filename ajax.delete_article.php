<?php
require_once 'inc/backend.inc.php';
$param = new stdClass();
$param->id = InputValidator::sanitize($_POST['id']);
$res = $clientSOAP->__soapCall("deleteArticle", array($param));
print $res->return;
