
package studentenrollmentsystem;

import Courses.AgriFisheryCourses;
import Courses.AutomotiveCourses;
import Courses.ComputerSoftwarDevCourse;
import Courses.ConstructionWeldingCourses;
import Courses.DigitalAnimationCourse;
import Courses.ElectricalElectronicsCourses;
import Courses.EntrepManagementCourses;
import Courses.HRCFmanagementCourse;
import Courses.HouseHoldHouseKeepingCourses;
import java.awt.Desktop;
import java.net.URL;
import ViewCourses.ViewCourse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class StudentFrame extends javax.swing.JFrame {

    ApplicationForm apply;

    public StudentFrame(ApplicationForm apply) {
        this.apply = apply;
    }

    public StudentFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(20);
        
}   

 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        myProfileButton = new javax.swing.JButton();
        notifButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        newCoursesAddedpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        programmingJavaApplyBtn = new javax.swing.JButton();
        viewCourse1 = new javax.swing.JButton();
        automotiveApplyBtn = new javax.swing.JButton();
        viewCourse2 = new javax.swing.JButton();
        agriProductionApplyBtn = new javax.swing.JButton();
        viewCourse3 = new javax.swing.JButton();
        foodbeverageApplyBtn = new javax.swing.JButton();
        viewCourse4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        myCoursesTab = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        profilepanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        firstNametxt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        middletxt = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        lasttxt = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        bdaytxt = new com.github.lgooddatepicker.components.DatePicker();
        userTabpane = new javax.swing.JTabbedPane();
        trainingSchedpanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        trainingTable = new javax.swing.JTable();
        timeInBtn = new javax.swing.JButton();
        timeOutBtn = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        programlabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        programsTable = new javax.swing.JTable();
        courseOfferedTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        category2 = new javax.swing.JButton();
        category3 = new javax.swing.JButton();
        category4 = new javax.swing.JButton();
        category5 = new javax.swing.JButton();
        category6 = new javax.swing.JButton();
        category8 = new javax.swing.JButton();
        category10 = new javax.swing.JButton();
        category12 = new javax.swing.JButton();
        category13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (2).png"))); // NOI18N

        jLabel2.setText("TESDA");
        jLabel2.setFont(new java.awt.Font("Schadow BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));

        searchTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        searchTextField.setOpaque(false);
        searchTextField.setToolTipText("");
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("🔍  Search");
        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setForeground(new java.awt.Color(0, 51, 102));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        myProfileButton.setText("👨  My Profile");
        myProfileButton.setBackground(new java.awt.Color(255, 255, 255));
        myProfileButton.setForeground(new java.awt.Color(0, 51, 153));
        myProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileButtonActionPerformed(evt);
            }
        });

        notifButton.setText("🔔  Notifications");
        notifButton.setBackground(new java.awt.Color(255, 255, 255));
        notifButton.setForeground(new java.awt.Color(0, 51, 153));
        notifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(notifButton)
                .addGap(18, 18, 18)
                .addComponent(myProfileButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchTextField)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(myProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(notifButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1385, 750));

        homeTab.setBackground(new java.awt.Color(255, 255, 255));

        newCoursesAddedpanel.setBackground(new java.awt.Color(255, 255, 255));
        newCoursesAddedpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel3.setText("Let's Start Learning");
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 10, 5));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java.png"))); // NOI18N

        jLabel9.setText("PROGRAMMING JAVA NCIII");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setText("Training Duration: ");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setText("Daily Training Hours: ");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setText("8 hours per day");
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel12.setText("240 hours");
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automotive.png"))); // NOI18N

        jLabel14.setText("AUTOMOTIVE SERVICING NCII");
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));

        jLabel15.setText("Training Duration: ");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel16.setText("676 hours");
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel17.setText("Daily Training Hours: ");
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel18.setText("8 hours per day");
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agricultural crops.png"))); // NOI18N

        jLabel20.setText("AGRICULTURAL CROPS PRODUCTION NCII");
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));

        jLabel22.setText("336 hours");
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel23.setText("Daily Training Hours: ");
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel24.setText("8 hours per day");
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel31.setText("Training Duration: ");
        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOOD AND BEVERAGE SERVICING NCII.png"))); // NOI18N

        jLabel26.setText("FOOD AND BEVERAGE SERVICING NCII");
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));

        jLabel27.setText("Duration: ");
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel28.setText("356 hours");
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel29.setText("Daily Training Hours: ");
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel30.setText("8 hours per day");
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 8, 10, 0));

        programmingJavaApplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        programmingJavaApplyBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        programmingJavaApplyBtn.setText("Apply");
        programmingJavaApplyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programmingJavaApplyBtnMouseClicked(evt);
            }
        });
        programmingJavaApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmingJavaApplyBtnActionPerformed(evt);
            }
        });
        jPanel5.add(programmingJavaApplyBtn);

        viewCourse1.setBackground(new java.awt.Color(255, 255, 255));
        viewCourse1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewCourse1.setText("View Course");
        viewCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourse1ActionPerformed(evt);
            }
        });
        jPanel5.add(viewCourse1);

        automotiveApplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        automotiveApplyBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        automotiveApplyBtn.setText("Apply");
        automotiveApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automotiveApplyBtnActionPerformed(evt);
            }
        });
        jPanel5.add(automotiveApplyBtn);

        viewCourse2.setBackground(new java.awt.Color(255, 255, 255));
        viewCourse2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewCourse2.setText("View Course");
        viewCourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourse2ActionPerformed(evt);
            }
        });
        jPanel5.add(viewCourse2);

        agriProductionApplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        agriProductionApplyBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agriProductionApplyBtn.setText("Apply");
        agriProductionApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agriProductionApplyBtnActionPerformed(evt);
            }
        });
        jPanel5.add(agriProductionApplyBtn);

        viewCourse3.setBackground(new java.awt.Color(255, 255, 255));
        viewCourse3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewCourse3.setText("View Course");
        viewCourse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourse3ActionPerformed(evt);
            }
        });
        jPanel5.add(viewCourse3);

        foodbeverageApplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        foodbeverageApplyBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        foodbeverageApplyBtn.setText("Apply");
        foodbeverageApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodbeverageApplyBtnActionPerformed(evt);
            }
        });
        jPanel5.add(foodbeverageApplyBtn);

        viewCourse4.setBackground(new java.awt.Color(255, 255, 255));
        viewCourse4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewCourse4.setText("View Course");
        viewCourse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourse4ActionPerformed(evt);
            }
        });
        jPanel5.add(viewCourse4);

        javax.swing.GroupLayout newCoursesAddedpanelLayout = new javax.swing.GroupLayout(newCoursesAddedpanel);
        newCoursesAddedpanel.setLayout(newCoursesAddedpanelLayout);
        newCoursesAddedpanelLayout.setHorizontalGroup(
            newCoursesAddedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newCoursesAddedpanelLayout.createSequentialGroup()
                .addGroup(newCoursesAddedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newCoursesAddedpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newCoursesAddedpanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(newCoursesAddedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        newCoursesAddedpanelLayout.setVerticalGroup(
            newCoursesAddedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newCoursesAddedpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(285, 264));

        jLabel5.setText("VISION");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("The transformational leader in the technical education and\n skills development of the Filipino workforce.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel7.setText("MISSION");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel7.setPreferredSize(new java.awt.Dimension(78, 15));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("TESDA sets direction, promulgates relevant standards,\n and implements programs geared towards quality assured and \ninclusive technical education and \nskills development and certification system.");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
                .addGap(480, 480, 480))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel7);

        jScrollPane2.setViewportView(jPanel6);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel8.setText("FAQ's ");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(77, 150));
        jPanel14.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("STEPS IN APPLYING ASSESSMENT AND CERTIFICATION");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1);

        jButton4.setText("HOW TO APPLY FOR A SCHOLARSHIP AT TESDA");
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton4.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4);

        jButton5.setText("WHAT ARE THE BENIFITS YOU CAN EXPECT AT TESDA?");
        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton5.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton5);

        jButton6.setText("ELIGIBILITY CRITERIA");
        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton6.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton6);

        jButton7.setText("What is the validity of the NC or COC?");
        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton7.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("️FOR MORE INFO. CLICK HERE");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setMaximumSize(new java.awt.Dimension(800, 40));
        jButton8.setPreferredSize(new java.awt.Dimension(700, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8);

        jScrollPane5.setViewportView(jPanel14);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newCoursesAddedpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(newCoursesAddedpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Home", homeTab);

        myCoursesTab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("USER'S NAME");
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        profilepanel.setBackground(new java.awt.Color(255, 255, 255));
        profilepanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userProf.png"))); // NOI18N

        jLabel33.setText("First Name");
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 153));

        middletxt.setEditable(false);

        jLabel34.setText("Middle Name");
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 153));

        lasttxt.setEditable(false);

        jLabel35.setText("Last Name");
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 153));

        jLabel36.setText("Age");
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 153));

        agetxt.setEditable(false);

        jLabel37.setText("Gender");
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 153));

        gendertxt.setEditable(false);

        emailtxt.setEditable(false);

        jLabel38.setText("Email");
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 153));

        jLabel39.setText("Birth-Date");
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 102, 153));

        bdaytxt.setEnabled(false);

        javax.swing.GroupLayout profilepanelLayout = new javax.swing.GroupLayout(profilepanel);
        profilepanel.setLayout(profilepanelLayout);
        profilepanelLayout.setHorizontalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilepanelLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bdaytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNametxt)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middletxt)
                    .addComponent(lasttxt)
                    .addGroup(profilepanelLayout.createSequentialGroup()
                        .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profilepanelLayout.setVerticalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lasttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bdaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        userTabpane.setBackground(new java.awt.Color(255, 255, 255));

        trainingSchedpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setText("Training Schedule");
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        trainingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Qualifications", "Course Code", "Time In", "Attendance Status", "Time Out", "Attendance Status", "Instructor's Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(trainingTable);

        timeInBtn.setText("Time In");
        timeInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeInBtnActionPerformed(evt);
            }
        });

        timeOutBtn.setText("Time Out");
        timeOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOutBtnActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout trainingSchedpanelLayout = new javax.swing.GroupLayout(trainingSchedpanel);
        trainingSchedpanel.setLayout(trainingSchedpanelLayout);
        trainingSchedpanelLayout.setHorizontalGroup(
            trainingSchedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainingSchedpanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(trainingSchedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(trainingSchedpanelLayout.createSequentialGroup()
                        .addComponent(timeInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(599, 599, 599)
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trainingSchedpanelLayout.setVerticalGroup(
            trainingSchedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainingSchedpanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(trainingSchedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(trainingSchedpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timeInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timeOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        userTabpane.addTab("Training Schedule", trainingSchedpanel);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        programlabel.setText("Programs");
        programlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        programsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enrollment ID", "Program", "Date Range", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(programsTable);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(programlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(programlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userTabpane.addTab("Programs", jPanel17);

        javax.swing.GroupLayout myCoursesTabLayout = new javax.swing.GroupLayout(myCoursesTab);
        myCoursesTab.setLayout(myCoursesTabLayout);
        myCoursesTabLayout.setHorizontalGroup(
            myCoursesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCoursesTabLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(myCoursesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myCoursesTabLayout.createSequentialGroup()
                        .addComponent(profilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(userTabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        myCoursesTabLayout.setVerticalGroup(
            myCoursesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCoursesTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myCoursesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTabpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Courses", myCoursesTab);

        courseOfferedTab.setBackground(new java.awt.Color(255, 255, 255));
        courseOfferedTab.setAutoscrolls(true);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3, 4, 4));

        category2.setBackground(new java.awt.Color(255, 255, 255));
        category2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category2.setForeground(new java.awt.Color(102, 102, 102));
        category2.setText("Agriculture and Fishery Courses");
        category2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category2ActionPerformed(evt);
            }
        });
        jPanel3.add(category2);

        category3.setBackground(new java.awt.Color(255, 255, 255));
        category3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category3.setForeground(new java.awt.Color(102, 102, 102));
        category3.setText("Automotive and Driving Courses");
        category3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category3ActionPerformed(evt);
            }
        });
        jPanel3.add(category3);

        category4.setBackground(new java.awt.Color(255, 255, 255));
        category4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category4.setForeground(new java.awt.Color(102, 102, 102));
        category4.setText("Building Construction and Welding Courses");
        category4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category4ActionPerformed(evt);
            }
        });
        jPanel3.add(category4);

        category5.setBackground(new java.awt.Color(255, 255, 255));
        category5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category5.setForeground(new java.awt.Color(102, 102, 102));
        category5.setText("Electrical and Electronics Courses");
        category5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category5ActionPerformed(evt);
            }
        });
        jPanel3.add(category5);

        category6.setBackground(new java.awt.Color(255, 255, 255));
        category6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category6.setForeground(new java.awt.Color(102, 102, 102));
        category6.setText("Entrepreneurship and Management Courses");
        category6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category6ActionPerformed(evt);
            }
        });
        jPanel3.add(category6);

        category8.setBackground(new java.awt.Color(255, 255, 255));
        category8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category8.setForeground(new java.awt.Color(102, 102, 102));
        category8.setText("Hotel, Restaurant, Culinary and Food Management Courses");
        category8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category8ActionPerformed(evt);
            }
        });
        jPanel3.add(category8);

        category10.setBackground(new java.awt.Color(255, 255, 255));
        category10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category10.setForeground(new java.awt.Color(102, 102, 102));
        category10.setText("Household Services and Housekeeping Courses");
        category10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category10ActionPerformed(evt);
            }
        });
        jPanel3.add(category10);

        category12.setBackground(new java.awt.Color(255, 255, 255));
        category12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category12.setForeground(new java.awt.Color(102, 102, 102));
        category12.setText("Computer Related and Software Development Courses");
        category12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category12ActionPerformed(evt);
            }
        });
        jPanel3.add(category12);

        category13.setBackground(new java.awt.Color(255, 255, 255));
        category13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        category13.setForeground(new java.awt.Color(102, 102, 102));
        category13.setText("Digital Animation Courses");
        category13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category13ActionPerformed(evt);
            }
        });
        jPanel3.add(category13);

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout courseOfferedTabLayout = new javax.swing.GroupLayout(courseOfferedTab);
        courseOfferedTab.setLayout(courseOfferedTabLayout);
        courseOfferedTabLayout.setHorizontalGroup(
            courseOfferedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseOfferedTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 331, Short.MAX_VALUE))
        );
        courseOfferedTabLayout.setVerticalGroup(
            courseOfferedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseOfferedTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Courses Offered", courseOfferedTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void notifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifButtonActionPerformed
        NotificationFrame notif = new NotificationFrame();
        notif.setLocationRelativeTo(null);
        notif.setVisible(true);
        
    }//GEN-LAST:event_notifButtonActionPerformed

    private void myProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileButtonActionPerformed
        MyProfile userProfile = new MyProfile();
        userProfile.setVisible(true);
        userProfile.setLocationRelativeTo(null);
    }//GEN-LAST:event_myProfileButtonActionPerformed

    private void category2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category2ActionPerformed
        AgriFisheryCourses agrifishcourse = new AgriFisheryCourses();
        agrifishcourse.setLocationRelativeTo(null);
        agrifishcourse.setVisible(true);
    }//GEN-LAST:event_category2ActionPerformed

    private void category3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category3ActionPerformed
        AutomotiveCourses automotive = new AutomotiveCourses();
        automotive.setLocationRelativeTo(null);
        automotive.setVisible(true);
    }//GEN-LAST:event_category3ActionPerformed

    private void category4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category4ActionPerformed
        ConstructionWeldingCourses constructionWelding = new ConstructionWeldingCourses();
        constructionWelding.setLocationRelativeTo(null);
        constructionWelding.setVisible(true);
    }//GEN-LAST:event_category4ActionPerformed

    private void category5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category5ActionPerformed
        ElectricalElectronicsCourses eletrician = new ElectricalElectronicsCourses();
        eletrician.setLocationRelativeTo(null);
        eletrician.setVisible(true);
    }//GEN-LAST:event_category5ActionPerformed

    private void category6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category6ActionPerformed
        EntrepManagementCourses entrep = new EntrepManagementCourses();
        entrep.setLocationRelativeTo(null);
        entrep.setVisible(true);
    }//GEN-LAST:event_category6ActionPerformed

    private void category8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category8ActionPerformed
        HRCFmanagementCourse hrcf = new HRCFmanagementCourse();
        hrcf.setLocationRelativeTo(null);
        hrcf.setVisible(true);
    }//GEN-LAST:event_category8ActionPerformed

    private void category10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category10ActionPerformed
        HouseHoldHouseKeepingCourses housekeeing = new HouseHoldHouseKeepingCourses();
        housekeeing.setLocationRelativeTo(null);
        housekeeing.setVisible(true);
    }//GEN-LAST:event_category10ActionPerformed

    private void category12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category12ActionPerformed
        ComputerSoftwarDevCourse programmers = new ComputerSoftwarDevCourse();
        programmers.setLocationRelativeTo(null);
        programmers.setVisible(true);
    }//GEN-LAST:event_category12ActionPerformed

    private void category13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category13ActionPerformed
        DigitalAnimationCourse digiAnim = new DigitalAnimationCourse();
        digiAnim.setLocationRelativeTo(null);
        digiAnim.setVisible(true);
    }//GEN-LAST:event_category13ActionPerformed

    private void viewCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourse2ActionPerformed
       ViewCourse viewCourse = new ViewCourse();
       viewCourse.jScrollPane4.setVisible(true);
       viewCourse.setVisible(true);
    }//GEN-LAST:event_viewCourse2ActionPerformed

    private void viewCourse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourse4ActionPerformed
       ViewCourse viewCourse = new ViewCourse();
       viewCourse.jScrollPane2.setVisible(true);
       viewCourse.setVisible(true);
    }//GEN-LAST:event_viewCourse4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesda.gov.ph/").toURI());
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesdaonlineprogram.com/how-to-apply-for-a-scholarship-in-tesda/").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void programmingJavaApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmingJavaApplyBtnActionPerformed
        ApplicationForm apply = new ApplicationForm();
        apply.setLocationRelativeTo(null);
        apply.setVisible(true);
        
        StudentFrame userFrame = new StudentFrame(apply);
        userFrame.changeLabelText("Programming Java NCIII");
        
        
        
    }//GEN-LAST:event_programmingJavaApplyBtnActionPerformed

    private void automotiveApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automotiveApplyBtnActionPerformed
        ApplicationForm apply = new ApplicationForm();
        apply.setLocationRelativeTo(null);
        apply.setVisible(true);
        
        StudentFrame userFrame = new StudentFrame(apply);
        userFrame.changeLabelText("Automotive Servicing NCIII");
    }//GEN-LAST:event_automotiveApplyBtnActionPerformed

    private void agriProductionApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agriProductionApplyBtnActionPerformed
        ApplicationForm apply = new ApplicationForm();
        apply.setLocationRelativeTo(null);
        apply.setVisible(true);
        
        StudentFrame userFrame = new StudentFrame(apply);
        userFrame.changeLabelText("Agricultural Crops Production NCII");
    }//GEN-LAST:event_agriProductionApplyBtnActionPerformed

    private void foodbeverageApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodbeverageApplyBtnActionPerformed
        ApplicationForm apply = new ApplicationForm();
        apply.setLocationRelativeTo(null);
        apply.setVisible(true);
        
        StudentFrame userFrame = new StudentFrame(apply);
        userFrame.changeLabelText("Food and Beverage Servicing NCII");
    }//GEN-LAST:event_foodbeverageApplyBtnActionPerformed

    private void programmingJavaApplyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programmingJavaApplyBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_programmingJavaApplyBtnMouseClicked

    private void viewCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourse1ActionPerformed
       ViewCourse viewCourse = new ViewCourse();
       viewCourse.jScrollPane1.setVisible(true);
       viewCourse.setVisible(true);
    }//GEN-LAST:event_viewCourse1ActionPerformed

    private void viewCourse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourse3ActionPerformed
       ViewCourse viewCourse = new ViewCourse();
       viewCourse.jScrollPane3.setVisible(true);
       viewCourse.setVisible(true);
    }//GEN-LAST:event_viewCourse3ActionPerformed

    private void timeInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeInBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) trainingTable.getModel();

        LocalTime now = LocalTime.now();
        LocalTime timeInStart = LocalTime.of(6, 0); // 6:00 AM
        LocalTime timeInEnd = LocalTime.of(8, 0);   // 8:00 AM

        if (now.isBefore(timeInStart)) {
            messageLabel.setText("Time in not allowed yet");
        } else if (now.isAfter(timeInEnd)) {
            messageLabel.setText("Time in late");
            markLate(model); // Mark late in "Attendance Status" column
            setTimeIn(model, true); // Update "Time In" column to true
        } else {
            messageLabel.setText("Time in successful");
            markOnTime(model); // Mark on-time in "Attendance Status" column
            setTimeIn(model, true); // Update "Time In" column to true
        }
    }//GEN-LAST:event_timeInBtnActionPerformed

    private void timeOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOutBtnActionPerformed
         DefaultTableModel model = (DefaultTableModel) trainingTable.getModel();

        LocalTime now = LocalTime.now();
        LocalTime timeOutStart = LocalTime.of(17, 0); // 5:00 PM
        LocalTime timeOutEnd = LocalTime.of(20, 0);   // 8:00 PM

        if (now.isBefore(timeOutStart)) {
            messageLabel.setText("Time out not allowed yet");
        } else if (now.isAfter(timeOutEnd)) {
            messageLabel.setText("Time out late");
            markLate(model); // Mark late in "Attendance Status" column
            setTimeOut(model, true); // Update "Time Out" column to true
        } else {
            messageLabel.setText("Time out successful");
            markOnTime(model); // Mark on-time in "Attendance Status" column
            setTimeOut(model, true); // Update "Time Out" column to true
        }
    }//GEN-LAST:event_timeOutBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesda.gov.ph/about/tesda/46").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesda.gov.ph/about/tesda/127").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesda.gov.ph/about/tesda/127").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://tesda.gov.ph/about/tesda/127").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed
 
     private void setTimeIn(DefaultTableModel model, boolean value) {
        int columnIndex = getColumnIndex("Time In");
        if (columnIndex != -1) {
            int rowCount = model.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                model.setValueAt(value, row, columnIndex);
            }
        }
    }

    private void setTimeOut(DefaultTableModel model, boolean value) {
        int columnIndex = getColumnIndex("Time Out");
        if (columnIndex != -1) {
            int rowCount = model.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                model.setValueAt(value, row, columnIndex);
            }
        }
    }

    private void markLate(DefaultTableModel model) {
        int columnIndex = getColumnIndex("Attendance Status");
        if (columnIndex != -1) {
            int rowCount = model.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                model.setValueAt("Late", row, columnIndex);
            }
        }
    }

    private void markOnTime(DefaultTableModel model) {
        int columnIndex = getColumnIndex("Attendance Status");
        if (columnIndex != -1) {
            int rowCount = model.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                model.setValueAt("On-time", row, columnIndex);
            }
        }
    }

    private int getColumnIndex(String columnName) {
        for (int i = 0; i < trainingTable.getColumnCount(); i++) {
            if (trainingTable.getColumnName(i).equals(columnName)) {
                return i;
            }
        }
        return -1; // Column not found
    }
    public void changeLabelText(String courseTitle) {
        
        apply.getMyLabel().setText(courseTitle);
    }

    public static void main(String args[]) {
   
        

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField agetxt;
    private javax.swing.JButton agriProductionApplyBtn;
    private javax.swing.JButton automotiveApplyBtn;
    public com.github.lgooddatepicker.components.DatePicker bdaytxt;
    private javax.swing.JButton category10;
    private javax.swing.JButton category12;
    private javax.swing.JButton category13;
    private javax.swing.JButton category2;
    private javax.swing.JButton category3;
    private javax.swing.JButton category4;
    private javax.swing.JButton category5;
    private javax.swing.JButton category6;
    private javax.swing.JButton category8;
    private javax.swing.JPanel courseOfferedTab;
    public javax.swing.JTextField emailtxt;
    public javax.swing.JTextField firstNametxt;
    private javax.swing.JButton foodbeverageApplyBtn;
    public javax.swing.JTextField gendertxt;
    private javax.swing.JPanel homeTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextField lasttxt;
    private javax.swing.JLabel messageLabel;
    public javax.swing.JTextField middletxt;
    public javax.swing.JPanel myCoursesTab;
    private javax.swing.JButton myProfileButton;
    private javax.swing.JPanel newCoursesAddedpanel;
    private javax.swing.JButton notifButton;
    public javax.swing.JPanel profilepanel;
    private javax.swing.JLabel programlabel;
    private javax.swing.JButton programmingJavaApplyBtn;
    private javax.swing.JTable programsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton timeInBtn;
    private javax.swing.JButton timeOutBtn;
    private javax.swing.JPanel trainingSchedpanel;
    private javax.swing.JTable trainingTable;
    private javax.swing.JTabbedPane userTabpane;
    private javax.swing.JButton viewCourse1;
    private javax.swing.JButton viewCourse2;
    private javax.swing.JButton viewCourse3;
    private javax.swing.JButton viewCourse4;
    // End of variables declaration//GEN-END:variables
}
