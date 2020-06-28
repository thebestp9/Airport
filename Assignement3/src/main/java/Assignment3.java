import java.io.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.util.*;

class MyFrame extends JFrame implements ActionListener  { 

    // Components of the Form 
    private JLabel bcolor1;
    private JLabel bcolor;
    private JLabel image;
    private JLabel image2;
    private JLabel image3;
    private JLabel title;
    private JLabel title1;
    private JLabel title2;
    private JLabel name;
    private JLabel aadd;
    private JLabel adel;
    private Container c;
    private JTextField tname;
    private JTextField tdel;
    private JButton add; 
    private JButton del; 
    private JButton sub;
    private JButton sub1;
    private JButton back;
    private JButton info;
    
    ArrayList fever = new ArrayList();
    FileWriter weaver;
    PrintWriter out;
    
    // constructor, to initialize the components 
    // with default values. 
    public MyFrame () 
    {
        setTitle("KLIA Asker"); 
        setBounds(300, 200, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 

        c = getContentPane(); 
        c.setLayout(null); 
      
        //the wide pink border colour
        bcolor = new JLabel();
        bcolor.setSize(900, 80); 
        bcolor.setLocation(0, 0);
        bcolor.setOpaque(true);
        bcolor.setBackground(new Color(255, 169, 195, 100));
        c.add(bcolor);
      
        //the thin black border colour
        bcolor1 = new JLabel();
        bcolor1.setSize(900, 3); 
        bcolor1.setLocation(0, 80);
        bcolor1.setOpaque(true);
        bcolor1.setBackground(new Color(0, 0, 0));
        c.add(bcolor1);
      
        //the air shape graphic
        image = new JLabel();
        image.setIcon(new ImageIcon("airlines2.png"));
        image.setSize(100, 80); 
        image.setLocation(700, 5);
        c.add(image);
        validate();
      
        //the air shape graphic
        image2 = new JLabel();
        image2.setIcon(new ImageIcon("airlines3.png"));
        image2.setSize(100, 80); 
        image2.setLocation(100, 5);
        c.add(image2);
        validate();
        
        //the colourful graphic
        image3 = new JLabel();
        image3.setIcon(new ImageIcon("Design.png"));
        image3.setSize(900, 600); 
        image3.setLocation(0, 0);
        c.add(image3);
        validate();
      
        //Text title in the front page
        title = new JLabel("WELCOME TO KLIA"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30); 
        title.setLocation(315, 30); 
        title.setForeground(new Color(0, 0, 0));
        c.add(title);
        
        //Text title in the add page
        title1 = new JLabel("ADD"); 
        title1.setFont(new Font("Arial", Font.PLAIN, 30));
        title1.setSize(300, 30); 
        title1.setLocation(420, 30); 
        title1.setForeground(new Color(0, 0, 0));
        c.add(title1);
        title1.setVisible(false);
        
        //Text title in the delete page
        title2 = new JLabel("DELETE"); 
        title2.setFont(new Font("Arial", Font.PLAIN, 30));
        title2.setSize(300, 30); 
        title2.setLocation(385, 30); 
        title2.setForeground(new Color(0, 0, 0));
        c.add(title2);
        title2.setVisible(false);

        //Label of text in the front page
        name = new JLabel("Choose Your Option"); 
        name.setFont(new Font("Arial", Font.PLAIN, 48)); 
        name.setSize(500, 100); 
        name.setLocation(230, 100); 
        c.add(name);
        
        //Label of text in the add page
        aadd = new JLabel("Please Enter Your Airlines"); 
        aadd.setFont(new Font("Arial", Font.PLAIN, 40)); 
        aadd.setSize(500, 100); 
        aadd.setLocation(230, 100); 
        c.add(aadd); 
        aadd.setVisible(false);
        
        //Label of text in the delete page
        adel = new JLabel("Enter An Index To Delete"); 
        adel.setFont(new Font("Arial", Font.PLAIN, 40)); 
        adel.setSize(500, 100); 
        adel.setLocation(240, 100); 
        c.add(adel);
        adel.setVisible(false);

        //text field in the add section
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 30)); 
        tname.setSize(300, 40); 
        tname.setLocation(310, 200); 
        c.add(tname); 
        tname.setVisible(false);

