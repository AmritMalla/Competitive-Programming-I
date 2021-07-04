import java.io.*;
import java.util.*;


/*
// O(n^3) Solution
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[][] costs = new int[n][k];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<k;j++){
                costs[i][j] = input.nextInt();
            }
        }
        
        int[] rowCost = new int[k];
        for(int j = 0;j<k;j++){
            rowCost[j] = costs[0][j];
        }
        
        for(int i = 1;i<n;i++){
            int[] newRowCost = new int[k];
            
            for(int j = 0;j<k;j++){
                newRowCost[j] = rowCostMin(rowCost, j) + costs[i][j];
            }
            rowCost = newRowCost;
        }
        
        System.out.println(rowCostMin(rowCost, -1 ));
    }
    
    
    public static int rowCostMin(int[] rowCost, int ex){
        int res  = Integer.MAX_VALUE;
        for(int i = 0;i<rowCost.length;i++){
            if(i == ex) continue;
            res = Math.min(rowCost[i], res );
        }
        return res;
    }
}
*/

//O(n^2) Solution
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[][] costs = new int[n][k];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<k;j++){
                costs[i][j] = input.nextInt();
            }
        }

        int[] rowCost = new int[k];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;

        for(int j = 0;j<k;j++){
            rowCost[j] = costs[0][j];

            if( rowCost[j] <= least){
                sleast = least;
                least = rowCost[j];
            }else if(rowCost[j] < sleast ){
                sleast = rowCost[j];
            }
        }
        for(int i = 1;i<n;i++){
            int[] newRowCost = new int[k];
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;

            for(int j = 0;j<k;j++){
                if(rowCost[j] == least){
                    newRowCost[j] = sleast + costs[i][j];
                }else{
                    newRowCost[j] = least + costs[i][j];
                }

                if( newRowCost[j] <= nleast){
                    nsleast = nleast;
                    nleast = newRowCost[j];
                }else if(newRowCost[j] < nsleast ){
                    nsleast = newRowCost[j];
                }

            }
            least = nleast;
            sleast = nsleast;
            rowCost = newRowCost;
        }

        System.out.println(least);
    }

}