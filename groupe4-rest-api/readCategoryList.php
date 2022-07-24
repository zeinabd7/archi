<?php
require 'inc/backend.inc.php';

$result = $model->readCategoryList();
$itemCount = $result->rowCount();

if ($itemCount > 0) {

    $returnedArray = array();
    $returnedArray["body"] = array();

    while ($row = $result->fetch(PDO::FETCH_ASSOC)) {
        extract($row);
        $e = array(
            "id" => $id,
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
