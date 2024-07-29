package $$$PracticeJava;

public class test3 extends Thread {

		public void run() {
			for (int i=1;i<=5;i++) {
				
				System.out.println(Thread.currentThread().getName() + " ==> "  + i);
				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					System.out.println(e);
//					
//				}
			}
		}
		public static void main(String[]args) {
			
			test3 mul1 =new test3();
			
			mul1.setName("ashok");
			
			test3 mul2 = new test3();
			mul2.setName("karthik");
			
			mul1.start();
			mul2.start();
		
		}
		}

