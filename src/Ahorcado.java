import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabrasAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        // Estructura de control interativa (Bucle)
        while (!palabrasAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length() + "letras)");

            System.out.println("Introduce una letra, por favor");


            // usamos la clase scanner para pedir una letra
            char letra =Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa(Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("!Incorrecto¡ Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabrasAdivinada = true;
                System.out.println("!Felicidades¡, has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if (!palabrasAdivinada) {
            System.out.println("!Que pena te has quedado sin instentos¡ GAME OVER");
        }

        scanner.close();
    }
}
