<?php
require 'inc/backend.inc.php';

$model->category = (isset($_GET['id']) && $_GET['id']) ? $_GET['id'] : '0';

$result = $model->readCategoryName();
$itemCount = $result->rowCount();

if ($itemCount > 0) {

    $returnedArray = array();
    $returnedArray["body"] = array();

    while ($row = $result->fetch(PDO::FETCH_ASSOC)) {
        extract($row);
        $e = array(

            "libelle" => $libelle,

        );
        array_push($returnedArray["body"], $e);
    }
    http_response_code(200);
    echo json_encode($returnedArray, JSON_PRETTY_PRINT);
} else {
    http_response_code(404);
    echo json_encode(
        array("message" => "Aucun élément trouvé.")
    );
}