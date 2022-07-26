package metier;
import java.sql.*;
public class Connexion {
    public static Connection ConnectDB ()
    {
        try{
            String urlPilote ="com.mysql.jdbc.Driver";
            Class.forName(urlPilote);
            //System.out.println ("Le pilote a été bien chargé");
            String urlBD ="jdbc:mysql://145.14.152.151:3306/u399670438_archi";
            String user  ="u399670438_archi";
            String  password="&idWBh9gS";
            Connection con =DriverManager.getConnection(urlBD, user, password);
            //System.out.println ("Connexion bien établie");
            return con;
        } catch (Exception e)
        {
            e.printStackTrace();
            return  null;
        }
    }

}
