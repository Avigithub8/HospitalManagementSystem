/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class viewpatient extends javax.swing.JFrame {

    /**
     * Creates new form viewpatient
     */
    public viewpatient() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mn3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        td = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        u = new javax.swing.JButton();
        d = new javax.swing.JButton();
        m = new javax.swing.JRadioButton();
        um = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        a5 = new javax.swing.JRadioButton();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" VIEW PATIENT_INFO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("NAME  :");

        nm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmMouseClicked(evt);
            }
        });
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nmKeyReleased(evt);
            }
        });

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "FATHER NAME", "AGE", "GENDER", "mobile no", "DATE", "blood group", "ADDRESS", "MARITIALSTATUS"
            }
        ));
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("PID  :");

        p1.setText("         -------------------------------");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("PATIENT NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("FATHER NAME:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("AGE :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("GENDER :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("MOBILE NO :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("TODAY DATE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("BLOOD GROUP:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("ADDRESS :");

        ad.setColumns(20);
        ad.setRows(5);
        jScrollPane2.setViewportView(ad);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("MARITIAL STATUS:");

        u.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        u.setText("UPDATE");
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        d.setText("DELETE");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        buttonGroup3.add(m);
        m.setSelected(true);
        m.setText("MARRIED");

        buttonGroup3.add(um);
        um.setText("UNMARRIED");

        buttonGroup2.add(a1);
        a1.setSelected(true);
        a1.setText("  A-");

        buttonGroup2.add(a2);
        a2.setText("  A+");

        buttonGroup2.add(a3);
        a3.setText("  AB");

        buttonGroup2.add(a4);
        a4.setText("  O+");

        buttonGroup2.add(a5);
        a5.setText("  O-");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(g1);
        g1.setSelected(true);
        g1.setText("    MALE");

        buttonGroup1.add(g2);
        g2.setText("FEMALE");

        buttonGroup1.add(g3);
        g3.setText("OTHER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p1)
                            .addComponent(n)
                            .addComponent(f)
                            .addComponent(a)
                            .addComponent(mn3)
                            .addComponent(td, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(g1)
                                .addGap(18, 18, 18)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g1)
                    .addComponent(g2)
                    .addComponent(g3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4)
                    .addComponent(a5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m)
                        .addComponent(um)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        // update button
        
        int pid=Integer.parseInt(p1.getText());
        String patientname=n.getText();
        java.util.Date dt=td.getDate();
        String fathername=f.getText();
        int age=Integer.parseInt(a.getText());
        String address=ad.getText();
        long mobileno=Long.parseLong(mn3.getText());
        String gender;
        if(g1.isSelected())
        {
            gender=g1.getText();
        }
        else if(g2.isSelected()){
            gender=g2.getText();
        }
        else{
            gender=g3.getText();
        }
        String bloodgroup;
        if(a1.isSelected())
        {
            bloodgroup=a2.getText();
        }
        else if(a2.isSelected()){
            bloodgroup=a2.getText();
        }
        else if(a3.isSelected()){
            bloodgroup=a3.getText();}
        else if(a4.isSelected()){
            bloodgroup=a4.getText();}
         
        else {
            bloodgroup=a5.getText();}
        String maritialstatus;
        if(m.isSelected()){
            maritialstatus=m.getText();
        }
        else{
            maritialstatus=um.getText();}
        java.sql.Date td=null;
        try{
        DB.DbConnect.insertUser.setString(1,patientname);
        DB.DbConnect .insertUser.setString(2,fathername);
        DB.DbConnect .insertUser.setInt(3,age);
        DB.DbConnect .insertUser.setString(4,gender);
        DB.DbConnect. insertUser.setLong(5,mobileno);
        td  =new java.sql.Date(dt.getTime());
        DB.DbConnect.insertUser.setDate(6,td);
        DB.DbConnect. insertUser.setString(7,bloodgroup);
        DB.DbConnect .insertUser.setString(8,address);
        DB.DbConnect .insertUser.setString(9,maritialstatus);
        DB.DbConnect. insertUser.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                
    }//GEN-LAST:event_uActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // delete button
        int r=JOptionPane.showConfirmDialog(null,"Do you want to delete",""
                +"Deletion Confirmation",JOptionPane.YES_OPTION);
        if(r==JOptionPane.YES_OPTION);
        try{
            int pid=Integer.parseInt(p1.getText());
            DB.DbConnect.st.executeUpdate("delete from patient_info where p1="+pid);
            JOptionPane.showMessageDialog(null, "Deleted");
            nmKeyReleased(null);
            p1.setText("----------");
            n.setText("");  
           f.setText("");
           a.setText(""+null);
           g1.setSelected(true);
           mn3.setText(""+null);
           td.setDate(null);
           a1.setSelected(true);
           ad.setText(null);
           m.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null,"Data deleted successfully");
        }
    }//GEN-LAST:event_dActionPerformed

    private void nmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nmKeyReleased
        // keyboard key
        try{
        javax.swing.table.DefaultTableModel dtm=(javax.swing.table.DefaultTableModel)t.getModel();
        int rc=dtm.getRowCount();
        while(rc--!=0){
            dtm.removeRow(0);
            
        }
        String n=nm.getText();
        DB.DbConnect.getUser.setString(1, "%" + n + "%");
        ResultSet rs = DB.DbConnect.getUser.executeQuery();
            try {
                while(rs.next()){
                    java.util.Vector row=new java.util.Vector();
                            row.add(rs.getInt("pid"));
                            row.add(rs.getString("patient_name"));
                            row.add(rs.getString("father_name"));
                            row.add(rs.getInt("age"));
                            row.add(rs.getString("gender"));
                            row.add(rs.getLong("mobile_no"));
                            row.add(rs.getDate("today_date"));
                            row.add(rs.getString("blood_group"));
                            row.add(rs.getString("address"));
                            row.add(rs.getString("maritial_status"));
                            dtm.addRow(row);
                }   } catch (SQLException ex) {
                    ex.printStackTrace();
                JOptionPane.showMessageDialog( null, ex);
            }
        }
catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
                }
        
    }//GEN-LAST:event_nmKeyReleased

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void nmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmMouseClicked
        // mouse key
        try{
        int ri=t.getSelectedRow();
        if(ri!=-1){
            int pid=(Integer)t.getValueAt(ri,0);
            String patientname=(String)t.getValueAt(ri,1);
            String fathername=(String)t.getValueAt(ri,2);
            String age=(String)t.getValueAt(ri,3);
            String gender=(String)t.getValueAt(ri,4);
            String mobileno=(String)t.getValueAt(ri,5);
            java.util.Date td1 = (java.util.Date) t.getValueAt(ri, 6);
            String bloodgroup=(String)t.getValueAt(ri,7);
            String address=(String)t.getValueAt(ri,8);
            String maritialstatus=(String)t.getValueAt(ri,9);
            p1.setText(pid+"");
            n.setText(patientname);
            f.setText(fathername);
            a.setText(age);
            
            if(gender.equals("Male"))
                g1.setSelected(true);
            else if(gender.equals("Female"))
                g2.setSelected(true);
            else
                g3.setSelected(true);
             
             m.setText(mobileno);
             td.setDate(td1);
             if(bloodgroup.equals("A-"))
                 a1.setSelected(true);
             
             else if(bloodgroup.equals("A+"))
                 a2.setSelected(true);
             
             else if(bloodgroup.equals("AB"))
                 a3.setSelected(true);
             
             else if(bloodgroup.equals("O+"))
                 a4.setSelected(true);
             
             else
                 a5.setSelected(true);
             ad.setText(address);
             if(maritialstatus.equals("Married"))
                 m.setSelected(true);
             else
                 um.setSelected(true);
             
        
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_nmMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
         try{
        int ri=t.getSelectedRow();
        if(ri!=-1){
            int pid=(Integer)t.getValueAt(ri,0);
            String patientname=(String)t.getValueAt(ri,1);
            String fathername=(String)t.getValueAt(ri,2);
            String age=String.valueOf(t.getValueAt(ri,3));
            String gender=(String)t.getValueAt(ri,4);
            String mobileno=String.valueOf(t.getValueAt(ri,5));
            java.util.Date td1 = (java.util.Date) t.getValueAt(ri, 6);
            String bloodgroup=(String)t.getValueAt(ri,7);
            String address=(String)t.getValueAt(ri,8);
            String maritialstatus=(String)t.getValueAt(ri,9);
            p1.setText(pid+"");
            n.setText(patientname);
            f.setText(fathername);
            a.setText(age);
            
            if(gender.equalsIgnoreCase("Male"))
                g1.setSelected(true);
            else if(gender.equalsIgnoreCase("Female"))
                g2.setSelected(true);
            else 
                g3.setSelected(true);
             
             mn3.setText(mobileno);
             td.setDate(td1);
             if(bloodgroup.equals("A-"))
                 a1.setSelected(true);
             
             else if(bloodgroup.equals("A+"))
                 a2.setSelected(true);
             
             else if(bloodgroup.equals("AB"))
                 a3.setSelected(true);
             
             else if(bloodgroup.equals("O+"))
                 a4.setSelected(true);
             
             else
                 a5.setSelected(true);
             ad.setText(address);
             if(maritialstatus.equalsIgnoreCase("Married"))
                 m.setSelected(true);
             else
                 um.setSelected(true);
             
        
        }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_tMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new viewpatient().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton a5;
    private javax.swing.JTextArea ad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton d;
    private javax.swing.JTextField f;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField mn3;
    private javax.swing.JTextField n;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField p1;
    private javax.swing.JTable t;
    private com.toedter.calendar.JDateChooser td;
    private javax.swing.JButton u;
    private javax.swing.JRadioButton um;
    // End of variables declaration//GEN-END:variables
}
