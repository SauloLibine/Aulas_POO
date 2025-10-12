package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 1024, 8, 9f);
        SistemaOperacional so = new SistemaOperacional(pc);

        // Programa 1 - sucesso
        Programa p1 = new Programa(8, 100, 4, 5000);

        // Programa 2 - erro de SSD
        Programa p2 = new Programa(4, 600, 2, 3000);

        // Programa 3 - erro de RAM
        Programa p3 = new Programa(32, 200, 6, 8000);

        System.out.println("=== Teste de execução de programas ===\n");

        System.out.println("Executando Programa 1:");
        so.executarPrograma(p1);
        System.out.println();

        System.out.println("Executando Programa 2:");
        so.executarPrograma(p2);
        System.out.println();

        System.out.println("Executando Programa 3:");
        so.executarPrograma(p3);
        System.out.println();
    }
}
