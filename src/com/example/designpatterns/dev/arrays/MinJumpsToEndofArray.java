package com.dev.arrays;

public class MinJumpsToEndofArray {

	public static void main(String[] args) {

		int[] A = { 2, 3, 1, 1, 4};

		int noOfJumps = jump(A);
		if (noOfJumps == -1) {
			System.out.println("Not Possible");
		} else {
			System.out.println("Minimum jumps required : " + noOfJumps);
		}
	}

	public static int jump(int[] a) {
		/* three variable as discussed in the editorial */
		int maxReachable = 0;
		int jumps = 0;
		int currReachable = 0;
		/* exploring every index in the given array */
		for (int currIdx = 0; currIdx < a.length; currIdx++) {

			/* updating max reachable index every time we visit a new index */
			maxReachable = Math.max(maxReachable, currIdx + a[currIdx]);

			/*
			 * as we have already considered the max jump length at this index and if max
			 * reachable index is still equal to or less than current index, then we can
			 * move forward from this index therefore answer is not possible in this case
			 */
			if (maxReachable <= currIdx) {
				return -1;
			}

			/*
			 * if current index is equal to the current reachable, increment jumps required
			 * and update current reachable
			 */
			if (currIdx == currReachable) {
				jumps++;
				currReachable = maxReachable;
			}
		}
		return jumps;
	}
}
