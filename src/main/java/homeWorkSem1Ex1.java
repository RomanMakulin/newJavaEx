import java.io.*;
public class homeWorkSem1Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число : ");
        int num = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println("Треугольное число = " + Triangle(num) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
