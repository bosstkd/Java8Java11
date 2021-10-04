package testCodinGame;

	//Program of synchronized method by using annonymous class  
	class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(100);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	public class TestSynchronization3{  
		public static void main(String args[]){  
			
			Object str = new Object();
			Object str2= new Object();
			System.out.println(str.hashCode()+" : "+str2.hashCode());
			
			
		final Table obj = new Table();//only one object  
		Thread t1=new Thread(){  
					public void run(){  
						obj.printTable(5);  
					}  
		};  
		Thread t2=new Thread(){  
					public void run(){  
						obj.printTable(100);  
					}  
		};  
		  
		t1.start();  
		t2.start();  
		}  
	}

