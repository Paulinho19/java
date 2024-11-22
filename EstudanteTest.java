public class EstudanteTest {
  public static void main(String[] args) {
    Estudante student = new Estudante();
    student.name = "John Doe";
    student.sex = 'M';
    student.age = 22;
    
    System.out.println("Nome: "+student.name);
    System.out.println("Sexo: "+student.sex);
    System.out.println("Idade: "+student.age);
  }
}
