
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Authentification_QNAME = new QName("http://service/", "authentification");
    private final static QName _AuthentificationResponse_QNAME = new QName("http://service/", "authentificationResponse");
    private final static QName _AddUtilisateurResponse_QNAME = new QName("http://service/", "addUtilisateurResponse");
    private final static QName _DeleteTokenResponse_QNAME = new QName("http://service/", "deleteTokenResponse");
    private final static QName _AddToken_QNAME = new QName("http://service/", "addToken");
    private final static QName _GetUtilisateur_QNAME = new QName("http://service/", "getUtilisateur");
    private final static QName _UpdateCategorieResponse_QNAME = new QName("http://service/", "updateCategorieResponse");
    private final static QName _DeleteArticle_QNAME = new QName("http://service/", "deleteArticle");
    private final static QName _DeleteArticleResponse_QNAME = new QName("http://service/", "deleteArticleResponse");
    private final static QName _DeleteUtilisateurResponse_QNAME = new QName("http://service/", "deleteUtilisateurResponse");
    private final static QName _UpdateUtilisateurResponse_QNAME = new QName("http://service/", "updateUtilisateurResponse");
    private final static QName _DeleteUtilisateur_QNAME = new QName("http://service/", "deleteUtilisateur");
    private final static QName _Compte_QNAME = new QName("http://service/", "compte");
    private final static QName _AddUtilisateur_QNAME = new QName("http://service/", "addUtilisateur");
    private final static QName _VerifyTokenResponse_QNAME = new QName("http://service/", "verifyTokenResponse");
    private final static QName _AddCategorieResponse_QNAME = new QName("http://service/", "addCategorieResponse");
    private final static QName _AddArticleResponse_QNAME = new QName("http://service/", "addArticleResponse");
    private final static QName _DeleteCategorie_QNAME = new QName("http://service/", "deleteCategorie");
    private final static QName _AddArticle_QNAME = new QName("http://service/", "addArticle");
    private final static QName _UpdateArticle_QNAME = new QName("http://service/", "updateArticle");
    private final static QName _VerifyToken_QNAME = new QName("http://service/", "verifyToken");
    private final static QName _UpdateCategorie_QNAME = new QName("http://service/", "updateCategorie");
    private final static QName _UpdateArticleResponse_QNAME = new QName("http://service/", "updateArticleResponse");
    private final static QName _DeleteToken_QNAME = new QName("http://service/", "deleteToken");
    private final static QName _AddCategorie_QNAME = new QName("http://service/", "addCategorie");
    private final static QName _GetUtilisateurResponse_QNAME = new QName("http://service/", "getUtilisateurResponse");
    private final static QName _AddTokenResponse_QNAME = new QName("http://service/", "addTokenResponse");
    private final static QName _DeleteCategorieResponse_QNAME = new QName("http://service/", "deleteCategorieResponse");
    private final static QName _UpdateUtilisateur_QNAME = new QName("http://service/", "updateUtilisateur");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCategorie }
     * 
     */
    public UpdateCategorie createUpdateCategorie() {
        return new UpdateCategorie();
    }

    /**
     * Create an instance of {@link VerifyToken }
     * 
     */
    public VerifyToken createVerifyToken() {
        return new VerifyToken();
    }

    /**
     * Create an instance of {@link AddArticle }
     * 
     */
    public AddArticle createAddArticle() {
        return new AddArticle();
    }

    /**
     * Create an instance of {@link UpdateArticle }
     * 
     */
    public UpdateArticle createUpdateArticle() {
        return new UpdateArticle();
    }

    /**
     * Create an instance of {@link AddCategorie }
     * 
     */
    public AddCategorie createAddCategorie() {
        return new AddCategorie();
    }

    /**
     * Create an instance of {@link DeleteToken }
     * 
     */
    public DeleteToken createDeleteToken() {
        return new DeleteToken();
    }

    /**
     * Create an instance of {@link UpdateArticleResponse }
     * 
     */
    public UpdateArticleResponse createUpdateArticleResponse() {
        return new UpdateArticleResponse();
    }

    /**
     * Create an instance of {@link AddTokenResponse }
     * 
     */
    public AddTokenResponse createAddTokenResponse() {
        return new AddTokenResponse();
    }

    /**
     * Create an instance of {@link GetUtilisateurResponse }
     * 
     */
    public GetUtilisateurResponse createGetUtilisateurResponse() {
        return new GetUtilisateurResponse();
    }

    /**
     * Create an instance of {@link UpdateUtilisateur }
     * 
     */
    public UpdateUtilisateur createUpdateUtilisateur() {
        return new UpdateUtilisateur();
    }

    /**
     * Create an instance of {@link DeleteCategorieResponse }
     * 
     */
    public DeleteCategorieResponse createDeleteCategorieResponse() {
        return new DeleteCategorieResponse();
    }

    /**
     * Create an instance of {@link AddToken }
     * 
     */
    public AddToken createAddToken() {
        return new AddToken();
    }

    /**
     * Create an instance of {@link GetUtilisateur }
     * 
     */
    public GetUtilisateur createGetUtilisateur() {
        return new GetUtilisateur();
    }

    /**
     * Create an instance of {@link UpdateCategorieResponse }
     * 
     */
    public UpdateCategorieResponse createUpdateCategorieResponse() {
        return new UpdateCategorieResponse();
    }

    /**
     * Create an instance of {@link DeleteTokenResponse }
     * 
     */
    public DeleteTokenResponse createDeleteTokenResponse() {
        return new DeleteTokenResponse();
    }

    /**
     * Create an instance of {@link AddUtilisateurResponse }
     * 
     */
    public AddUtilisateurResponse createAddUtilisateurResponse() {
        return new AddUtilisateurResponse();
    }

    /**
     * Create an instance of {@link AuthentificationResponse }
     * 
     */
    public AuthentificationResponse createAuthentificationResponse() {
        return new AuthentificationResponse();
    }

    /**
     * Create an instance of {@link Authentification }
     * 
     */
    public Authentification createAuthentification() {
        return new Authentification();
    }

    /**
     * Create an instance of {@link UpdateUtilisateurResponse }
     * 
     */
    public UpdateUtilisateurResponse createUpdateUtilisateurResponse() {
        return new UpdateUtilisateurResponse();
    }

    /**
     * Create an instance of {@link DeleteUtilisateurResponse }
     * 
     */
    public DeleteUtilisateurResponse createDeleteUtilisateurResponse() {
        return new DeleteUtilisateurResponse();
    }

    /**
     * Create an instance of {@link DeleteArticleResponse }
     * 
     */
    public DeleteArticleResponse createDeleteArticleResponse() {
        return new DeleteArticleResponse();
    }

    /**
     * Create an instance of {@link DeleteArticle }
     * 
     */
    public DeleteArticle createDeleteArticle() {
        return new DeleteArticle();
    }

    /**
     * Create an instance of {@link DeleteUtilisateur }
     * 
     */
    public DeleteUtilisateur createDeleteUtilisateur() {
        return new DeleteUtilisateur();
    }

    /**
     * Create an instance of {@link DeleteCategorie }
     * 
     */
    public DeleteCategorie createDeleteCategorie() {
        return new DeleteCategorie();
    }

    /**
     * Create an instance of {@link AddArticleResponse }
     * 
     */
    public AddArticleResponse createAddArticleResponse() {
        return new AddArticleResponse();
    }

    /**
     * Create an instance of {@link AddCategorieResponse }
     * 
     */
    public AddCategorieResponse createAddCategorieResponse() {
        return new AddCategorieResponse();
    }

    /**
     * Create an instance of {@link AddUtilisateur }
     * 
     */
    public AddUtilisateur createAddUtilisateur() {
        return new AddUtilisateur();
    }

    /**
     * Create an instance of {@link VerifyTokenResponse }
     * 
     */
    public VerifyTokenResponse createVerifyTokenResponse() {
        return new VerifyTokenResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "authentification")
    public JAXBElement<Authentification> createAuthentification(Authentification value) {
        return new JAXBElement<Authentification>(_Authentification_QNAME, Authentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "authentificationResponse")
    public JAXBElement<AuthentificationResponse> createAuthentificationResponse(AuthentificationResponse value) {
        return new JAXBElement<AuthentificationResponse>(_AuthentificationResponse_QNAME, AuthentificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addUtilisateurResponse")
    public JAXBElement<AddUtilisateurResponse> createAddUtilisateurResponse(AddUtilisateurResponse value) {
        return new JAXBElement<AddUtilisateurResponse>(_AddUtilisateurResponse_QNAME, AddUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteTokenResponse")
    public JAXBElement<DeleteTokenResponse> createDeleteTokenResponse(DeleteTokenResponse value) {
        return new JAXBElement<DeleteTokenResponse>(_DeleteTokenResponse_QNAME, DeleteTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addToken")
    public JAXBElement<AddToken> createAddToken(AddToken value) {
        return new JAXBElement<AddToken>(_AddToken_QNAME, AddToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getUtilisateur")
    public JAXBElement<GetUtilisateur> createGetUtilisateur(GetUtilisateur value) {
        return new JAXBElement<GetUtilisateur>(_GetUtilisateur_QNAME, GetUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategorieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateCategorieResponse")
    public JAXBElement<UpdateCategorieResponse> createUpdateCategorieResponse(UpdateCategorieResponse value) {
        return new JAXBElement<UpdateCategorieResponse>(_UpdateCategorieResponse_QNAME, UpdateCategorieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteArticle")
    public JAXBElement<DeleteArticle> createDeleteArticle(DeleteArticle value) {
        return new JAXBElement<DeleteArticle>(_DeleteArticle_QNAME, DeleteArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteArticleResponse")
    public JAXBElement<DeleteArticleResponse> createDeleteArticleResponse(DeleteArticleResponse value) {
        return new JAXBElement<DeleteArticleResponse>(_DeleteArticleResponse_QNAME, DeleteArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteUtilisateurResponse")
    public JAXBElement<DeleteUtilisateurResponse> createDeleteUtilisateurResponse(DeleteUtilisateurResponse value) {
        return new JAXBElement<DeleteUtilisateurResponse>(_DeleteUtilisateurResponse_QNAME, DeleteUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateUtilisateurResponse")
    public JAXBElement<UpdateUtilisateurResponse> createUpdateUtilisateurResponse(UpdateUtilisateurResponse value) {
        return new JAXBElement<UpdateUtilisateurResponse>(_UpdateUtilisateurResponse_QNAME, UpdateUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteUtilisateur")
    public JAXBElement<DeleteUtilisateur> createDeleteUtilisateur(DeleteUtilisateur value) {
        return new JAXBElement<DeleteUtilisateur>(_DeleteUtilisateur_QNAME, DeleteUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Utilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "compte")
    public JAXBElement<Utilisateur> createCompte(Utilisateur value) {
        return new JAXBElement<Utilisateur>(_Compte_QNAME, Utilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addUtilisateur")
    public JAXBElement<AddUtilisateur> createAddUtilisateur(AddUtilisateur value) {
        return new JAXBElement<AddUtilisateur>(_AddUtilisateur_QNAME, AddUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verifyTokenResponse")
    public JAXBElement<VerifyTokenResponse> createVerifyTokenResponse(VerifyTokenResponse value) {
        return new JAXBElement<VerifyTokenResponse>(_VerifyTokenResponse_QNAME, VerifyTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategorieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addCategorieResponse")
    public JAXBElement<AddCategorieResponse> createAddCategorieResponse(AddCategorieResponse value) {
        return new JAXBElement<AddCategorieResponse>(_AddCategorieResponse_QNAME, AddCategorieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addArticleResponse")
    public JAXBElement<AddArticleResponse> createAddArticleResponse(AddArticleResponse value) {
        return new JAXBElement<AddArticleResponse>(_AddArticleResponse_QNAME, AddArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCategorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteCategorie")
    public JAXBElement<DeleteCategorie> createDeleteCategorie(DeleteCategorie value) {
        return new JAXBElement<DeleteCategorie>(_DeleteCategorie_QNAME, DeleteCategorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addArticle")
    public JAXBElement<AddArticle> createAddArticle(AddArticle value) {
        return new JAXBElement<AddArticle>(_AddArticle_QNAME, AddArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateArticle")
    public JAXBElement<UpdateArticle> createUpdateArticle(UpdateArticle value) {
        return new JAXBElement<UpdateArticle>(_UpdateArticle_QNAME, UpdateArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verifyToken")
    public JAXBElement<VerifyToken> createVerifyToken(VerifyToken value) {
        return new JAXBElement<VerifyToken>(_VerifyToken_QNAME, VerifyToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateCategorie")
    public JAXBElement<UpdateCategorie> createUpdateCategorie(UpdateCategorie value) {
        return new JAXBElement<UpdateCategorie>(_UpdateCategorie_QNAME, UpdateCategorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateArticleResponse")
    public JAXBElement<UpdateArticleResponse> createUpdateArticleResponse(UpdateArticleResponse value) {
        return new JAXBElement<UpdateArticleResponse>(_UpdateArticleResponse_QNAME, UpdateArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteToken")
    public JAXBElement<DeleteToken> createDeleteToken(DeleteToken value) {
        return new JAXBElement<DeleteToken>(_DeleteToken_QNAME, DeleteToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addCategorie")
    public JAXBElement<AddCategorie> createAddCategorie(AddCategorie value) {
        return new JAXBElement<AddCategorie>(_AddCategorie_QNAME, AddCategorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getUtilisateurResponse")
    public JAXBElement<GetUtilisateurResponse> createGetUtilisateurResponse(GetUtilisateurResponse value) {
        return new JAXBElement<GetUtilisateurResponse>(_GetUtilisateurResponse_QNAME, GetUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addTokenResponse")
    public JAXBElement<AddTokenResponse> createAddTokenResponse(AddTokenResponse value) {
        return new JAXBElement<AddTokenResponse>(_AddTokenResponse_QNAME, AddTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCategorieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteCategorieResponse")
    public JAXBElement<DeleteCategorieResponse> createDeleteCategorieResponse(DeleteCategorieResponse value) {
        return new JAXBElement<DeleteCategorieResponse>(_DeleteCategorieResponse_QNAME, DeleteCategorieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateUtilisateur")
    public JAXBElement<UpdateUtilisateur> createUpdateUtilisateur(UpdateUtilisateur value) {
        return new JAXBElement<UpdateUtilisateur>(_UpdateUtilisateur_QNAME, UpdateUtilisateur.class, null, value);
    }

}
