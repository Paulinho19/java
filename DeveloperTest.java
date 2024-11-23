public class DeveloperTest {
  public static void main(String[] args){
    Developer dev1 = new Developer();
    Developer dev2 = new Developer();

    dev1.name = "John Doe";
    dev1.age = 40;
    dev1.role = "Senior Full Stack";
    dev1.company = "Intel Corporation";
    double salary = dev1.monthSalary(40, 48);

    dev2.name = "Craig Smith";
    dev2.age = 25;
    dev2.role = "Junior Frontend";
    dev2.company = "Microsoft Corporation";
    double salary2 = dev2.monthSalary(40, 22);

    dev1.greetings();
    System.out.println("Recebo R$"+salary+" reais por mês.");
    dev1.work();

    System.out.println("\n");

    dev2.greetings();
    System.out.println("Recebo R$"+salary2+" reais por mês.");
    dev2.work();


  }
}
