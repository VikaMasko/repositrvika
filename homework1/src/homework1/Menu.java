package homework1;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println(
                "1. Операции" + "\n" +
                        "2. Печать" + "\n" +
                        "3. Выход"
        );


        Scanner scan1 = new Scanner(System.in);
        String menuLine = scan1.nextLine();
        int menuItem = Integer.parseInt(menuLine);
        if (menuItem == 1) {
            System.out.println("Операции:");
            Operations.operations();
        } else if (menuItem == 2) {
            System.out.println("Печать:");
            Print.print();
        } else if (menuItem == 3){
            System.out.println("Выход");
        }else{
            System.out.println("Пожалуйста, введите 1, 2 или 3");
            menu();
        }
    }}
