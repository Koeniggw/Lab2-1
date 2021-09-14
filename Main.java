import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Type a number to count down or up from then press \"Enter\": ");

    Scanner s = new Scanner(System.in);

    int number = s.nextInt();
    //Not sure if we need to worry about the user inputing letters, characters, or decimals for this lab. Results in an Exception in thread "main"
    
    if (number >= 0) {
      while (number >= 0) {
        System.out.println(number);
        number--;
      }
    } else {
      while (number <= 0) {
        System.out.println(number);
        number++;
      }

    }

    System.out.println("Blast Off!");

  }
}