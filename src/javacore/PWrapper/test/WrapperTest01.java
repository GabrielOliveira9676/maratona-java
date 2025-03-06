package academy.devdojo.maratonajava.javacore.PWrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 10L;
        float floatp = 10F;
        double doublep = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //auto Boxing
        Byte bytew = 1;
        Short shortw = 1;
        Integer intw = 1;
        Long longw = 10L;
        Float floatw = 10F;
        Double doublew = 10D;
        Character charw = 'W';
        Boolean booleanw = false;


        //unboxing
        int i = intw;
        Integer intW2 = Integer.parseInt("1");
        boolean verdade = Boolean.parseBoolean(null);
        System.out.println(verdade);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
