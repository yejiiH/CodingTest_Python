import java.util.Scanner;

public class Main {
    public static void main(String[] args)  { //psvm 입력하면 자동완성됨

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] paper = new boolean[100][100];
        int count = 0;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!paper[j][k]){
                        count++;
                        paper[j][k]=true;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
