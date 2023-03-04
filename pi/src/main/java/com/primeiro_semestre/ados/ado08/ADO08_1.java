package pi.ado08;

public class ADO08_1 {
    public static void main(String[] args) {

        double top = 0.0, bottom = 0.0, left = 0.0, right = 0.0, front = 0.0, back = 0.0, onePoint = 0.0, total = 0.0;
        int die,
                counter = 0,
                oneMillion = 1000000;

        do {
            die = (int) (Math.random() * 6);
            onePoint = 1;
            switch (die) {
                case 0:
                    back += onePoint;
                    break;
                case 1:
                    top += onePoint;
                    break;
                case 2:
                    bottom += onePoint;
                    break;
                case 3:
                    left += onePoint;
                    break;
                case 4:
                    right += onePoint;
                    break;
                case 5:
                    front += onePoint;
                    break;
            }
            counter++;
        } while (counter < oneMillion);

        total = front + back + left + right + top + bottom;

        System.out.println(
                "Front: " + getPercentage(front, oneMillion) + " %" +
                        "\nBack: " + getPercentage(back, oneMillion) + " %" +
                        "\nLeft: " + getPercentage(left, oneMillion) + " %" +
                        "\nRight: " + getPercentage(right, oneMillion) + " %" +
                        "\nTop: " + getPercentage(top, oneMillion) + " %" +
                        "\nBottom: " + getPercentage(bottom, oneMillion) + " %" +
                        "\n\nTotal: " + (getPercentage(total, oneMillion)) + " %");

    }

    public static double getPercentage(double value, double total) {
        return ((value * 100) / total);
    }
}
