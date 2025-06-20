import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String res;
        try {
            res = calc(input);
            System.out.println(res);
        } catch (IOException e) {
            System.out.println("Wrong text");
        }
    }
    public static String calc (String input) throws IOException {
        int a;
        int b;
        String[] parts;
        parts = input.split(" ");       
        if (parts.length == 3){
            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[2]);
                if (a < 1 || a > 10){
                    throw new IOException();
                }
                if (b <1 || b > 10)
                    throw new IOException();
            } catch (NumberFormatException e) {
                throw new IOException();
            }
        }else{
            throw new IOException();
        }
        switch (parts[1]){
            case "+":
                return String.valueOf(a+ b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                    return String.valueOf(a / b);
            default:
                throw new IOException();
        }
    }
}
