public class Saludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saludo inicial
        System.out.println("HOLA EQUIPO !!!");
        
        // Cálculo de Fibonacci
        int n = 10; // Puedes cambiar el valor para obtener más términos
        System.out.println("Serie de Fibonacci hasta " + n + " términos:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Método recursivo para calcular Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
