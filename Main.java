/*
CREATED BY ARIN KODOLIKAR MARCH 15TH 2024
CONTRIBUTORS:

BUTTONS -> buttons.
LAYOUTS -> mainguilayouts.java
PASSWORD AND USERNAME ITEMS -> passanduser.java
TESTING FILES

EST 2024 @ELXRTECHNOLOGIES INCORPORATED

 */



import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Main class
class Main {





    static void welcomeGUI(JButton button){

        JLabel WelcomeText = new JLabel("ELXR");
        WelcomeText.setBounds(655, 100, 600, 200);
        WelcomeText.setFont(new Font("Serif", Font.ITALIC, 150));
        JLabel WelcomeText2 = new JLabel("ELXR");
        WelcomeText2.setBounds(665, 110, 600, 200);
        JLabel WelcomeText4 = new JLabel("ELXR");
        WelcomeText4.setBounds(675, 120, 600, 200);

        WelcomeText2.setFont(new Font("Serif", Font.ITALIC, 150));
        WelcomeText4.setFont(new Font("Serif", Font.ITALIC, 150));

        WelcomeText2.setForeground(Color.RED);
        WelcomeText4.setForeground(Color.PINK);

        JFrame welcome = new JFrame("ELXR");
        Image icon = Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Arin.Kodolikar\\Desktop\\elxrfinal.png\"");
        welcome.setIconImage(icon);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcome.getContentPane().setBackground( Color.gray );



        JButton Authenticator = new JButton("OK");
        Authenticator.setBounds(905,400, 70, 50);

        JPasswordField user = new JPasswordField(7);
        user.setBounds(655,400,200,20);
        JLabel usernamelabel = new JLabel("USERNAME");
        usernamelabel.setBounds(655,360, 200, 60);
        usernamelabel.setFont(new Font("Serif", Font.BOLD, 10));

        JPasswordField pass = new JPasswordField(6);
        pass.setBounds(655,450,200,20);
        JLabel passwordlabel = new JLabel("PASSWORD");
        passwordlabel.setFont(new Font("Serif", Font.BOLD, 10));
        passwordlabel.setBounds(655,410, 200, 60);


        welcome.setSize(2400, 1600);

        welcome.setLayout(null);

        welcome.setVisible(true);

        welcome.add(button);

        welcome.add(WelcomeText);
        welcome.add(WelcomeText2);
        welcome.add(WelcomeText4);

        welcome.add(Authenticator);
        welcome.add(user);
        welcome.add(pass);
        welcome.add(usernamelabel);
        welcome.add(passwordlabel);




        Authenticator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                pass.selectAll();
                user.selectAll();

                char[] sourceusername = user.getPassword();
                char[] sourcepassword = pass.getPassword();

                if (passanduser.isUsernameCorrect(sourceusername) && passanduser.isPasswordCorrect(sourcepassword)) {
                    JOptionPane.showMessageDialog(null, "Authenticated, Welcome." , "ELXR", JOptionPane.INFORMATION_MESSAGE);
                    welcome.dispose();
                    mainGUI(buttons.button(), buttons.jarFileSearcher(), buttons.exeFileSearcher(), buttons.customFileSearcher(), buttons.txtfilsearcher(), buttons.filereadertest());

                } else{

                    JOptionPane.showMessageDialog(null, "Incorrect, try again." , "ELXR", JOptionPane.INFORMATION_MESSAGE);


                }

            }
        });







        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

    }




     static void mainGUI(JButton Button, JButton jarfilesearcher, JButton exefilesearcher, JButton customsearcher, JButton securitycheck, JButton reader){


         JLabel WelcomeText = new JLabel("ELXR");
         WelcomeText.setBounds(900, 60, 600, 200);
         WelcomeText.setFont(new Font("Serif", Font.ITALIC, 150));
         JLabel WelcomeText2 = new JLabel("ELXR");
         WelcomeText2.setBounds(910, 70, 600, 200);
         WelcomeText2.setFont(new Font("Serif", Font.ITALIC, 150));
         JLabel WelcomeText4 = new JLabel("ELXR");
         WelcomeText4.setBounds(920, 80, 600, 200);
         WelcomeText4.setFont(new Font("Serif", Font.ITALIC, 150));

         WelcomeText2.setForeground(Color.RED);
         WelcomeText4.setForeground(Color.PINK);

         JLabel header = new JLabel("What would you like to do?");
         header.setFont(new Font("Sans_Serif", Font.BOLD, 25));
         header.setBounds(100, 145,350, 75);

         JLabel misc = new JLabel("@ELXR INC, File Retriever");
         misc.setFont(new Font("Sans_Serif", Font.BOLD, 15));
         misc.setBounds(900, 240,300, 20);








         JFrame frame = new JFrame("ELXR");
         frame.getContentPane().setBackground( Color.gray );

         Image icon = Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Arin.Kodolikar\\Desktop\\elxrfinal.png\"");
         frame.setIconImage(icon);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         frame.setVisible(true);




         frame.add(header);
         frame.add(Button);
         frame.add(misc);
         frame.add(jarfilesearcher);
         frame.add(exefilesearcher);
         frame.add(customsearcher);
         frame.add(reader);
         frame.add(securitycheck);
         frame.add(WelcomeText);
         frame.add(WelcomeText2);
         frame.add(WelcomeText4);




         frame.setSize(2400, 1600);
         frame.setLayout(null);
         frame.setVisible(true);

         Button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e){
                System.exit(0);

             }
         });



     }






    public static void main(String[] args)
    {
        welcomeGUI(buttons.button());

    }
}