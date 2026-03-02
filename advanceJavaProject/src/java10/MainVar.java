package java10;

public class MainVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		var b = 20;
		var name = "hiiii";
		var val = 837.209;
//		var c;    Can't do like this.
//		c = 29;
		var c = 0.0;
		c = 73.88;
//		Runnable r = ()->{
//			a = 20;
//			System.out.println(a);
//		};
//		r.run();
		//var is only supported inside method, means local variable
		
		// var can't be initialized with null
		
		var str = new String("we can use var in place of class");
		
		int[] arr = {1,2,3,4,5};
		for(var z : arr) {
			System.out.println(z);
		}
	}

}
