public class MonthsAndDays {
  public static void main(String[] args) {
      // Array unidimensional
      int[] ages = {15,44,33,34};
      
      // Array multidimensional
      int[][] calendarDays = new int[12][2];

      calendarDays[0][1] = 31;
      calendarDays[1][1] = 29;
      calendarDays[2][1] = 31;
      calendarDays[3][1] = 30;
      calendarDays[4][1] = 31;
      calendarDays[5][1] = 30;
      calendarDays[6][1] = 31;
      calendarDays[7][1] = 31;
      calendarDays[8][1] = 30;
      calendarDays[9][1] = 31;
      calendarDays[10][1] = 30;
      calendarDays[11][1] = 31;

      String[] months = {"janeiro", "fevereiro","março", "abril", "maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};

      for(int i = 0; i < calendarDays.length;i++) {
        System.out.println("O mês de "+months[i]+" tem "+calendarDays[i][1]+" dias em 2024.");
      }
  }
}
