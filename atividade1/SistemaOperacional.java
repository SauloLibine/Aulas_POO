package atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        System.out.println("Tentando executar programa...");

        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: O programa requer mais espaço no SSD do que o disponível.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: O programa requer mais memória RAM do que o disponível.");
            return false;
        }

        if (p.getNucleos() > computador.getNucleos()) {
            System.out.println("Aviso: O programa usa mais núcleos do que o computador possui, será limitado.");
            p.setNucleos(computador.getNucleos());
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.printf("Programa executado com sucesso! Tempo estimado de execução: %.2f segundos.%n", tempoExecucao);
        return true;
    }
}
