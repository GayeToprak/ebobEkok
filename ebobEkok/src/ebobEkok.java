import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int number1, number2, ebob = 1;

        System.out.print("birinci sayıyı giriniz:");
        number1 = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        number2 = inp.nextInt();

        System.out.println("ebob:");
        for(int i = 1; i<= number1; i++){
            if(number1 % i == 0 && number2 % i == 0){
                System.out.println(i);
                ebob = i;
            }
        }

        for(int i = 1 ; i<= (number1 * number2); i++){
            if(number1 % i == 0 && number2 % i == 0){
                System.out.println("ekok:");
                break;
            }
        }
        System.out.println((number1 * number2)/ebob);
    }
}
