<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- demande à la jsp d'importer les tag lib  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout d'un nouveau client</title>
</head>
<body>

	<form method="post" action="ServletCreerClient">

		<fieldset>
			<legend>Creation Client</legend>
			<p />
			Nom : <input type="text" name="nom" placeholder="Entrez le nom" />
			<p />
			Prénom : <input type="text" name="prenom"
				placeholder="Entrez le prenom" />
			<p />
			Email : <input type="email" name="email"
				placeholder="Entrez votre email" />
			<p />
			Ville : <input type="text" name="ville"
				placeholder="Entrez la ville" />
			<p />
			Code Postal : <input type="text" name="codePostal"
				placeholder="Entrez le code postal" />

			
		</fieldset>

		<input type="reset" value="Annuler" /> 
		<input type="submit" value="Valider" /> 

	</form>


</body>
</html>


<!-- private String nomClient; -->
<!-- 	private String prenomClient; -->
<!-- 	private String emailClient; -->
	
<!-- 	@OneToOne(cascade = {CascadeType.REMOVE})  -->
<!-- 	@JoinColumn(name = "adresse_id", unique = true) -->
<!-- 	private Adresse adresseClient; -->
	
<!-- 	private CompteCourant compteCourant; -->
<!-- 	private CompteEpargne compteEpargne; -->
	
<!-- 	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY) -->
<!-- 	protected List<Compte> listComptes = new ArrayList<Compte>(); -->
	
<!-- 	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE }) -->
<!-- 	private Conseiller conseiller; -->