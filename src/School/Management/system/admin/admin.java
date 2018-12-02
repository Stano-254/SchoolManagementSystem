package School.Management.system.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Stern
 */
public class admin extends javax.swing.JFrame {
    public admin(){
     intilComponents();   
    }
    
    public void intilComponents(){
 // seeting the Jframe
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setBackground(new Color(0, 0, 0));
        setBounds(new Rectangle(5, 50, 9, 6));
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(403, 403));
        setSize(new Dimension(1368, 768));
        setName("JFrame"); 
        setUndecorated(false);
        setResizable(false);
        getContentPane().setLayout(null);
        
//        setting the jframe center on screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ///end of setting frame on screen
        //intializtion of components
        
        //panels
        JPanel adminPanel = new JPanel(),schoolDeptPane = new JPanel(),courseUnitPane = new JPanel(),lecturerPane  = new JPanel(),deanHodPane = new JPanel(),studentPane = new JPanel();JPanel deptDetailsPane = new JPanel(),deptPreviewPane= new JPanel(),deptPreviewInnerPane= new JPanel(),
                skulDetailsPane=new JPanel(),skulPreviewPane=new JPanel(),skulPreviewInnerPane=new JPanel(),courseDetailsPane=new JPanel(),coursePreviewInnerPane=new JPanel(),coursePreviewPane=new JPanel(),unitDetailsPane=new JPanel(),unitPreviewInnerPane=new JPanel(),
                unitPreviewPane=new JPanel(),hodPreviewPane=new JPanel(),hodPreviewInnerPane=new JPanel(),hodDetailsPane=new JPanel(),deanPreviewPane=new JPanel(),deanPreviewInnerPane=new JPanel(),deanDetailsPane=new JPanel(),lecturerPreviewPane=new JPanel(),lecturerPreviewInnerPane=new JPanel(),lecturerDetailsPane=new JPanel(),
                studentPreviewPane=new JPanel(),studentPreviewInnerPane=new JPanel(),studentDetailsPane=new JPanel();
        //jlist 
        JList unitsAssigned = new javax.swing.JList<>();
       
        //scrollpanes
        JScrollPane skulPreviewPaneScroller = new JScrollPane(),deptPreviewPaneScroller = new JScrollPane(),coursePreviewPaneScroller = new JScrollPane(),unitPreviewPaneScroller = new JScrollPane(),lecturerPreviewPaneScroller = new JScrollPane(),hodPreviewPaneScroller = new JScrollPane(),deanPreviewPaneScroller = new JScrollPane(),studentPreviewPaneScroller = new JScrollPane(),unitAssignJscroller= new JScrollPane();
        
        //textfields
        JTextField skulIDTxt = new JTextField(),skulNameTxt = new JTextField(),deptNameTxt = new JTextField(),deptIDTxt = new JTextField(),courseIDTxt = new JTextField(),unitIDTxt = new JTextField(),courseNameTxt = new JTextField(),unitCodeTxt = new JTextField(),unitNameTxt = new JTextField(),lecturerIDTxt = new JTextField(),lecturerNameTxt = new JTextField(),lecturerUsernameTxt = new JTextField(),
        lecturerPasswordTxt = new JTextField(),lecTelTxt = new JTextField(),lecEmailTxt = new JTextField(),hodUsernameTxt = new JTextField(),hodIDTxt = new JTextField(),hodPasswordTxt = new JTextField(),deanIDTxt = new JTextField(),deanUsernameTxt = new JTextField(),deanPasswordTxt = new JTextField(),studentIDTxt = new JTextField(),studentNameTxt = new JTextField(),studentUsernameTxt = new JTextField(),studentPasswordTxt = new JTextField(),studentADMnoTxt = new JTextField();
        //labels
        JLabel Header = new JLabel(), skulIDJlb = new JLabel(),unitAssinJlb = new JLabel(),skulNameJlb = new JLabel(),skulPreviewJlb = new JLabel(),deptIDJlb = new JLabel(),deptNameJlb = new JLabel(),deptPreviewJlb= new JLabel(),coursePreviewJlb= new JLabel(),courseIDJlb= new JLabel(),courseNameJlb= new JLabel(),unitIDJlb= new JLabel(),
                unitNameJlb= new JLabel(),unitPreviewJlb= new JLabel(),lecturerIDJlb= new JLabel(),lecturerNameJlb= new JLabel(),lecturerUsernameJlb= new JLabel(),lecturerPasswordJlb= new JLabel(),lecturerEmailJlb= new JLabel(),lecturerTelJlb= new JLabel(),lecturerPreviewJlb= new JLabel(),deanPreviewJlb= new JLabel(),deanIDJlb= new JLabel(),deanUsernameJlb= new JLabel(),deanPasswordJlb= new JLabel(),hodIDJlb= new JLabel(),hodPreviewJlb= new JLabel(),hodUsernameJlb= new JLabel(),
                hodPasswordJlb= new JLabel(),studentIDJlb= new JLabel(),studentNameJlb= new JLabel(),studentUsernameJlb= new JLabel(),studentPasswordJlb= new JLabel(),studentADMJlb= new JLabel(),studentEmailJlb= new JLabel(),unitCodeJlb= new JLabel();
        
        //buttons
        JButton addSkulCmd = new JButton(),updateSkulCmd = new JButton(),deleteSkulCmd = new JButton(),addDeptCmd = new JButton(),updateDeptCmd = new JButton(),deleteDeptCmd = new JButton(),addCourseCmd = new JButton(),updateCourseCmd = new JButton(),deleteCourseCmd = new JButton(),addUnitCmd = new JButton(),updateUnitCmd = new JButton(),deleteUnitCmd = new JButton(),addLecCmd = new JButton(),updateLecCmd = new JButton(),deleteLecCmd = new JButton(),addHodCmd = new JButton(),updateHodCmd = new JButton(),deleteHodCmd = new JButton(),
         addDeanCmd = new JButton(),updateDeanCmd = new JButton(),deleteDeanCmd = new JButton(),addStudentCmd = new JButton(),updateStudentCmd = new JButton(),deleteStudentCmd = new JButton(),assignUnitCmd = new JButton();//updateSkulCmd = new JButton(),deleteSkulCmd = new JButton(),addDeptCmd = new JButton(),updateDeptCmd = new JButton(),deleteDeptCmd = new JButton(),addSkulCmd = new JButton(),updateSkulCmd = new JButton(),deleteSkulCmd = new JButton(),addDeptCmd = new JButton(),updateDeptCmd = new JButton(),deleteDeptCmd = new JButton();;
        JTable skulPreviewTable=new JTable(),deptPreviewTable= new JTable(),coursePreviewTable=new JTable(),unitPreviewTable= new JTable(),hodPreviewTable=new JTable(),deanPreviewTable= new JTable(),lecturerPreviewTable=new JTable(),studentPreviewTable= new JTable();
        
