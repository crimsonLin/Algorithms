package algorithms.basic;

public class Practise1_1_5 {

	public static void main(String[] args) {
		if (args[0] != null && args[1] != null && args[2] != null ) {
			if (!args[0].equals(args[1])) {
				System.out.println("Not equal");
			} else if (!args[0].equals(args[2])) {
				System.out.println("Not equal");
			} else {
				System.out.println("Equal");
			}
			
		} else {
			System.out.println("arguments error");
		}

	}

}
