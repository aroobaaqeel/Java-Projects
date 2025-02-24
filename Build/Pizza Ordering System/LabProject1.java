/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rao Waqas
 */
public class LabProject1 extends javax.swing.JFrame {

    /**
     * Creates new form LabProject1
     */
    public LabProject1() {
        initComponents();
    }
    
   DefaultTableModel model;
   String item;
   int price;
   Connection con;
   PreparedStatement pst;
PreparedStatement pst1;
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pepp = new javax.swing.JRadioButton();
        periperi = new javax.swing.JRadioButton();
        malai = new javax.swing.JRadioButton();
        atikka = new javax.swing.JRadioButton();
        bbq = new javax.swing.JRadioButton();
        fajita = new javax.swing.JRadioButton();
        tikka = new javax.swing.JRadioButton();
        hot = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        balance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total1 = new javax.swing.JTextField();
        cheese = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        small = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        large = new javax.swing.JRadioButton();
        elarge = new javax.swing.JRadioButton();
        chicken = new javax.swing.JCheckBox();
        top = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        payment1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        coca = new javax.swing.JRadioButton();
        pepsi = new javax.swing.JRadioButton();
        marinda = new javax.swing.JRadioButton();
        fanta = new javax.swing.JRadioButton();
        up = new javax.swing.JRadioButton();
        sprite = new javax.swing.JRadioButton();
        sting = new javax.swing.JRadioButton();
        slice = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(245, 95, 12));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Pizza Ordering System");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rao Waqas\\Pictures\\pizza-3010062__340.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 220, 110));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 110));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(pepp);
        pepp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pepp.setText("Pepperoni");
        pepp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peppActionPerformed(evt);
            }
        });
        jPanel3.add(pepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        buttonGroup2.add(periperi);
        periperi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        periperi.setText("Peri Peri");
        periperi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periperiActionPerformed(evt);
            }
        });
        jPanel3.add(periperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroup2.add(malai);
        malai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        malai.setText("Malai Boti");
        malai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malaiActionPerformed(evt);
            }
        });
        jPanel3.add(malai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        buttonGroup2.add(atikka);
        atikka.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        atikka.setText("Afghani Tikka");
        jPanel3.add(atikka, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        buttonGroup2.add(bbq);
        bbq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bbq.setText("BBQ");
        bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbqActionPerformed(evt);
            }
        });
        jPanel3.add(bbq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonGroup2.add(fajita);
        fajita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fajita.setText("Fajita");
        fajita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajitaActionPerformed(evt);
            }
        });
        jPanel3.add(fajita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        buttonGroup2.add(tikka);
        tikka.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tikka.setText("Tikka");
        tikka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikkaActionPerformed(evt);
            }
        });
        jPanel3.add(tikka, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        buttonGroup2.add(hot);
        hot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hot.setText("Hot & Spicy");
        hot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotActionPerformed(evt);
            }
        });
        jPanel3.add(hot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 330, 170));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 80, -1));
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Payment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Balance");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));
        jPanel1.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 80, -1));

        cheese.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cheese.setText("Extra Cheese  50rs");
        jPanel1.add(cheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(small);
        small.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        small.setText("Small  200rs");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });
        jPanel4.add(small, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonGroup1.add(medium);
        medium.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medium.setText("Medium  400rs");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        jPanel4.add(medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroup1.add(large);
        large.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        large.setText("Large  600rs");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });
        jPanel4.add(large, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        buttonGroup1.add(elarge);
        elarge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        elarge.setText("E Large  800rs");
        jPanel4.add(elarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 170));

        chicken.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chicken.setText("Extra Chicken  75rs");
        jPanel1.add(chicken, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        top.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        top.setText("Extra Topping  30rs");
        jPanel1.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));
        jPanel1.add(payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 80, -1));

        jTabbedPane1.addTab("Pizza", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(coca);
        coca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        coca.setText("Coca Cola   50rs");

        buttonGroup2.add(pepsi);
        pepsi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pepsi.setText("Pepsi   50rs");

        buttonGroup2.add(marinda);
        marinda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        marinda.setText("Marinda   50rs");

        buttonGroup2.add(fanta);
        fanta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fanta.setText("Fanta   50rs");

        buttonGroup2.add(up);
        up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        up.setText("7up   50rs");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        buttonGroup2.add(sprite);
        sprite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sprite.setText("Sprite   50rs");

        buttonGroup2.add(sting);
        sting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sting.setText("Sting  50rs");

        buttonGroup2.add(slice);
        slice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        slice.setText("Slice   50rs");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marinda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprite, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(up))
                .addGap(113, 113, 113)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sting)
                    .addComponent(slice, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coca)
                    .addComponent(fanta)
                    .addComponent(sprite)
                    .addComponent(sting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepsi)
                    .addComponent(marinda)
                    .addComponent(up)
                    .addComponent(slice))
                .addGap(42, 42, 42))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 170));

        jTabbedPane1.addTab("Drinks", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 830, 230));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quanity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 490, 170));

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 100, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 130, 50));

        remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peppActionPerformed

    private void periperiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periperiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periperiActionPerformed

    private void malaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malaiActionPerformed

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumActionPerformed

    private void largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largeActionPerformed

    private void bbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbqActionPerformed

    private void fajitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fajitaActionPerformed

    private void tikkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tikkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tikkaActionPerformed

    private void hotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        if(small.isSelected()== true && bbq.isSelected()==true)
        {
            item= "Small (BBQ)";
            price= 200;
        }
        if(small.isSelected()== true && fajita.isSelected()==true)
        {
            item= "Small (Fajita)";
            price= 200;
        }
        if(small.isSelected()== true && atikka.isSelected()==true)
        {
            item= "Small (Afghani Tikka)";
            price= 200;
        }
        if(small.isSelected()== true && periperi.isSelected()==true)
        {
            item= "Small (Peri Peri)";
            price= 200;
        }
        if(small.isSelected()== true && pepp.isSelected()==true)
        {
            item= "Small (Pepperoni)";
            price= 200;
        }
        if(small.isSelected()== true && tikka.isSelected()==true)
        {
            item= "Small (Tikka)";
            price= 200;
        }
        if(small.isSelected()== true && malai.isSelected()==true)
        {
            item= "Small (Malai Boti)";
            price= 200;
        }
        if(small.isSelected()== true && hot.isSelected()==true)
        {
            item= "Small (Hot & Spicy)";
            price= 200;
        }
        
        else if(medium.isSelected()== true && atikka.isSelected()==true)
        {
            item= "Medium (Afghani Tikka)";
            price= 400;
        }
        else if(medium.isSelected()== true && malai.isSelected()==true)
        {
            item= "Medium (Malai Boti)";
            price= 400;
        }
        else if(medium.isSelected()== true && tikka.isSelected()==true)
        {
            item= "Medium (Tikka)";
            price= 400;
        }
        else if(medium.isSelected()== true && hot.isSelected()==true)
        {
            item= "Medium (Hot & Spicy)";
            price= 400;
        }
        else if(medium.isSelected()== true && periperi.isSelected()==true)
        {
            item= "Medium (Peri Peri)";
            price= 400;
        }
        else if(medium.isSelected()== true && bbq.isSelected()==true)
        {
            item= "Medium (BBQ)";
            price= 400;
        }
        else if(medium.isSelected()== true && fajita.isSelected()==true)
        {
            item= "Medium (Fajita)";
            price= 400;
        }
        else if(medium.isSelected()== true && pepp.isSelected()==true)
        {
            item= "Medium (Pepperoni)";
            price= 400;
        }
                
        else if(large.isSelected()== true && atikka.isSelected()==true)
        {
            item= "Large (Afghani Tikka)";
            price= 600;
        }
        else if(large.isSelected()== true && malai.isSelected()==true)
        {
            item= "Large (Malai Boti)";
            price= 600;
        }
        else if(large.isSelected()== true && tikka.isSelected()==true)
        {
            item= "Large (Tikka)";
            price= 600;
        }
        else if(large.isSelected()== true && hot.isSelected()==true)
        {
            item= "Large (Hot & Spicy)";
            price= 600;
        }
        else if(large.isSelected()== true && periperi.isSelected()==true)
        {
            item= "Large (Tikka)";
            price= 600;
        }
        else if(large.isSelected()== true && bbq.isSelected()==true)
        {
            item= "Large (BBQ)";
            price= 600;
        }
        else if(large.isSelected()== true && fajita.isSelected()==true)
        {
            item= "Large (Fajita)";
            price= 600;
        }
        else if(large.isSelected()== true && pepp.isSelected()==true)
        {
            item= "Large (Pepperoni)";
            price= 600;
        }

        else if(elarge.isSelected()== true && atikka.isSelected()==true)
        {
            item= "Extra Large (Afghani Tikka)";
            price= 800;
        }
        else if(elarge.isSelected()== true && malai.isSelected()==true)
        {
            item= "Extra Large (Malai Boti)";
            price= 800;
        }
        else if(elarge.isSelected()== true && tikka.isSelected()==true)
        {
            item= "Extra Large (Tikka)";
            price= 800;
        }
        else if(elarge.isSelected()== true && hot.isSelected()==true)
        {
            item= "Extra Large (Hot & Spicy)";
            price= 800;
        }
        else if(elarge.isSelected()== true && periperi.isSelected()==true)
        {
            item= "Extra Large (Peri Peri)";
            price= 800;
        }
        else if(elarge.isSelected()== true && bbq.isSelected()==true)
        {
            item= "Extra Large (BBQ)";
            price= 800;
        }
        else if(elarge.isSelected()== true && fajita.isSelected()==true)
        {
            item= "Extra Large (Fajita)";
            price= 800;
        }
        else if(elarge.isSelected()== true && pepp.isSelected()==true)
        {
            item= "Extra Large (Pepperoni)";
            price= 800;
        }
        
        if(pepsi.isSelected()==true)
        {
            item="Pepsi";
            price=50;
        }
        if(coca.isSelected()==true)
        {
            item="Coca Cola";
            price=50;
        }
        if(fanta.isSelected()==true)
        {
            item="Fanta";
            price=50;
        }
        if(marinda.isSelected()==true)
        {
            item="Marinda";
            price=50;
        }
        if(up.isSelected()==true)
        {
            item="7up";
            price=50;
        }
        if(sprite.isSelected()==true)
        {
            item="Sprite";
            price=50;
        }
        if(sting.isSelected()==true)
        {
            item="Sting";
            price=50;
        }
        if(slice.isSelected()==true)
        {
            item="Slice";
            price=50;
        }
        if (cheese.isSelected()== true)
        {
            item="Extra Cheese";
            price=50;
        }
        if (chicken.isSelected() == true)
        {
            item="Extra Chicken";
            price=75;
        }
        if (top.isSelected() == true)
        {
            item="Extra Topping";
            price=30;
        }
        
        

        int qty1= Integer.parseInt(qty.getValue().toString());
        int total= qty1*price;
        
        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
                
        {
            item,
            price,
            qty1,
            total
            
        });
        int sum = 0;
        
        for(int a=0; a<jTable1.getRowCount(); a++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
        }
        total1.setText(Integer.toString(sum));
    }//GEN-LAST:event_addActionPerformed

    public void sales()
    {
        int lastid =0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/pizza","root","");
            String total = total1.getText();
            String bal = balance.getText();
            String pay = payment1.getText();
            String query = "insert into sales(subtotal,pay,bal)values(?,?,?)";
            pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, total);
            pst.setString(2, pay);
             pst.setString(3, bal);
             pst.executeUpdate();
             ResultSet rs = pst.getGeneratedKeys();
             if(rs.next())
            {
                lastid = rs.getInt(1);
            }
            int row = jTable1.getRowCount();
            String query1 = "insert into salesproduct(salesid,prodname,price,qty,total)values(?,?,?,?,?)";
            pst1 = con.prepareStatement(query1);
            String prodname = "";
            int price1;
            int qty2;
            int tot = 0;
            for(int i=0; i<jTable1.getRowCount(); i++)
                    {
                        prodname = (String)jTable1.getValueAt(i, 0);
                         price1 = (int)jTable1.getValueAt(i, 1);
                         qty2 = (int)jTable1.getValueAt(i, 2);
                         tot = (int)jTable1.getValueAt(i, 3);
                        
                         pst1.setInt(1,lastid);
                          pst1.setString(2,prodname);
                          pst1.setInt(3,price1);
                          pst1.setInt(4,qty2);
                          pst1.setInt(5,tot);
                          pst1.executeUpdate();
                        
                    }
            JOptionPane.showMessageDialog(this, "Sales Completed");
            HashMap a = new HashMap();
            a.put("invo", lastid);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(LabProject1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabProject1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        model.removeRow(jTable1.getSelectedRow());
         int sum = 0;
         for(int a=0; a<jTable1.getRowCount(); a++)
        {
            
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
            
        }
        total1.setText(Integer.toString(sum));
    }//GEN-LAST:event_removeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int tot = Integer.parseInt(total1.getText());
        int pay = Integer.parseInt(payment1.getText());
        
        int bal = pay - tot;
        
        balance.setText(String.valueOf(bal));
        
        
        sales();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LabProject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabProject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabProject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabProject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabProject1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JRadioButton atikka;
    private javax.swing.JTextField balance;
    private javax.swing.JRadioButton bbq;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cheese;
    private javax.swing.JCheckBox chicken;
    private javax.swing.JRadioButton coca;
    private javax.swing.JRadioButton elarge;
    private javax.swing.JRadioButton fajita;
    private javax.swing.JRadioButton fanta;
    private javax.swing.JRadioButton hot;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton large;
    private javax.swing.JRadioButton malai;
    private javax.swing.JRadioButton marinda;
    private javax.swing.JRadioButton medium;
    private javax.swing.JTextField payment1;
    private javax.swing.JRadioButton pepp;
    private javax.swing.JRadioButton pepsi;
    private javax.swing.JRadioButton periperi;
    private javax.swing.JSpinner qty;
    private javax.swing.JButton remove;
    private javax.swing.JRadioButton slice;
    private javax.swing.JRadioButton small;
    private javax.swing.JRadioButton sprite;
    private javax.swing.JRadioButton sting;
    private javax.swing.JRadioButton tikka;
    private javax.swing.JCheckBox top;
    private javax.swing.JTextField total1;
    private javax.swing.JRadioButton up;
    // End of variables declaration//GEN-END:variables
}