        //Jcombo box
        JComboBox cSkulComboSelector = new JComboBox<>(), lSkulComboSelector = new JComboBox<>(),dSkulComboSelector = new JComboBox<>(),uCourseComboSelector = new JComboBox<>(),hLecComboSelector = new JComboBox<>(),dLecComboSelector = new JComboBox<>(),hDeptComboSelector = new JComboBox<>(),sCourseComboSelector = new JComboBox<>();
        
        
        JTabbedPane adminPane = new JTabbedPane();
        Header.setSize(new Dimension(1368,30));
        Header.setOpaque(true);
        Header.setHorizontalAlignment(SwingConstants.CENTER);
        Header.setBackground(new Color(0,0,0));
        Header.setForeground(new Color(0,153,255));
        Header.setFont(new java.awt.Font("Consolas", 3, 48)); 
        Header.setText("Administrator  pane");
        /// tabbed pane
       
        adminPane.setBackground(new Color(0, 0, 0));
        adminPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminPane.setForeground(new Color(0, 153, 204));
        adminPane.setFont(new Font("Comic Sans MS", 0, 18)); 
        adminPane.setPreferredSize(new Dimension(1620, 898));
        adminPane.addTab( "School & Dept info", null, schoolDeptPane, "" );
        adminPane.addTab( "Course & Unit info", null, courseUnitPane, "" );
        adminPane.addTab( "Lecturer's Info", null, lecturerPane, "" );
        adminPane.addTab( "Dean & hod info", null, deanHodPane, "" );
        adminPane.addTab( "Students nfo", null, studentPane, "" );
        adminPane.setBounds(0,40,1368,728);
 ///SchoolPane
 //<editor-fold defaultstate="collapsed" desc=" school details and preview (optional) ">
       schoolDeptPane.setBackground(new Color(0,0,0)); 
       schoolDeptPane.setBounds(0,51,1368,728);
       schoolDeptPane.setLayout(null);
       schoolDeptPane.add(skulDetailsPane); schoolDeptPane.add(skulPreviewPane);  schoolDeptPane.add(deptDetailsPane ); schoolDeptPane.add(deptPreviewPane);
       
//school details pane
       skulDetailsPane.setBounds(50,10,500,300);
       skulDetailsPane.setBackground(new Color(51,51,51));
       skulDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "school Details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       skulDetailsPane.setLayout(null);
       skulDetailsPane.add(skulNameJlb);skulDetailsPane.add(skulIDJlb);skulDetailsPane.add(skulNameTxt);skulDetailsPane.add(skulIDTxt);skulDetailsPane.add(addSkulCmd);skulDetailsPane.add(updateSkulCmd);skulDetailsPane.add(deleteSkulCmd);
       
       skulIDJlb.setBounds(50,80,150,30); skulIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));skulIDJlb.setOpaque(false);skulIDJlb.setText("School ID");skulIDJlb.setFont(new Font("Traditional Arabic", 1, 18));skulIDJlb.setForeground(new java.awt.Color(0, 153, 255));skulIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       skulNameTxt.setBounds(230,150,200,35);skulNameTxt.setBackground(new Color(255,255,255));skulNameTxt.setFont(new Font("Georgia",2,18));
       skulNameJlb.setBounds(50,150,150,30); skulNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));skulNameJlb.setOpaque(false);skulNameJlb.setText("School Name");skulNameJlb.setFont(new Font("Traditional Arabic", 1, 18));skulNameJlb.setForeground(new Color(0, 153, 255));skulNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       skulIDTxt.setBounds(230,80,200,35);skulIDTxt.setBackground(new Color(255,255,255));skulIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       addSkulCmd.setText("Add");addSkulCmd.setBounds(80,230,80,35);addSkulCmd.setFont(new Font("Sitka Banner", 3, 14));addSkulCmd.setForeground(new Color(0,204,51));addSkulCmd.setBackground(new Color(0,0,0));
       updateSkulCmd.setText("Update");updateSkulCmd.setBounds(180,230,80,35);updateSkulCmd.setFont(new Font("Sitka Banner", 3, 14));updateSkulCmd.setForeground(new Color(0,240,240));updateSkulCmd.setBackground(new Color(0,0,0));
       deleteSkulCmd.setText("Delete");deleteSkulCmd.setBounds(280,230,80,35);deleteSkulCmd.setFont(new Font("Sitka Banner", 3, 14));deleteSkulCmd.setForeground(new Color(255,0,51));deleteSkulCmd.setBackground(new Color(0,0,0));

//school preview pane
       skulPreviewPane.setBounds(700,10,550,300);
       skulPreviewPane.setBackground(new Color(51,51,51));
       skulPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       skulPreviewPane.setLayout(null);
       skulPreviewPane.add(skulPreviewJlb);skulPreviewPane.add(skulPreviewInnerPane);
       
       skulPreviewJlb.setBounds(400,10,135,23);skulPreviewJlb.setText("school Preview");skulPreviewJlb.setFont(new Font("Georgia",3,14));skulPreviewJlb.setForeground(new Color(255,255,255));skulPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));skulPreviewJlb.setBackground(new Color(0,0,0));
       
       skulPreviewInnerPane.setBounds(10,40,500,240);skulPreviewInnerPane.setBackground(new java.awt.Color(51, 51, 51));skulPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       skulPreviewPaneScroller.setBounds(10,10,480,200);skulPreviewInnerPane.add(skulPreviewPaneScroller);skulPreviewInnerPane.setLayout(null);skulPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
