import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String message = in.nextLine();
        if (message == "") {
            throw new RuntimeException("Пустое сообщение вводить нельзя");
        }
        System.out.println("Вы ввели: " + message);
        in.close();
    }
}
