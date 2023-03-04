public class MyString {
    private String str = "";
    private boolean debugMode = false;

    public MyString() {
    }

    public MyString(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public void addChar(char ch) {
        this.str += ch;
        if (debugMode) {
            System.out.println("the char: " + ch);
            System.out.println("add: " + str);
        }
    }
 
    public void addString(String str) {
        this.str += str;
        if (debugMode) {
            System.out.println("the str: " + str);
            System.out.println("add: " + str);
        }
    }

    public void clear() {
        this.str = "";
        if (debugMode) {
            System.out.println("-clear-");
        }
    }

    public void addSpace() {
        this.str += " ";
        if (debugMode) {
            System.out.println("-added space-");
        }
    }

    public void clearBreakLine() {
        this.str.replaceAll("\n", " ");
        if (debugMode) {
            System.out.println("-replace all br-");
        }
    }

    public String toString() {
        return this.str;
    }

}
