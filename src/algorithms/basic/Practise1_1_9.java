/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 将一个正整数N用二进制表示并转换成一个String类型的值s
 */
public class Practise1_1_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("");
		int n=500;
		System.out.println(Integer.toBinaryString(n));	
		while (n>0) {
			s.append(n % 2);
			n=n/2;
		}
		System.out.println(s.reverse());
			

	}

}
