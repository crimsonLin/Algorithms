/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 编写一个静态方法lg（），接受一个整型参数N，返回不大于Log2N的最大整数，不要适用Math库
 */
public class Practise1_1_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N=4096;
		int i=1;
		int j=0;
		while (i<N) {
			System.out.println("j="+j+" i="+i);
			j++;
			i*=2;
		}
		if (i==N) {
			System.out.println(j);
		} else {
			System.out.println(j-1);
		}
		
		System.out.println(Math.log10(N)/Math.log10(2));
	}

}
