public class Developer {
  public String name;
  public int age;
  public String role;
  public String company;

  public void greetings() {
    System.out.println("Olá, me chamo "+name+". Tenho "+age+" anos e sou um desenvolvedor "+role+" na empresa "+company+". É um prazer estar aqui!");
  }

  public void work() {
    System.out.println("Estou trabalhando no desenvolvimento de um novo sistema.");
  }

  public double monthSalary(double hours, double valuePerHour) {
    return (hours * valuePerHour)*20;
  }
}
