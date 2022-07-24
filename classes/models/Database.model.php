<?php

class DatabaseModel
{
    public static function selectAll($sql, $db)
    {
        $result = $db->prepare($sql);
        $result->execute();
        $tab = $result->fetchAll();
        $result->closeCursor();
        return $tab;
    }

    public function selectOne($sql, $db)
    {
        $result = $db->prepare($sql);
        $result->execute();
        $tab = $result->fetch();
        $result->closeCursor();
        return $tab;
    }

    public function select($table, $order = "", $db)
    {
        $order = ($order != "") ? " order by $order" : "";

        $result = $db->prepare("select * from $table$order");
        $result->execute();
        $tab = $result->fetchAll();
        $result->closeCursor();
        return $tab;
    }

}
