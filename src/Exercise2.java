import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> words=new ArrayList<>();
        System.out.print("Write how many words you want to include in numbers:");
        int wordListSize=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<wordListSize;i++){
            System.out.println("please write your word:");
            words.add(scan.nextLine());

        }
        Collections.sort(words);
        for(String s:words){
            System.out.println(s);
        }
      }



    }



