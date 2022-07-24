<?php
session_start();

// DEACTIVATE ERROR REPORTING
error_reporting(0);

// SITE CONFIGURATION
require_once "config/site.config.php";

// CONTROLLERS
require_once "classes/controllers/Database.controller.php";
require_once "classes/controllers/Article.controller.php";
require_once "classes/controllers/Category.controller.php";
require_once "classes/controllers/View.controller.php";
require_once "classes/controllers/User.controller.php";

// MODELS
require_once "classes/models/Article.model.php";
require_once "classes/models/Category.model.php";
require_once "classes/models/Inputvalidator.model.php";
require_once "classes/models/Database.model.php";
require_once "classes/models/ParseJSON.model.php";
require_once "classes/models/User.model.php";

// DATABASE CONNECTION
// $conn = Database::getConn();

// SOAP ENDPOINT
$clientSOAP = new SoapClient("https://4a25-154-124-209-84.eu.ngrok.io/Service1?wsdl");

// REST URI
$restURI = "https://anovasn.com/archi";
