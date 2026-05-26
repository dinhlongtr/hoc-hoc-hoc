import java.io.*;
import java.util.*;

public class happynumber{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("HAPPYNUMBER.INP"));
        PrintWriter wr = new PrintWriter(new File("HAPPYNUMBER.OUT"));

        int n = sc.nextInt();

        int happyc = 0;
        long currentN = 0;
        long tongbinhphuong = 0;
        for(int i = 0; i<=n; i++){
            if(!sc.hasNextLong()) return;
            long x = sc.nextLong();
            long temp =x;
            sc.close();
            wr.close();
            while (temp!=1 && temp!=4){
                tongbinhphuong = 0;
                currentN = temp;
                while (currentN>0)
                {
                    long kitu = currentN % 10;
                    tongbinhphuong = kitu * kitu;
                    currentN /=10;
                }
            temp = tongbinhphuong;
            }
            if(temp == 1){
                happyc ++;
            }
            wr.println(happyc);
        }
        
        
    }
}
