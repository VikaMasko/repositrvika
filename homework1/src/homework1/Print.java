package homework1;
import java.util.Scanner;
import java.util.Arrays;

public class Print {
    public static void print(){
           System.out.println(
                   "1. Печать в прямом порядке"+"\n"+
                   "2. Печать в обратном порядке"+"\n"+
                   "3. Печать в отсортированном порядке"+"\n"+
                   "4. Назад"
                   );
        Scanner scan = new Scanner(System.in);
        String printLine = scan.nextLine();
        int printItem = Integer.parseInt(printLine);
           if (printItem == 1) {
               String numArrstr = Arrays.toString(Main.numArr);
               System.out.println("Прямой порядок:" + numArrstr);
               print();
           }else if (printItem == 2){
               int backArr[] = new int[Main.numArr.length];
               for(int i=0; i<Main.numArr.length; i++){
                   backArr[i]=Main.numArr[Main.numArr.length - i - 1];
               }
               String backArrstr = Arrays.toString(backArr);
               System.out.println("Обратный порядок " + backArrstr);
               print();
           }else if (printItem == 3){
               String numArrsortstring = Arrays.toString(Main.numArrsorted);
               System.out.println("Отсортированный порядок: " + numArrsortstring);
               print();
           }else if (printItem == 4){
               Menu.menu();
           }else {
               System.out.println("Пожалуйста, введите 1, 2, 3 или 4");
               print();
           }
}}
