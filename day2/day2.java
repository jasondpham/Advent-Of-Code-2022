import java.io.BufferedReader;
import java.io.FileReader;
public class day2 {
  public static void main(String[] args) {
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader("day2in"));
      String line = reader.readLine();
      int score = 0;
      while (line != null) {
        String[] split = line.split(" ");
        char elf = split[0].charAt(0);
        char mine = split[1].charAt(0);
        System.out.println(elf + " " + mine);
        if (mine == 'X') {
          score += 1;
          if (elf == 'A') {
            score += 3;
          } else if (elf == 'B') {
            score += 0;
          } else {
            score += 6;
          }
        } else if (mine == 'Y') {
          score += 2;
          if (elf == 'A') {
            score += 6;
          } else if (elf == 'B') {
            score += 3;
          } else {
            score += 0;
          }
        } else {
          score += 3;
          if (elf == 'A') {
            score += 0;
          } else if (elf == 'B') {
            score += 6;
          } else {
            score += 3;
          }
        }
        line = reader.readLine();
      }
      System.out.println(score);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
