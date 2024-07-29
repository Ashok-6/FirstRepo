package $$$PracticeJava;

public class Mul extends Thread {
		
		public void run() {
			System.out.println("ashok");
		}
		
		public static void main(String[]args)  {
			
			Mul m1=new Mul();
			
			
			m1.start();
			
		}

		
	}


