/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 打印M行N列二维数组的转置
 */
public class Practise1_1_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m=7;
		int n=8;
		int [][] array = new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				array[i][j]=j+i+1;
			}
		}

		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				System.out.printf("%-3d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.printf("%-3d", array[j][i]);
			}
			System.out.println();
		}
	}

}
