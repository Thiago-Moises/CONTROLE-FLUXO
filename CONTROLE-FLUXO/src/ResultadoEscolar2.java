public class ResultadoEscolar2 {
    public static void main(String[] args) {
        // Refactoring

        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }

}
