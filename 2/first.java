
import java.util.Scanner;

public class first {
    
    public static void main(String[] args) {
        float a = inputDouble();
        System.out.println(a);
        
        
        
        
        
}

    public static float inputDouble (){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        String input = in.nextLine();
        try {
            float num = Float.parseFloat(input);
            return num;
        }
        
        catch (NumberFormatException e) {
            System.out.println("Некорректно введено число. Попробуйте снова. ");
            float num = inputDouble();
            return num;
        }
    }
}

