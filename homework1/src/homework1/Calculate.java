package homework1;
import java.util.Scanner;

public class Calculate {
    public static void calculate(){
        System.out.println(
                "1. Найти максимум"+"\n"+
                "2. Найти минимум"+"\n"+
                "3. Найти количество"+"\n"+
                "4. Найти сумму значений"+"\n"+
                "5. Найти среднее арифметическое"+"\n"+
                "6. Назад"
        );
        Scanner scan1 = new Scanner(System.in);
        String operationsLine = scan1.nextLine();
        int operationsItem = Integer.parseInt(operationsLine);
        if (operationsItem == 1){
            String maxValue = String.valueOf(Main.numArrsorted[Main.numArrsorted.length-1]);
            System.out.println("Максимальное значение: " + maxValue);
            calculate();
        } else if(operationsItem == 2){
            String minValue = String.valueOf(Main.numArrsorted[0]);
            System.out.println("Минимальное значение: " + minValue);
            calculate();
        } else if(operationsItem == 3) {
            String arrLenght = String.valueOf(Main.numArrsorted.length);
            System.out.println("Количество элементов: " + arrLenght);
            calculate();
        } else if(operationsItem == 4) {
            int summ = 0;
            for(int i=0; i<Main.numArrsorted.length; i++){
                summ = summ + Main.numArrsorted[i];
            }
            String summStr = String.valueOf(summ);
            System.out.println("Сумма значений: "+ summStr);
            calculate();
        } else if(operationsItem == 5){
            int summ = 0;
            for(int i=0; i<Main.numArrsorted.length; i++){
                summ = summ + Main.numArrsorted[i];
            }
            String averStr = String.valueOf(summ/Main.numArrsorted.length);
            System.out.println("Среднее значение: " + averStr);
            calculate();
        } else if(operationsItem == 6){
            Operations.operations();
        }
        else{
            System.out.println("Пожалуйста, введите 1, 2, 3, 4, 5 или 6");
            calculate();
        }

    }
}
