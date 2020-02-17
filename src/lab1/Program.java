package lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    String birthday;
    String name;
    int nameLength;
    System.out.println("Hello world!");
    System.out.print("Please enter your name: ");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    System.out.println("Hello, " + name);
    nameLength = name.length();
    System.out.println("Your name has " + nameLength + " letters");
    System.out.println(nameLength + "! = " + calculateFactorial(nameLength));
    System.out.print("Please, enter your birth date in format (DD.MM.YYYY): ");
    birthday = scanner.nextLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");
    Date birthDate = dateFormat.parse(birthday);
    Date date = new Date();
    System.out.println("Today is " + date + " your birthday is " + birthDate);
  }

  static int calculateFactorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }
}
