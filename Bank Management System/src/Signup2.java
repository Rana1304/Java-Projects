import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener{

    String formno ;

    JTextField textpan,textaadhar;

    JRadioButton r1,r2,e1,e2;

    JButton next;

    @SuppressWarnings("rawtypes")
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    Signup2(String formno){

        super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);
        
        JLabel l2 =new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);
        
        JLabel l3 =new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,600,40);
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Jain","Sikh","Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 =new JLabel("Cateogary : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,600,40);
        add(l4);

        String cateogary[] = {"General","OBC","SC","ST","PWD","Other"};
        comboBox2 = new JComboBox<>(cateogary);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 =new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,600,40);
        add(l5);

        String income[] = {"NULL","<1,50,000","<2,50,000","5,00,000","UP TO 10,00,000","ABOVE 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 =new JLabel("Education : ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,600,40);
        add(l6);

        String education[] = {"NULL","8th Pass","10th or 12th Pass","Non-Graduate","Under-Graduate","Post-Graduate","PHD"};
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 =new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,600,40);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Buisness","Student","Retired","Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 =new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,180,40);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,390,320,40);
        add(textpan);

        JLabel l9 =new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,450,180,40);
        add(l9);

        textaadhar = new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhar.setBounds(350,450,320,40);
        add(textaadhar);

        JLabel l10 =new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,500,600,40);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,500,100,40);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,500,100,40);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 =new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,550,180,40);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,18));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,550,100,40);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,18));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,550,100,40);
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12 =new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(600,10,100,40);
        add(l12);

        JLabel l13 =new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(700,10,60,40);
        add(l13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 750);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(252,208,76));

        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Signup2(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String)comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String income = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = textpan.getText();
        String aadhar = textaadhar.getText();

        String scitizen = null;
        if(r1.isSelected()){
            scitizen = "Yes";
        }
        else if(r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = null;
        if(e1.isSelected()){
            eaccount = "Yes";
        }
        else if(e2.isSelected()){
            eaccount = "No";
        }

        try {
            if(e.getSource() == next){
                if(textpan.getText().equals("")||textaadhar.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }else{
                    Conn c1 = new Conn();
                    String q = "insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+income+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                    c1.statement.executeUpdate(q);
                    new Signup3(formno);
                    setVisible(false);
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
