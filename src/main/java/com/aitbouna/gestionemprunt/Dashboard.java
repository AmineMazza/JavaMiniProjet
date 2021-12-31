package com.aitbouna.gestionemprunt;


import static com.aitbouna.gestionemprunt.LoginSession.NickName;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 *
 * @author AitBouna
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private static String matRef;
    
    public Dashboard() {
        initComponents();
        matGroupBtn.add(videoProjector);
        videoProjector.setActionCommand("videoProjector");
        matGroupBtn.add(computer);
        computer.setActionCommand("computer");
        matGroupBtn.add(microphone);
        microphone.setActionCommand("microphone");
        matGroupBtn.add(printer);
        printer.setActionCommand("printer");
        matGroupBtn.add(speakers);
        speakers.setActionCommand("speakers");
        matGroupBtn.add(computerbk);
        computerbk.setActionCommand("computerbk");
        matGroupBtn.add(physicsbk);
        
        userGroupBtn.add(userHistoryBtn);
        userHistoryBtn.setActionCommand("userHistoryBtn");
        userGroupBtn.add(userLateBtn);
        userLateBtn.setActionCommand("userLateBtn");
        
        physicsbk.setActionCommand("physicsbk");
        nickNameTxt.setText(NickName);
         
        
        returnGoupBtn.add(videoProjector2);
        videoProjector2.setActionCommand("videoProjector2");
        returnGoupBtn.add(computer2);
        computer2.setActionCommand("computer2");
        returnGoupBtn.add(microphone2);
        microphone2.setActionCommand("microphone2");
        returnGoupBtn.add(printer2);
        printer2.setActionCommand("printer2");
        returnGoupBtn.add(speakers2);
        speakers2.setActionCommand("speakers2");
        returnGoupBtn.add(computerbk2);
        computerbk2.setActionCommand("computerbk2");
        returnGoupBtn.add(physicsbk2);
        
    }
    
    String getSelectedRadioBtn(){
        return matGroupBtn.getSelection().getActionCommand();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matGroupBtn = new javax.swing.ButtonGroup();
        userGroupBtn = new javax.swing.ButtonGroup();
        returnGoupBtn = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        videoProjector = new javax.swing.JRadioButton();
        computer = new javax.swing.JRadioButton();
        microphone = new javax.swing.JRadioButton();
        searchAvailabilityBtn = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nickNameTxt = new javax.swing.JLabel();
        printer = new javax.swing.JRadioButton();
        speakers = new javax.swing.JRadioButton();
        computerbk = new javax.swing.JRadioButton();
        physicsbk = new javax.swing.JRadioButton();
        imageLbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        searchResultLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userHistoryBtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        userLateBtn = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        userInfoResultPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        resultPanel2 = new javax.swing.JPanel();
        resultLbl2 = new javax.swing.JLabel();
        mainPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        msgReturnLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        saveReturnBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        videoProjector2 = new javax.swing.JRadioButton();
        computer2 = new javax.swing.JRadioButton();
        microphone2 = new javax.swing.JRadioButton();
        printer2 = new javax.swing.JRadioButton();
        speakers2 = new javax.swing.JRadioButton();
        computerbk2 = new javax.swing.JRadioButton();
        physicsbk2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("select the material concerned :");

        videoProjector.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        videoProjector.setText("videoProjector");
        videoProjector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoProjectorActionPerformed(evt);
            }
        });

        computer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        computer.setText("Computer");
        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });

        microphone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        microphone.setText("Microphone");
        microphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                microphoneActionPerformed(evt);
            }
        });

        searchAvailabilityBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        searchAvailabilityBtn.setText("Search availability");
        searchAvailabilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAvailabilityBtnActionPerformed(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(153, 153, 153));

        cancelBtn.setBackground(new java.awt.Color(204, 204, 204));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("LOGOUT");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome Mr.");

        nickNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nickNameTxt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nickNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(nickNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        printer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        printer.setText("Printer");
        printer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerActionPerformed(evt);
            }
        });

        speakers.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        speakers.setText("Speakers");
        speakers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakersActionPerformed(evt);
            }
        });

        computerbk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        computerbk.setText("Computer book");
        computerbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerbkActionPerformed(evt);
            }
        });

        physicsbk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        physicsbk.setText("Physics book");
        physicsbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsbkActionPerformed(evt);
            }
        });

        imageLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        imageLbl.setForeground(new java.awt.Color(255, 0, 51));
        imageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(videoProjector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(microphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchAvailabilityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(printer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(speakers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(computerbk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physicsbk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(videoProjector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(computer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(microphone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(speakers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(computerbk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(physicsbk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchAvailabilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        searchResultLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        searchResultLbl.setForeground(new java.awt.Color(255, 0, 51));
        searchResultLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchResultLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchResultLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        jLabel3.setText("Search result :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("material loan", jPanel1);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Chose an action :");

        userHistoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        userHistoryBtn.setText("list the borrowing history of a user");
        userHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userHistoryBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("FirstName :");

        jLabel5.setText("LastName :");

        userLateBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        userLateBtn.setText("list late users");

        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInfoResultPanelLayout = new javax.swing.GroupLayout(userInfoResultPanel);
        userInfoResultPanel.setLayout(userInfoResultPanelLayout);
        userInfoResultPanelLayout.setHorizontalGroup(
            userInfoResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        userInfoResultPanelLayout.setVerticalGroup(
            userInfoResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Search result :");

        resultLbl2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout resultPanel2Layout = new javax.swing.GroupLayout(resultPanel2);
        resultPanel2.setLayout(resultPanel2Layout);
        resultPanel2Layout.setHorizontalGroup(
            resultPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(resultLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        resultPanel2Layout.setVerticalGroup(
            resultPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userInfoResultPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userLateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(mainPanel2Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameTxt)
                                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))))
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(resultPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userHistoryBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(userInfoResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("user accounts", mainPanel2);

        msgReturnLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgReturnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgReturnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("fill in user information");

        jLabel10.setText("FirstName :");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel11.setText("LastName :");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        saveReturnBtn.setText("SAVE");
        saveReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReturnBtnActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(saveReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        videoProjector2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        videoProjector2.setText("videoProjector");

        computer2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        computer2.setText("computer");

        microphone2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        microphone2.setText("microphone");

        printer2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        printer2.setText("printer");

        speakers2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        speakers2.setText("speakers");

        computerbk2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        computerbk2.setText("computer book");

        physicsbk2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        physicsbk2.setText("physics book");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Select the Materiel :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(physicsbk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(computerbk2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(videoProjector2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(computer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(microphone2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speakers2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(physicsbk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(computerbk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speakers2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(microphone2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(computer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(videoProjector2)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout mainPanel3Layout = new javax.swing.GroupLayout(mainPanel3);
        mainPanel3.setLayout(mainPanel3Layout);
        mainPanel3Layout.setHorizontalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanel3Layout.setVerticalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("return of material", mainPanel3);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ImageIcon getImage(String  matName) throws Exception{
        
            ImageIcon newImg = null;
            Connection cn = MySQLConnection.getConnection();
            String query  = "Select image from materiels where name = '"+matName+"'";
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                byte[] img = rs.getBytes("image");
                ImageIcon icon = new ImageIcon(img);
                Image image = icon.getImage();
                Image myimg = image.getScaledInstance(imageLbl.getWidth(), imageLbl.getHeight(), Image.SCALE_SMOOTH);
                newImg = new ImageIcon(myimg);
            }   
            rs.close();
            cn.close();
           return newImg;
    }
    
    private void videoProjectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoProjectorActionPerformed
        
        imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
    }//GEN-LAST:event_videoProjectorActionPerformed

    private void searchAvailabilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAvailabilityBtnActionPerformed
       
        searchResultLbl.setText("");
        Connection cnn = null;
        PreparedStatement pstmt1 = null;
        ResultSet rs = null;
        try{
            cnn = MySQLConnection.getConnection();
            String matName = matGroupBtn.getSelection().getActionCommand();
            String query = "SELECT ref,status FROM materiels WHERE Name=?";
            
            pstmt1 = cnn.prepareStatement(query);
            pstmt1.setString(1, matName);
            rs = pstmt1.executeQuery();
            
            rs.next();
            int status  = rs.getInt("status");
            matRef = String.valueOf(rs.getInt("ref"));
            if(status == 0){
                //searchResultLbl.setText(matGroupBtn.getSelection().getActionCommand() +" "+matRef);
                new Emprunt().setVisible(true);
            }else{
                searchResultLbl.setText("Sorry the "+matName+" is not availabale...!");
            }
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchAvailabilityBtnActionPerformed

    private void speakersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakersActionPerformed
        imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");
        }
    }//GEN-LAST:event_speakersActionPerformed

    private void printerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerActionPerformed
       imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
    }//GEN-LAST:event_printerActionPerformed

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerActionPerformed
        imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
        
    }//GEN-LAST:event_computerActionPerformed

    private void computerbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerbkActionPerformed
       imageLbl.setIcon(null);
       ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
    }//GEN-LAST:event_computerbkActionPerformed

    private void physicsbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsbkActionPerformed
        imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
    }//GEN-LAST:event_physicsbkActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        cancelBtn.setForeground(Color.red);
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        cancelBtn.setForeground(Color.white);
    }//GEN-LAST:event_cancelBtnMouseExited

    private void userHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userHistoryBtnActionPerformed
        firstNameTxt.requestFocus();
    }//GEN-LAST:event_userHistoryBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
      
       String buttonSelected = matGroupBtn.getSelection().getActionCommand();
       Connection cnn = null;
       PreparedStatement stmt = null;
       ResultSet rs = null;
       if(true){
            resultLbl2.setText(buttonSelected);   
            String fName = firstNameTxt.getText();
            String lName = lastNameTxt.getText();
            
            String query = "SELECT lastName,dateEmp, dateReturn, name FROM users u, emprunts emp, materiels mat where emp.codeUser = u.userId and emp.codeMat=mat.ref and u.firstName=? and lastName=?";
            
            try {
                stmt = cnn.prepareStatement(query);
                stmt.setString(1,fName);
                stmt.setString(2, lName);
                rs = stmt.executeQuery();
                String lname = rs.getString("lastName");
                String str = lname+" Pol borrowed the following material :\n";
                if(rs.next()){
                    
                    String matName = rs.getString("name");
                    String dateEmp = rs.getString("dateEmp");
                    String dateReturn = rs.getString("dateReturn");
                    str += matName+" from "+dateEmp+" to "+dateReturn+"\n";
                    
                }
                resultLbl2.setText(str);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }   
       }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void microphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microphoneActionPerformed
        imageLbl.setIcon(null);
        ImageIcon image;
        try {
            image = getImage(matGroupBtn.getSelection().getActionCommand());
            imageLbl.setIcon(image);
        } catch (Exception ex) {
            imageLbl.setText("Fail to load image !");

        }
    }//GEN-LAST:event_microphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReturnBtnActionPerformed
        String matSelected = returnGoupBtn.getSelection().getActionCommand();
        
        Connection cnn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        
        try{
            
            String fName = firstNameTxt.getText();
            String lName = lastNameTxt.getText();
            
            cnn = MySQLConnection.getConnection();
            String query = "SELECT ref from materiels where name = ?";
            stmt1 = cnn.prepareStatement(query);
            stmt1.setInt(1, Integer.parseInt(matSelected));
            rs = stmt1.executeQuery();
            if (rs.next()){
                int ref = rs.getInt("ref");
                String query2 = "UPDATE materiels SET status=?";
                 stmt2 = cnn.prepareStatement(query2);
                 stmt2.setInt(1, 0);
                 int n = stmt2.executeUpdate();
                 if(n>0){
                    msgReturnLbl.setText("the return of "+matSelected+" material, by "+fName+" "+lName+" has been recorded on the database");
                 }else{
                     msgReturnLbl.setText("htere was an Error...!");
                 }
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } 
        
    }//GEN-LAST:event_saveReturnBtnActionPerformed

    
    public static String getMatRef(){
        return matRef;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JRadioButton computer;
    private javax.swing.JRadioButton computer2;
    private javax.swing.JRadioButton computerbk;
    private javax.swing.JRadioButton computerbk2;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JPanel mainPanel3;
    private javax.swing.ButtonGroup matGroupBtn;
    private javax.swing.JRadioButton microphone;
    private javax.swing.JRadioButton microphone2;
    private javax.swing.JLabel msgReturnLbl;
    private javax.swing.JLabel nickNameTxt;
    private javax.swing.JRadioButton physicsbk;
    private javax.swing.JRadioButton physicsbk2;
    private javax.swing.JRadioButton printer;
    private javax.swing.JRadioButton printer2;
    private javax.swing.JLabel resultLbl2;
    private javax.swing.JPanel resultPanel2;
    private javax.swing.ButtonGroup returnGoupBtn;
    private javax.swing.JButton saveReturnBtn;
    private javax.swing.JButton searchAvailabilityBtn;
    private javax.swing.JLabel searchResultLbl;
    private javax.swing.JRadioButton speakers;
    private javax.swing.JRadioButton speakers2;
    private javax.swing.JButton submitBtn;
    private javax.swing.ButtonGroup userGroupBtn;
    private javax.swing.JRadioButton userHistoryBtn;
    private javax.swing.JPanel userInfoResultPanel;
    private javax.swing.JRadioButton userLateBtn;
    private javax.swing.JRadioButton videoProjector;
    private javax.swing.JRadioButton videoProjector2;
    // End of variables declaration//GEN-END:variables
}
