<main>
    <div id="title">
<?php foreach ($categorieName as $catego) {$name = $catego->libelle?>
<?=$catego->libelle ? 'Les articles de la catégorie <span class="catego">&laquo; ' . $catego->libelle . ' &raquo;</span>'
    : 'Tous les articles de MGLSI NEWS'?>
    </div>
    <?php }?>

<?php if ($noArticle) {?>
    <span class='no-art'>Aucun article trouvé pour cette catégorie.</span>
<?php } else {?>

    <div id="articles-container">
<?php foreach ($articles as $article) {?>
        <div onclick="window.location.href='<?=URL?>/news/article/<?=$article->id?>'" class="article">
        <div class="title-container">
            <div class="title"><?=$article->titre?></div>
            <div class="libelle"><?=!$name ? $article->libelle : ''?></div>
        </div>
            <div class="content"><?=$article->contenu?></div>
            <div class="create-date">Publié le <?=$article->dateCreation?></div>
        </div>
<?php }}?>
    </div>

</main>

</body>
</html>
