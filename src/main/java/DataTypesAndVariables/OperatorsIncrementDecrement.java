package DataTypesAndVariables;

public class OperatorsIncrementDecrement {
    public static void main(String[] args) {
        // ++ sumando uno incremento
        // -- restano uno decremento
        // se puede ser prefijo o postfijo

        int lives = 5;
        lives = lives -1;
        System.out.println(lives); // 4

        lives--; // Decremento Post Fija
        System.out.println(lives); // 3

        lives++; // Incremento Post Fija
        System.out.println(lives); // 4

        // Prefija

        // int gift = 100 + lives++; // postfijo
        int gift = 100 + ++lives; // prefijo
        System.out.println(gift);
        System.out.println(lives); // lives 5

    }
}
