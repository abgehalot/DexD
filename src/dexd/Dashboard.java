/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexd;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anil
 */
public class Dashboard extends javax.swing.JFrame {
    String uName,dateG,entry,latent,comp;
    SimpleDateFormat dformat=new SimpleDateFormat("dd-MMM-yyyy");
    SimpleDateFormat dformat2=new SimpleDateFormat("yyyy-MM-dd");
    Color color =new Color(0,0,0,0);
    int editflag=0;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Dashboard(String user) {
        initComponents();
        uName = user;
        uName = uName.substring(0, 1).toUpperCase()+uName.substring(1);
        this.setLocationRelativeTo(null);
        welText.setText("Welcome "+uName+"!");
        addB.setVisible(false);
        editB.setVisible(false);
        entryReset.setVisible(false);
        jScrollPane1.setBorder(null);

//        editFeild.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        welText = new javax.swing.JLabel();
        signOut = new javax.swing.JLabel();
        dateChoose = new com.toedter.calendar.JDateChooser();
        getDate = new javax.swing.JButton();
        displayDate = new javax.swing.JLabel();
        context = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        editB = new javax.swing.JButton();
        addB = new javax.swing.JButton();
        delete = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editFeild = new javax.swing.JTextArea();
        entryReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("openBook.png")));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1200, 720));
        setMaximumSize(new java.awt.Dimension(1200, 720));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

        welText.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        welText.setForeground(new java.awt.Color(153, 51, 255));
        welText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welText.setText("welcome");

        signOut.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        signOut.setForeground(new java.awt.Color(255, 0, 0));
        signOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signOut.setText("Sign Out");
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutMouseClicked(evt);
            }
        });

        dateChoose.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        getDate.setText("Select");
        getDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getDateMouseClicked(evt);
            }
        });
        getDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDateActionPerformed(evt);
            }
        });

        displayDate.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N

        context.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        context.setToolTipText("");
        context.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOpaque(true);

        editB.setBackground(new java.awt.Color(0, 153, 255));
        editB.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        editB.setText("Edit");
        editB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBMouseClicked(evt);
            }
        });
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        addB.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        addB.setText("Add");
        addB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBMouseClicked(evt);
            }
        });

        delete.setText("Delete Your Account ");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        editFeild.setEditable(false);
        editFeild.setBackground(color);
        editFeild.setColumns(20);
        editFeild.setFont(new java.awt.Font("Forte", 0, 16)); // NOI18N
        editFeild.setLineWrap(true);
        editFeild.setRows(5);
        editFeild.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Journal Entry", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N
        editFeild.setNextFocusableComponent(addB);
        editFeild.setOpaque(false);
        editFeild.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(editFeild);

        entryReset.setBackground(new java.awt.Color(51, 0, 0));
        entryReset.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        entryReset.setForeground(new java.awt.Color(204, 0, 0));
        entryReset.setText("Reset Entry");
        entryReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entryResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signOut, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(displayDate, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(context, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(entryReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(getDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(welText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(delete)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(getDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(context)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getDateMouseClicked
        // TODO add your handling code here:
        dateG = dformat.format(dateChoose.getDate());
        displayDate.setText(dateG);
        dateG = dformat2.format(dateChoose.getDate());
        addB.setVisible(true);
        editB.setVisible(true);
        entryReset.setVisible(true);
        getentry();
    }//GEN-LAST:event_getDateMouseClicked

    private void getDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getDateActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBActionPerformed

    private void signOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseClicked
        // TODO add your handling code here:
        dispose();
        new LoginWin().setVisible(true);
        
    }//GEN-LAST:event_signOutMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "\nYour account with "+uName+" and all its data will be deleted permanently!");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
            String str="drop table "+uName;
            PreparedStatement ps=con.prepareStatement(str);
//            ps.setString(1, date);

//            int row=0;
//            String mesg = null;
            int rs=ps.executeUpdate();
//            if(rs==0){
                str="delete from users where uname='"+uName+"'";
                PreparedStatement pr=con.prepareStatement(str);
                int rr=pr.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Drop Table succsesfull!");
//                if(rr==0)
                    JOptionPane.showMessageDialog(rootPane, "delete row from able succsesfull!");
                dispose();
                new LoginWin().setVisible(true);
//            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteMouseClicked

    private void addBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBMouseClicked
        // TODO add your handling code here:
        comp=editFeild.getText();
        if (!comp.equals(latent)){
            updateEntry();
        }
    }//GEN-LAST:event_addBMouseClicked

    private void editBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBMouseClicked
        // TODO add your handling code here:
        editFeild.setEditable(true);
    }//GEN-LAST:event_editBMouseClicked

    private void entryResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entryResetMouseClicked
        // TODO add your handling code 
        editFeild.setText("Add your entry here!");
        addB.setText("Update");
    }//GEN-LAST:event_entryResetMouseClicked

    private void getentry(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
            String str="select context from "+uName+" where date=?";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setString(1, dateG);

            int row=0;
            String mesg = "Add your entry here!";
            ResultSet rs=ps.executeQuery();

            while(rs.next())
            {
                row=rs.getRow();
                mesg=rs.getString("context");
            }
            if(row>0){
//                mesg = mesg.replace("\n", "<br>");
//                context.setText("<html><p style='text-align:justify'>"+mesg+"<p><html>");
                editFeild.setText(mesg);
                latent=mesg;
                editflag=1;
                editFeild.setEditable(false);
                addB.setText("Update");
            }else{
//                context.setText("Add your message!");
                editFeild.setText(mesg);
                latent=mesg;
                editFeild.setEditable(true);
                addB.setText("Add");
                editflag=0;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void updateEntry(){
        String str=null;
        PreparedStatement ps;
        try{
        entry = editFeild.getText();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dexd","root","");
        if(editflag==0){
            latent=editFeild.getText();
            str = "insert into "+uName+"(date,context) values(?,?)";
            ps=con.prepareStatement(str);
            ps.setString(1, dateG);
            ps.setString(2, entry);
        }
        else if(comp.equals("Add your entry here!")){
            latent=editFeild.getText();
            str="delete from "+uName+" where date=?";
            ps=con.prepareStatement(str);
            ps.setString(1, dateG);
            
        }
        else{
            latent=editFeild.getText();
            str = "update "+uName+" set context=? where date=?";
            ps=con.prepareStatement(str);
            ps.setString(1, entry);
            ps.setString(2, dateG);
        }
        int n=ps.executeUpdate();
        if(n>0){
            JOptionPane.showMessageDialog(rootPane, "Journal entry sucessful!");
//            getentry();
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    static class setVisible {

        public setVisible(boolean b) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JLabel context;
    private com.toedter.calendar.JDateChooser dateChoose;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel displayDate;
    private javax.swing.JButton editB;
    private javax.swing.JTextArea editFeild;
    private javax.swing.JButton entryReset;
    private javax.swing.JButton getDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel signOut;
    private javax.swing.JLabel welText;
    // End of variables declaration//GEN-END:variables
}
