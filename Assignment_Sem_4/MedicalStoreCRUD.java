package Assignment_Sem_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MedicalStoreCRUD extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4;
    JButton add, view, update, delete;

    Connection con;

    MedicalStoreCRUD() {
        setTitle("Medical Store Billing System");

        // Labels
        JLabel l1 = new JLabel("ID");
        JLabel l2 = new JLabel("Name");
        JLabel l3 = new JLabel("Price");
        JLabel l4 = new JLabel("Quantity");

        // TextFields
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        // Buttons
        add = new JButton("Add");
        view = new JButton("View");
        update = new JButton("Update");
        delete = new JButton("Delete");

        // Layout
        setLayout(new GridLayout(5, 2));
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(add); add(view);
        add(update); add(delete);

        // Button Actions
        add.addActionListener(this);
        view.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);

        // DB Connection
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medical_store",
                    "root", "password"
            );
        } catch (Exception e) {
            System.out.println(e);
        }

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int id = Integer.parseInt(t1.getText());
            String name = t2.getText();
            double price = Double.parseDouble(t3.getText());
            int qty = Integer.parseInt(t4.getText());

            if (e.getSource() == add) {
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO medicine VALUES (?, ?, ?, ?)"
                );
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setDouble(3, price);
                ps.setInt(4, qty);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Added");
            }

            if (e.getSource() == view) {
                PreparedStatement ps = con.prepareStatement(
                        "SELECT * FROM medicine WHERE id=?"
                );
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(String.valueOf(rs.getDouble("price")));
                    t4.setText(String.valueOf(rs.getInt("quantity")));
                } else {
                    JOptionPane.showMessageDialog(this, "Record Not Found");
                }
            }

            if (e.getSource() == update) {
                PreparedStatement ps = con.prepareStatement(
                        "UPDATE medicine SET name=?, price=?, quantity=? WHERE id=?"
                );
                ps.setString(1, name);
                ps.setDouble(2, price);
                ps.setInt(3, qty);
                ps.setInt(4, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
            }

            if (e.getSource() == delete) {
                PreparedStatement ps = con.prepareStatement(
                        "DELETE FROM medicine WHERE id=?"
                );
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new MedicalStoreCRUD();
    }
}