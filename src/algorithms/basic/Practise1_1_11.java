/**
 * 
 */
package algorithms.basic;

/**
 * @author Administrator
 * 打印一个二维布尔数组的内容，其中，使用*表示真，空格表示假，打印行号和列号
 */
public class Practise1_1_11 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean [][] array={{true,true,false,false,false},
							{false,false,false},
							{false,false,true,false,true,true},
							{true,true},{false},{true}
				};
		int col=0;
		for (int i=0;i<array.length;i++){
			if (array[i].length>col) 
				col=array[i].length;
		}
		
		System.out.print("---");
		for (int j=1;j<=col;j++){
			System.out.printf("%-3d",j);
		}
		System.out.println();
		
		for (int i=0; i<array.length; i++) {
			System.out.printf("%-3d",i+1);
			for (int k=0;k<array[i].length;k++){
				if (array[i][k]) {
					System.out.print("* |");
				} else {
					System.out.print("  |");
				}
			}
			
			for (int l=col-array[i].length; l>0;l--) {
				System.out.print("--|");
			}
			
			System.out.println();
				
		}
		
		System.out.println("Row="+array.length+" Col="+col);
		
			
			
	}

}
