/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.api;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author BahaMoviX
 */

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() throws IOException {
        initComponents();
        jTable1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jSpinner1.setValue(100);
        this.getContentPane().setBackground( Color.decode("#F9EBEA") );
        this.comLink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الأشخاص الذين يتابعون سلطانھ ⁶⁰⁰ᵏ (@Q1s1Q) | تويتر", "الأشخاص الذين يتابعون ᷂حلوى ᷂القطن 🇸🇦1ᵐ (@7lw__) | تويتر", "الأشخاص الذين يتابعون ࿐ابـن واايــل࿐ (@zrrrm) | تويتر", "الأشخاص الذين يتابعون فهد الصقعبي 🇸🇦 (@fssl1999) | تويتر", "الأشخاص الذين يتابعون ᎷᎪYᏆᎠ (@_MMll_) | تويتر", "الأشخاص الذين يتابعون تفاصيل شرقي (@qalcc) | تويتر", "الأشخاص الذين يتابعون ‏ ‏فــھــد♡ ♔✰ ¹ᴹ ࿐ (@p22__) | تويتر", "الأشخاص الذين يتابعون ‏ﺂﻟﭴۆھَہّړُھَہ³⁵⁰ᴷ (@_jo_18) | تويتر", "الأشخاص الذين يتابعون ‏مشاعر 1Ꮇ❗️ (@08a) | تويتر", "الأشخاص الذين يتابعون عقد خروج🚫 (@__bc1) | تويتر", "الأشخاص الذين يتابعون انثى من خيال (@Hs___5) | تويتر", "الأشخاص الذين يتابعون العـαℓαтнвـذب (@3thb511) | تويتر", "الأشخاص الذين يتابعون ‏اناقة حرف 🙋‍♂️💙 (@maz___1) | تويتر", "الأشخاص الذين يتابعون ♡sʜoooq💙🎼 (@shOOOq_M) | تويتر", "الأشخاص الذين يتابعون *✒الحر الأشقر*✒ فارس (@Ashger_70R) | تويتر", "الأشخاص الذين يتابعون فالح الظفيري 🇰🇼 (@Faleh_HD) | تويتر", "الأشخاص الذين يتابعون .nour. 🏇🏻 (@loura_3) | تويتر", "الأشخاص الذين يتابعون مُجَرَّد مشآعر (@Bas330) | تويتر", "الأشخاص الذين يتابعون شمالي رايق ‏²⁰⁰ᴷ (@Shmaliie) | تويتر", "الأشخاص الذين يتابعون #مساعد .. 🇰🇼 (@B88R_) | تويتر", "الأشخاص الذين يتابعون ‏مروان الوصابي₁Ꮇ (@K800_) | تويتر", "الأشخاص الذين يتابعون ᎷᎪYᏆᎠ (@_Mayid_) | تويتر" }));
        this.setLocationRelativeTo(null);
       // String line;
       
     File f = new File("MyFile.txt");
if(!f.exists()) { 
    // do something
    System.out.println("File is not exist");
                String filename = "MyFile.txt";
                //ErrorCheck ec   = new ErrorCheck();            // Recommend not creating this until/unless you need it
             String fileName = filename; // VERY poor practice having two locals that only differ by the capitalization of one character in the middle (`filename` and `fileName`)
             Path filePath   = Paths.get(fileName);


             try {

                 Files.createDirectories(filePath.getParent());  // No need for your null check, so I removed it; based on `fileName`, it will always have a parent
                  //Charset StandardCharsets;
                 // Open the file, creating it if it doesn't exist
                 try (
                     final BufferedWriter out = Files.newBufferedWriter(
                                                     filePath,
                                                     StandardCharsets.UTF_8,
                                                     StandardOpenOption.CREATE,
                                                     StandardOpenOption.APPEND)
                 ) {
                     // Write to out here
                 }
             } catch (Exception ec) {
                 // Log-and-continue isn't generally best practice; and if you're going to do it
                 //ec.("ERROR: GSW.SendEmail.Exception =>",ec); // <== Um...send mail failed? This isn't sending mail, it's putting something in a file.
                 System.out.println("File Error");
             }
      }
       
       try{
            String out= "";
             for (String line : Files.readAllLines(Paths.get("MyFile.txt"))) {
                 out = line;
             }
             this.lines = out.split("&&");
             String[][] rows = new String[this.lines.length][3] ;
             String[] cols = {"Email","Name","Password"};
             for(int i = 0 ; i < this.lines.length ; i++)
             {
                 System.out.println(this.lines[i]);
                 rows[i] = this.lines[i].split("#");

             }
            System.out.println("SDFS");
           //jTable1.getModel().setValueAt("Math", 0, 0);
             for (int x = 1 ; x < this.lines.length ; x ++)
             {
                 for(int y = 0 ; y < 2 ; y++)
                 {
                     jTable1.getModel().setValueAt(rows[x][y], x, y); //===> Error here

                 }
             }
            // jTable1.setRowSelectionInterval(0, 0);
       }catch(Exception rre)
               
               {
                   String filename2d= "MyFile.txt";
                   FileWriter fw = new FileWriter(filename2d,true); //the true will append the new data
                //fw.write("&&"+name.getText()+"#"+email.getText()+"#"+password.getText());//appends the string to the file
    
                    fw.close();
               }
        //jTable1 = new javax.swing.JTable(WordSearch.letters, cols);
        
        //jTable1.firePropertyChange();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comLink = new javax.swing.JComboBox<>();
        url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twitter AP");
        setBackground(new java.awt.Color(255, 242, 243));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAlignmentX(3.0F);
        jTable1.setAlignmentY(3.0F);
        jTable1.setGridColor(new java.awt.Color(79, 77, 148));
        jTable1.setRowHeight(26);
        jTable1.setSelectionBackground(new java.awt.Color(79, 77, 148));
        jTable1.setSelectionForeground(new java.awt.Color(217, 216, 216));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(82, 39, 145));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("اضافة حساب جديد");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(82, 39, 145));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("مسح المتابيع ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(82, 39, 145));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("اضافة متابعين");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comLink.setBackground(new java.awt.Color(82, 39, 145));
        comLink.setEditable(true);
        comLink.setForeground(new java.awt.Color(255, 255, 255));
        comLink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الأشخاص الذين يتابعون سلطانھ ⁶⁰⁰ᵏ (@Q1s1Q) | تويتر", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" }));

        jLabel1.setText("او");

        jLabel2.setText("من");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("r");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("تلقائي");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("عدد المتابعين");

        jButton5.setBackground(new java.awt.Color(255, 0, 32));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("خروج");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 32));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("مسح الحساب");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comLink, 0, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(comLink, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        newAcc sh = new newAcc();
        sh.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
     
       
       // sho.setData();
       
       try
       {
           int[] rows = jTable1.getSelectedRows();
           for(int i = 0 ; i < rows.length ; i ++)
           {
                DeleteUsers sho = new DeleteUsers();
               
                sho.setData(this.lines[rows[i]].split("#")[1], this.lines[rows[i]].split("#")[2]);
                sho.show();
           }
       }
       catch(Exception ex)
       {
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:\\
        
        if(jCheckBox1.isSelected())
        {
            System.out.println("Multi accounts");
            int numFollowers = (Integer)jSpinner1.getValue();
            System.out.println("Numbers "+numFollowers);
        try
       {
           int[] rows = jTable1.getSelectedRows();
           
           String[] Emails = new String[rows.length];
           String[] passwords = new String[rows.length];
           
           for(int i = 0 ; i < rows.length ; i++)
           {
               Emails[i] = this.lines[rows[i]].split("#")[1];
               passwords[i] = this.lines[rows[i]].split("#")[2];
           }
               AddUsers add = new AddUsers();
                if(this.url.getText().equals("") || this.url.getText().equals(null))

                {
                    String[] URLArr = new String[22];
                URLArr[0] = "https://twitter.com/Q1s1Q/followers";
                URLArr[1] = "https://twitter.com/7lw__/followers";
                URLArr[2] = "https://twitter.com/zrrrm/followers";
                URLArr[3] = "https://twitter.com/fssl1999/followers";
                URLArr[4] = "https://twitter.com/_MMll_/followers";
                URLArr[5] = "https://twitter.com/qalcc/followers";
                URLArr[6] = "https://twitter.com/p22__/followers";
                URLArr[7] = "https://twitter.com/_jo_18/followers";
                URLArr[8] = "https://twitter.com/08a/followers";
                URLArr[9] = "https://twitter.com/__bc1/followers";
                URLArr[10] = "https://twitter.com/Hs___5/followers";
                URLArr[11] = "https://twitter.com/3thb511/followers";
                URLArr[12] = "https://twitter.com/maz___1/followers";
                URLArr[13] = "https://twitter.com/shOOOq_M/followers";
                URLArr[14] = "https://twitter.com/Ashger_70R/followers";
                URLArr[15] = "https://twitter.com/Faleh_HD/followers";
                URLArr[16] = "https://twitter.com/loura_3/followers";
                URLArr[17] = "https://twitter.com/Bas330/followers";
                URLArr[18] = "https://twitter.com/Shmaliie/followers";
                URLArr[19] = "https://twitter.com/B88R_/followers";
                URLArr[20] = "https://twitter.com/K800_/followers";
                URLArr[21] = "https://twitter.com/_Mayid_/followers";

                add.setData(Emails, passwords, URLArr[comLink.getSelectedIndex()],numFollowers);
                 add.show();
                }
                else
                {
                    add.setData(Emails, passwords,this.url.getText(),numFollowers);
                    add.show();
                }
        
       }catch(Exception exe)
       {
           
       }
       }
           else
        {
            jSpinner1 = new JSpinner(new SpinnerNumberModel(0, 0, 30, 1));
            int numFollowers = (Integer)jSpinner1.getValue();
           try
       {
           int[] rows = jTable1.getSelectedRows();
           for(int i = 0 ; i < rows.length ; i ++)
           {
               AddUsers add = new AddUsers();
                if(this.url.getText().equals("") || this.url.getText().equals(null))

                {
                    String[] URLArr = new String[22];
                URLArr[0] = "https://twitter.com/Q1s1Q/followers";
                URLArr[1] = "https://twitter.com/7lw__/followers";
                URLArr[2] = "https://twitter.com/zrrrm/followers";
                URLArr[3] = "https://twitter.com/fssl1999/followers";
                URLArr[4] = "https://twitter.com/_MMll_/followers";
                URLArr[5] = "https://twitter.com/qalcc/followers";
                URLArr[6] = "https://twitter.com/p22__/followers";
                URLArr[7] = "https://twitter.com/_jo_18/followers";
                URLArr[8] = "https://twitter.com/08a/followers";
                URLArr[9] = "https://twitter.com/__bc1/followers";
                URLArr[10] = "https://twitter.com/Hs___5/followers";
                URLArr[11] = "https://twitter.com/3thb511/followers";
                URLArr[12] = "https://twitter.com/maz___1/followers";
                URLArr[13] = "https://twitter.com/shOOOq_M/followers";
                URLArr[14] = "https://twitter.com/Ashger_70R/followers";
                URLArr[15] = "https://twitter.com/Faleh_HD/followers";
                URLArr[16] = "https://twitter.com/loura_3/followers";
                URLArr[17] = "https://twitter.com/Bas330/followers";
                URLArr[18] = "https://twitter.com/Shmaliie/followers";
                URLArr[19] = "https://twitter.com/B88R_/followers";
                URLArr[20] = "https://twitter.com/K800_/followers";
                URLArr[21] = "https://twitter.com/_Mayid_/followers";

                add.setData(this.lines[rows[i]].split("#")[1], this.lines[rows[i]].split("#")[2], URLArr[comLink.getSelectedIndex()],numFollowers);
                 add.show();
                }
                else
                {
                    add.setData(this.lines[rows[i]].split("#")[1], this.lines[rows[i]].split("#")[2],this.url.getText(),numFollowers);
                    add.show();
                }
           }
       }
           catch(Exception ee)
           {
               
           }
           //add.setData(Email, password, Url);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            this.dispose();
           // this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            TwitterAPI x = new TwitterAPI();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int result = JOptionPane.showConfirmDialog(null, 
   "هل تريد مسح هذا الحساب ؟",null, JOptionPane.YES_NO_OPTION);
if(result == JOptionPane.YES_OPTION) {
     String out= "";
     try
     {
        try {
            // TODO add your handling code here:
             
            for (String line : Files.readAllLines(Paths.get("MyFile.txt"))) {
                out = line;
            }
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lines = out.split("&&");
        int sizeOfDeletedUsers = lines.length - jTable1.getSelectedRows().length;
       String[] rows = new String[sizeOfDeletedUsers];
       int Count = 0;
        for(int i = 0 ; i < this.lines.length ; i++)
        {
            
            if(!ArrayUtils.contains(jTable1.getSelectedRows(),i))
            {
                rows[Count] = this.lines[i];
                Count++;
            }
            
        }
        String str ="";
        for (int x = 0 ; x < rows.length ; x++)
        {
            str += rows[x]+"&&";
        }
            String filename= "MyFile.txt";
            
            File file = new File(filename);
        try {
            file.createNewFile();
             FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
           
         try {
            this.dispose();
           // this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            TwitterAPI x = new TwitterAPI();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
}catch(Exception ss)
        {
        
        }
       
        
}
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comLink;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
    private String[] lines ;
}
