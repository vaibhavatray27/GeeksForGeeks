import java.util.ArrayList;

/**
 * The n-queens puzzle is the problem of placing n queens on a (n×n) chessboard
 * such that no two queens can attack each other. Given an integer n, find all
 * distinct solutions to the n-queens puzzle. Each solution contains distinct
 * board configurations of the n-queens’ placement, where the solutions are a
 * permutation of [1,2,3..n] in increasing order, here the number in the ith
 * place denotes that the ith-column queen is placed in the row with that
 * number. For eg below figure represents a chessboard [3 1 4 2].
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: 1 Output: [1] Explaination: Only one queen can be placed in the single
 * cell available.
 * 
 * Example 2:
 * 
 * Input: 4 Output: [2 4 1 3 ] [3 1 4 2 ] Explaination: These are the 2 possible
 * solutions.
 * 
 * 
 * 
 * Your Task: You do not need to read input or print anything. Your task is to
 * complete the function nQueen() which takes n as input parameter and returns a
 * list containing all the possible chessboard configurations. Return an empty
 * list if no solution exists.
 * 
 * 
 * 
 * Expected Time Complexity: O(n!) Expected Auxiliary Space: O(n2)
 * 
 * 
 * @author 05946N744
 *
 */
public class June1Problem {
	

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        int[][] m=new int[n][n];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> rsf = new ArrayList<Integer>();
        nQueen(m,0,rsf,result);
        return result;
    }
    
    public static void nQueen(int[][] m,int row,ArrayList<Integer> rsf,ArrayList<ArrayList<Integer>> result){

        if(row==m.length){
            result.add(new ArrayList<>(rsf));
            return;
        }
        
        for(int col=0;col<m.length;col++){
            if(isSafeToPlaceQueen(m,row,col)){
                m[row][col]=1;
                rsf.add(col+1);
                nQueen(m,row+1,rsf,result);
                rsf.remove(new Integer(col+1));
                m[row][col]=0;
            }
        }
    }
    
    public static Boolean isSafeToPlaceQueen(int[][] m,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(m[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(m[i][j]==1){
                return false;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0&&j<m.length;i--,j++){
            if(m[i][j]==1){
                return false;
            }
        }
        return true;
    }   

}
