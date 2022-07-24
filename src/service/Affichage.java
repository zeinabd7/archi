package service;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class Affichage {
    public static void main(String[] args)
    {
        UtilisateurWS stub = new Service1Service().getUtilisateurWSPort();
        List<Utilisateur> et1 =stub.getUtilisateur();
        JButton b1 = new JButton("Modifier");
        JButton b2 = new JButton("Supprimer");


        String columns[] = { "ID", "Login", "Password" , "Role","Actions" };
        Object data[][] = new Object[10][10];
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.print("Welcome to WayToLearnX!");
            }
        });
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setShowVerticalLines(true);
        JScrollPane pane = new JScrollPane(table);
        JFrame f = new JFrame("Liste des utilisateurs");
        JPanel panel = new JPanel();
        panel.add(pane);
        f.add(panel);
        //panel.add(b1);
        panel.add(b2);
        f.setSize(500, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        int i = 0;

        for(Utilisateur et : et1){
            System.out.println(et.getId() +" - "+ et.getLogin() +"- "+ et.getPassword() +"- "+et.getPassword());
            data[i][0] = et.getId() + "";
            data[i][1] = et.getLogin();
            data[i][2] = et.getPassword();
            data[i][3] = et.getRole();
            data[i][4] = panel.add(b1);
            data[i][5] = b2;
            i++;
        }

        /*public void actionPerformed(ActionEvent ae){
        System.out.println(stub.authentification(login1,pass1));
    }*/


    }
}
