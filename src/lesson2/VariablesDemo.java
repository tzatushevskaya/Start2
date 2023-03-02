package lesson2;

public class VariablesDemo {

    public static void main(String[] args) {

        boolean varBool = true;
        byte varByte = 120;
        char varChar = 'Z';
        double varDouble = 120;
        float varFloat = 120f;
        int varInt = 2147483647;
        long varLong = 2147483648L;
        short varShort = 32767;

        System.out.println("Logical type:");
        System.out.println("This is the value currently stored in the varBool variable: "
                + varBool + ". The values stored in such variable type might be true or false");


        System.out.println("\nCharacter type:");
        System.out.println("This is the value currently stored in the varChar variable: " + varChar
                + ". The values stored in such variable type might be in range from 0 to 65,536 (standard ASCII characters range included)");


        System.out.println("\nInteger types:");
        System.out.println("This is the value currently stored in the varByte variable: " + varByte
                + ". The values stored in such variable\\ type might be in range from -128 to 127");
        System.out.println("This is the value currently\n stored in the varShort variable: " + varShort
                + ". The values stored in such variable\n type might be in range from -32768 to 32767");
        System.out.println("This is the value currently\n stored in the varInt variable: " + varInt
                + ". The values stored in such variable\n type might be in range from -2,147,483,648 to 2,147,483,647");
        System.out.println("This is the value currently\n stored in the varLong variable: " + varLong
                + ". The values stored in such variable\n type might be in range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");


        System.out.println("\nFloating\\point types:");
        System.out.println("This is the value currently stored in the varFloat variable: " + varFloat
                + ". The values stored in such variable type are decimals. float: approximately ±1.4E-45 to ±3.4028235E38");
        System.out.println("This is the value currently stored in the varDouble variable: " + varDouble
                + ". The values stored in such variable type are decimals. double: approximately ±4.9E-324 to ±1.7976931348623157E308");


    }

}
