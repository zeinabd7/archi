package service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import service.UtilisateurWS;
import service.Utilisateur;
import service.Service1Service;

import java.util.List;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener   {
    UtilisateurWS stub = new Service1Service().getUtilisateurWSPort();
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
     JTextField login,password;
    Login()
    {
        userLabel = new JLabel();
        userLabel.setText("Login");
         login = new JTextField(15);
        passLabel = new JLabel();
        passLabel.setText("Password");

        password = new JPasswordField(15);
        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(login);
        newPanel.add(passLabel);
        newPanel.add(password);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }
    public void actionPerformed(ActionEvent ae)
    {
        try {
            String login1=login.getText();
            String pass1=password.getText();
            System.out.println(stub.authentification(login1,pass1));
            if (stub.authentification(login1,pass1)!="0")
            {

                JLabel wel_label = new JLabel(" Bonjour, "+login1+" vous etes "+stub.authentification(login1,pass1));
                TestJButton page = new TestJButton();
                page.setVisible(true);
                page.setSize(500,500);
                page.getContentPane().add(wel_label);

            }
            else{
                JOptionPane.showMessageDialog(null,"Username/Password Error","ERROR", JOptionPane.ERROR_MESSAGE) ;
                userLabel.setText(null);
                passLabel.setText(null);
                userLabel.requestFocus();
            }

        }catch  (Exception e1) {e1.printStackTrace();}
    }

    public static void main(String[] args) {

            try
            {
                //
                Login form = new Login();
                form.setSize(300,200);
                form.setVisible(true);
            }

            catch(Exception e)
            {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le: ");
        System.out.print("\tlogin:");
        String login= sc1.nextLine();
        System.out.print("\tmot de passe:");
        String password=sc1.nextLine();
        System.out.println(stub.authentification(login,password));*/

}
