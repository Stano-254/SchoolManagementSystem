
package SchoolManagementSystem.login;



import SchoolManagementSystem.user.student;
import SchoolManagementSystem.user.Lecturers;
import SchoolManagementSystem.user.deans;
import SchoolManagementSystem.user.hods;
import School.Management.system.admin.dbConfig;
import School.Management.system.admin.admin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author Stern
 */
public class Login  extends javax.swing.JFrame{
    dbConfig db = new dbConfig();
    public Image img,img2,img3,img4,img5,img6;
    String daytime_night,Hour,Minute,second;
    private final JTextField usernameTxt = new JTextField();
    private final JPasswordField Jpass = new JPasswordField();
    private final JLabel PM_AM = new JLabel(),secJlb = new JLabel(),minJlb =new JLabel(),hourJlb = new JLabel(),Blink1 =  new JLabel(),Blink2 = new JLabel(),dayOfWeeks = new JLabel(),dateJlb = new JLabel(),LogoJlb = new JLabel(),imgHolder = new JLabel(), usernameJlb = new JLabel(), passwordJlb = new JLabel(), userLabel = new JLabel();
    
    public  Login(){
        intilComponents();
        dateTime();
        
        
    }

    
    
    
    
    
    
    
    
    
    
    
    private void intilComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("login");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(5, 50, 9, 6));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(403, 403));
        setSize(new java.awt.Dimension(683, 401));
        setName("JFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);
        
//        setting the jframe center on screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        /* 
        setting variables and panels for use on Jframe
        */
//      another pane on top of main pane
        /* creating element to use on the panels 

        */
        JPanel mainPane = new JPanel(),headerPane = new JPanel(),loginPane = new JPanel();
        JButton MinimizeCmd = new JButton(),CloseCmd = new JButton(), loginCmd = new JButton();
      
        
        /* 
        end of elements creation
        
        */
        /* 
        components of header pane
        */
        CloseCmd.setPreferredSize(new Dimension(17, 18));
        MinimizeCmd.setPreferredSize(new Dimension(17, 18));
        
        try {
            img = ImageIO.read(getClass().getResource("/schoolmanagement1/resource/close1.png"));
            img2= ImageIO.read(getClass().getResource("/schoolmanagement1/resource/mimimize2.png"));
            img3= ImageIO.read(getClass().getResource("/schoolmanagement1/resource/LOGO1.png"));
            img4= ImageIO.read(getClass().getResource("/schoolmanagement1/resource/homeImg.jpeg"));
            img5= ImageIO.read(getClass().getResource("/schoolmanagement1/resource/select-user.png"));
            img6= ImageIO.read(getClass().getResource("/schoolmanagement1/resource/globe2.gif"));
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        CloseCmd.setIcon(new ImageIcon(img));MinimizeCmd.setIcon(new ImageIcon(img2));
        CloseCmd.setBorder(null); MinimizeCmd.setBorder(null);
        CloseCmd.setBounds(665, 0, 16, 17);MinimizeCmd.setBounds(640, 0, 17, 17);
        headerPane.add(CloseCmd);headerPane.add(MinimizeCmd);
        
        MinimizeCmd.addActionListener((ActionEvent event) -> {
         this.setState(JFrame.ICONIFIED);
         });
        CloseCmd.addActionListener((ActionEvent event) -> {
          System.exit(0); 
           
         });
//        URL url = this.getClass().getResource("/schoolmanagement1/resource/globe2.gif");
//        Icon icon = new ImageIcon(url);
        LogoJlb.setIcon( new ImageIcon (img3)); 
       LogoJlb.setText(" ");
        headerPane.add(LogoJlb);
        LogoJlb.setBounds(0, 0, 60, 50);
        
    /**
     *
     */
     // <editor-fold defaultstate="collapsed" desc="timeStamp"> 
        PM_AM.setBounds(598,0,40,30);
        PM_AM.setFont(new Font("Digital-7", 1, 24)); 
        PM_AM.setForeground(new Color(0, 204, 255));
        PM_AM.setHorizontalAlignment(SwingConstants.CENTER);
        PM_AM.setText("PM");
        
        secJlb.setBounds(560,0,40,30);
        secJlb.setFont(new Font("Digital-7", 1, 24)); 
        secJlb.setForeground(new Color(0, 204, 255));
        secJlb.setHorizontalAlignment(SwingConstants.CENTER);
        secJlb.setText("00");
        
        Blink1.setBounds(540,0,40,30);
        Blink1.setFont(new Font("Digital-7", 1, 24)); 
        Blink1.setForeground(new Color(0, 204, 255));
        Blink1.setHorizontalAlignment(SwingConstants.CENTER);
        Blink1.setText(":");
        
        minJlb.setBounds(520,0,40,30);
        minJlb.setFont(new Font("Digital-7", 1, 24)); 
        minJlb.setForeground(new Color(0, 204, 255));
        minJlb.setHorizontalAlignment(SwingConstants.CENTER);
        minJlb.setText("00");
        
        Blink2.setBounds(498,0,40,30);
        Blink2.setFont(new Font("Digital-7", 1, 24)); 
        Blink2.setForeground(new Color(0, 204, 255));
        Blink2.setHorizontalAlignment(SwingConstants.CENTER);
        Blink2.setText(":");
        
        hourJlb.setBounds(480,0,40,30);
        hourJlb.setFont(new Font("Digital-7", 1, 24)); 
        hourJlb.setForeground(new Color(0, 204, 255));
        hourJlb.setHorizontalAlignment(SwingConstants.CENTER);
        hourJlb.setText("00");
        
        dayOfWeeks.setFont(new java.awt.Font("Georgia", 3, 14));
        dayOfWeeks.setForeground(new java.awt.Color(255, 255, 255));
        dayOfWeeks.setText("dayOfWeek");
        headerPane.add(dayOfWeeks);
        dayOfWeeks.setBounds(340, 0, 90, 34);
        
        dateJlb.setFont(new java.awt.Font("Lucida Bright", 0, 14)); 
        dateJlb.setForeground(new java.awt.Color(255, 255, 255));
        dateJlb.setText("Date");
        headerPane.add(dateJlb);
        dateJlb.setBounds(340, 20, 120, 30);
      
        headerPane.add(PM_AM);headerPane.add(secJlb);headerPane.add(Blink1);headerPane.add(minJlb);headerPane.add(Blink2);headerPane.add(hourJlb);
        headerPane.setBackground(new Color(0,0,0));
        headerPane.setLayout(null);
        headerPane.setBounds(0,0,683,50);
         //////////////////////////////////////////////////////////////
         // </editor-fold>
        imgHolder.setHorizontalAlignment(SwingConstants.CENTER);
        imgHolder.setIcon(new ImageIcon(img4)); 
        imgHolder.setIconTextGap(0);
        mainPane.add(imgHolder);
        imgHolder.setBounds(0, -15,448, 480); 
        mainPane.add(headerPane);
        
        // loginpane 
        
        userLabel.setBounds(80,0,100,87);
        userLabel.setIcon(new ImageIcon(img5));
         loginPane.add(userLabel);
        usernameJlb.setBackground(new Color(51, 51, 51));
        usernameJlb.setFont(new Font("Gabriola", 1, 24)); 
        usernameJlb.setForeground(new Color(0, 204, 204));
        usernameJlb.setHorizontalAlignment(SwingConstants.CENTER);
        usernameJlb.setText("Username");
        usernameJlb.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new ImageIcon(img3))); 
        usernameJlb.setOpaque(true);
       
        usernameJlb.setBounds(30,100,180,30);
        usernameTxt.setBounds(30,140,180,30);
        usernameTxt.setFont(new Font("Cambria", 1, 18));
        loginPane.add(usernameJlb);
        loginPane.add(usernameTxt);
        passwordJlb.setBackground(new Color(51, 51, 51));
        passwordJlb.setFont(new Font("Gabriola", 1, 24)); 
        passwordJlb.setForeground(new Color(0, 204, 204));
        passwordJlb.setHorizontalAlignment(SwingConstants.CENTER);
        passwordJlb.setText("password");
        passwordJlb.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new ImageIcon(img3))); 
        passwordJlb.setOpaque(true);
        loginPane.add(passwordJlb);
        passwordJlb.setBounds(30, 200, 180, 30);
        Jpass.setFont(new Font("Cambria", 1, 18));
        Jpass.setBounds(30,240,180,30);
        loginPane.add(Jpass);
        loginCmd.setBounds(80,280,80,30);
        loginCmd.setFont(new Font("Gabriola", 3, 24)); 
        loginCmd.setForeground(new Color(0, 204, 255));
        loginCmd.setText("Log In");
        loginCmd.setBorder(BorderFactory.createTitledBorder(""));
        loginCmd.addActionListener((ActionEvent event) -> {
            String table,username,pass;
        username=usernameTxt.getText().trim().toUpperCase();
        pass=Jpass.getPassword().toString();
          JOptionPane.showMessageDialog(null, username);
        JOptionPane.showMessageDialog(null, pass);
        // sending data to the database.
        int slash= username.indexOf("/");
         JOptionPane.showMessageDialog(null,slash);
         JOptionPane.showMessageDialog(null,username.substring(0,slash));
        if(username.substring(0,slash).contains("CI")){
           table="student_table"; 
         login(table,username,pass);
          JOptionPane.showMessageDialog(null, "login Successful");
          student std= new student();
          std.setVisible(true);
          dispose();
                 }
        else if(username.substring(0,slash).contains("LEC")){
            table="lecturers_table"; 
         login(table,username,pass);
         Lecturers lec= new Lecturers();
          lec.setVisible(true);
          dispose();
        }
        else if(username.substring(0,slash).contains("HOD")){
            table="HOD_table"; 
         login(table,username,pass);table="student"; 
         login(table,username,pass);
         hods hod= new hods();
          hod.setVisible(true);
          dispose();
        }
        else if (username.substring(0,slash).contains("DE")){
            table="deans_table"; 
         login(table,username,pass);
         deans dean= new deans();
          dean.setVisible(true);
          dispose();
        } 
        else if(username.substring(0,slash).contains("ADMIN")){
            table="admin_table"; 
         login(table,username,pass);
         admin adm= new admin();
          adm.setVisible(true);
          dispose();
        }
        else 
        {
                 JOptionPane.showMessageDialog(null, " Invalid Username");
                 
                }
        });
        loginPane.add(loginCmd);
        
       
        loginPane.setBackground(new Color(240,240,240));
        loginPane.setBounds(448,50,235,400);
        loginPane.setLayout(null);
        mainPane.add(loginPane);
        /////////////////////
        
    mainPane.setMinimumSize(new java.awt.Dimension(683,468));
    mainPane.setLayout(null);
    mainPane.setBackground(Color.red);
    mainPane.setBounds(0, 0, 683,400);
    getContentPane().add(mainPane);
    }
    
    
    
    public static void main (String [] args){
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
     private void dateTime(){
          
         new Thread(){
          @Override
         public void run(){
             int timeRun=0;
             while(timeRun==0)
            {
                 Calendar cal = new GregorianCalendar();
                  
                  int hour = cal.get(Calendar.HOUR);
                  int minute = cal.get(Calendar.MINUTE);
                  int sec = cal.get(Calendar.SECOND);
                  int AM_PM = cal.get(Calendar.AM_PM);
                 int month = cal.get(Calendar.MONTH);
                 int day = cal.get(Calendar.DAY_OF_MONTH);
                 int year = cal.get(Calendar.YEAR);
                 int dayOfWeek= cal.get(Calendar.DAY_OF_WEEK);
                  if(AM_PM==1){
                     daytime_night ="PM"; 
                  } else {
                      daytime_night = "AM";
                  }
                  if(sec%2==0){
                     Blink1.setText(":");
                     Blink2.setText(":");
                     dayOfWeeks.setForeground(Color.cyan);
                  }else{
                    Blink1.setText("");  
                    Blink2.setText("");
                     dayOfWeeks.setForeground(Color.blue);
                  }
                  
                 switch (dayOfWeek) {
                     case 1:
                         dayOfWeeks.setText("Sunday");
                         break;
                     case 2:
                         dayOfWeeks.setText("Monday");
                         break;
                     case 3:
                         dayOfWeeks.setText("Tuesday");
                         break;
                     case 4:
                         dayOfWeeks.setText("Wensday");
                         break;
                     case 5:
                         dayOfWeeks.setText("Thursday");  
                         break;
                     case 6:
                         dayOfWeeks.setText("Friday");
                         break;
                     case 7:
                         dayOfWeeks.setText("Sarturday");
                         break;
                     default:
                         break;
                 }
                
//                Hour =( ( hour < 10 ) ? "0"+hour : hour ) + ""; 
                Hour =((hour==0)&&(AM_PM==1)? 12 : ( ( hour < 10 ) ? "0"+hour : hour ))+""; 
                
                Minute = ( ( minute < 10 ) ? "0"+ minute : minute )  + " ";
                second = ( ( sec < 10 ) ? "0"+ sec : sec )  + "";   
               hourJlb.setText(Hour);
               minJlb.setText(Minute);
               secJlb .setText(second);
               PM_AM.setText(daytime_night);
               dateJlb.setText((day)+" / "+(month+1)+" / "+year+" ");
              }
         }  
        }.start();
    
    }
    

public void login(String table, String username,String pass){
        JOptionPane.showMessageDialog(null,table);
         try {   
     String sql = "SELECT * FROM "+table.trim()+" WHERE Username=? and password=? ";
        
         PreparedStatement pst= db.con.prepareStatement(sql);
         pst.setString(1,username);
         pst.setString(2,pass);
         pst.execute();
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,ex);
     }
    }
}