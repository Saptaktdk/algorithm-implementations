//You are playing a solitaire game with three piles of stones of sizes a​​​​​​, b,​​​​​​ and c​​​​​​ respectively. Each turn you choose two different non-empty piles, take one stone from each, and add 1 point to your score. The game stops when there are fewer than two non-empty piles (meaning there are no more available moves).
//Given three integers a​​​​​, b,​​​​​ and c​​​​​, return the maximum score you can get.
//Constraints:
//1 <= a, b, c <= 10^5

//Input: a = 2, b = 4, c = 6
//Output: 6

public class MaximumScoreFromRemovingStones {
    public static int maximumScore(int a, int b , int c) {
        int smallest  = Math.min(a,Math.min(b,c));
        int largest = Math.max(a,Math.max(b,c));
        int mid = a + b + c - smallest - largest;


        if (largest > smallest + mid) {
            return smallest + mid;
        }
       
        return (a + b + c) / 2;
        
    }

    public static void main (String args[]) {
        int a = 1;
        int b = 2;
        int c = 6;

        int res = maximumScore(a,b,c);
        System.out.println("Maximum score is: " + res);
    }
    
}