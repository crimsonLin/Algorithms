/**
 * 
 */
package algorithms.basic;

import java.text.SimpleDateFormat;

/**
 * @author Administrator
 * 
 */
public class Practise1_1_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		long start = System.currentTimeMillis(); 
		System.out.println("Fibonacci Calculation: starting at " + sdf.format(start));
		for (int N =0;N<100;N++) {
			System.out.print(N + " " + F1(N));
			long end = System.currentTimeMillis();  
			System.out.println("        finished at " + sdf.format(end) + ", elapsed: "  
			      + (end -start)/1000);
		}

	}
	
	public static long F(int N) {
		if (N==0) return 0;
		if (N==1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static long F1(int N) {
		if (N==0) return 0;
		if (N==1) return 1;
		long last =1;
		long fi =1;		
		long swap =0;
		for (int i=2;i<N;i++) {
			swap = fi;
			fi+=last;
			last = swap;
		}
		return fi;
	}

}
