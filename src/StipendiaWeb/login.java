package StipendiaWeb;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class login extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public login() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
       
    }
    

    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        txt_date.setText((month+1)+"/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+":"+(minute)+":"+second);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        cmd_Login = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_combo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        txt_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        cmd_Login.setBackground(new java.awt.Color(255, 153, 0));
        cmd_Login.setForeground(new java.awt.Color(255, 255, 255));
        cmd_Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cmd_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmd_Login.setLabel("Sign in");
        cmd_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_LoginActionPerformed(evt);
            }
        });
        cmd_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmd_LoginKeyPressed(evt);
            }
        });
        jPanel2.add(cmd_Login);
        cmd_Login.setBounds(670, 470, 160, 40);

        txt_username.setToolTipText("");
        txt_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txt_username);
        txt_username.setBounds(630, 350, 230, 30);

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password);
        txt_password.setBounds(630, 410, 230, 30);

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Usuario" }));
        txt_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comboActionPerformed(evt);
            }
        });
        jPanel2.add(txt_combo);
        txt_combo.setBounds(730, 200, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StipendiaWeb/Images/bk3-07.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 600);

        jMenu2.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StipendiaWeb/Images/Exit.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        txt_date.setText("Date");
        jMenuBar1.add(txt_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void cmd_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_LoginActionPerformed
        // TODO add your handling code here:
      MainMenu j = new MainMenu();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_cmd_LoginActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:#
        System.exit(0); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cmd_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmd_LoginKeyPressed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_cmd_LoginKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
          String sql = "select id,username,password,division from Users Where (username =? and password =? and division =?)";
                
                //"select * from Employeeinfo where username=? and password=? and division=? and id=?";
        try{
           int count =0;
         
           pst=conn.prepareStatement(sql);
           
           
           pst.setString(1,txt_username.getText());
           pst.setString(2,txt_password.getText());
           pst.setString(3, txt_combo.getSelectedItem().toString());
           
           rs=pst.executeQuery();
           
            
           {
           }
           while(rs.next()){
               int id = rs.getInt(1);
               Emp.empId = id;
               count =count+1;
           }
           String access=(txt_combo.getSelectedItem().toString());
             
           
           
           if(access =="Admin") {
           
               if(count==1){
                   JOptionPane.showMessageDialog(null,"Success" );
                   MainMenu j = new MainMenu();
                   j.setVisible(true);
                   this.dispose();
                   
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
           
           }
              
           else if(count>1){
                   JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                   }
           
        
           else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
              
           }
               
           }
               else if(access=="Sales"){
                   
                   if(count ==1){
                   JOptionPane.showMessageDialog(null,"Success");
                   MainMenu j = new MainMenu();
                   j.setVisible (true); 
                   
                   
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
                   }
                   
         
                else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
               
           }    
                   
                   
               }
               
           
        } catch(Exception e)

        {
             JOptionPane.showMessageDialog(null, e);

        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
            
        }
        
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comboActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_Login;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox txt_combo;
    private javax.swing.JMenu txt_date;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