//       skulPreviewPaneScroller.setBounds(30,50,200,100);
       
       
      skulPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { " School ID", "School Name"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       skulPreviewPaneScroller.setViewportView(skulPreviewTable);
       skulPreviewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));skulPreviewTable.setFont(new java.awt.Font("Georgia", 1, 14));

//</editor-fold>
   //dept pane     
 //<editor-fold defaultstate="collapsed" desc="Department pane" (structure)"> 
//dept details pane
  
       deptDetailsPane.setBounds(50,330,500,300);
       deptDetailsPane.setBackground(new Color(51,51,51));
       deptDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "Department details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       deptDetailsPane.setLayout(null);
       deptDetailsPane.add(deptNameJlb);deptDetailsPane.add(deptIDJlb);deptDetailsPane.add(deptNameTxt);deptDetailsPane.add(deptIDTxt);deptDetailsPane.add(addDeptCmd);deptDetailsPane.add(updateDeptCmd);deptDetailsPane.add(deleteDeptCmd);
       
       deptIDJlb.setBounds(40,80,180,30); deptIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deptIDJlb.setOpaque(false);deptIDJlb.setText("Department ID");deptIDJlb.setFont(new Font("Traditional Arabic", 1, 18));deptIDJlb.setForeground(new java.awt.Color(0, 153, 255));deptIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deptNameTxt.setBounds(230,150,200,35);deptNameTxt.setBackground(new Color(255,255,255));deptNameTxt.setFont(new Font("Georgia",2,18));
       deptNameJlb.setBounds(40,150,180,30); deptNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deptNameJlb.setOpaque(false);deptNameJlb.setText("Department Name");deptNameJlb.setFont(new Font("Traditional Arabic", 1, 18));deptNameJlb.setForeground(new Color(0, 153, 255));deptNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deptIDTxt.setBounds(230,80,200,35);deptIDTxt.setBackground(new Color(255,255,255));deptIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       addDeptCmd.setText("Add");addDeptCmd.setBounds(80,230,80,35);addDeptCmd.setFont(new Font("Sitka Banner", 3, 14));addDeptCmd.setForeground(new Color(0,204,51));addDeptCmd.setBackground(new Color(0,0,0));
       updateDeptCmd.setText("Update");updateDeptCmd.setBounds(180,230,80,35);updateDeptCmd.setFont(new Font("Sitka Banner", 3, 14));updateDeptCmd.setForeground(new Color(0,240,240));updateDeptCmd.setBackground(new Color(0,0,0));
       deleteDeptCmd.setText("Delete");deleteDeptCmd.setBounds(280,230,80,35);deleteDeptCmd.setFont(new Font("Sitka Banner", 3, 14));deleteDeptCmd.setForeground(new Color(255,0,51));deleteDeptCmd.setBackground(new Color(0,0,0));

//dept preview pane
       deptPreviewPane.setBounds(700,330,550,300);
       deptPreviewPane.setBackground(new Color(51,51,51));
       deptPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       deptPreviewPane.setLayout(null);
       deptPreviewPane.add(deptPreviewJlb);deptPreviewPane.add(deptPreviewInnerPane);
       
       deptPreviewJlb.setBounds(360,10,180,23);deptPreviewJlb.setText("Department Preview");deptPreviewJlb.setFont(new Font("Georgia",3,14));deptPreviewJlb.setForeground(new Color(255,255,255));deptPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));deptPreviewJlb.setBackground(new Color(0,0,0));
       
       deptPreviewInnerPane.setBounds(10,40,500,240);deptPreviewInnerPane.setBackground(new java.awt.Color(51, 51, 51));deptPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       deptPreviewPaneScroller.setBounds(10,10,480,200);deptPreviewInnerPane.add(deptPreviewPaneScroller);deptPreviewInnerPane.setLayout(null);deptPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

       
       
      deptPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { " Department ID", "Department Name"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       deptPreviewPaneScroller.setViewportView(deptPreviewTable);
       deptPreviewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));deptPreviewTable.setFont(new java.awt.Font("Georgia", 1, 14));
      
        
   //</editor-fold>         
   //course pane & unit
 //<editor-fold defaultstate="collapsed" desc=" course details and preview (optional) ">
       courseUnitPane.setBackground(new Color(0,0,0)); 
       courseUnitPane.setBounds(0,51,1368,728);
       courseUnitPane.setLayout(null);
       courseUnitPane.setOpaque(true);
       courseUnitPane.add(courseDetailsPane); courseUnitPane.add(coursePreviewPane);  courseUnitPane.add(courseDetailsPane ); courseUnitPane.add(coursePreviewPane);
       
//course details pane
       courseDetailsPane.setBounds(50,10,500,300);
       courseDetailsPane.setBackground(new Color(51,51,51));
       courseDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "Course details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       courseDetailsPane.setLayout(null);
       courseDetailsPane.add(courseNameJlb);courseDetailsPane.add(courseIDJlb);courseDetailsPane.add(courseNameTxt);courseDetailsPane.add(courseIDTxt);courseDetailsPane.add(addCourseCmd);courseDetailsPane.add(updateCourseCmd);courseDetailsPane.add(deleteCourseCmd);courseDetailsPane.add(cSkulComboSelector);
       
       courseIDJlb.setBounds(50,80,150,30); courseIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));courseIDJlb.setOpaque(false);courseIDJlb.setText("Course ID");courseIDJlb.setFont(new Font("Traditional Arabic", 1, 18));courseIDJlb.setForeground(new Color(0, 153, 255));courseIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       courseNameTxt.setBounds(230,140,200,35);courseNameTxt.setBackground(new Color(255,255,255));courseNameTxt.setFont(new Font("Georgia",2,18));
       courseNameJlb.setBounds(50,140,150,30); courseNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));courseNameJlb.setOpaque(false);courseNameJlb.setText("Course Name");courseNameJlb.setFont(new Font("Traditional Arabic", 1, 18));courseNameJlb.setForeground(new Color(0, 153, 255));courseNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       courseIDTxt.setBounds(230,80,200,35);courseIDTxt.setBackground(new Color(255,255,255));courseIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       button(addCourseCmd);addCourseCmd.setText("Add");addCourseCmd.setBounds(80,240,80,35);
       button(updateCourseCmd);updateCourseCmd.setText("Update");updateCourseCmd.setBounds(180,240,80,35);
       button(deleteCourseCmd);deleteCourseCmd.setText("Delete");deleteCourseCmd.setBounds(280,240,80,35);
       cSkulComboSelector.setModel(new DefaultComboBoxModel<>(new String[] { "school name", "computing", "Math", "Edu" }));cSkulComboSelector.setFont(new Font("Georgia", 3, 18)); 
       cSkulComboSelector.setBounds(230,190,180,30);
       
