package service;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

class TestJButton extends JFrame
{
    UtilisateurWS stub = new Service1Service().getUtilisateurWSPort();
    List<Utilisateur> et1 =stub.getUtilisateur();
    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private String[] columns = new String[3];
    private String[][] data = new String[3][3];
    JButton button = new JButton();
    JButton button1 = new JButton();

    public TestJButton()
    {
        setTitle("Utilisateurs");
        setSize(300,150);
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns = new String[] {"ID", "Login", "Password" , "Role","Modifier","Supprimer"};
        Object data[][] = new Object[6][6];
        int i = 0;

        for(Utilisateur et : et1){
            System.out.println(et.getId() +" - "+ et.getLogin() +"- "+ et.getPassword() +"- "+et.getPassword());
            data[i][0] = et.getId() + "";
            data[i][1] = et.getLogin();
            data[i][2] = et.getPassword();
            data[i][3] = et.getRole();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(data,columns);
        table = new JTable();
        table.setModel(model);
        table.getColumn("Modifier").setCellRenderer(new ButtonRenderer());
        table.getColumn("Modifier").setCellEditor(new ButtonEditor(new JCheckBox()));
        table.getColumn("Supprimer").setCellRenderer(new ButtonRenderer1());
        table.getColumn("Supprimer").setCellEditor(new ButtonEditor1(new JCheckBox()));
        scrollPane = new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);

        button.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        JOptionPane.showMessageDialog(null,"Voulez-vous vraiment modifier?");
                    }
                }
        );
        button1.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        if(table.getSelectedRow() != -1)
                        {
                            model.removeRow(table.getSelectedRow());
                            JOptionPane.showMessageDialog(null, "L'utilisateur a bien été supprimé");
                        }
                    }
                }
        );
    }

    class ButtonRenderer extends JButton implements TableCellRenderer
    {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Modifier" : value.toString());
            return this;
        }
    }
    class ButtonRenderer1 extends JButton implements TableCellRenderer
    {
        public ButtonRenderer1() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Supprimer" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor
    {
        private String label;

        public ButtonEditor(JCheckBox checkBox)
        {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column)
        {
            label = (value == null) ? "Modifier" : value.toString();
            button.setText(label);
            return button;
        }

        public Object getCellEditorValue()
        {
            return new String(label);
        }
    }
    class ButtonEditor1 extends DefaultCellEditor
    {
        private String label;

        public ButtonEditor1(JCheckBox checkBox)
        {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column)
        {
            label = (value == null) ? "Supprimer" : value.toString();
            button1.setText(label);
            System.out.print(label);
            return button1;
        }

        public Object getCellEditorValue()
        {
            return new String(label);
        }
    }

    public static void main(String args[])
    {
        TestJButton f = new TestJButton();
        f.setVisible(true);
    }
}