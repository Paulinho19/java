public class FuncionariosTest {
  public static void main(String[] args) {
    Funcionarios funcionario = new Funcionarios();

    funcionario.name = "John Doe";
    funcionario.age = 28;
    funcionario.salaries = new double[]{7400,8750,6500};

    funcionario.imprime();
    funcionario.imprimeMediaSalarial();
  }
}
