<?php
require 'inc/backend.inc.php';

$model->id = (isset($_GET['id']) && $_GET['id']) ? $_GET['id'] : '0';

$result = $model->read();
$itemCount = $result->rowCount();

if ($itemCount > 0) {

    $returnedArray = array();
    $returnedArray["body"] = array();

    while ($row = $result->fetch(PDO::FETCH_ASSOC)) {
        extract($row);
        $e = array(
            "id" => $id,
            "titre" => $titre,
            "contenu" => $contenu,
            "dateCreation" => $dateCreation,
            "dateModification" => $dateModification,
            "categorie" => $categorie,
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
