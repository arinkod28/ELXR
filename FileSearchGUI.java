import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearchGUI extends JFrame {

    private JTextField textField;
    private JTextField searchField;

    public FileSearchGUI() {
        super("ELXR");

        textField = new JTextField(30);
        textField.setEditable(false);

        searchField = new JTextField(20);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(e -> {
            String fileName = searchField.getText().trim();
            if (!fileName.isEmpty()) {
                List<File> foundFiles = new ArrayList<>();
                search(new File(System.getProperty("user.home")), fileName, foundFiles);
                StringBuilder sb = new StringBuilder();
                for (File file : foundFiles) {
                    sb.append(file.getAbsolutePath()).append("\n");
                }
                textField.setText(sb.toString());
                textField.setCaretPosition(0);
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a file name to search.");
            }
        });

        JPanel searchPanel = new JPanel();
        searchPanel.add(new JLabel("File Name: "));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        String title = "ELXR CUSTOM SEARCHER";
        Border border = BorderFactory.createTitledBorder(title);
        searchPanel.setBorder(border);

        JScrollPane scrollPane = new JScrollPane(textField);
        scrollPane.setPreferredSize(new Dimension(600, 200 ));

        setLayout(new FlowLayout());
        add(searchPanel);
        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main() {
        SwingUtilities.invokeLater(FileSearchGUI::new);
    }

    public static void search(File directory, String fileName, List<File> foundFiles) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    search(file, fileName, foundFiles);
                } else if (file.getName().equalsIgnoreCase(fileName)) {
                    foundFiles.add(file);
                }
            }
        }
    }
}
