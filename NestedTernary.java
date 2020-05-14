package conditionalStatements;

public class NestedTernary {

	public static void main(String[] args) {

				int x=10;
				int y=23;
				int z=-98;
				int res= (x>y) ? (x>z) ? (x) : (z) : (y>z) ? (y) : (z);
				System.out.println("Gratest of three is "+res);
	}

}

//Gratest of three is 23
