<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page de gestion des articles</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
	<link rel="stylesheet" href="<?=URL?>/assets/css/admin.css">

</head>

<body>
    <main>
	<div id="titleUser">
        Bienvenue <b><?=$_SESSION['login']?></b>, vous êtes connecté en tant que <b><?=$_SESSION['role']?></b>
        </div>

		<div id="flex">

		<div id="bg-white">
			<div id="linkscontainer">

		<?php if ($_SESSION['role'] == 'admin') {?>
		<a href="<?=URL?>/manage/users">Gestion des utilisateurs</a>
		<?php }?>
		<a href="<?=URL?>/manage/articles">Gestion des articles</a>
		<a href="<?=URL?>/manage/categories">Gestions des catégories</a> <br>
		<a  href="<?=URL?>/manage/logout">Déconnexion</a>
		</div>
		</div>
        <form method="post" id="box">

		<div class="toptil">
            <div id="title">Liste des articles</div>
            <div onclick="addArticle()" id="button" class="buttonText">+ Ajouter un nouvel article</div>
            </div>

            <table class="padb-12">
                <tr class="alignleft">
                    <th class="pad-12">#</th>
                    <th class="pad-12">Titre</th>
                    <th class="pad-12">Contenu</th>
					<th class="pad-12">Catégorie</th>
                    <th class="pad-12">Date de création</th>
                    <th class="pad-12">Date de modification</th>
                    <th class="pad-12">Actions</th>
                </tr>
                <?php foreach ($data_article as $response) {?>
                <tr class="alignleft">
                    <td class="pad-12"><?=$response->id?></td>
                    <td class="pad-12"><?=$response->titre?></td>
                    <td class="pad-12"><?=substr($response->contenu, 0, 60)?>...</td>
					<td class="pad-12"><?PHP foreach ($data_category as $category) {if ($response->categorie == $category->id) {echo $category->libelle;}}?></td>
                    <td class="pad-12"><?=$response->dateCreation?></td>
                    <td class="pad-12"><?=$response->dateModification?></td>
                    <td class="butCont">
                        <div onclick="updateArticle(<?=$response->id?>, '<?=$response->titre?>', '<?=$response->contenu?>','<?=$response->category?>')" id="button">Modifier</div>
                        <div onclick="deleteArticle(<?=$response->id?>)" id="button">Supprimer</div>

                    </td>
                </tr>
                <?php }?>
            </table>
        </form>
		</div>
    </main>
</body>
<script>
	function deleteArticle(id){
		Swal.fire({
			title: 'Merci de patienter...',
			showCancelButton: false,
			showConfirmButton: false,
			closeOnCancel: true,
			timer: 1000,
   		 }).then(function(){
		$.ajax({
			type: "POST",
			url: "<?=URL?>/ajax.delete_article.php",
			data:{
				id: id
			},
			success: function(data){

				if(data == true){
					Swal.fire({
						title: 'L\'article a bien été supprimé',
						icon: 'success',
						showCancelButton: false,
						showConfirmButton: false,
						closeOnCancel: true,
						timer: 1000,
						timerProgressBar: true,
					}).then(function(){
						location.reload();
					})
				} else {
					Swal.fire({
						title: 'Oops, erreur de traitement',
						icon: 'error',
						showCancelButton: false,
						showConfirmButton: false,
						closeOnCancel: true,
						timer: 2000,
						timerProgressBar: true,
					})
				}
			}
		})
		})
	}

	function addArticle(){
		Swal.fire({
			title: 'Ajouter un article',
			html:`
            <input id="atitre" class="swal2-input" Placeholder="Titre">
				<textarea id="acontenu" class="swal2-input" placeholder="Contenu de l'article"></textarea>
				<select class="swal2-input" id="acategorie">
					<?php
foreach ($data_category as $value) {
    ?>
						<option value="<?php echo $value->id; ?>"><?php echo $value->libelle; ?></option>
					<?PHP
}
?>
				</select>
            `,
			showCancelButton: false,
			showConfirmButton: true,
			closeOnCancel: true,
			confirmButtonText: "Ajouter",
		}).then((result) => {
			if (result.isConfirmed) {
				$.ajax({
					type: "POST",
					url: "<?=URL?>/ajax.add_article.php",
					data:{
                        titre: $('#atitre').val(),
                        contenu: $('#acontenu').val(),
						categorie: $('#acategorie').val()
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: 'L\'article a bien été ajouté',
								icon: 'success',
								showCancelButton: false,
								showConfirmButton: false,
								closeOnCancel: true,
								timer: 1000,
								timerProgressBar: true,
							}).then(function(){
								location.reload();
							})
						} else {
							Swal.fire({
								title: 'Oops, erreur de traitement',
								icon: 'error',
								showCancelButton: false,
								showConfirmButton: false,
								closeOnCancel: true,
								timer: 2000,
								timerProgressBar: true,
							})
						}
					}
				})
			}
		})
	}


	function updateArticle(id,titre,contenu,category){
		let actual
		Swal.fire({
			title: `Modification de l'article #${id}`,
			html:
				`<input id="utitre" class="swal2-input" value="${titre}" Placeholder="Titre">
                <textarea id="ucontenu" class="swal2-input"  placeholder="Contenu de l'article">${contenu}</textarea>
				<select class="swal2-input" id="ucategorie">
					<?php
foreach ($data_category as $value) {
    ?>
						<option value="<?php echo $value->id; ?>" ${category == '<?=$value->id;?>' ? ' selected' : ''}><?php echo $value->libelle; ?></option>
					<?PHP
}
?>
				</select>
`,




			showCancelButton: false,
			showConfirmButton: true,
			closeOnCancel: true,
			confirmButtonText: "Modifier",
		}).then((result) => {
			if (result.isConfirmed) {
			$.ajax({
					type: "POST",
					url: "<?=URL?>/ajax.update_article.php",
					data:{
						id:id,
						titre: document.getElementById('utitre').value,
						contenu: document.getElementById('ucontenu').value,
						categorie: document.getElementById('ucategorie').value,
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: `L'article #${id} a bien été modifié`,
								icon: 'success',
								showCancelButton: false,
								showConfirmButton: false,
								closeOnCancel: true,
								timer: 1000,
								timerProgressBar: true,
							}).then(function(){
								location.reload();
							})
						} else {
							Swal.fire({
								title: 'Oops, erreur de traitement',
								icon: 'error',
								showCancelButton: false,
								showConfirmButton: false,
								closeOnCancel: true,
								timer: 2000,
								timerProgressBar: true,
							})
						}
					}
			})
		}
		})

	}

</script>
</html>
