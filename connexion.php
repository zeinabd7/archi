<?php
require_once 'inc/backend.inc.php';

if (isset($_POST["logMeIn"])) {
    $login = $_POST['login'];
    $password = $_POST['password'];
    if (empty($login) || empty($password)) {
        $error = "Veuillez remplir tous les champs";
    } else {
        $params = new stdClass();
        $params->login = strtoupper($login);
        $params->password = strtoupper($password);
        $res = $clientSOAP->__soapCall("authentification", array($params));
        if ($res->return != "0") {
            $_SESSION['login'] = $login;
            $_SESSION['role'] = $res->return;
            if ($res->return == "admin") {
                header("Location: " . URL . "/manage/users");
            } else {
                header("Location: " . URL . "/manage/articles");
            }

        } else {
            $error = "Le login ou le mot de passe est incorrect";
        }
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page de connexion</title>
    <link rel="stylesheet" href="assets/css/admin.css">

</head>
<body>
    <main>
        <?php if (isset($error)) {?>
        <div class="error">
            <?=$error?>
        </div>
        <?php }?>
        <form method="post" id="box">
            <div id="title">Page de connexion</div>
            <div id="input_container">
                <input type="text" name="login" placeholder="Nom d'utilisateur">
                <input type="password" name="password" placeholder="Mot de passe">
            </div>

        <div id="button_container">
            <button type="submit" name="logMeIn" id="button">
            Connexion
            </button>
        </div>
        </form>
    </main>
</body>
</html>
