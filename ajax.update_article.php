<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->id = InputValidator::sanitize($_POST['id']);
$params->titre = InputValidator::sanitize($_POST['titre']);
$params->contenu = InputValidator::sanitize($_POST['contenu']);
$params->dateModification = date('Y-m-d H:i:s');
$params->categorie = InputValidator::sanitize($_POST['categorie']);
$res = $clientSOAP->__soapCall("updateArticle", array($params));
print $res->return;
