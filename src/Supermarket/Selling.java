/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectProduct();
        GetCat();
    }
Connection con=null;
        Statement st=null;
        ResultSet rs=null;
     public void SelectProduct()
        {
            try
            {
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/KMart","Manager","Password@28");
            st=con.createStatement();
            rs=st.executeQuery(" Select * from Manager.PRODUCTS");
            ptable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
                 e.printStackTrace();
            }
        }
      private void GetCat()
        {
          try
            {
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/KMart","Manager","Password@28");
            st=con.createStatement();
            String query="Select * from Manager.CATEGORY";
            rs=st.executeQuery(query);
            while(rs.next())
            {
                String Mycat=rs.getString("CATNAME");
                pcat.addItem(Mycat);
            }
            }
            catch(Exception e)
            {
                 e.printStackTrace();
            }  
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prodid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pqty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pcat = new javax.swing.JComboBox<>();
        pedit = new javax.swing.JButton();
        pclear = new javax.swing.JButton();
        pdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        padd1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtxt = new javax.swing.JTextArea();
        gtotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("   BILLING POINT");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("   BILL ID");

        prodid.setForeground(new java.awt.Color(0, 204, 0));
        prodid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodidActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("  NAME");

        pname.setForeground(new java.awt.Color(0, 204, 0));
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText(" QUANTITY");

        pqty.setForeground(new java.awt.Color(0, 204, 0));
        pqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqtyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("  FILTER BY");

        pcat.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GROCERY", "STATIONERY", "CLOTHES", "TOYS", "UTENSILS", "ELECTRONICS", "BAGS" }));
        pcat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcatActionPerformed(evt);
            }
        });

        pedit.setBackground(new java.awt.Color(0, 204, 0));
        pedit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pedit.setForeground(new java.awt.Color(255, 255, 255));
        pedit.setText("FILTER");
        pedit.setBorder(null);
        pedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peditMouseClicked(evt);
            }
        });
        pedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peditActionPerformed(evt);
            }
        });

        pclear.setBackground(new java.awt.Color(0, 204, 0));
        pclear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pclear.setForeground(new java.awt.Color(255, 255, 255));
        pclear.setText("CLEAR");
        pclear.setBorder(null);
        pclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pclearMouseClicked(evt);
            }
        });

        pdelete.setBackground(new java.awt.Color(0, 204, 0));
        pdelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pdelete.setForeground(new java.awt.Color(255, 255, 255));
        pdelete.setText("PRINT");
        pdelete.setBorder(null);
        pdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdeleteMouseClicked(evt);
            }
        });
        pdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdeleteActionPerformed(evt);
            }
        });

        ptable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ptable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ptable.setRowHeight(25);
        ptable.setSelectionBackground(new java.awt.Color(0, 204, 0));
        ptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ptable);
        if (ptable.getColumnModel().getColumnCount() > 0) {
            ptable.getColumnModel().getColumn(0).setHeaderValue("ID");
            ptable.getColumnModel().getColumn(1).setHeaderValue("NAME");
            ptable.getColumnModel().getColumn(2).setHeaderValue("QUANTITY");
            ptable.getColumnModel().getColumn(3).setHeaderValue("PRICE");
            ptable.getColumnModel().getColumn(4).setHeaderValue("CATEGORY");
        }

        padd1.setBackground(new java.awt.Color(0, 204, 0));
        padd1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        padd1.setForeground(new java.awt.Color(255, 255, 255));
        padd1.setText("ADD TO BILL");
        padd1.setBorder(null);
        padd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                padd1MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("  PRODUCTS LIST");

        billtxt.setColumns(20);
        billtxt.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        billtxt.setRows(5);
        jScrollPane2.setViewportView(billtxt);

        gtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gtotal.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(prodid, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pqty, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(padd1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(pclear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pcat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(pedit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(gtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pedit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pcat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(padd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(pclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText(" LOGOUT");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prodidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodidActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void pqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pqtyActionPerformed

    private void peditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peditMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_peditMouseClicked

    private void peditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peditActionPerformed

    private void pclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pclearMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_pclearMouseClicked

    private void pdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdeleteMouseClicked
        // TODO add your handling code here:
        try
        {
        billtxt.print();
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_pdeleteMouseClicked

    private void pdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdeleteActionPerformed
   int prid,newqty;
    public void update()
   {
           try
            {
                con= DriverManager.getConnection("jdbc:derby://localhost:1527/KMart","Manager","Password@28");
                String query="Update Manager.PRODUCTS set PRODQUAN ="+newqty+""+"where PRODID="+prid;
                Statement add=con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Product Updated Successfully");
                SelectProduct();
                
                
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }}
    Double Uprice,ptotal=0.0,GrdTotal=0.0;
    int Availqty;
    private void ptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)ptable.getModel();
        int MyIndex =ptable.getSelectedRow();
       prid=Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       
       pname.setText(model.getValueAt(MyIndex, 1).toString());
       Uprice=Double.valueOf(model.getValueAt(MyIndex,3).toString());
     //  ptotal=Uprice*Integer.valueOf(pqty.getText());
        Availqty=Integer.valueOf(model.getValueAt(MyIndex,2).toString());
        newqty=Availqty-Integer.valueOf(pqty.getText());
      //  pqty.setText(model.getValueAt(MyIndex, 2).toString());
       // pprice.setText(model.getValueAt(MyIndex, 2).toString());
       
    }//GEN-LAST:event_ptableMouseClicked
 int i=0;
    private void padd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padd1MouseClicked
        // TODO add your handling code here:
        if(pqty.getText().isEmpty()|| pname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(newqty<= Integer.valueOf(pqty.getText()))
        {
            JOptionPane.showMessageDialog(this,"Out of Stock");
        }
        else
        {
            
            i++;
            ptotal=Uprice*Double.valueOf(pqty.getText());
            GrdTotal=GrdTotal+ptotal;
            if(i==1)
            {
                billtxt.setText(billtxt.getText()+"             -------------K MART-------------\n"+" S.No.   PRODUCT     PRICE     QUANTITY     TOTAL\n"+"    "+i+"         "+pname.getText()+"             "+Uprice+"               "+pqty.getText()+"                  "+ptotal+"\n");
            }
            else
            {
                billtxt.setText(billtxt.getText()+"    "+i+"         "+pname.getText()+"             "+Uprice+"               "+pqty.getText()+"                  "+ptotal+"\n");
            }
            gtotal.setText("Rs"+ GrdTotal);
            update();
        }
       

    }//GEN-LAST:event_padd1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:\S\
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void pcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcatActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billtxt;
    private javax.swing.JLabel gtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton padd1;
    private javax.swing.JComboBox<String> pcat;
    private javax.swing.JButton pclear;
    private javax.swing.JButton pdelete;
    private javax.swing.JButton pedit;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pqty;
    private javax.swing.JTextField prodid;
    private javax.swing.JTable ptable;
    // End of variables declaration//GEN-END:variables
}
