<?php
class Model
{

    private $itemsTable = "article";
    public $id;
    public $category;
    private $conn;

    public function __construct($db)
    {
        $this->conn = $db;
    }

    public function read()
    {
        if ($this->id) {
            $stmt = $this->conn->prepare("SELECT * FROM " . $this->itemsTable . " WHERE id = :id");
            $stmt->bindValue(':id', $this->id, PDO::PARAM_INT);
        } else {
            $stmt = $this->conn->prepare("SELECT * FROM " . $this->itemsTable);
        }
        $stmt->execute();

        return $stmt;
    }

    public function readByCategory()
    {
        if ($this->category) {
            $stmt = $this->conn->prepare("SELECT * FROM " . $this->itemsTable . " WHERE categorie = :id_category");
            $stmt->bindValue(':id_category', $this->category, PDO::PARAM_INT);
        }
        $stmt->execute();

        return $stmt;
    }

    public function readCategoryName()
    {
        if ($this->category) {
            $stmt = $this->conn->prepare("SELECT libelle FROM categorie WHERE id = :id_category");
            $stmt->bindValue(':id_category', $this->category, PDO::PARAM_INT);
        }
        $stmt->execute();

        return $stmt;
    }

    public function readCategoryList()
    {

        $stmt = $this->conn->prepare("SELECT * FROM categorie");
        $stmt->execute();

        return $stmt;
    }

}
