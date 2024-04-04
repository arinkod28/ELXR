import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class txtFileSearch {

    public static void main() {

        File directory = new File(System.getProperty("user.home"));

        JFrame output = new JFrame("ELXR txt SEARCH");
        JTextArea textField = new JTextArea();

        Image icon = Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Arin.Kodolikar\\Desktop\\elxrfinal.png\"");
        output.setIconImage(icon);
        textField.setBounds(0,150,1600,5000);
        output.setSize(1600,1000);
        output.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(4,4));
        panel.setBounds(0, 150, 6600, 5000);
        panel.add(new JScrollPane(textField));




        output.setLayout(new BorderLayout());
        JLabel info = new JLabel("JAR txt REQUEST");
        info.setBounds(0,0,400,20);
        info.setFont(new Font("Serif", Font.BOLD, 20));

        JScrollPane scrollPane = new JScrollPane(textField, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        JLabel WelcomeText = new JLabel("ELXR");
        WelcomeText.setBounds(670, 10, 600, 150);
        WelcomeText.setFont(new Font("Serif", Font.ITALIC, 80));
        JLabel WelcomeText2 = new JLabel("ELXR");
        WelcomeText2.setBounds(680, 20, 600, 150);
        JLabel WelcomeText4 = new JLabel("ELXR");
        WelcomeText4.setBounds(690, 30, 600, 150);

        WelcomeText2.setFont(new Font("Serif", Font.ITALIC, 80));
        WelcomeText4.setFont(new Font("Serif", Font.ITALIC, 80));

        WelcomeText2.setForeground(Color.RED);
        WelcomeText4.setForeground(Color.PINK);





        output.setVisible(true);
        textField.setEditable(false);
        output.add(textField);
        output.add(WelcomeText);
        output.add(WelcomeText2);
        output.add(WelcomeText4);
        output.add(info);
        output.add(panel.add(new JScrollPane(textField)));
        //output.add(new JScrollPane(textField));






        textField.setFont(new Font("Sans_Serif", Font.PLAIN, 12));


        List<File> txtFiles = new ArrayList<>();

        search(directory, txtFiles);
        StringBuilder sb = new StringBuilder();



        for (File txtFile : txtFiles) {
            sb.append(txtFile.getAbsolutePath()).append("\n");

        }
        textField.setText(sb.toString());



        JOptionPane.showMessageDialog(null, "Found " + txtFiles.size() + " .txt files:", "ELXR", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void search(File directory, List<File> txtFiles) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    search(file, txtFiles);
                } else if (file.getName().toLowerCase().endsWith(".txt")) {
                    txtFiles.add(file);
                }
            }
        }
    }
}
