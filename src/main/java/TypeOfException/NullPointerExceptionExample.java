package TypeOfException;
public class NullPointerExceptionExample {
    private String symbol;
    private int price;
    public static String market;

    public NullPointerExceptionExample(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static void main(String[] args) {
      /*1.Java  NullPointerException while calling instance method on null object
        NullPointerExceptionExample a = null;
        a.getPrice(); */

        /*2.NullPointerException in Java while accessing field on a null reference.
        NullPointerExceptionExample b = null;
        int price = b.price; //here b is null, you can’t access field here
        */

        /*3.java.lang.NullPointerException when throwing null as an exception.
        If you throw an Exception object and if that is null you will get a null pointer exception as
        shown in the below example

        RuntimeException nullException = null;
        throw nullException;*/

       /* 4.example of NullPointerException is when getting the length of an array that is null.
        NullPointerExceptionExample [] c = null;
        int length = c.length;  //array is null here*/

        /*5.Example of NPE when accessing an element of a null array.
        NullPointerExceptionExample[] d = null;
        NullPointerExceptionExample motorola = d[0]; //array is null here*/

        /*6.You will also get NullPointerException in Java if you try to synchronize on a null object or try to
        use the null object inside the synchronized block in Java.
        NullPointerExceptionExample e = null;
        synchronized(e){
            System.out.print("This statement is synchronized on null");
        }*/

    }
}
