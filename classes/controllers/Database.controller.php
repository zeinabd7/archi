<?PHP
/*==========================*\
|   PDO Database connection  |
\*==========================*/

class Database
{

    public static function getConn()
    {

        include_once 'config/database.config.php';
        $archi = null;

        try {

            $archi = new PDO('mysql:host=' . $host . ';
                                port=' . $port . ';
                                dbname=' . $database, $user, $pass
            );

            $archi->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);

        } catch (Exception $e) {

            require_once "views/database.error.view.php";

        }

        return $archi;

    }

}
