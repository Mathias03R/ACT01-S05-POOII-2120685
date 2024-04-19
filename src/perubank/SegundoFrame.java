package perubank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SegundoFrame extends JFrame {
    private JTextField txtName, txtEmail, txtPassword;
    
    public SegundoFrame(PrimerFrame frame) {
        this.setTitle("Registrarse");
        setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                frame.activarFrame();
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel title = new JLabel("Registrarse");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(title);
        
        txtName = new JTextField();
        txtName.setText("Name");
        
        txtEmail = new JTextField();
        txtEmail.setText("Email");

        txtPassword = new JPasswordField();
        txtPassword.setText("Password");

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setFont(new Font("Arial", Font.BOLD, 16));
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Registrado!");
            }
        });
        
        panel.add(txtName);
        panel.add(txtEmail);
        panel.add(txtPassword);
        panel.add(btnRegistrar);
        
        this.add(panel);
    }
}
