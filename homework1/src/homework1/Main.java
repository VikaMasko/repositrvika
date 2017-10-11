
package homework1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int numArr[];
    public static int numArrsorted[];

    public static void main(String args[]){
        System.out.println("Введите значения, не больше десяти через пробел:");
        inputvalues();

    }

    public static void sortvalues(){
        Main.numArrsorted =  new int [Main.numArr.length];
        Main.numArrsorted =  Main.numArr;
        Sort sortArr = new Sort();
        sortArr.sort(Main.numArrsorted);
    }

    public static void inputvalues(){
        Scanner scan  = new Scanner(System.in);
        String values = scan.nextLine();
        String[] strArr = values.split(" ");
        Main.numArr = new int[strArr.length];
        for(int i=0; i< strArr.length; i++){
            Main.numArr[i]  = Integer.parseInt(strArr[i]);
        }
        if (Main.numArr.length > 10){
            System.out.println("Не больше 10 значений");
            inputvalues();
        }
        else{
            sortvalues();
            Menu.menu();}
    }
  }
