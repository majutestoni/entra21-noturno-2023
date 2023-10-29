package exFuncionario;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Endereco endereco = new Endereco("Brasil", "SC", "Blumenau", "Rua Joinville", "150");
        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add("Gerenciar");
        habilidades.add("Administrar");
        habilidades.add("Falar");

        Gerente gerente1 = new Gerente("1", endereco, LocalDate.of(2000, 02, 20), "Bruno",
                2000, LocalDate.of(2020, 02, 20) , habilidades, "1");

        System.out.println(gerente1.getIdade());
        System.out.println(gerente1.calcularSalarioAnual());
        System.out.println(gerente1.calcularAnosDeEmpresa());
        System.out.println(gerente1.toString());
        gerente1.adicionarHabilidade("Programar");
        System.out.println(gerente1.toString());

    }
}