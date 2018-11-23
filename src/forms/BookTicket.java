/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author manad
 */
public class BookTicket extends javax.swing.JFrame {

    /**
     * Creates new form BookTicket
     */
    public static String Name;
    public BookTicket(String name) {
        initComponents();
        showTableData();
        Name=name;
    }
    
     public BookTicket() {
        initComponents();
        showTableData();
        //Name=name;
    }

  public int newid(int id)
  {
      return id+1;
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datefield = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        typefield = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        slotfield = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Ticket");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Book Ticket");

        jLabel2.setText("Show Name:");

        jLabel3.setText("Show Date:");

        jLabel4.setText("Show Slot:");

        typefield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silver", "Gold", "Platinum" }));
        typefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typefieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Seat Type:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel6.setText("Show Log");

        jButton1.setText("Add Transaction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        slotfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Night" }));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logins/logo_small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(slotfield, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2)
                                        .addComponent(datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(219, 219, 219)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(slotfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typefieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        String name=namefield.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
          
        String date = dateFormat.format(datefield.getDate()); 
        //String date= "date";
        String slot=(String)slotfield.getSelectedItem();
        //int totalseat=Integer.parseInt(seatfield.getText());
        String type=(String)typefield.getSelectedItem();
        
        //int id=Integer.parseInt(idfield.getText());
        
        
        
        String insertStr="";
        try{
       
         Class.forName("com.mysql.jdbc.Driver").newInstance();       
Connection conn = DriverManager.getConnection("jdbc:mysql://"+"localhost"+":"
                + "3306"+"/"+"Sams"+"?"+"user="+"root"+"&password=" + "manad");

         System.out.println("Connected to server");
         
         String sql3= "SELECT MAX(id) AS id FROM Transactions";
         PreparedStatement pst5 = conn.prepareStatement(sql3);
         ResultSet rs5=pst5.executeQuery();
         rs5.first();
            //rs = pst5.executeQuery("SELECT MAX(id) AS id FROM schedule");
         int lastid = rs5.getInt("id");
         
         int id=lastid+1;
         
         int b=0,c=0;
         
        // String sql = "select * from  Showlog where date = ? and slot = ?";
         String sql = "select * from  Showlog where date = ? and slot = ?";
         
//         insertStr= "insert into Show (name, date, slot, totalseat, seatbooked) values("
//                 +quotate(name)+","
//                    +quotate(date)+","
//                    +quotate(slot)+","
//                  +totalseat+","
//                 +b 
//                 +")";

         PreparedStatement pst1 = conn.prepareStatement(sql);
         pst1.setString(1, date);
         pst1.setString(2, slot);
         ResultSet rs1 = pst1.executeQuery();
         
         int temp= 0;//rs1.getInt("seatsbooked");
         
         
         

 
         if(rs1.next() && temp<300)
         {
        int price=0;
             if(type.equals("Gold"))
        {
            price=200;
        }
             if(type.equals("Silver"))
             {
                 price=180;
             }
          if(type.equals("Platinum"))
          {
              price=250;
          }

        insertStr = "insert into Transactions (id,showname,showdate,showslot,amount,performedby) values(?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(insertStr);
        
        st.setInt(1,id);
        st.setString(2, name);
        st.setString(3, date);
        st.setString(4, slot);
        st.setInt(5, price);
        st.setString(6,Name);
        
        st.executeUpdate();
        st.close();
         Statement stmt = conn.createStatement();
            
//            int done=stmt.executeUpdate(insertStr);
            
             JOptionPane.showMessageDialog(null,"Transaction Complete");
             
             
        
 String sql1 = "UPDATE Showlog SET earnings=earnings+"+price+" WHERE date=? and slot=?";
// con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
 PreparedStatement pst = conn.prepareStatement(sql1);
 //pst.setString(4, Rollno.getText());
 pst.setString(1,date);
 pst.setString(2,slot);
 //pst.setString(3,namefield.getText());
 pst.executeUpdate();
 
 int seat=0;
 String sql2 = "UPDATE Showlog SET seatsbooked = seatsbooked+1 WHERE date=? and slot=?";
// con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
 PreparedStatement pst3 = conn.prepareStatement(sql2);
 //pst.setString(4, Rollno.getText());
 pst3.setString(1,date);
 pst3.setString(2,slot);
 //pst.setString(3,namefield.getText());
 pst3.executeUpdate();
 JOptionPane.showMessageDialog(null, "Updated Successfully");
 
  String sql4 = "select * from  Showlog where date = ? and slot = ?";
   PreparedStatement pst7 = conn.prepareStatement(sql4);
   pst7.setString(1, date);
   pst7.setString(2, slot);
   ResultSet rs7 = pst7.executeQuery();
   while(rs7.next())
       seat=rs7.getInt("seatsbooked");
  
             
             //dispose();
             //BookTicket a=new BookTicket();
             //a.setVisible(true);
            //spose();
            
//            commentLabel.setText("1 row inserted");
           
            //getContentPane().removeAll();
            //initComponents();
        
         conn.close();
         
         dispose();
         
         receipt x= new receipt(id,name,date,slot,price,seat,Name);
         x.setVisible(true);
         JOptionPane.showMessageDialog(null,"Ticket Booked");
         
         
        
         
         }
         
         else
             JOptionPane.showMessageDialog(null,"Show does not exist");
             dispose();
             BookTicket a= new BookTicket(Name);
             a.setVisible(true);
        }
       
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        SalesPerson a=new SalesPerson(Name);
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

     public void showTableData(){
try{
Connection conn = DriverManager.getConnection("jdbc:mysql://"+"localhost"+":"
                + "3306"+"/"+"Sams"+"?"+"user="+"root"+"&password=" + "manad");

         System.out.println("Connected to server");
String sql = "SELECT * FROM Showlog";
PreparedStatement pst = conn.prepareStatement(sql);
ResultSet rs=pst.executeQuery();
table.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
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
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefield;
    private javax.swing.JComboBox<String> slotfield;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> typefield;
    // End of variables declaration//GEN-END:variables
}
