public class Funcionarios {
  public String name;
  public int age;
  public double [] salaries;

  public void imprime() {
    System.out.println("Nome: "+this.name);
    System.out.println("Idade: "+this.age);
    
    for(int i=0; i<salaries.length; i++) {
      System.out.print("R$"+salaries[i]+" ");
    }

    }

    public void imprimeMediaSalarial() {
      double media = 0;
      for(int i=0; i<salaries.length; i++) {
        media += salaries[i];
      }
      media /= salaries.length;
      System.out.println("\n Média salarial: R$"+media);
    }
  }


