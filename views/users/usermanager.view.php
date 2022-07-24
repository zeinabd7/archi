<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page d'administration</title>
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
            <div id="title">Liste des utilisateurs</div>
            <div onclick="addUser()" id="button" class="buttonText">+ Ajouter un nouvel utilisateur</div>
            </div>
            <table class="padb-12">
                <tr class="alignleft">
                    <th class="pad-12">#</th>
                    <th class="pad-12">Login</th>
                    <th class="pad-12">Password</th>
                    <th class="pad-12">Rôle</th>
                    <th class="pad-12">Actions</th>
                </tr>
                <?php foreach ($res as $response) {?>
                <tr class="alignleft">
                    <td class="pad-12"><?=$response->id?></td>
                    <td class="pad-12"><?=$response->login?></td>
                    <td class="pad-12"><?=$response->password?></td>
                    <td class="pad-12"><?=$response->role?></td>
                    <td class="butCont">
                        <div onclick="updateUser(<?=$response->id?>, '<?=$response->login?>', '<?=$response->password?>', '<?=$response->role?>')" id="button">Modifier</div>
                        <div onclick="deleteUser(<?=$response->id?>)" id="button">Supprimer</div>
                        <?php
$param = new stdClass();
    $param->id_utilisateur = $response->id;
    $res = $clientSOAP->__soapCall("verifyToken", array($param));
    if ($res->return == "0") {
        ?>
                        <div onclick="addToken(<?=$response->id?>)" id="button">Générer un jeton</div>
                        <?php } else {?>
                        <div onclick="deleteToken(<?=$response->id?>)" id="button">Supprimer le jeton</div>
                        <?php }?>
                    </td>
                </tr>
                <?php }?>
            </table>

        </form>
		</div>
    </main>
</body>

<script>

function addToken(id){
		Swal.fire({
			title: 'Merci de patienter...',
			showCancelButton: false,
			showConfirmButton: false,
			closeOnCancel: true,
			timer: 1000,
   		 }).then(function(){
		$.ajax({
			type: "POST",
			url: "ajax.generate_token.php",
			data:{
				id: id
			},
			success: function(data){

				if(data == true){
					Swal.fire({
						title: 'Un jeton de modification a bien été ajouté pour cet utilisateur',
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

    function deleteToken(id){
		Swal.fire({
			title: 'Merci de patienter...',
			showCancelButton: false,
			showConfirmButton: false,
			closeOnCancel: true,
			timer: 1000,
   		 }).then(function(){
		$.ajax({
			type: "POST",
			url: "ajax.delete_token.php",
			data:{
				id: id
			},
			success: function(data){

				if(data == true){
					Swal.fire({
						title: 'Le jeton de cet utilisateur a bien été supprimé',
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


	function deleteUser(id){
		Swal.fire({
			title: 'Merci de patienter...',
			showCancelButton: false,
			showConfirmButton: false,
			closeOnCancel: true,
			timer: 1000,
   		 }).then(function(){
		$.ajax({
			type: "POST",
			url: "ajax.delete_user.php",
			data:{
				id: id
			},
			success: function(data){

				if(data == true){
					Swal.fire({
						title: 'L\'utilisateur a bien été supprimé',
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

	function addUser(){
		Swal.fire({
			title: 'Ajouter un utilisateur',
			html:`
            <input id="alogin" class="swal2-input" Placeholder="Nom d'utilisateur">
				<input id="apass" class="swal2-input" placeholder="Mot de passe">
                <select id="arole" class="swal2-input">
                    <option value="admin">Admin</option>
                    <option value="editeur">Editeur</option>
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
					url: "ajax.add_user.php",
					data:{
                        login: $('#alogin').val(),
                        password: $('#apass').val(),
                        role: $('#arole').val()
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: 'L\'utilisateur a bien été ajouté',
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


	function updateUser(id,login,password,role){
		Swal.fire({
			title: `Modification de l'utilisateur #${id}`,
			html:
				`<input id="ulogin" class="swal2-input" value="${login}" Placeholder="Nom d'utilisateur">
				<input id="upass" class="swal2-input" value="${password}" placeholder="Mot de passe">
                <select id="urole" class="swal2-input">
                    <option value="admin" ${role == 'admin' ? ' selected': ''}>Admin</option>
                    <option value="editeur" ${role == 'editeur' ? ' selected': ''}>Editeur</option>
                </select>`,

			showCancelButton: false,
			showConfirmButton: true,
			closeOnCancel: true,
			confirmButtonText: "Modifier",
		}).then((result) => {
			if (result.isConfirmed) {
			$.ajax({
					type: "POST",
					url: "ajax.update_user.php",
					data:{
						id:id,
						login: document.getElementById('ulogin').value,
						password: document.getElementById('upass').value,
                        role: document.getElementById('urole').value,
					},
					success: function(data){

						if(data == true){
							Swal.fire({
								title: `L'utilisateur #${id} a bien été modifié`,
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