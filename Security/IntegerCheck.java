//Security Module
//Integer Overflow
//Author: Towson.edu

import java.util.Scanner;

public class IntegerCheck {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i;
    byte b;
    short sh;
    long lon;

    System.out.print("Type an integer value: ");
    i = scan.nextInt();
    System.out.print("Type a byte value: ");
    b = scan.nextByte();
    System.out.print("Type a short value: ");
    sh = scan.nextShort();
    System.out.print("Type a long value: ");
    lon = scan.nextLong();

    System.out.println("\nYou entered the following values: ");
    System.out.println("Integer: " + i);
    System.out.println("Byte: " + b);
    System.out.println("Short: " + sh);
    System.out.println("Long: " + lon);
  }
}
