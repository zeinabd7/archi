<?PHP
/*==========================*\
|   PDO Database connection  |
\*==========================*/

class Database
{

    private $temp;

    public function getConn()
    {

        // database informations configuration file
        include_once 'config/database.config.php';

        $this->temp = null;

        try {
            // connecting to the database with PDO
            $this->temp = new PDO('mysql:host=' . $host . ';
                                port=' . $port . ';
                                dbname=' . $database, $user, $pass
            );

            // deactivate emulated requests
            $this->temp->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);

        } catch (Exception $e) {

            // database connection custom error message
            die('La connexion à la base de donnée est impossible.');

        }
        return $this->temp;
    }

}
