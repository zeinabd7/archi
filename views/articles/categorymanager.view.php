<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page de gestion des catégories</title>
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
            <div id="title">Liste des catégories</div>
            <div onclick="addCategory()" id="button" class="buttonText">+ Ajouter</div>
            </div>

            <table class="padb-12">
                <tr class="alignleft">
                    <th class="pad-12">#</th>
                    <th class="pad-12">Titre</th>
                    <th class="pad-12">Action</th>
                </tr>
                <?php foreach ($data as $response) {?>
                <tr class="alignleft">
                    <td class="pad-12"><?=$response->id?></td>
                    <td class="pad-12"><?=$response->libelle?></td>

                    <td class="butCont">
                        <div onclick="updateCategory(<?=$response->id?>, '<?=$response->libelle?>')" id="button">Modifier</div>
                        <div onclick="deleteCategory(<?=$response->id?>)" id="button">Supprimer</div>
                    </td>
                </tr>
                <?php }?>
            </table>

        </form>
		</div>
    </main>
</body>
<script>
	function deleteCategory(id){
		Swal.fire({
			title: 'Merci de patienter...',
			showCancelButton: false,
			showConfirmButton: false,
			closeOnCancel: true,
			timer: 1000,
   		 }).then(function(){
		$.ajax({
			type: "POST",
			url: "<?=URL?>/ajax.delete_category.php",
			data:{
				id: id
			},
			success: function(data){

				if(data == true){
					Swal.fire({
						title: 'La catégorie a bien été supprimé',
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

	function addCategory(){
		Swal.fire({
			title: 'Ajouter une catégorie',
			html:`
            <input id="alibelle" class="swal2-input" Placeholder="Libelle">

            `,
			showCancelButton: false,
			showConfirmButton: true,
			closeOnCancel: true,
			confirmButtonText: "Ajouter",
		}).then((result) => {
			if (result.isConfirmed) {
				$.ajax({
					type: "POST",
					url: "<?=URL?>/ajax.add_category.php",
					data:{
                        libelle: $('#alibelle').val(),
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: 'La catégorie a bien été ajouté',
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


	function updateCategory(id,libelle){
		Swal.fire({
			title: `Modification de la catégorie #${id}`,
			html:
				`<input id="ulibelle" class="swal2-input" value="${libelle}" Placeholder="Libelle">
`,
			showCancelButton: false,
			showConfirmButton: true,
			closeOnCancel: true,
			confirmButtonText: "Modifier",
		}).then((result) => {

			if (result.isConfirmed) {

			$.ajax({
					type: "POST",
					url: "<?=URL?>/inc/ajax.update_category.php",
					data:{
						id:id,
						libelle: $('#ulibelle').val(),
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: `La catégorie #${id} a bien été modifié`,
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