//course preview pane
       coursePreviewPane.setBounds(700,10,550,300);
       coursePreviewPane.setBackground(new Color(51,51,51));
       coursePreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       coursePreviewPane.setLayout(null);
       coursePreviewPane.add(coursePreviewJlb);coursePreviewPane.add(coursePreviewInnerPane);
       
       coursePreviewJlb.setBounds(400,10,135,23);coursePreviewJlb.setText("course Preview");coursePreviewJlb.setFont(new Font("Georgia",3,14));coursePreviewJlb.setForeground(new Color(255,255,255));coursePreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));coursePreviewJlb.setBackground(new Color(0,0,0));
       
       coursePreviewInnerPane.setBounds(10,40,500,240);coursePreviewInnerPane.setBackground(new Color(51, 51, 51));coursePreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       coursePreviewPaneScroller.setBounds(10,10,480,200);coursePreviewInnerPane.add(coursePreviewPaneScroller);coursePreviewInnerPane.setLayout(null);coursePreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 153, 255)));

       
       
      coursePreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null,null},{null, null,null},{null,null,null},{null, null,null},}, new String [] { " Course ID", "Course Name","School Name"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       coursePreviewPaneScroller.setViewportView(coursePreviewTable);
       coursePreviewTable.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));coursePreviewTable.setFont(new Font("Georgia", 1, 14));

//</editor-fold>
    //unit 
 //<editor-fold defaultstate="collapsed" desc=" unit details (Structure)">  
   //unit details pane
  
       unitDetailsPane.setBounds(50,330,500,300);
       unitDetailsPane.setBackground(new Color(51,51,51));
       unitDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "Units details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       unitDetailsPane.setLayout(null);
       courseUnitPane.add(unitDetailsPane); 
       unitDetailsPane.add(unitNameJlb); unitDetailsPane.add(unitIDJlb); unitDetailsPane.add(unitNameTxt); unitDetailsPane.add(unitIDTxt); unitDetailsPane.add(addUnitCmd); unitDetailsPane.add(updateUnitCmd); unitDetailsPane.add(deleteUnitCmd);unitDetailsPane.add(uCourseComboSelector);
       unitDetailsPane.add(unitCodeJlb); unitDetailsPane.add(unitCodeTxt);
       
       unitCodeJlb.setBounds(40,100,180,30);unitCodeJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null)); unitCodeJlb.setOpaque(false); unitCodeJlb.setText("Unit Code"); unitCodeJlb.setFont(new Font("Traditional Arabic", 1, 18)); unitCodeJlb.setForeground(new java.awt.Color(0, 153, 255)); unitCodeJlb.setHorizontalAlignment(SwingConstants.CENTER);
       unitIDJlb.setBounds(40,50,180,30);  unitIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null)); unitIDJlb.setOpaque(false); unitIDJlb.setText("Unit ID"); unitIDJlb.setFont(new Font("Traditional Arabic", 1, 18)); unitIDJlb.setForeground(new java.awt.Color(0, 153, 255)); unitIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       unitCodeTxt.setBounds(230,100,200,35);unitCodeTxt.setBackground(new Color(255,255,255));unitCodeTxt.setFont(new Font("Georgia",2,18));
       unitNameTxt.setBounds(230,150,200,35);unitNameTxt.setBackground(new Color(255,255,255));unitNameTxt.setFont(new Font("Georgia",2,18));
       unitNameJlb.setBounds(40,150,180,30); unitNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));unitNameJlb.setOpaque(false);unitNameJlb.setText("Unit  Name");unitNameJlb.setFont(new Font("Traditional Arabic", 1, 18));unitNameJlb.setForeground(new Color(0, 153, 255));unitNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       unitIDTxt.setBounds(230,50,200,35);unitIDTxt.setBackground(new Color(255,255,255));unitIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       addUnitCmd.setText("Add");addUnitCmd.setBounds(80,230,80,35);addUnitCmd.setFont(new Font("Sitka Banner", 3, 14));addUnitCmd.setForeground(new Color(0,204,51));addUnitCmd.setBackground(new Color(0,0,0));
       updateUnitCmd.setText("Update");updateUnitCmd.setBounds(180,230,80,35);updateUnitCmd.setFont(new Font("Sitka Banner", 3, 14));updateUnitCmd.setForeground(new Color(0,240,240));updateUnitCmd.setBackground(new Color(0,0,0));
       deleteUnitCmd.setText("Delete");deleteUnitCmd.setBounds(280,230,80,35);deleteUnitCmd.setFont(new Font("Sitka Banner", 3, 14));deleteUnitCmd.setForeground(new Color(255,0,51));deleteUnitCmd.setBackground(new Color(0,0,0));
       uCourseComboSelector.setModel(new DefaultComboBoxModel<>(new String[] { "course name", "computing", "Math", "Edu" }));uCourseComboSelector.setFont(new Font("Georgia", 3, 18)); 
       uCourseComboSelector.setBounds(230,190,180,30);
