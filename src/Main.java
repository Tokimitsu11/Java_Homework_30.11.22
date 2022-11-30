import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
         printInt();
        System.out.println(sum());
        sub(a, b);


        }
    //        1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    static void printInt(){
        System.out.println("Enter your data : ");
        String a = scanner.nextLine();
        System.out.println("You've entered : " + a);
    }

//        2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму


    public static int sum(){
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();
        return a+b+c;
    }

    //        3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
//        их разность и вывести на консоль их метода main
    public static int sub(int a, int b){
        System.out.println(a-b);
        return a-b;
    }


}