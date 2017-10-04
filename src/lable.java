import java.util.Scanner;

public class lable{
    public static void main (String[] args){
        System.out.println("This is a short simple program to see the list of best universities in Belarus ordered by mid entering score");
        System.out.println("Inter your region to see the list of best universities:");
        Scanner region = new Scanner (System.in);
        String city = region.nextLine();
        String list = "hey ho";
        if (city.equals("Minsk")){
            list = "Do you really want to study here?";
        }else if(city.equals("Brest")){
            list =  "Brest State Univkersity named after A.S. Pushkin" +"\n"+
                    "Brest State Technical University";
        }else if(city.equals("Gomel")){
            list =  "Gomel State Medical University" +"\n"+
                    "Gomel State Technical (P. V. Sukhoy) University ";
        }else if(city.equals("Grodno")){
            list =  "Grodno State Medical University" +"\n"+
                    "Grodno State (Yanka Kupala) University ";
        }else if(city.equals("Mogilev")){
            list =  "Mogilev State A. Kuleshov University" +"\n"+
                    "Mahilyow State Food University ";
        }else if(city.equals("Vitebsk")){
            list =  "Vitebsk State Technological University" +"\n"+
                    "Vitsebsk State Medical University";
        }else {
            System.out.println("Please, check spelling");
        }
        System.out.println(list);
    }
}
