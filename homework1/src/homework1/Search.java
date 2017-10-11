package homework1;
import java.util.Scanner;
import java.util.Arrays;

public class Search {
    public static void search(){
    System.out.println(
            "1. Проверить, входит ли число в массив"+"\n"+
            "2. Заменить один элемнет на другой"+"\n"+
            "3. Назад"
    );
    Scanner scan1 = new Scanner(System.in);
    String operationsLine = scan1.nextLine();
    int operationsItem = Integer.parseInt(operationsLine);
    if (operationsItem == 1){
        System.out.println("Введите значение элемента: ");
        Scanner scan = new Scanner(System.in);
        String elFind = scan.nextLine();
        int valFind = Integer.parseInt(elFind);
        Binary.binarysearch(valFind);
        search();
    } else if(operationsItem == 2) {
        String minValue = String.valueOf(Main.numArrsorted[0]);
        System.out.println("Введите номер элемента: ");
        Scanner scan = new Scanner(System.in);
        String elChange = scan.nextLine();
        int noEl = Integer.parseInt(elChange)-1;
        System.out.println("Введите новое значение: ");
        Scanner scan2 = new Scanner(System.in);
        String newValue = scan2.nextLine();
        int newVal = Integer.parseInt(newValue);
        Main.numArr[noEl]=newVal;
        String numArrsortstring = Arrays.toString(Main.numArr);
        System.out.println("Новый массив: "+ numArrsortstring);
        search();
    } else if(operationsItem == 3){
        Operations.operations();
    } else{
        System.out.println("Пожалуйста, введите 1, 2 или 3");
        search();
    }
    }
}
