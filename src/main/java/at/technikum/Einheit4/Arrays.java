package at.technikum.Einheit4;

public class Arrays {

    public static void main(String[] args) {

        //how to initialize an empty array with a fixed number of values
        int[] m = new int[5];

        //assigning a value to the x-th slot of the array
        m[0] = 5;

        System.out.println("All array values");
        for (int i = 0; i< m.length; i++) {
            System.out.println(m[i]);
        }

        int[] array2 = new int[8];
        //if you want to insert an x-th number into the array that only has y spaces
        //then u have to create a new array and copy the old array values over...
        for (int i = 0; i < array2.length; i++) {

            //without if - the loop will stop at the index i of the smaller array
            //and it will return an error -> program will terminate
            if (i < m.length) {
                array2[i] = m[i];
            }
        }
    }
}
