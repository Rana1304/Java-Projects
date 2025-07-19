import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{

    JTextField textname,textfname,textemail,textadd,textcity,textpin,textstate;

    JDateChooser datechooser;

    Random ran = new Random();

    long first4 = (ran.nextLong()% 9000L) +1000L;

    String first = " " +Math. abs(first4);

    JRadioButton r1 , r2 , r3 , m1 , m2;

    JButton next ;

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(360,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Information");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);

        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raeway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);
        
        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raeway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);

        textfname = new JTextField();
        textfname.setFont(new Font("Raleway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raeway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Ralway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(370,290,90,30);
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(470,290,90,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelemail = new JLabel("Email Address :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelms = new JLabel("Maritial Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,90,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(400,440,110,30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        
        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);
        
        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);
        
        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String formno = first;
        String name = textname.getText();
        String fname = textfname.getText();
        String Dob = null;
        if (datechooser.getDate() != null) {
            Dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a date of birth.");
        }
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }else {
            gender = "Others";
        }
        String email = textemail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else{
            marital = "Unmarried";
        }
        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();

        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill ALL THE FIELDS");
            }else{
                Conn conn1 = new Conn();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+Dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
