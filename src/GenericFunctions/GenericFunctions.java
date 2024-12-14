package GenericFunctions;

// Java program to show working of user defined
// Generic functions

class Test {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("CPRO2221");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}