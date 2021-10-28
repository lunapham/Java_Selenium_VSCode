package aspirepackage;

/**
 * Hello world!
 */
public final class App {

    //Convert String to String Array
    public static String[] convertStringToStringArr(String str) {

        String strArray[] = str.split("");
 
        System.out.println("String : " + str);
        System.out.println("String array : [ ");
 
        // Iterating over the string
        for (int i = 0; i < strArray.length; i++) {
            // Printing the elements of String array
            System.out.print(strArray[i] + ", ");
        }
 
        System.out.print("]");
        return null;
        
    }


    //Convert String array to Int array
    public static int[] convertStringArrToIntArr(String str) {

        String strArray[] = str.split("");

        int[] result = new int[strArray.length];

        try {

            for (int i = 0; i < strArray.length; i++) {
                result[i] = Integer.parseInt(strArray[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Failed to convert String [] to Int []" + e);
        }
        return result;
    }



    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
