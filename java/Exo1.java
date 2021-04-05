import java.util.*;
import java.io.*;
import java.lang.*;

public class Exo1
{
  private static void Fortunes(double m, double h, double s)
  {
    System.out.println("La fortune de Macron est "+m+" euros.");
    System.out.println("La fortune de Hollande est "+h+" euros.");
    System.out.println("La fortune de Sarkozy est "+s+" euros."+"\n");
  }

  public static void main(String[] args)
  {
    double m = 50000000, h = 50000000, s = 50000000; // h: Hollande, m: Macron, s: Sarkozy

    System.out.println("Initialement :");
    Fortunes(m, h, s);
    
    s = 0.5*m;
    m /= 2;
    m = 0.5*h;
    h /= 2;
    h = 0.5*s;
    s /= 2;

    System.out.println("Après échanges :");
    Fortunes(m, h, s);
  }
}