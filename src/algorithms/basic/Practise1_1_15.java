/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 编写一个静态方法histogram（），接受一个整型数组a[]和一个整数M为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
 * 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等
 */
public class Practise1_1_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arrayInput = {1,1,2,5,7,9,2,1,5,7,8,4,6,2,8,7,8};
		int n =10;
		int [] outputArray=histogram(arrayInput,n);
		System.out.println(arrayInput.length);
		int sum=0;
		for (int i=0;i<outputArray.length;i++) {
			sum+=outputArray[i];
		}
		System.out.println(sum);
	}
	
	public static int[] histogram(int [] a, int M) {
		int[] array = new int[M];
		int length = a.length;
		for (int i=0;i<length;i++) {
			if (a[i]<M) {
				array[a[i]]++;
			}

		}
		return array;
	}

}
