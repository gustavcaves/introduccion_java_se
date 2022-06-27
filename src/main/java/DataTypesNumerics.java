public class DataTypesNumerics {
    public static void main(String[] args) {
        // int solo permite ingresar 10 digitos
        int n = 1234567890;
        // Enteros byte 1, short 2, int 4, long 8 bytes ocupan en memoria
        // Es importante definir el tipo de variable adecuada
        // int es el usado, no tan grande ni tan pequeño
        // si es una base muy grande si usar el long

        // Poner una L al final del la declaracion del la variable long
        long nL = 12345678901L;

        // Punto flotante, float 4 bytes en memoria, double 8bytes en memoria
        // double mas usado

        // Cuando se requiere mas precicion
        double nD = 123.123123123123;
        float nF = 123.123F;
    }
}
