package tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        // INTEIROS = não permitem NULL
        //byte nullByte = null;

        byte b;         // 8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129; // too large

        char c; // 16 bits
        char c1 = 'A';
        char c2 = 15;

        //char c3 = 'AA';  //Not Ok
        //char c4 = '-100'; //Not OK
        short s; // 16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647; //  32 bit
        int i2 = -2147483648;
        //int i3= -2147483649; //too large

        long l = 9223372036854775807L;
        long l2 = -9223372036854775808L;
        //long l3 = 9223372036854775808L; // too large

        //Flutuantes

        float f = 65f; // 32 bits 3.402,823,5 E+38
        float f2 = 65.0f;
        float f3 = 0.5f; // 4.4 E-45

        double d = 1024.99; // 64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456; //4.9 E-324

        //Booleano

        boolean bo = true;
        boolean b02 = false;
        //boolean bo3 = "false"; //Not Ok
        //boolean bo4 = "true". //Not Ok

        //void v; //palavra reservada

        //System.out.println("byte : "+ b); //error
    }
}