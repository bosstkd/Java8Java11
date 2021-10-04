package J8.functionalInterface;

public class FunctionalIntefaceMain {
	 
    public static void main(String[] args)
    {
        FunctionalIntefaceMain pMain=new FunctionalIntefaceMain();
        pMain.printForm(() -> System.out.println("Printing form"));
        Printable t = new test();
        t.printColor();
    }
 
    public void printForm(Printable p)
    {
        p.print();
    }
}