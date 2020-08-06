import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
  
class MyFrame 
    extends JFrame 
    implements ActionListener { 

    private Container ctnr; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel name1; 
    private JTextField tname1; 
    private JLabel contact;
    private JTextField tcontact;
    private JLabel name2; 
    private JTextField tname2; 
    private JLabel contact1;
    private JTextField tcontact1;
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup button1; 
    private JLabel dob; 
    private JComboBox date; 
    private JComboBox month; 
    private JComboBox year; 
    private JLabel grade;
    private JRadioButton grade1;
    private JRadioButton grade2;
    private ButtonGroup button2;
    private JLabel addrr; 
    private JTextArea taddrr; 
    private JCheckBox treg; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel rcnfm; 
    private JTextArea resadd; 
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "2014","2015"}; 
  
    public MyFrame() 
    { 
        setTitle("ABC Kindergarten"); 
        setBounds(300, 90, 830, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        
        class MenuBar extends JMenuBar{
        }
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("Menu");
        menuBar.add(file);
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);
        file.add(open);
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        file.add(quit);
       
        ctnr = getContentPane(); 
        ctnr.setLayout(null); 
  
        title = new JLabel("ABC Kindergarten Registration Form"); 
        title.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 22)); 
        title.setSize(400, 30); 
        title.setLocation(280, 30); 
        ctnr.add(title); 
  
        name = new JLabel("Child's Name"); 
        name.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        name.setSize(190, 20); 
        name.setLocation(100, 100); 
        ctnr.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        tname.setSize(190, 20); 
        tname.setLocation(230, 100); 
        ctnr.add(tname); 
  
        name1= new JLabel("Father's Name"); 
        name1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        name1.setSize(190, 20); 
        name1.setLocation(100, 130); 
        ctnr.add(name1); 
  
        tname1 = new JTextField(); 
        tname1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        tname1.setSize(190, 20); 
        tname1.setLocation(230, 130); 
        ctnr.add(tname1); 
        
        contact = new JLabel("Contact No"); 
        contact.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        contact.setSize(140, 20); 
        contact.setLocation(100, 160); 
        ctnr.add(contact); 
  
        tcontact = new JTextField(); 
        tcontact.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        tcontact.setSize(140, 20); 
        tcontact.setLocation(230, 160); 
        ctnr.add(tcontact); 
        
        name2= new JLabel("Mother's Name"); 
        name2.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        name2.setSize(190, 20); 
        name2.setLocation(100, 190); 
        ctnr.add(name2); 
  
        tname2 = new JTextField(); 
        tname2.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        tname2.setSize(190, 20); 
        tname2.setLocation(230, 190); 
        ctnr.add(tname2); 
        
        contact1 = new JLabel("Contact No"); 
        contact1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        contact1.setSize(140, 20); 
        contact1.setLocation(100, 220); 
        ctnr.add(contact1); 
  
        tcontact1 = new JTextField(); 
        tcontact1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        tcontact1.setSize(140, 20); 
        tcontact1.setLocation(230, 220); 
        ctnr.add(tcontact1); 
  
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 250); 
        ctnr.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 18)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(230, 250); 
        ctnr.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 18)); 
        female.setSelected(false); 
        female.setSize(85, 20); 
        female.setLocation(330, 250); 
        ctnr.add(female); 
  
        button1 = new ButtonGroup(); 
        button1.add(male); 
        button1.add(female); 
  
        dob = new JLabel("DOB"); 
        dob.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        dob.setSize(100, 20); 
        dob.setLocation(100, 280); 
        ctnr.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        date.setSize(50, 20); 
        date.setLocation(230, 280); 
        ctnr.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        month.setSize(60, 20); 
        month.setLocation(280, 280); 
        ctnr.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        year.setSize(60, 20); 
        year.setLocation(340, 280); 
        ctnr.add(year); 
        
        grade = new JLabel("Grade"); 
        grade.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        grade.setSize(100, 20); 
        grade.setLocation(100, 310); 
        ctnr.add(grade); 
  
        grade1 = new JRadioButton("1st Grade"); 
        grade1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 18)); 
        grade1.setSelected(true); 
        grade1.setSize(100, 20); 
        grade1.setLocation(230, 310); 
        ctnr.add(grade1); 
  
        grade2 = new JRadioButton("2nd Grade"); 
        grade2.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 18)); 
        grade2.setSelected(false); 
        grade2.setSize(110, 20); 
        grade2.setLocation(330, 310); 
        ctnr.add(grade2); 
  
        button2 = new ButtonGroup(); 
        button2.add(grade1); 
        button2.add(grade2); 
  
        addrr = new JLabel("Address"); 
        addrr.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        addrr.setSize(100, 20); 
        addrr.setLocation(100, 340); 
        ctnr.add(addrr); 
  
        taddrr = new JTextArea(); 
        taddrr.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 17)); 
        taddrr.setSize(200, 75); 
        taddrr.setLocation(230, 340); 
        taddrr.setLineWrap(true); 
        ctnr.add(taddrr); 
  
        treg = new JCheckBox("Please confirm the registration"); 
        treg.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 16)); 
        treg.setSize(250, 20); 
        treg.setLocation(230, 430); 
        ctnr.add(treg); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        sub.setSize(100, 20); 
        sub.setLocation(230, 480); 
        sub.addActionListener(this); 
        ctnr.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 19)); 
        reset.setSize(100, 20); 
        reset.setLocation(320, 480); 
        reset.addActionListener(this); 
        ctnr.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        ctnr.add(tout); 
  
        rcnfm = new JLabel(""); 
        rcnfm.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 15)); 
        rcnfm.setSize(500, 25); 
        rcnfm.setLocation(230, 450); 
        ctnr.add(rcnfm); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        ctnr.add(resadd); 
  
        setVisible(true); 
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
            if (treg.isSelected()) { 
                String data1; 
                String data 
                    = "Child's Name : "
                      + tname.getText() + "\n"
                      + "Father's Name : "
                      + tname1.getText() + "\n" + "Contact Number : "
                              + tcontact.getText() + "\n" + "Mother's Name : "
                                      + tname2.getText() + "\n" + "Contact Number : "
                                      + tcontact1.getText() +"\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; 
                String data2 
                    = "DOB : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
  
                String data3 = "Address : " + taddrr.getText(); 
                tout.setText(data + data1 + data2 + data3); 
                tout.setEditable(false); 
                rcnfm.setText("Registration Successful"); 
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                rcnfm.setText("Please complete"
                            + " the registration"); 
            } 
            if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            taddrr.setText(def); 
            tname1.setText(def); 
            rcnfm.setText(def); 
            tout.setText(def); 
            treg.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def); 
            }
         String choice = e.getActionCommand();
         if (choice.equals("Open")) {;
        }
         else if (choice.equals("Quit")) {
         JOptionPane.showMessageDialog(this,"Sure to Quit?");
         System.exit(0);   
    } 
   } 
  }
}
class Kindergarten { 
  
    public static void main(String[] args) throws Exception 
    { 
        MyFrame f = new MyFrame(); 
    } 
}