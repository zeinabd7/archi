<?php
/*===============*\
|   PHP REST API  |
\*===============*/

header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Max-Age: 3600");
header("Access-Control-Allow-Headers: Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");

include_once 'classes/Database.class.php';
include_once 'classes/Model.class.php';

$database = new Database();
$model = new Model($database->getConn());
