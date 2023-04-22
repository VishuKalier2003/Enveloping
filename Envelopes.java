/* You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope... One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height... Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other)... Note: You cannot rotate an envelope...
 * Eg 1: envelopes = [[5,4],[6,4],[6,7],[2,3]]       Output = 3
 * Eg 2: envelopes = [[1,1],[1,1],[1,1]]             Output = 0
 */
import java.util.*;
public class Envelopes
{
    public int MaximumWrapping(int Envelop[][])
    {
        Arrays.sort(Envelop,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        // Sorting Arrays, b[0]-a[0] sorts in decreasing order, a[0]-b[0] sorts in increasing order, b[1]-a[1] means we first put i+1 value then i value in decreasing fashion...
        for(int i = 0; i < Envelop.length; i++)
            System.out.print("["+Envelop[i][0]+","+Envelop[i][1]+"]");
        System.out.println();
        int count = 0;
        for(int i = 0; i < Envelop.length-1; i++)
        {
            if((Envelop[i][0] < Envelop[i+1][0]) && (Envelop[i][1] < Envelop[i+1][1]))
                count++;    // If width and height of first envelop is lesser than the former...
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the number of Envelopes : ");
        x = sc.nextInt();
        int Envelop[][] = new int[x][2];
        for(int i = 0; i < Envelop.length; i++)
        {
            System.out.print("Enter height of "+(i+1)+" th Envelope : ");
            Envelop[i][0] = sc.nextInt();
            System.out.print("Enter width of "+(i+1)+" th Envelope : ");
            Envelop[i][1] = sc.nextInt();
        }
        Envelopes envelopes = new Envelopes();     // Object creation...
        System.out.println("The Envelopes : "+envelopes.MaximumWrapping(Envelop));
        sc.close();
    }
}

// Time Complexity  - O(n log n) time...
// Space Complexity - O(1) space...