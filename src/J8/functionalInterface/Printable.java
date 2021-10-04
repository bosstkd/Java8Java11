package J8.functionalInterface;

public interface Printable {
	 
    void print();
    default void printColor()
    {
        System.out.println("Printing Color copy");
    }
}