        //text field in the delete section
        tdel = new JTextField(); 
        tdel.setFont(new Font("Arial", Font.PLAIN, 30)); 
        tdel.setSize(300, 40); 
        tdel.setLocation(310, 200); 
        c.add(tdel); 
        tdel.setVisible(false);

        //the add button
        add = new JButton("Add"); 
        add.setFont(new Font("Arial", Font.BOLD, 30)); 
        add.setSize(100, 35); 
        add.setLocation(200, 300); 
        add.addActionListener(this); 
        c.add(add);
        
        //the delete button
        del = new JButton("Delete"); 
        del.setFont(new Font("Arial", Font.BOLD, 30)); 
        del.setSize(130, 35); 
        del.setLocation(580, 300); 
        del.addActionListener(this); 
        c.add(del);
        
        //the info button
        info = new JButton("Info"); 
        info.setFont(new Font("Arial", Font.BOLD, 30)); 
        info.setSize(100, 35); 
        info.setLocation(400, 400); 
        info.addActionListener(this); 
        c.add(info);

        //the submit button in the add section
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.BOLD, 30)); 
        sub.setSize(140, 35); 
        sub.setLocation(180, 300); 
        sub.addActionListener(this); 
        c.add(sub); 
        sub.setVisible(false);
        
        //the submit button in the delete section
        sub1 = new JButton("Submit"); 
        sub1.setFont(new Font("Arial", Font.BOLD, 30)); 
        sub1.setSize(140, 35); 
        sub1.setLocation(180, 300); 
        sub1.addActionListener(this); 
        c.add(sub1); 
        sub1.setVisible(false);
        
        //the back button
        back = new JButton("Back"); 
        back.setFont(new Font("Arial", Font.BOLD, 30)); 
        back.setSize(130, 35); 
        back.setLocation(600, 300); 
        back.addActionListener(this); 
        c.add(back); 
        back.setVisible(false);

        setVisible(true); 
    } 

   // method actionPerformed() 
   // to get the action performed 
   // by the user and act accordingly 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //info button to know the element in the array
        if(e.getSource() == info){
            
            JOptionPane.showMessageDialog(this , fever);
                System.out.println(fever);
        }
        
        //add button
        if (e.getSource() == add) {
            title.setVisible(false);
            title1.setVisible(true);
            aadd.setVisible(true);
            name.setVisible(false);
            tname.setVisible(true);
            sub.setVisible(true);
            info.setVisible(false);
            del.setVisible(false);
            add.setVisible(false);
            back.setVisible(true);
        }
        
        //submit button in the add section
        if (e.getSource() == sub) {
            fever.add(tname.getText());
            
            try 
            {
                weaver = new FileWriter("\\Users\\thebestp9\\Documents\\NetBeansProjects\\Assignement3\\src\\main\\java\\Information.txt" , true);
                out = new PrintWriter (weaver);
                out.write(tname.getText() + "\n");
                out.close();
            } 
            catch (Exception ea) 
            {
                JOptionPane.showMessageDialog(null, e + "");
            }
        }
        
        //the back button
        //same function as in the add and delete button
        if (e.getSource() == back) {
            title.setVisible(true);
            title1.setVisible(false);
            title2.setVisible(false);
            aadd.setVisible(false);
            adel.setVisible(false);
            name.setVisible(true);
            tname.setVisible(false);
            tdel.setVisible(false);
            sub1.setVisible(false);
            sub.setVisible(false);
            info.setVisible(true);
            del.setVisible(true);
            add.setVisible(true);
            back.setVisible(false);
        }
        
        //the delete button
        if (e.getSource() == del) {
            title.setVisible(false);
            title2.setVisible(true);
            adel.setVisible(true);
            name.setVisible(false);
            tdel.setVisible(true);
            sub1.setVisible(true);
            info.setVisible(false);
            del.setVisible(false);
            add.setVisible(false); 
            back.setVisible(true);
        }
        
        //the submit button on delete section
        if (e.getSource() == sub1) {
            int wee = Integer.parseInt(tdel.getText()) - 1 ;
            fever.remove(wee);
        }
    } 
} 

// Driver Code 
class Registration { 

   public static void main(String[] args) throws Exception , FileNotFoundException , IOException  { 
       MyFrame f = new MyFrame(); 
       Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");  
           f.setIconImage(icon);  
   } 
}





