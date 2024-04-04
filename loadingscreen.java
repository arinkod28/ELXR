import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class loadingscreen extends JFrame {
    public loadingscreen() {
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


        JFrame searching = new JFrame("LOADING");
        searching.setLayout(null);
        searching.getContentPane().setBackground(Color.gray);
        searching.setSize(2400, 1600);
        searching.add(WelcomeText);
        searching.add(WelcomeText2);
        searching.add(WelcomeText4);

        JLabel loading = new JLabel("Loading");
        loading.setBounds(800, 400, 300, 300);

        searching.add(loading);


        searching.setVisible(true);

        // Simulate loading process

        filereadertest.main();


        // After loading is complete, close the loading screen and proceed
        dispose();

    }



    public static void main() {
        // Create and display the loading screen
        SwingUtilities.invokeLater(loadingscreen::new);
    }
}
