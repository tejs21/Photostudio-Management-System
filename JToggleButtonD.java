            // Prg to demonstrate JToggleButton

import java.awt.*;            
import java.awt.event.*;            
import javax.swing.*;            

class JToggleButtonD extends JFrame
{
    JButton b1, b2, b3, b4, b5;
    ImageIcon Bimg1, Bimg2, Bimg3, Bimg4, Bimg5, title;
    GridBagLayout gbag;
    GridBagConstraints gbagc;

    JToggleButtonD(String s)
    {
        super(s);
        setVisible(true);
        setSize(1000, 800);
        
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\Admin\\Pictures\\BG Project\\Background.jpg")));
        Container c = getContentPane();
        c.setLayout(new BorderLayout(20, 20));
        c.setBackground(new Color(22, 14, 18));

        Bimg1 = new ImageIcon((new ImageIcon("B1.jpg").getImage()).getScaledInstance(320, 300, java.awt.Image.SCALE_SMOOTH));
        Bimg2 = new ImageIcon((new ImageIcon("wp1922955.jpg").getImage()).getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
        Bimg3 = new ImageIcon((new ImageIcon("wp1922965.jpg").getImage()).getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
        Bimg4 = new ImageIcon((new ImageIcon("wp1922966-the-expendables-wallpapers.jpg").getImage()).getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
        Bimg5 = new ImageIcon((new ImageIcon("wp1922966-the-expendables-wallpapers.jpg").getImage()).getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
        
        b1 = new JButton(Bimg1);
        b2 = new JButton(Bimg2);
        b3 = new JButton(Bimg3);
        b4 = new JButton(Bimg4);
        b5 = new JButton(Bimg5);
        

        gbag = new GridBagLayout();
        gbagc = new GridBagConstraints();
        
        Container cnew = new Container();
        //Panel cnew = new Panel();
        cnew.setLayout(gbag);

        gbagc.anchor = GridBagConstraints.NORTHWEST;
        gbagc.weightx = 1;
        gbagc.weighty = 1;
        gbagc.insets = new Insets(50, 100, 50, 100);
        gbagc.gridx = 0;
        gbagc.gridy = 0;
        
        gbag.setConstraints(b1, gbagc);
        gbagc.gridx = 1;
        gbag.setConstraints(b2, gbagc);
        gbagc.gridx = 2;
        gbag.setConstraints(b3, gbagc);


        gbagc.gridx = 0;
        gbagc.gridy = 1;

        gbag.setConstraints(b4, gbagc);

        gbagc.gridx = 1;
        gbag.setConstraints(b5, gbagc);
        
        

        cnew.add(b1);
        cnew.add(b2);
        cnew.add(b3);
        cnew.add(b4);
        cnew.add(b5);

        Bimg1 = new ImageIcon((new ImageIcon("Title.jpg").getImage()).getScaledInstance(1600, 100, java.awt.Image.SCALE_SMOOTH));

        c.add(cnew, BorderLayout.CENTER);
        c.add(new JLabel(""), BorderLayout.WEST);
        c.add(new JLabel(""), BorderLayout.EAST);
        c.add(new JLabel(Bimg1), BorderLayout.NORTH);
        c.add(new JLabel(""), BorderLayout.SOUTH);
        
    }

    public static void main(String args[])
    {
        JToggleButtonD obj = new JToggleButtonD("Java Toggle Button Demo");
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}