//Units preview pane
       unitPreviewPane.setBounds(700,330,550,300);
       unitPreviewPane.setBackground(new Color(51,51,51));
       unitPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       unitPreviewPane.setLayout(null);
       courseUnitPane.add(unitPreviewPane);
       unitPreviewPane.add(unitPreviewJlb);unitPreviewPane.add(unitPreviewInnerPane);
       
       unitPreviewJlb.setBounds(400,10,120,23);unitPreviewJlb.setText("Unit Preview");unitPreviewJlb.setFont(new Font("Georgia",3,14));unitPreviewJlb.setForeground(new Color(255,255,255));unitPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));unitPreviewJlb.setBackground(new Color(0,0,0));
       
       unitPreviewInnerPane.setBounds(10,40,500,240);unitPreviewInnerPane.setBackground(new Color(51, 51, 51));unitPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       unitPreviewPaneScroller.setBounds(10,10,480,200);unitPreviewInnerPane.add(unitPreviewPaneScroller);unitPreviewInnerPane.setLayout(null);unitPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

       
       
      unitPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null,null, null},{null, null,null, null},{null,null,null, null},{null, null,null, null},}, new String [] { " Unit ID", "Unit Code ","Unit Name","Department"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       unitPreviewPaneScroller.setViewportView(unitPreviewTable);
       unitPreviewTable.setBorder(new LineBorder(new java.awt.Color(0, 102, 153), 2, true));unitPreviewTable.setFont(new Font("Georgia", 1, 14));
         
        
        
        //unitpane
       //</editor-fold>      
   //lecturer
 //<editor-fold defaultstate="collapsed" desc="Lecturer details and preview" (structure)">
       lecturerPane.setBackground(new Color(0,0,0)); 
       lecturerPane.setBounds(0,51,1368,728);
       lecturerPane.setLayout(null);
       lecturerPane.add(lecturerDetailsPane); lecturerPane.add(lecturerPreviewPane);  
 
 
 
 
       lecturerDetailsPane.setBounds(50,10,500,600);
       lecturerDetailsPane.setBackground(new Color(51,51,51));
       lecturerDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "Lecturer details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       lecturerDetailsPane.setLayout(null);
       lecturerDetailsPane.add(lecturerNameJlb);lecturerDetailsPane.add(lecturerIDJlb);lecturerDetailsPane.add(lecturerNameTxt);lecturerDetailsPane.add(lecturerIDTxt);lecturerDetailsPane.add(addLecCmd);lecturerDetailsPane.add(updateLecCmd);lecturerDetailsPane.add(deleteLecCmd);lecturerDetailsPane.add(lSkulComboSelector);lecturerDetailsPane.add(unitAssignJscroller);
       lecturerDetailsPane.add(lecturerUsernameJlb);lecturerDetailsPane.add(lecturerPasswordJlb);lecturerDetailsPane.add(lecturerEmailJlb);lecturerDetailsPane.add(lecturerTelJlb);lecturerDetailsPane.add(lecturerUsernameTxt);lecturerDetailsPane.add(lecturerPasswordTxt);lecturerDetailsPane.add(lecTelTxt);lecturerDetailsPane.add(lecEmailTxt);lecturerDetailsPane.add(unitAssinJlb);
       lecturerDetailsPane.add(assignUnitCmd);       
       lecturerIDJlb.setBounds(40,40,180,30); lecturerIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerIDJlb.setOpaque(false);lecturerIDJlb.setText("Lecturer ID");lecturerIDJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerIDJlb.setForeground(new java.awt.Color(0, 153, 255));lecturerIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecturerIDTxt.setBounds(230,40,200,35); lecturerIDTxt.setBackground(new Color(255,255,255)); lecturerIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       lecturerNameJlb.setBounds(40,80,180,30); lecturerNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerNameJlb.setOpaque(false);lecturerNameJlb.setText("Lecturer Name");lecturerNameJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerNameJlb.setForeground(new Color(0, 153, 255));lecturerNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecturerNameTxt.setBounds(230,80,200,35);lecturerNameTxt.setBackground(new Color(255,255,255));lecturerNameTxt.setFont(new Font("Georgia",2,18));
      //combo
       lSkulComboSelector.setModel(new DefaultComboBoxModel<>(new String[] { "school name", "computing", "Math", "Edu" }));lSkulComboSelector.setFont(new Font("Georgia", 3, 18)); 
       lSkulComboSelector.setBounds(230,120,180,30);
             
       lecturerUsernameJlb.setBounds(40,160,180,30); lecturerUsernameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerUsernameJlb.setOpaque(false);lecturerUsernameJlb.setText("Username");lecturerUsernameJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerUsernameJlb.setForeground(new Color(0, 153, 255));lecturerUsernameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecturerUsernameTxt.setBounds(230,160,200,35);lecturerUsernameTxt.setBackground(new Color(255,255,255));lecturerUsernameTxt.setFont(new Font("Georgia",2,18));
       lecturerPasswordJlb.setBounds(40,200,180,30); lecturerPasswordJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerPasswordJlb.setOpaque(false);lecturerPasswordJlb.setText("Password");lecturerPasswordJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerPasswordJlb.setForeground(new Color(0, 153, 255));lecturerPasswordJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecturerPasswordTxt.setBounds(230,200,200,35);lecturerPasswordTxt.setBackground(new Color(255,255,255));lecturerPasswordTxt.setFont(new Font("Georgia",2,18));
       lecturerEmailJlb.setBounds(40,240,180,30); lecturerEmailJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerEmailJlb.setOpaque(false);lecturerEmailJlb.setText("Email");lecturerEmailJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerEmailJlb.setForeground(new java.awt.Color(0, 153, 255));lecturerEmailJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecEmailTxt.setBounds(230,240,200,35);lecEmailTxt.setBackground(new Color(255,255,255));lecEmailTxt.setFont(new Font("Georgia",2,18));
       lecturerTelJlb.setBounds(40,280,180,30); lecturerTelJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));lecturerTelJlb.setOpaque(false);lecturerTelJlb.setText("Tel");lecturerTelJlb.setFont(new Font("Traditional Arabic", 1, 18));lecturerTelJlb.setForeground(new java.awt.Color(0, 153, 255));lecturerTelJlb.setHorizontalAlignment(SwingConstants.CENTER);
       lecTelTxt.setBounds(230,280,200,35);lecTelTxt.setBackground(new Color(255,255,255));lecTelTxt.setFont(new Font("Georgia",2,18));
       
       
       unitAssinJlb.setBounds(180,340,130,30); unitAssinJlb.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));;unitAssinJlb.setOpaque(false);unitAssinJlb.setText("Unit Assign");unitAssinJlb.setFont(new Font("Georgia", 3, 18));unitAssinJlb.setForeground(new Color(255, 255, 255));unitAssinJlb.setHorizontalAlignment(SwingConstants.CENTER);
       unitsAssigned.setBorder(javax.swing.BorderFactory.createEtchedBorder());unitAssignJscroller.setBorder(javax.swing.BorderFactory.createEtchedBorder());unitsAssigned.setBackground(new Color(0,0,0));unitsAssigned.setForeground(new Color(0,153,255));unitsAssigned.setFont(new Font("Serif",3,18));unitsAssigned.setVisibleRowCount(4);unitsAssigned.setSelectionBackground(new Color(0,0,204));unitsAssigned.setSelectionForeground(new Color(255,255,255));

       unitsAssigned.setModel(new javax.swing.AbstractListModel<String>() {String[] strings = { "CCS 201", "CCS 107", "CCS 108", "CCT 210", "CCS 107" };public int getSize() { return strings.length; }public String getElementAt(int i) { return strings[i]; }
       });unitAssignJscroller.setViewportView(unitsAssigned);unitAssignJscroller.setBounds(200,370,100,110);unitsAssigned.setBounds(200,370,100,110);
       assignUnitCmd.setText("Assign");assignUnitCmd.setBounds(320,370,100,80);assignUnitCmd.setFont(new Font("Sitka Banner", 3, 14));assignUnitCmd.setForeground(new Color(0,204,51));assignUnitCmd.setBackground(new Color(0,0,0));
       addLecCmd.setText("Add");addLecCmd.setBounds(80,530,80,35);addLecCmd.setFont(new Font("Sitka Banner", 3, 14));addLecCmd.setForeground(new Color(0,204,51));addLecCmd.setBackground(new Color(0,0,0));
       updateLecCmd.setText("Update");updateLecCmd.setBounds(180,530,80,35);updateLecCmd.setFont(new Font("Sitka Banner", 3, 14));updateLecCmd.setForeground(new Color(0,240,240));updateLecCmd.setBackground(new Color(0,0,0));
       deleteLecCmd.setText("Delete");deleteLecCmd.setBounds(280,530,80,35);deleteLecCmd.setFont(new Font("Sitka Banner", 3, 14));deleteLecCmd.setForeground(new Color(255,0,51));deleteLecCmd.setBackground(new Color(0,0,0));
      
       lecturerPreviewPane.setBounds(700,10,550,550);
       lecturerPreviewPane.setBackground(new Color(51,51,51));
       lecturerPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       lecturerPreviewPane.setLayout(null);
       lecturerPreviewPane.add(lecturerPreviewJlb);lecturerPreviewPane.add(lecturerPreviewInnerPane);
       
       lecturerPreviewJlb.setBounds(360,10,180,23);lecturerPreviewJlb.setText("Lecturer Preview");lecturerPreviewJlb.setFont(new Font("Georgia",3,14));lecturerPreviewJlb.setForeground(new Color(255,255,255));lecturerPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));lecturerPreviewJlb.setBackground(new Color(0,0,0));
       
       lecturerPreviewInnerPane.setBounds(10,40,500,240);lecturerPreviewInnerPane.setBackground(new Color(51, 51, 51));lecturerPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());lecturerPreviewInnerPane.add(lecturerPreviewPaneScroller);lecturerPreviewInnerPane.setLayout(null);
       lecturerPreviewPaneScroller.setBounds(10,10,480,200);lecturerPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 153, 255)));

       
       
      lecturerPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { "Lec ID", "Lec Name","Tel","Email","School",}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       lecturerPreviewPaneScroller.setViewportView(lecturerPreviewTable);
       lecturerPreviewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));lecturerPreviewTable.setFont(new java.awt.Font("Georgia", 1, 14));
         
     //</editor-fold>            
    //hod
 //<editor-fold defaultstate="collapsed" desc=" hod details and preview (optional) ">
       deanHodPane.setBackground(new Color(0,0,0)); 
       deanHodPane.setBounds(0,51,1368,728);
       deanHodPane.setLayout(null);
       deanHodPane.add(hodDetailsPane); deanHodPane.add(hodPreviewPane);  deanHodPane.add(deanDetailsPane ); deanHodPane.add(deanPreviewPane);
       
