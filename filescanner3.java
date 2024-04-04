import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JTextArea;

public class filescanner3 {

    public static void scanFilesForSuspiciousCode(List<File> filenames, JTextArea textArea) {
        for (File filename : filenames) {
            int vulnerabilityCount = 0;
            File file = new File(filename.toURI());
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (isSuspicious(line)) {
                        vulnerabilityCount++;
                        textArea.append("File: " + file.getAbsolutePath() + "\n");
                        textArea.append("Suspicious code found: " + line + "\n\n");
                    }
                }


                textArea.append("There are " + vulnerabilityCount+ " vulnerabilities found in " + file.getName() + "\n");
            } catch (FileNotFoundException e) {
                textArea.append("File not found: " + filename + "\n");
            }
        }
    }

    private static boolean isSuspicious(String line) {
        //placeholder
        return line.contains("eval(") || line.contains("System.exit(") || line.contains("if(accessLevel != user)") || line.contains("administrator");
    }



    public static void main(List<File> filenames, JTextArea textArea) {

        scanFilesForSuspiciousCode(filenames, textArea);
    }
}
