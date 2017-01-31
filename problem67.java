import java.util.Scanner;
import java.lang.*;

public class solution 
{
  public static final int N = 100;
  public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[N][];
        for(int i = 0; i < N; i++) {
                                      A[i] = new int[i+1];
                                      for(int j = 0 ; j <= i; j++) A[i][j] = sc.nextInt();
                                   }
        long[][] sum = new long[N][];
        for(int i = 0; i < N; i++){
                                     sum[i] = new long [i+1];
                                     for(int j = 0; j <= i; j++) {
                                                                   if(i != 0) 
                                                                         {
                                                                          if( i != j && j != 0 )
                                                                             sum[i][j] = Math.max(sum[i-1][j-1],sum[i-1][j])+A[i][j];
                                                                          if( i != j && j == 0 )
                                                                             sum[i][j] = sum[i-1][j]+A[i][j];
                                                                          if( i == j && j != 0 )
                                                                             sum[i][j] = sum[i-1][j-1]+A[i][j];
                                                                         }
                                                                   else 
                                                                       sum[i][j] = A[i][j];
                                                                  }
                                    }
        long max = 0;
        for(int j = 0,i = N-1; j <= i; j++) {
                                            if(max < sum[i][j]) 
                                                max = sum[i][j];
                                           }
        System.out.println("Answer : " + max);
      }
}
