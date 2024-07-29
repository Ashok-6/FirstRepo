package $$$PracticeJava;

public class Multi implements Runnable {
		public void run() {
			System.out.println("thread is running..");
		}
		public static void main(String[]args) {
			
			Multi m1=new Multi(); ///object creation
			
			m1.run();
		}


	}

