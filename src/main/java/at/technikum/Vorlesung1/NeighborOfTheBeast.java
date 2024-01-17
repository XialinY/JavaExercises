package at.technikum.Vorlesung1;

public class NeighborOfTheBeast {

    public static void main(String[] args) {

        int i = 667;
        System.out.printf("the neighbor of the beast: %d!\n", 667);
        //String s = String.format("%02X",i);
        //System.out.printf("the neighbor of the beast: %s\n" , s );
        System.out.printf("the neighbor of the beast: %S!\n" , Integer.toHexString(i));
        System.out.printf("the neighbor of the beast: %X!\n" , i); //int to Hexadecimal %X
        System.out.printf("the neighbor of the beast: %10d!\n" , i);
        System.out.printf("the neighbor of the beast: %-10d!\n" , i);
        System.out.printf("the neighbor of the beast: %08d!\n" , i);
        System.out.printf("the neighbor of the beast: %+-12d!\n" , i);

    }



}
