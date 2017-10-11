package homework1;
import java.util.Scanner;

public class Operations {
    public static void operations(){
        System.out.println(
                "1. Вычисления"+"\n"+
                "2. Поиск"+"\n"+
                "3. Назад"
        );
        Scanner scan1 = new Scanner(System.in);
        String operationsLine = scan1.nextLine();
        int operationsItem = Integer.parseInt(operationsLine);
        if (operationsItem == 1){
            System.out.println("Вычисления");
            Calculate.calculate();
        }
        else if(operationsItem == 2){
            System.out.println("Поиск");
            Search.search();
        }
        else if(operationsItem == 3){
            Menu.menu();
        }
        else{
            System.out.println("Пожалуйста, введите 1, 2 или 3");
            operations();
        }

}}
