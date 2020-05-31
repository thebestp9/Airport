import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener { 

    // Components of the Form 
    private JLabel bcolor1;
    private JLabel bcolor;
    private JLabel gif;
    private JLabel rec;
    private JLabel rec1;
    private JLabel image;
    private JLabel image2;
    private JLabel image3;
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel airlines;
    private JRadioButton asia;
    private JRadioButton malindo;
    private JRadioButton malaysia;
    private JRadioButton emirates;
    private ButtonGroup gengp; 
    private JLabel dob; 
    private JComboBox sex;
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset;
    private JButton info; 
    private JTextArea tout; 
    private JLabel res;
    private JLabel res1;

    private String gender[] = {"--Select--" , "Male" , "Female" , "Others"}; 
    

    // constructor, to initialize the components 
    // with default values. 
    public MyFrame() 
    {
        setTitle("KLIA Asker"); 
        setBounds(300, 200, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 

        c = getContentPane(); 
        c.setLayout(null); 
      
        bcolor = new JLabel();
        bcolor.setSize(900, 80); 
        bcolor.setLocation(0, 0);
        bcolor.setOpaque(true);
        bcolor.setBackground(new Color(255, 169, 195, 100));
        c.add(bcolor);
      
        bcolor1 = new JLabel();
        bcolor1.setSize(900, 3); 
        bcolor1.setLocation(0, 80);
        bcolor1.setOpaque(true);
        bcolor1.setBackground(new Color(0, 0, 0));
        c.add(bcolor1);
        
        gif = new JLabel();
        gif.setIcon(new ImageIcon("normalloading2.gif"));
        gif.setSize(100, 100); 
        gif.setLocation(250, 380);
        c.add(gif);
        validate();
        
        rec = new JLabel();
        rec.setIcon(new ImageIcon("Rec.png"));
        rec.setSize(400, 10); 
        rec.setLocation(100, 345);
        c.add(rec);
        validate();
        
        rec1 = new JLabel();
        rec1.setIcon(new ImageIcon("Rec.png"));
        rec1.setSize(400, 10); 
        rec1.setLocation(100, 495);
        c.add(rec1);
        validate();
      
        image = new JLabel();
        image.setIcon(new ImageIcon("airlines2.png"));
        image.setSize(100, 80); 
        image.setLocation(700, 5);
        c.add(image);
        validate();
      
        image2 = new JLabel();
        image2.setIcon(new ImageIcon("airlines3.png"));
        image2.setSize(100, 80); 
        image2.setLocation(100, 5);
        c.add(image2);
        validate();
       
        image3 = new JLabel();
        image3.setIcon(new ImageIcon("thumbs1.png"));
        image3.setSize(100, 80); 
        image3.setLocation(630, 420);
        c.add(image3);
        validate();
        image3.setVisible(false);
      
      
        title = new JLabel("WELCOME TO KLIA"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30); 
        title.setLocation(315, 30); 
        title.setForeground(new Color(0, 0, 0));
        c.add(title); 

        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 

        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        c.add(tname); 

        mno = new JLabel("Email"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(500, 100); 
        c.add(mno); 

        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setSize(150, 20); 
        tmno.setLocation(600, 100); 
        c.add(tmno); 

        airlines = new JLabel("Types of Airlines"); 
        airlines.setFont(new Font("Arial", Font.PLAIN, 20)); 
        airlines.setSize(150, 20); 
        airlines.setLocation(100, 150); 
        c.add(airlines); 

        asia = new JRadioButton("Air Asia"); 
        asia.setFont(new Font("Arial", Font.PLAIN, 15)); 
        asia.setSelected(false); 
        asia.setSize(75, 20); 
        asia.setLocation(290, 150); 
        c.add(asia); 
 
        malindo = new JRadioButton("Malindo Air"); 
        malindo.setFont(new Font("Arial", Font.PLAIN, 15)); 
        malindo.setSelected(false); 
        malindo.setSize(100, 20); 
        malindo.setLocation(375, 150); 
        c.add(malindo); 
       
        malaysia = new JRadioButton("Malaysia Airlines"); 
        malaysia.setFont(new Font("Arial", Font.PLAIN, 15)); 
        malaysia.setSelected(false); 
        malaysia.setSize(135, 20); 
        malaysia.setLocation(475, 150); 
        c.add(malaysia); 
      
        emirates = new JRadioButton("Emirates"); 
        emirates.setFont(new Font("Arial", Font.PLAIN, 15)); 
        emirates.setSelected(false); 
        emirates.setSize(85, 20); 
        emirates.setLocation(610, 150); 
        c.add(emirates);

        gengp = new ButtonGroup(); 
        gengp.add(asia); 
        gengp.add(malindo); 
        gengp.add(malaysia);
        gengp.add(emirates);
 
        dob = new JLabel("Gender"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(200, 20); 
        dob.setLocation(100, 200); 
        c.add(dob); 
 
        sex = new JComboBox(gender); 
        sex.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sex.setSize(110, 20); 
        sex.setLocation(200, 200); 
        c.add(sex); 


        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(330, 250); 
        c.add(term); 

        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(200, 300); 
        sub.addActionListener(this); 
        c.add(sub); 

        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(400, 300); 
        reset.addActionListener(this); 
        c.add(reset); 
       
        info = new JButton("Info"); 
        info.setFont(new Font("Arial", Font.PLAIN, 15)); 
        info.setSize(100, 20); 
        info.setLocation(600, 300); 
        info.addActionListener(this); 
        c.add(info);

        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(400, 150); 
        tout.setLocation(100, 350); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 

        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setForeground(new Color(255, 0, 0));
        res.setSize(500, 50); 
        res.setLocation(270, 500);
        c.add(res);
      
        res1 = new JLabel(""); 
        res1.setFont(new Font("Arial", Font.PLAIN, 30)); 
        res1.setSize(500, 35); 
        res1.setLocation(550, 370);
        c.add(res1); 

        setVisible(true); 
    } 

   // method actionPerformed() 
   // to get the action performed 
   // by the user and act accordingly 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == info){
            JOptionPane.showMessageDialog(this, "Air Asia: The price is cheap, maximum of 5.0KG of luggage,  West Runway, Economy class\n\nMalindo Air: The price is cheap, Maximum of 4.0KG of luggage, East Runway, Economy class\n\nMalaysia Airlines:The price is average, Maximum of 7.0KG of luggage, North Runway, Economy class and Business Class\n\nEmirates: The price is expensive, Maximum of 10.0KG of luggage, South Runway, Economy class and Business Class");
        }
        
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                gif.setVisible(false);
                
                String data1 = ""; 
                    String data  = "Name : " + tname.getText() + "\n" + 
                                   "Email : " + tmno.getText() + "\n"; 
               
            if (asia.isSelected()) 
                data1 = "Airlines : Air Asia\nType of Class : Economy\nRunway : West\n";
            if (malindo.isSelected()) 
                data1 = "Airlines : Malindo Air\nType of Class : Economy\nRunway : East\n";
            if (malaysia.isSelected()) 
                data1 = "Airlines : Malaysia Airlines\nType of Class : Economy\nRunway : North\n";
            else if(emirates.isSelected()) 
                data1 = "Airlines : Enirates\nType of Class : Economy\nRunway : South\n";
                     
            
                     
            String data2 
                = "Gender : "+ sex.getSelectedItem() + "\n";
               
            tout.setText(data + data1 + data2); 
            tout.setEditable(false); 
            res.setForeground(new Color(0, 0, 0));
            res.setText("Registration Successfully.."); 
            res1.setText("Have A Save Flight!!");
            image3.setVisible(true);
           } 
          
           else 
           { 
               tout.setText(""); 
               res.setText("Please accept the terms & conditions.."); 
           } 
       } 

       else if (e.getSource() == reset) 
       { 
           String def = ""; 
           tname.setText(def);
           tmno.setText(def); 
           res.setText(def);
           res1.setText(def); 
           tout.setText(def); 
           term.setSelected(false); 
           image3.setVisible(false);
           sex.setSelectedIndex(0);
           gif.setVisible(true);
           res.setForeground(new Color(255, 0, 0));
       } 
    } 
} 

// Driver Code 
class Registration { 

   public static void main(String[] args) throws Exception  { 
       MyFrame f = new MyFrame(); 
       Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");  
           f.setIconImage(icon); 
       
   } 
}

