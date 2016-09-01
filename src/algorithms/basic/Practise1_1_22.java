/**
 * 
 */
package algorithms.basic;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Practise1_1_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= new int[100];
		for (int i=0;i<100;i++) {
			a[i]=(int) Math.round(Math.random()*1000);
		}
		Arrays.sort(a);
		for (int i=0;i<100;i++) {
			System.out.print(a[i] +"   ");
		}
		System.out.println();
		System.out.println(rank(11,a));
	}
	
	public static int rank(int key, int[] a) {
		return rank(key,a,0,a.length-1,1);
	}
	public static int rank(int key, int[] a, int lo, int hi, int step) {
		StringBuffer space=new StringBuffer("");
		for (int i=1;i<step;i++) {
			space.append("  ");
		}
		System.out.print(space);
		if (hi<0 || lo >a.length) {
			System.out.println("BinarySearch "+key+ " between "+lo+" and "+hi);
		} else {
			System.out.println("BinarySearch "+key+ " between "+lo+" ["+a[lo]+"] and "+hi+" ["+a[hi]+"]");
		}
		
		System.out.print(space);
		System.out.println("This is "+step+" times search");
		if (lo>hi) return -1;
		int mid = lo +(hi-lo)/2;
		step++;
		if (key<a[mid]) return rank(key,a,lo,mid-1,step);
		else if (key>a[mid]) return rank(key,a,mid+1,hi,step);
		else return mid;
	}

}
