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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anil
 */

public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public NewUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public class EmailValidator {
	// Email Regex java
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

	private Pattern pattern;

	private Matcher matcher;

	public EmailValidator() {
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
	}
	public boolean validateEmail(String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phnum = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        rpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        ilog = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create your account!!!");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("openBook.png")));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 600, 550));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(600, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 140, 170, 30);

        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 190, 170, 30);

        jLabel3.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Retype Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 250, 170, 30);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 350, 110, 30);

        email.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(400, 350, 170, 30);

        phnum.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        phnum.setText("91");
        phnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnumActionPerformed(evt);
            }
        });
        getContentPane().add(phnum);
        phnum.setBounds(400, 300, 170, 30);

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(password);
        password.setBounds(400, 190, 170, 30);

        rpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(rpassword);
        rpassword.setBounds(400, 250, 170, 30);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter the following Details");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 60, 390, 60);

        signUp.setBackground(new java.awt.Color(0, 153, 0));
        signUp.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        signUp.setText("SignUp");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        signUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signUpKeyPressed(evt);
            }
        });
        getContentPane().add(signUp);
        signUp.setBounds(400, 420, 75, 30);

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearKeyPressed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(490, 420, 75, 30);

        ilog.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        ilog.setForeground(new java.awt.Color(255, 0, 0));
        ilog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ilog.setToolTipText("");
        ilog.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ilog.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ilog.setMaximumSize(new java.awt.Dimension(340, 100));
        ilog.setMinimumSize(new java.awt.Dimension(340, 100));
        ilog.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(ilog);
        ilog.setBounds(230, 460, 340, 130);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Phone :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 300, 110, 30);

        username.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(400, 140, 170, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dexd/signUp.jpg"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setAutoscrolls(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(600, 550));
        jLabel6.setRequestFocusEnabled(false);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void rpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpasswordActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpActionPerformed

    private void phnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnumActionPerformed

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        // TODO add your handling code here:
        SignUp();
    }//GEN-LAST:event_signUpMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        clearFeilds();
    }//GEN-LAST:event_clearMouseClicked

    private void signUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signUpKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)||(evt.getKeyCode() == KeyEvent.VK_SPACE))
            SignUp();
    }//GEN-LAST:event_signUpKeyPressed

    private void clearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER)||(evt.getKeyCode() == KeyEvent.VK_SPACE))
            clearFeilds();
    }//GEN-LAST:event_clearKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    
    private void updateNew(String uname, String pword, String phnumb,String email){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
                String str="insert into users(uname,pword,phone,email)values(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(str);
                ps.setString(1, uname);
                ps.setString(2, pword);
                ps.setString(3, phnumb);
                ps.setString(4, email);

                int n=ps.executeUpdate();

                if(n>0)
                {   
                    String astr="create table "+uname+"(date DATE primary key,context varchar(15000))";
                    PreparedStatement pr=con.prepareStatement(astr);
//                  pr.setString(1, uname);
                    int m=pr.executeUpdate();
//                    if(m==0){
                    JOptionPane.showMessageDialog(rootPane, "\nYou are registered as "+uname+"!");
                    
                    new Dashboard(uname).setVisible(true);
                    System.gc();
                    java.awt.Window win[] = java.awt.Window.getWindows(); 
                    for(int i=0;i<(win.length-1);i++){ 
                        win[i].dispose(); 
                        win[i]=null;
//                    }
                    } 
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    
    private void SignUp(){
        ilog.setText("<html><p style='text-align:center'>");
        String uname = username.getText();
        String pword = password.getText();
        String rpword = rpassword.getText();
        String phnumb = phnum.getText();
        String eMail = email.getText();
        int len = phnumb.length();
        int flag=0;
        if(!uname.equals("")){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
            String str="select uname from users where uname=?";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setString(1,uname);
            
            int row=0;
            ResultSet rs=ps.executeQuery();

            while(rs.next())
            {
                row=rs.getRow();
            }
            if(row>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Username is already taken!");
                setIlog("Try someother username!");
//                clearFeilds();
            }else
                flag=1;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            setIlog("Enter valid username!");
        }
        if(len!=12){
            setIlog("Invalid Phone Number!");
            flag=0;    
        }
        if(!(rpword.equals(pword))){
            flag=0;
            password.setText(null); 
            rpassword.setText(null);
            setIlog("Password does't match! Please retype");
        }
        if(!eMail.equals("")){
            EmailValidator eValid = new EmailValidator(); 
            if(!eValid.validateEmail(eMail)){
                flag=0;
                setIlog("Enter valid email!");
            }
        }else{
            flag=0;
            setIlog("Enter email!");
        }
        if(flag==1){
            updateNew(uname,pword,phnumb,eMail);
        }else{
            String strm= ilog.getText();
            ilog.setText(strm+"</p></html");
        }
    }
    
    private void setIlog(String s){
        String str = ilog.getText();
        str +=s +" <br>";
        ilog.setText(str);
    }
    
    private void clearFeilds(){
        username.setText(null);
        password.setText(null);
        rpassword.setText(null);
        phnum.setText("91");
        email.setText(null);
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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewUser().setVisible(true);
            }
        });
    }

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField email;
    private javax.swing.JLabel ilog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phnum;
    private javax.swing.JPasswordField rpassword;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
