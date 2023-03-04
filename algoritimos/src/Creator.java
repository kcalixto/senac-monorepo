import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Creator {
    // Yout directory after C:/User/
    // public final String YOUR_DIRECTORY_HERE = "\\3D
    // Objects\\Prog\\algoritimos-e-programacao\\src\\com\\segundo_semestre\\lista01\\";
    // ! CHANGE THIS
    public final String YOUR_DIRECTORY_HERE = "/go/src/algoritimos/src/com/segundo_semestre/lista04/";
    public final String FILE_NAME = "ex";
    public final String FILE_PACKAGE_NAME = "com.segundo_semestre.lista04";

    //

    public final String JAVA_INITIAL_STRUCT = "package " + FILE_PACKAGE_NAME + ";" +
            "\n\npublic class " + FILE_NAME + " {\n" +
            "   public static void main(String[] args) {\n" +
            "       //QUESTION" +
            "\n" +
            "   }\n" +
            "}";

    public final String DIR = System.getProperty("user.home") + YOUR_DIRECTORY_HERE;
    public final String NAME = FILE_NAME + ".java";

    public FileWriter writer;

    public void init() {
        try {
            // load questions ta 100% - 28/08/2022
            ArrayList<String> questions = loadQuestions();

            for (int i = 0; i < questions.size(); i++) {
                String newName = (NAME.replace(".java", (i + 1) + ".java"));
                writer = new FileWriter(DIR + newName);
                write(writer, questions.get(i), i + 1);
                writer.close();

                System.out.println("File Created: " + DIR + newName);
            }

        } catch (Exception e) {
            System.out.println("Err: " + e.getMessage());
        }
    }

    public void write(FileWriter writer, String question, int fileNumber) throws IOException {
        String newString = "//";
        char[] charArr = question.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            newString += charArr[i];
        }
        int max = 50;
        String sysout = "       System.out.println(" + "\"" + question + "\"" + ");";
        charArr = sysout.toCharArray();
        newString += "\n\n";
        for (int i = 0; i < charArr.length; i++) {
            newString += charArr[i];
        }
        newString += "\n\n\n";

        writer.write((JAVA_INITIAL_STRUCT.replace("//QUESTION", newString)).replace(FILE_NAME, FILE_NAME + fileNumber));
    }

    public ArrayList<String> loadQuestions() throws FileNotFoundException, IOException {
        ArrayList<String> questions = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("questions.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            everything = everything.replace(System.getProperty("line.separator"), " \n ");
            char[] charArr = everything.toCharArray();

            // starts with 2
            int nextQuestion = 2;

            MyString tempString = new MyString();
            for (int i = 0; i < charArr.length; i++) {
                char currentChar = charArr[i];

                if (currentChar == '\n') {
                    if (isLastChar(i, charArr.length)) {
                        questions.add(tempString.toString());
                        return questions;
                    }

                    if (clearOrSpace(charArr[i + 2] + "", charArr[i + 3] + "", nextQuestion +
                            "")) {
                        nextQuestion++;
                        questions.add(tempString.toString());

                        tempString.clear();
                    } else {
                        tempString.addSpace();
                    }
                } else {
                    tempString.addChar(currentChar);
                }
            }

            System.out.println("Loaded " + questions.size() + " questions!");
        }
        return questions;
    }

    public boolean isLastChar(int i, int length) {
        // may be 1 or 2, depends on how .txt files are beeing decoded, be aware
        if (i == length - 2) {
            return true;
        }
        return false;
    }

    public boolean clearOrSpace(String futureChar, String farAwayChar, String nextQuestion) {
        boolean add = true;
        boolean clear = false;

        if (futureChar.equalsIgnoreCase(nextQuestion)
                ||
                // futureChar = char[i+2];
                (futureChar + farAwayChar)
                        .equalsIgnoreCase(nextQuestion)) {
            return add;
        }
        return clear;
    }

    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.init();
    }
}
