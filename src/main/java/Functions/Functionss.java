package Functions;

public class Functionss {

    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Area de un circulo pi * r2
        circleArea(y);

        // Area de una esfera 4*PI * r2
        sphereArea(y);

        // Volumen de una esfera (4/3)*pi * r3
        sphereVolumen(y);

        System.out.println("Pesos a Dollares: " + converToDollar(200, "MXN"));


    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }


    // Tipo de comentario ignorado por java docs

    /*
    * Linea 1
    * Linea 2
    * Linea 3
     */

    // Comentarios que coje y que proboca la documentacion java docs

    /**
     * Descripción: Funcion que si especificas su mondeda la convierte a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     */
    public static double converToDollar(double quantity, String currency){
        // MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.050;
                break;
            case "COP":
                quantity = quantity * 0.00024;
                break;
        }
        return quantity;
    }
}