//school details pane
       hodDetailsPane.setBounds(50,10,500,300);
       hodDetailsPane.setBackground(new Color(51,51,51));
       hodDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "school Details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       hodDetailsPane.setLayout(null);
       hodDetailsPane.add(hodUsernameJlb);hodDetailsPane.add(hodIDJlb);hodDetailsPane.add(hodIDTxt);hodDetailsPane.add(hodUsernameTxt);hodDetailsPane.add(addHodCmd);hodDetailsPane.add(updateHodCmd);hodDetailsPane.add(deleteHodCmd);
       
       hodIDJlb.setBounds(50,80,150,30); hodIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));hodIDJlb.setOpaque(false);hodIDJlb.setText("School ID");hodIDJlb.setFont(new Font("Traditional Arabic", 1, 18));hodIDJlb.setForeground(new java.awt.Color(0, 153, 255));hodIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       hodIDTxt.setBounds(230,80,200,35);hodIDTxt.setBackground(new Color(255,255,255));hodIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       hodUsernameTxt.setBounds(230,150,200,35);hodUsernameTxt.setBackground(new Color(255,255,255));hodUsernameTxt.setFont(new Font("Georgia",2,18));
       hodUsernameJlb.setBounds(50,150,150,30); hodUsernameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));hodUsernameJlb.setOpaque(false);hodUsernameJlb.setText("School Name");hodUsernameJlb.setFont(new Font("Traditional Arabic", 1, 18));hodUsernameJlb.setForeground(new Color(0, 153, 255));hodUsernameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       hodPasswordTxt.setBounds(230,150,200,35);hodPasswordTxt.setBackground(new Color(255,255,255));hodPasswordTxt.setFont(new Font("Georgia",2,18));
       hodPasswordJlb.setBounds(50,150,150,30); hodPasswordJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));hodPasswordJlb.setOpaque(false);hodPasswordJlb.setText("School Name");hodPasswordJlb.setFont(new Font("Traditional Arabic", 1, 18));hodPasswordJlb.setForeground(new Color(0, 153, 255));hodPasswordJlb.setHorizontalAlignment(SwingConstants.CENTER);
       addHodCmd.setText("Add");addHodCmd.setBounds(80,230,80,35);addHodCmd.setFont(new Font("Sitka Banner", 3, 14));addHodCmd.setForeground(new Color(0,204,51));addHodCmd.setBackground(new Color(0,0,0));
       updateHodCmd.setText("Update");updateHodCmd.setBounds(180,230,80,35);updateHodCmd.setFont(new Font("Sitka Banner", 3, 14));updateHodCmd.setForeground(new Color(0,240,240));updateHodCmd.setBackground(new Color(0,0,0));
       deleteHodCmd.setText("Delete");deleteHodCmd.setBounds(280,230,80,35);deleteHodCmd.setFont(new Font("Sitka Banner", 3, 14));deleteHodCmd.setForeground(new Color(255,0,51));deleteHodCmd.setBackground(new Color(0,0,0));

