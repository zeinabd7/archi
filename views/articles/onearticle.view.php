
<main>
<?php foreach ($oneArticle as $article) {?>
    <div id="title">
        <?=$article->libelle?>
        <img height="22" width="23" src="<?=URL?>/assets/img/fast-forward.png" alt="">
        <?=$article->titre?>
    </div>

    <div id="view-article">
        <div class="content"><?=$article->contenu?></div>
    </div>

  <div class="article-info-date">
   Publié le <?=$article->dateCreation?> <br>
   Dernière date de modification: <?=$article->dateModification?>
  </div>

    <a id="returnlink" href="<?=URL?>/news/<?=$article->categorie?>">&laquo; Revenir à la page précédente</a>
<?php }?>
</main>

</body>
</html>
