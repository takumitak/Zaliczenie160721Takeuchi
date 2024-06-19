//36. Napisz program, który odwraca kolejność cyfr w podanej liczbie całkowitej:
//- Program powinien wczytać liczbę całkowitą wprowadzoną przez użytkownika.
//- Odwrócić kolejność cyfr w tej liczbie.
//- Wyświetlić wynik.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj lcizbye:");
    int liczba = scanner.nextInt();
   
    int[] kolejna_cyfra = new int[100];
    int j=0;
    while(liczba>0)
    {
        kolejna_cyfra[j]=liczba % 10;
        liczba/=10;
        j++;
    }
    

    System.out.println("Liczby w odwrotnej kolejności:");
    for (int i =0; i <=j-1; i++)
      {
        System.out.println(kolejna_cyfra[i]);
      }
  
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}