//school preview pane
       hodPreviewPane.setBounds(700,10,550,300);
       hodPreviewPane.setBackground(new Color(51,51,51));
       hodPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       hodPreviewPane.setLayout(null);
       hodPreviewPane.add(hodPreviewJlb);hodPreviewPane.add(hodPreviewInnerPane);
       
       hodPreviewJlb.setBounds(400,10,135,23);hodPreviewJlb.setText("school Preview");hodPreviewJlb.setFont(new Font("Georgia",3,14));hodPreviewJlb.setForeground(new Color(255,255,255));hodPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));hodPreviewJlb.setBackground(new Color(0,0,0));
       
       hodPreviewInnerPane.setBounds(10,40,500,240);hodPreviewInnerPane.setBackground(new Color(51, 51, 51));hodPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       hodPreviewPaneScroller.setBounds(10,10,480,200);hodPreviewInnerPane.add(hodPreviewPaneScroller);hodPreviewInnerPane.setLayout(null);hodPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
//       skulPreviewPaneScroller.setBounds(30,50,200,100);
       
       
      hodPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { " Hod ID", "Hod Name","Tel","Email","school name"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       hodPreviewPaneScroller.setViewportView(hodPreviewTable);
       hodPreviewTable.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));hodPreviewTable.setFont(new Font("Georgia", 1, 14));

//</editor-fold>
   //dean
