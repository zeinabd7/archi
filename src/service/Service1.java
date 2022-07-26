package service;

import metier.Connexion;
import metier.Utilisateur;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="UtilisateurWS")

public class Service1{
    @WebMethod
    public boolean deleteUtilisateur(@WebParam(name="id")int id)
    {

        //Statement statement = con.createStatement();
        try {
            Connection con = Connexion.ConnectDB();
            String sql="delete from utilisateur where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setInt(1,id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Suppression effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
    @WebMethod
    public boolean addUtilisateur(@WebParam(name="login")String login,@WebParam(name="password")String password,@WebParam(name="role")String role){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "insert into utilisateur(login,password,role) values(?,?,?)";
            PreparedStatement psmt = null;
            psmt = con.prepareStatement(sql);
            psmt.setString(1, login);
            psmt.setString(2, password);
            psmt.setString(3, role);
            if (psmt.executeUpdate() !=0)
            {
                System.out.println("Insertion reussie");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
        //System.out.println("Insertion reussie");
    }

    @WebMethod
    public List<Utilisateur> getUtilisateur()  {

        try {
            List<Utilisateur>  utilisateurs= new ArrayList<>();
            Connection con = Connexion.ConnectDB();
            String query= "select * from utilisateur ";
            PreparedStatement pst = null;
            pst = con.prepareStatement(query);
            //pst.setInt(1,1);
            ResultSet res= pst.executeQuery();
            while (res.next())
            {
                utilisateurs.add(new Utilisateur(res.getInt("id"),res.getString("login"),res.getString("password"),res.getString("role")));
            }
            return utilisateurs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @WebMethod
    public boolean updateUtilisateur(@WebParam(name="id")int id,@WebParam(name="login")String login,@WebParam(name="password")String password,@WebParam(name="role")String role)
            {

        try {
            Connection con = Connexion.ConnectDB();
            String sql ="update utilisateur set login=?,password=?,role=? where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setString(1, login);
            psmt.setString(2, password);
            psmt.setString(3, role);
            psmt.setInt(4, id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Modification effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;

    }

    @WebMethod
    public String authentification(@WebParam(name="login")String login,@WebParam(name="password")String password){

        try{
            Connection con = Connexion.ConnectDB();
            String query = "SELECT * FROM utilisateur WHERE login = ? AND password = ? limit 1";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(query);
            psmt.setString(1, login);
            psmt.setString(2, password);
            ResultSet rs= psmt.executeQuery();
            if (rs.next() == true)
            {
                //return true;
               return rs.getString("role");
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //return false;
        return "0";
    }

    @WebMethod
    public boolean addToken(@WebParam(name="id_utilisateur")int id_utilisateur){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "insert into jeton(token,id_utilisateur) values(?,?)";
            PreparedStatement psmt = null;
            psmt = con.prepareStatement(sql);
            psmt.setString(1, Token.generate(7));
            psmt.setInt(2, id_utilisateur);
            if (psmt.executeUpdate() !=0)
            {
                System.out.println("Insertion reussie");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }
    @WebMethod
    public boolean deleteToken(@WebParam(name="id_utilisateur")int id_utilisateur){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "delete from jeton where id_utilisateur=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setInt(1,id_utilisateur);
            if (psmt.executeUpdate() !=0){
                System.out.println("Suppression effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }


    @WebMethod
    public String verifyToken(@WebParam(name="id_utilisateur")int id_utilisateur){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "SELECT * FROM jeton WHERE id_utilisateur = ? ";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setInt(1,id_utilisateur);
            ResultSet rs= psmt.executeQuery();
            if (rs.next() == true)
            {
                //return true;
                return rs.getString("token");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "0";
    }

    @WebMethod
    public boolean deleteArticle(@WebParam(name="id")int id)
    {

        //Statement statement = con.createStatement();
        try {
            Connection con = Connexion.ConnectDB();
            String sql="delete from article where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setInt(1,id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Suppression effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @WebMethod
    public boolean updateArticle(@WebParam(name="id")int id,@WebParam(name="titre")String titre,@WebParam(name="contenu")String contenu,@WebParam(name="dateModification")String dateModification,@WebParam(name="categorie")int categorie)
    {

        try {
            Connection con = Connexion.ConnectDB();
            String sql ="update article set titre=?,contenu=?,dateModification=?,categorie=? where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setString(1, titre);
            psmt.setString(2, contenu);
            psmt.setString(3, dateModification);
            psmt.setInt(4, categorie);
            psmt.setInt(5, id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Modification effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;

    }
    @WebMethod
    public boolean addArticle(@WebParam(name="titre")String titre,@WebParam(name="contenu")String contenu,@WebParam(name="dateCreation")String dateCreation,@WebParam(name="dateModification")String dateModification,@WebParam(name="categorie")int categorie){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "insert into article(titre,contenu,dateCreation,dateModification,categorie) values(?,?,?,?,?)";
            PreparedStatement psmt = null;
            psmt = con.prepareStatement(sql);
            psmt.setString(1, titre);
            psmt.setString(2, contenu);
            psmt.setString(3, dateCreation);
            psmt.setString(4, dateModification);
            psmt.setInt(5, categorie);
            if (psmt.executeUpdate() !=0)
            {
                System.out.println("Insertion reussie");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
        //System.out.println("Insertion reussie");
    }
    @WebMethod
    public boolean addCategorie(@WebParam(name="libelle")String libelle){
        try {
            Connection con = Connexion.ConnectDB();
            String sql= "insert into categorie(libelle) values(?)";
            PreparedStatement psmt = null;
            psmt = con.prepareStatement(sql);
            psmt.setString(1, libelle);
            if (psmt.executeUpdate() !=0)
            {
                System.out.println("Insertion reussie");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
        //System.out.println("Insertion reussie");
    }
    @WebMethod
    public boolean updateCategorie(@WebParam(name="id")int id,@WebParam(name="libelle")String libelle)
    {

        try {
            Connection con = Connexion.ConnectDB();
            String sql ="update categorie set libelle=? where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setString(1, libelle);
            psmt.setInt(2, id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Modification effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;

    }
    @WebMethod
    public boolean deleteCategorie(@WebParam(name="id")int id)
    {

        try {
            Connection con = Connexion.ConnectDB();
            String sql="delete from categorie where id=?";
            PreparedStatement psmt = null;
            psmt=con.prepareStatement(sql);
            psmt.setInt(1,id);
            if (psmt.executeUpdate() !=0){
                System.out.println("Suppression effectuée");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }



}
