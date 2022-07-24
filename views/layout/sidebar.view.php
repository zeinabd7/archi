<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MGLSI NEWS</title>
    <link rel="stylesheet" href="<?=URL?>/assets/css/app.css">
    <?php
?>
</head>
<style>
    #button_container {
        display: flex;
        justify-content: end;
    }
    #button{
        background-color: #008080;
        color: white;
        border: none;
        border-radius: 5px;
        padding: 12px;
        transition: 0.25s;
        font-size: 14px;
        cursor: pointer;
        margin-top: 10px;
        margin-right:16px;
    }
    #button:hover{
        opacity:0.8;
        transition:0.25s;
    }
    a{
        text-decoration: none;
    }
</style>
<body>
<div id="sidebar">
    <div id="side-container">
            <div id="title">
                Catégories d'article
            </div>
            <ul class="category">

                <?php foreach ($categories as $value) {?>
                    <a style="text-decoration: none;" href="<?=URL?>/news/<?=$value->id?>">
                        <li><?=$value->libelle?></li>
                    </a>
                <?php }?>

                <a style="text-decoration: none;margin-top:2.3rem;" href="<?=URL?>/news/all">
                    <li>Voir tous les articles</li>
                </a>
            </ul>
    </div>
</div>

<a href="<?=URL?>/connexion" id="button_container">
    <div id="button">
    Connexion
    </div>
</a>