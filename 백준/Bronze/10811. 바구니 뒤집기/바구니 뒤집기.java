import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] basketNo=new int[sc.nextInt()];
        int number=sc.nextInt();

       for(int i=0;i<basketNo.length;i++){
           basketNo[i]=i+1;
       }
       for(int j=0;j<number;j++){
           int a = sc.nextInt()-1;
           int b = sc.nextInt()-1;
           int temp=0;
           while(a<b){
               temp = basketNo[a];
               basketNo[a]=basketNo[b];
               basketNo[b]=temp;
               a++;
               b--;
           }
       }
        for(int i=0;i<basketNo.length;i++){
            System.out.println(basketNo[i]);
        }




    }

}
