package perubank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PrimerFrame extends JFrame {
    private JPanel panel = new JPanel();
    private JPanel usernamePanel = new JPanel();
    private JPanel passwordPanel = new JPanel();
    private JPanel registerPanel = new JPanel();
    
    private JLabel title = new JLabel("Login");
    private JLabel lblUsername = new JLabel("Username:");
    private JTextField txtUsername = new JTextField(10);
    private JLabel lblPassword = new JLabel("Password:");
    private JPasswordField txtPassword = new JPasswordField(10);
    private JCheckBox rememberPassword = new JCheckBox("Remember Password");
    private JButton btnLogin = new JButton("LOGIN");
    private JLabel lblRegister = new JLabel("Don't have an account?");
    private JButton btnRegister = new JButton("Register");
    
    public PrimerFrame() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        title.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(title, gbc);
        
        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.X_AXIS));
        usernamePanel.add(lblUsername);
        usernamePanel.add(txtUsername);
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.add(usernamePanel, gbc);
        
        // Password Panel
        passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.X_AXIS));
        passwordPanel.add(lblPassword);
        passwordPanel.add(txtPassword);
        gbc.gridy++;
        panel.add(passwordPanel, gbc);
        
        // Remember Password
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(rememberPassword, gbc);
        
        // Login Button
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnLogin, gbc);
        
        // Register Panel
        registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.X_AXIS));
        registerPanel.add(lblRegister);
        registerPanel.add(btnRegister);
        gbc.gridy++;
        panel.add(registerPanel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SegundoFrame segundoFrame = new SegundoFrame(PrimerFrame.this);
                segundoFrame.setVisible(true);
                desactivarFrame();
            }
        });
        
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sesion Iniciada");
            }
        });

        this.add(panel);
        
        this.setTitle("Login");
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    public void desactivarFrame(){
        setEnabled(false);
    }
    
    public void activarFrame(){
        setEnabled(true);
    }
}