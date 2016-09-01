/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 编写一个递归的静态方法计算ln(N!)的值
 */
public class Practise1_1_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
		System.out.println(cal(n));

	}
	
	public static double cal(int N) {
		if (N==1) return 0;
		return cal(N-1) + Math.log(N);
	}

}
