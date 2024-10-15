import java.util.*;
public class pattern {
    private static int pattern(int num)
    {
        for(int row=1;row<=num;row++)
        { int totalcol=row>num?2*num-row:row;
            int totalspace=num-totalcol;
            for(int s=0;s<totalspace;s++)
            {
                System.out.print(" ");
            }
            for( int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
         System.out.println();
        }
        return 0;
    }
        private static int pattern2(int num)
        {
            int ognum=num;
            num =2*num;
            for(int row=1;row<num;row++)
            {
                for(int col=1;col<num;col++)
                {
                int totalcol=ognum-Math.min(Math.min(row, col),Math.min(num-row,num-col));
                System.out.print(totalcol+" ");
                }
                System.out.println();
            }
            return 0;



        }
    
    public static void main(String[] args) {
        int num=8;
        pattern2(num);
    }
    
}
