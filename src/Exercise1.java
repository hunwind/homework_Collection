import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        List<Integer> numbers=new ArrayList<>();
        System.out.print("Type the number of digits you want to add to the list:");
        int listSize=scan.nextInt();
        for(int i=0;i<listSize;i++){
            System.out.println("please enter numbber:");
            numbers.add(scan.nextInt());
        }
        scan.close();
        int minNumber= Collections.min(numbers);
        int maxNumber=Collections.max(numbers);
        System.out.println("min:"+minNumber);
        System.out.println("max:"+maxNumber);





    }




}
