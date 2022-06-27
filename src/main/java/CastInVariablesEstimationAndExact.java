public class CastInVariablesEstimationAndExact {
    public static void main(String[] args) {
        // Casteo, quitar algo
        // En la programacion hay situaciones donde se necesita cambiar el tipo de dato
        // Estimacion o Exactitud

        // En un año ubicar 30 perritos
        // Cuantos perritos ubique en 1 mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        // CASTEO ENTRE TIPOS DE DATOS

        double c = a/b;
        System.out.println(c);
        double c2 = (double) a/b;
        System.out.println(c2);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);


    }
}
