/**
 * 
 */
package easy.dynamicprogramming;

/**
 * @author ArunMannuru
 *
 */
/*
 * Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * Example 1:
 * 
 * Input: 2
 * Output:  2
 * Explanation:  There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2
 * Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 * 
 * 
 */
public class ClimbStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 4;
		System.out.println(climbStair(steps));
	}
	public static int climbStair(int steps){
		if(steps == 0)
			return 0;
		if(steps == 1)
			return 1;
		return climbStair(steps-1)+climbStair(steps-2);
	}
}
