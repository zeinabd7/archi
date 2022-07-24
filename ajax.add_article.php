<?php
require_once 'inc/backend.inc.php';
$params = new stdClass();
$params->titre = InputValidator::sanitize($_POST['titre']);
$params->contenu = InputValidator::sanitize($_POST['contenu']);
$params->categorie = InputValidator::sanitize($_POST['categorie']);
$params->dateCreation = date('Y-m-d H:i:s');
$params->dateModification = date('Y-m-d H:i:s');
$res = $clientSOAP->__soapCall("addArticle", array($params));
print $res->return;
