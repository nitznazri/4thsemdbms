import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;





public class login_form extends javax.swing.JFrame {

    /**
     * Creates new form login_form
     */
    public login_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setText("USERNAME :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 74, 26);

        jLabel4.setText("PASSWORD :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(24, 130, 80, 23);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(110, 90, 180, 20);

        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 180, 80, 20);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(110, 130, 180, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M.4_e0.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 90, 780, 500);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 30, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@localhost:1521:XE";
        String user= "system";
        String pass="iit2012070";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
       // System.out.println("rohit");
        
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
        
           try {
             
                String user1 = username.getText();
                String pass1 = password.getText();
                System.out.println("user name is ="+ user1+" "+pass1);
                String sql = "select * from login where USERNAME = '"+user1+"' and PASSWORD = '"+pass1+"'";
                st= con.createStatement();
                rs = st.executeQuery(sql);
                
                int count=0;
                while(rs.next()){
                    System.out.println("rohit");
                    count++;
                    
                }
                if(count==1){
                    JOptionPane.showMessageDialog(null,"User found,Action granted");
                   try {
                    //HMS_new p = new HMS_new();
                    setVisible(false);
                    //p.setVisible(true);
                    //new start();
                    
                    //frame.dispose();

                    
                }
                   catch(Exception ex){
                       
                   }
                }
                else if(count >1)
                {
                    JOptionPane.showMessageDialog(null,"Access denied as multiple user found");
                }
                else {
                    JOptionPane.showMessageDialog(null,"User not found");
                }
                
                
            } 
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login_form f = new login_form();
                Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
                f.setLocation(screenWidth/4,screenHeight/4);
                f.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
