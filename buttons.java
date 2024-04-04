import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttons {


    public static JButton button(){

        JButton button = new JButton("Close");
        button.setBounds(0, 0, 80, 15);
        button.setFont(new Font("Sans_Serif", Font.BOLD, 10));

        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);



        return button;
    }


    public static JButton filereadertest(){

        JButton search = new JButton("JAR Vulnerability Reader");
        search.setBounds(260, 220, 200, 35);







        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                filereadertest.main();



            }
        });

        return search;
    }

    public static JButton jarFileSearcher(){


        JButton search = new JButton(".jar File Search");
        search.setBounds(100, 220, 150, 35);





        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "PRESS OK TO START JAR SEARCH", "ELXR", JOptionPane.INFORMATION_MESSAGE);


                JarFileSearch.main();



            }
        });
        return search;
    }
    public static JButton exeFileSearcher(){


        JButton search = new JButton(".exe File Search");
        search.setBounds(100, 260, 150, 35);





        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "PRESS OK TO START EXE SEARCH", "ELXR", JOptionPane.INFORMATION_MESSAGE);


                exeFileSearch.main();



            }
        });
        return search;


    }

    public static JButton customFileSearcher(){


        JButton search = new JButton("Custom File Search");
        search.setBounds(100, 300, 150, 35);





        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FileSearchGUI.main();


            }
        });
        return search;
    }

    public static JButton javaFileSearch(){


        JButton search = new JButton(".Java File Search");
        search.setBounds(260 , 300, 150, 35);





        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        return search;
    }

    public static JButton txtfilsearcher(){


        JButton search = new JButton(".txt File Search");
        search.setBounds(260, 260, 150, 35);





        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtFileSearch.main();


            }
        });
        return search;
    }
}


