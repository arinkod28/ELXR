import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class filereadertest {

    public static void main() {






        JFrame output = new JFrame("JAR FILE AUTHENTICATOR");
        JTextArea textField = new JTextArea();

        Image icon = Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Arin.Kodolikar\\Desktop\\elxrfinal.png\"");
        output.setIconImage(icon);
        textField.setBounds(0, 150, 1600, 5000);
        output.setSize(1600, 1000);
        output.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(4, 4));
        panel.setBounds(0, 150, 6600, 5000);
        panel.add(new JScrollPane(textField));


        output.setLayout(new BorderLayout());
        JLabel info = new JLabel("JAR FILE AUTHENTICATOR");
        info.setBounds(0, 0, 400, 20);
        info.setFont(new Font("Serif", Font.BOLD, 20));

        JScrollPane scrollPane = new JScrollPane(textField, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        //output.add(new JScrollPane(textField));


        textField.setFont(new Font("Sans_Serif", Font.PLAIN, 12));


        File directory = new File(System.getProperty("user.home"));


        List<File> jarFiles = new ArrayList<>();


        search(directory, jarFiles);
        filescanner3.main(jarFiles, textField);

        textField.setEditable(false);
        output.add(textField);
        output.add(panel.add(new JScrollPane(textField)));

        output.setVisible(true);

    }

    public static void search(File directory, List<File> jarFiles) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    search(file, jarFiles);
                } else if (file.getName().toLowerCase().endsWith(".jar")) {
                    jarFiles.add(file);
                }
            }
        }
    }


}














