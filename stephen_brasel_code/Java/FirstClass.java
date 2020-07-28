public class FirstClass{
	public static void main(String[] args){
		System.out.println("Hello, future Java devs!");
	}

	public FirstClass(){
		super();
		
	}

	static{
		System.out.println("I run, but when?");
		// OUTER:
		// for(int i = 0; i < 4; i++){
		// 	for(int j = 0; j < 4; j++){
		// 		if(i == 1){
		// 			break OUTER;
		// 		}
		// 		System.out.println(":beer:!");
		// 	}
		// }
	}

	{
		System.out.println("Do I run?");
	}
}

// class AnotherClass{

// }