//<editor-fold defaultstate="collapsed" desc=" Dean pane and preview (structure) ">
       deanDetailsPane.setBounds(50,330,500,300);
       deanDetailsPane.setBackground(new Color(51,51,51));
       deanDetailsPane.setBorder(BorderFactory.createTitledBorder(null, "Department details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       deanDetailsPane.setLayout(null);
       deanDetailsPane.add(deanPasswordJlb);deanDetailsPane.add(deanIDJlb);deanDetailsPane.add(deanUsernameTxt);deanDetailsPane.add(deanIDTxt);deanDetailsPane.add(addDeanCmd);deanDetailsPane.add(updateDeanCmd);deanDetailsPane.add(deleteDeanCmd); deanDetailsPane.add(deanPasswordTxt); deanDetailsPane.add(deanUsernameJlb); deanDetailsPane.add(deanPasswordJlb); deanDetailsPane.add(deanPasswordJlb);
       
       deanIDJlb.setBounds(40,80,180,30); deanIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deanIDJlb.setOpaque(false);deanIDJlb.setText("Department ID");deanIDJlb.setFont(new Font("Traditional Arabic", 1, 18));deanIDJlb.setForeground(new java.awt.Color(0, 153, 255));deanIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deanIDTxt.setBounds(230,150,200,35);deanIDTxt.setBackground(new Color(255,255,255));deanIDTxt.setFont(new Font("Georgia",2,18));
       deanUsernameJlb.setBounds(40,150,180,30); deanUsernameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deanUsernameJlb.setOpaque(false);deanUsernameJlb.setText("Department Name");deanUsernameJlb.setFont(new Font("Traditional Arabic", 1, 18));deanUsernameJlb.setForeground(new Color(0, 153, 255));deanUsernameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deanUsernameTxt.setBounds(230,80,200,35);deanUsernameTxt.setBackground(new Color(255,255,255));deanUsernameTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       addDeanCmd.setText("Add");addDeanCmd.setBounds(80,230,80,35);addDeanCmd.setFont(new Font("Sitka Banner", 3, 14));addDeanCmd.setForeground(new Color(0,204,51));addDeanCmd.setBackground(new Color(0,0,0));
       updateDeanCmd.setText("Update");updateDeanCmd.setBounds(180,230,80,35);updateDeanCmd.setFont(new Font("Sitka Banner", 3, 14));updateDeanCmd.setForeground(new Color(0,240,240));updateDeanCmd.setBackground(new Color(0,0,0));
       deleteDeanCmd.setText("Delete");deleteDeanCmd.setBounds(280,230,80,35);deleteDeanCmd.setFont(new Font("Sitka Banner", 3, 14));deleteDeanCmd.setForeground(new Color(255,0,51));deleteDeanCmd.setBackground(new Color(0,0,0));

//dean preview pane
       deanPreviewPane.setBounds(700,330,550,300);
       deanPreviewPane.setBackground(new Color(51,51,51));
       deanPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       deanPreviewPane.setLayout(null);
       deanPreviewPane.add(deanPreviewJlb);deanPreviewPane.add(deanPreviewInnerPane);
       
       deanPreviewJlb.setBounds(360,10,180,23);deanPreviewJlb.setText("Department Preview");deanPreviewJlb.setFont(new Font("Georgia",3,14));deanPreviewJlb.setForeground(new Color(255,255,255));deanPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));deanPreviewJlb.setBackground(new Color(0,0,0));
       
       deanPreviewInnerPane.setBounds(10,40,500,240);deanPreviewInnerPane.setBackground(new Color(51, 51, 51));deanPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       deanPreviewPaneScroller.setBounds(10,10,480,200);deanPreviewInnerPane.add(deanPreviewPaneScroller);deanPreviewInnerPane.setLayout(null);deanPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 153, 255)));

       
       
      deanPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { " Dean ID", "Dean Name","School","Tel","Email"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       deanPreviewPaneScroller.setViewportView(deanPreviewTable);
       deanPreviewTable.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));deanPreviewTable.setFont(new Font("Georgia", 1, 14));
      
     //</editor-fold>       
  //student pane.
 //<editor-fold defaultstate="collapsed" desc="Student details and preview(structure)">
       studentPane.setBounds(50,330,500,300);
       studentPane.setBackground(new Color(51,51,51));
       studentPane.setBorder(BorderFactory.createTitledBorder(null, "Department details", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255))); 
       studentPane.setLayout(null);
       studentPane.add(deptNameJlb);studentPane.add(deptIDJlb);studentPane.add(deptNameTxt);studentDetailsPane.add(deptIDTxt);studentDetailsPane.add(addDeptCmd);studentDetailsPane.add(updateDeptCmd);studentDetailsPane.add(deleteDeptCmd);
       
       deptIDJlb.setBounds(40,80,180,30); deptIDJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deptIDJlb.setOpaque(false);deptIDJlb.setText("Department ID");deptIDJlb.setFont(new Font("Traditional Arabic", 1, 18));deptIDJlb.setForeground(new java.awt.Color(0, 153, 255));deptIDJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deptNameTxt.setBounds(230,150,200,35);deptNameTxt.setBackground(new Color(255,255,255));deptNameTxt.setFont(new Font("Georgia",2,18));
       deptNameJlb.setBounds(40,150,180,30); deptNameJlb.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), null));deptNameJlb.setOpaque(false);deptNameJlb.setText("Department Name");deptNameJlb.setFont(new Font("Traditional Arabic", 1, 18));deptNameJlb.setForeground(new Color(0, 153, 255));deptNameJlb.setHorizontalAlignment(SwingConstants.CENTER);
       deptIDTxt.setBounds(230,80,200,35);deptIDTxt.setBackground(new Color(255,255,255));deptIDTxt.setFont(new Font("Georgia",2,18));//skulIDTxt.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
       addDeptCmd.setText("Add");addDeptCmd.setBounds(80,230,80,35);addDeptCmd.setFont(new Font("Sitka Banner", 3, 14));addDeptCmd.setForeground(new Color(0,204,51));addDeptCmd.setBackground(new Color(0,0,0));
       updateDeptCmd.setText("Update");updateDeptCmd.setBounds(180,230,80,35);updateDeptCmd.setFont(new Font("Sitka Banner", 3, 14));updateDeptCmd.setForeground(new Color(0,240,240));updateDeptCmd.setBackground(new Color(0,0,0));
       deleteDeptCmd.setText("Delete");deleteDeptCmd.setBounds(280,230,80,35);deleteDeptCmd.setFont(new Font("Sitka Banner", 3, 14));deleteDeptCmd.setForeground(new Color(255,0,51));deleteDeptCmd.setBackground(new Color(0,0,0));

//dept preview pane
       deptPreviewPane.setBounds(700,330,550,300);
       deptPreviewPane.setBackground(new Color(51,51,51));
       deptPreviewPane.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Georgia", 3, 36), new Color(255, 255, 255)));
       deptPreviewPane.setLayout(null);
       deptPreviewPane.add(deptPreviewJlb);deptPreviewPane.add(deptPreviewInnerPane);
       
       deptPreviewJlb.setBounds(360,10,180,23);deptPreviewJlb.setText("Department Preview");deptPreviewJlb.setFont(new Font("Georgia",3,14));deptPreviewJlb.setForeground(new Color(255,255,255));deptPreviewJlb.setBorder(BorderFactory.createTitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.TOP));deptPreviewJlb.setBackground(new Color(0,0,0));
       
       deptPreviewInnerPane.setBounds(10,40,500,240);deptPreviewInnerPane.setBackground(new java.awt.Color(51, 51, 51));deptPreviewInnerPane.setBorder(BorderFactory.createEtchedBorder());
       deptPreviewPaneScroller.setBounds(10,10,480,200);deptPreviewInnerPane.add(deptPreviewPaneScroller);deptPreviewInnerPane.setLayout(null);deptPreviewPaneScroller.setViewportBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

       
       
      deptPreviewTable.setModel(new DefaultTableModel(
    new Object [][] {
        {null, null},{null, null},{null,null},{null, null},}, new String [] { " Department ID", "Department Name"}){boolean[] canEdit = new boolean [] { false, false }; public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex]; }});
       deptPreviewPaneScroller.setViewportView(deptPreviewTable);
       deptPreviewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));deptPreviewTable.setFont(new java.awt.Font("Georgia", 1, 14));
         
      //</editor-fold>  
        adminPanel.add(adminPane);
        
        
        
        adminPanel.add(Header);
        Header.setBounds(0,0,1368,50);
        adminPanel.setSize(new Dimension(1368,768));
        adminPanel.setBounds(0,0,1368,768);
        adminPanel.setLayout(null);
        adminPanel.setBackground(new Color(0,0,0));
        getContentPane().add(adminPanel);
                
}
    
    
    
    
    
    
    
    public static void main(String args[] ){
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() ->{
            new admin().setVisible(true); 
    });
    }
    public void button(JButton btn){
     btn.setFont(new Font("Sitka Banner", 3, 14));btn.setForeground(new Color(0,204,51));btn.setBackground(new Color(0,0,0)); 
    }
}
