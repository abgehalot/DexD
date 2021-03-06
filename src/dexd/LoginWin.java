/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexd;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anil
 */
public class LoginWin extends javax.swing.JFrame {

    /**
     * Creates new form LoginWin
     */
    public LoginWin() {
        initComponents();
        this.setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
//        String title="<html>&#x1F4D6 Welcome to DexD</html";
//        jframe.setTitle(title);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        singUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to DexD | A digital diary");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("openBook.png")));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1200, 720));
        setMaximumSize(new java.awt.Dimension(1200, 720));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to DexD");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 230, 1200, 80);

        login.setBackground(new java.awt.Color(0, 204, 204));
        login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login.setText("LogIn");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(600, 520, 100, 30);

        singUp.setBackground(new java.awt.Color(204, 0, 51));
        singUp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        singUp.setForeground(new java.awt.Color(0, 102, 102));
        singUp.setText("Create");
        singUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singUpMouseClicked(evt);
            }
        });
        singUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                singUpKeyPressed(evt);
            }
        });
        getContentPane().add(singUp);
        singUp.setBounds(860, 520, 100, 30);

        jLabel3.setFont(new java.awt.Font("Orator Std", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Username :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 360, 180, 30);

        jLabel4.setFont(new java.awt.Font("Orator Std", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 450, 180, 30);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(600, 360, 230, 28);

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(100, 20));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(600, 450, 230, 30);

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearKeyPressed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(730, 520, 100, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dexd/loginBack.jpeg"))); // NOI18N
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 720));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 720);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        login();
    }//GEN-LAST:event_loginMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_clearMouseClicked

    private void singUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singUpMouseClicked
        // TODO add your handling code here:
        new NewUser().setVisible(true);
    }//GEN-LAST:event_singUpMouseClicked

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)||(evt.getKeyCode() == KeyEvent.VK_SPACE))
            login();
    }//GEN-LAST:event_loginKeyPressed

    private void clearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)||(evt.getKeyCode() == KeyEvent.VK_SPACE)){
            username.setText(null);
            password.setText(null);
        }
    }//GEN-LAST:event_clearKeyPressed

    private void singUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_singUpKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)||(evt.getKeyCode() == KeyEvent.VK_SPACE)){
            new NewUser().setVisible(true);
        }
            
    }//GEN-LAST:event_singUpKeyPressed
    
    private void login(){
        try{
            String user=username.getText();
            String pass=password.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
            String str="select * from users where uname=? and pword=?";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setString(1, user);
            ps.setString(2, pass);

            int row=0;
            ResultSet rs=ps.executeQuery();

            while(rs.next())
            {
                row=rs.getRow();
            }

            if(row==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter valid username and password.\nIf you are a new user, click on create!");
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Welcome "+ user+"!");
                new Dashboard(user).setVisible(true);
                dispose();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWin().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton singUp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
