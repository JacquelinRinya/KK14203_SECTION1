import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
class MyFrame extends JFrame 
    implements ActionListener { 

    private Container c; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel matricno; 
    private JTextField tmatricno;
    private JLabel coursecode; 
    private JComboBox code; 
    private JLabel rating; 
    private JRadioButton rating1; 
    private JRadioButton rating2;
    private JRadioButton rating3; 
    private JRadioButton rating4; 
    private JRadioButton rating5;  
    private ButtonGroup rate; 
    private JLabel outcome;
    private JCheckBox Bknowledge; 
    private JCheckBox Aknowledge;
    private JButton sub; 
    private JButton clear; 
    private JTextArea tout; 
    private JLabel res; 
    private JLabel rcnfm;
 
    private String codes[] 
        = { "KK14203", "KT14202", "KK13203", "UW02204" }; 
   
    public MyFrame() 
    { 
        setTitle("Evaluation"); 
        setBounds(0, 0, 450, 550); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        
        class MenuBar extends JMenuBar{
        }
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("Menu");
        menuBar.add(file);
        JMenuItem open = new JMenuItem("Load Data");
        open.addActionListener(this);
        file.add(open);
        JMenuItem quit = new JMenuItem("Exit");
        quit.addActionListener(this);
        file.add(quit);
       
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Course Evaluation Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 20)); 
        title.setSize(350, 30); 
        title.setLocation(100, 30); 
        c.add(title); 
  
        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 18)); 
        name.setSize(230, 20); 
        name.setLocation(10, 100); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 16)); 
        tname.setSize(200, 23); 
        tname.setLocation(130, 100); 
        c.add(tname); 
  
        matricno = new JLabel("Matric No."); 
        matricno.setFont(new Font("Arial", Font.PLAIN, 18)); 
        matricno.setSize(180, 20); 
        matricno.setLocation(10, 130); 
        c.add(matricno); 
  
        tmatricno = new JTextField(); 
        tmatricno.setFont(new Font("Arial", Font.PLAIN, 16)); 
        tmatricno.setSize(130, 23); 
        tmatricno.setLocation(130, 130); 
        c.add(tmatricno); 
        
        coursecode = new JLabel("Course Code"); 
        coursecode.setFont(new Font("Arial", Font.PLAIN, 18)); 
        coursecode.setSize(220, 25); 
        coursecode.setLocation(10, 160); 
        c.add(coursecode); 
  
        code = new JComboBox(codes); 
        code.setFont(new Font("Arial", Font.PLAIN, 16)); 
        code.setSize(150, 20); 
        code.setLocation(130, 160); 
        c.add(code); 
  
        rating = new JLabel("Rating"); 
        rating.setFont(new Font("Arial", Font.PLAIN, 18)); 
        rating.setSize(100, 20); 
        rating.setLocation(10, 190); 
        c.add(rating); 
  
        rating1 = new JRadioButton("1"); 
        rating1.setFont(new Font("Arial", Font.PLAIN, 16)); 
        rating1.setSelected(true); 
        rating1.setSize(40, 20); 
        rating1.setLocation(130, 190); 
        c.add(rating1); 
  
        rating2 = new JRadioButton("2"); 
        rating2.setFont(new Font("Arial", Font.PLAIN, 16)); 
        rating2.setSelected(false); 
        rating2.setSize(40, 20); 
        rating2.setLocation(170, 190); 
        c.add(rating2); 
        
        rating3 = new JRadioButton("3"); 
        rating3.setFont(new Font("Arial", Font.PLAIN, 16)); 
        rating3.setSelected(true); 
        rating3.setSize(40, 20); 
        rating3.setLocation(210, 190); 
        c.add(rating3); 
  
        rating4 = new JRadioButton("4"); 
        rating4.setFont(new Font("Arial", Font.PLAIN, 16)); 
        rating4.setSelected(false); 
        rating4.setSize(40, 20); 
        rating4.setLocation(250, 190); 
        c.add(rating4); 
        
        rating5 = new JRadioButton("5"); 
        rating5.setFont(new Font("Arial", Font.PLAIN, 16)); 
        rating5.setSelected(false); 
        rating5.setSize(40, 20); 
        rating5.setLocation(290, 190); 
        c.add(rating5); 
  
        rate = new ButtonGroup(); 
        rate.add(rating1); 
        rate.add(rating2); 
        rate.add(rating3); 
        rate.add(rating4); 
        rate.add(rating5); 
  
        outcome = new JLabel("Outcome"); 
        outcome.setFont(new Font("Arial", Font.PLAIN, 18)); 
        outcome.setSize(100, 20); 
        outcome.setLocation(10, 220); 
        c.add(outcome);
        
        Bknowledge = new JCheckBox("Basic Knowledge"); 
        Bknowledge.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Bknowledge.setSize(140, 20); 
        Bknowledge.setLocation(130, 220); 
        c.add(Bknowledge); 
        
        Aknowledge = new JCheckBox("Advanced Knowledge"); 
        Aknowledge.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Aknowledge.setSize(180, 20); 
        Aknowledge.setLocation(270, 220); 
        c.add(Aknowledge);
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(80, 25); 
        sub.setLocation(10, 250); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        clear = new JButton("Clear"); 
        clear.setFont(new Font("Arial", Font.PLAIN, 15)); 
        clear.setSize(80, 25); 
        clear.setLocation(95, 250); 
        clear.addActionListener(this); 
        c.add(clear); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(425, 150); 
        tout.setLocation(10, 310); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
        
        rcnfm = new JLabel(""); 
        rcnfm.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 15)); 
        rcnfm.setSize(500, 25); 
        rcnfm.setLocation(130, 280); 
        c.add(rcnfm); 
        
        setVisible(true); 
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
                String data1; 
                String data 
                    = "Output" + "\n" + "----------" + "\n" + "Name :  "
                      + tname.getText() + "\n"
                      + "Matric No :  "
                      + tmatricno.getText() + "\n"; 
                if (rating1.isSelected()) 
                    data1 = "Rating : 1"
                            + "\n"; 
                if (rating2.isSelected()) 
                    data1 = "Rating : 2"
                            + "\n"; 
                if (rating3.isSelected()) 
                    data1 = "Rating : 3"
                            + "\n"; 
                if (rating4.isSelected()) 
                    data1 = "Rating : 4"
                            + "\n"; 
                else
                    data1 = "Rating : 5" + "\n";
                String data2 
                    = "Course Code : "
                      + (String)code.getSelectedItem()
                      + "\n"; 
                String data3 = " ";
                if (Bknowledge.isSelected()) 
                    data3 = "Outcome : Basic Knowledge"
                            + "\n"; 
                if (Aknowledge.isSelected()) 
                    data3 = "Outcome : Advanced Knowledge"
                            + "\n"; 
                String data4 = " "; 
                tout.setText(data + data1 + data2 + data3 + data4); 
                tout.setEditable(false); 
                rcnfm.setText("Evaluation Successful"); 
            } 
            else { 
                tout.setText("");  
                res.setText(""); 
                rcnfm.setText("Please complete"
                        + " the evaluation"); 
            }
  
        if (e.getSource() == clear) { 
            String def = ""; 
            tname.setText(def); 
            tmatricno.setText(def); 
            res.setText(def); 
            tout.setText(def);  
            code.setSelectedIndex(0);  
           
        } 
        String choice = e.getActionCommand();
        if (choice.equals("Load Data")) {;
        }
        else if (choice.equals("Exit")) {
           JOptionPane.showMessageDialog(this,"Sure to Exit?");
           System.exit(0);     
      } 
    }
}
   class CourseEvaluation { 

    public static void main(String[] args) throws Exception 
    { 
        MyFrame f = new MyFrame(); 
    }
}