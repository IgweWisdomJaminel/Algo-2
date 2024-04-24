import java.util.Scanner;

public class ALgo {

    public static void consecutiveZeros(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count =0;
        int max=0;
        while(n>0){
            if(n%2==1){
                count++;
                if(count>max){
                    max=count;
                }else {
                    count=1;
                }

            }
            n=n/2;
        }
        System.out.println(count);
    }

    public static void consecutiveOneCollectioMethod(){

    }
    public static void main(String[] args) {
        consecutiveZeros();


    }
}
