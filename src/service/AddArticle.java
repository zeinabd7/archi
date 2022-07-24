
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addArticle complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addArticle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateModification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArticle", propOrder = {
    "titre",
    "contenu",
    "dateCreation",
    "dateModification",
    "categorie"
})
public class AddArticle {

    protected String titre;
    protected String contenu;
    protected String dateCreation;
    protected String dateModification;
    protected int categorie;

    /**
     * Obtient la valeur de la propri�t� titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * D�finit la valeur de la propri�t� titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Obtient la valeur de la propri�t� contenu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * D�finit la valeur de la propri�t� contenu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenu(String value) {
        this.contenu = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateCreation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * D�finit la valeur de la propri�t� dateCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreation(String value) {
        this.dateCreation = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateModification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateModification() {
        return dateModification;
    }

    /**
     * D�finit la valeur de la propri�t� dateModification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateModification(String value) {
        this.dateModification = value;
    }

    /**
     * Obtient la valeur de la propri�t� categorie.
     * 
     */
    public int getCategorie() {
        return categorie;
    }

    /**
     * D�finit la valeur de la propri�t� categorie.
     * 
     */
    public void setCategorie(int value) {
        this.categorie = value;
    }

}
