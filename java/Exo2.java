import java.util.*;
import java.io.*;
import java.lang.*;

public class Exo2
{
  private static double prix_final(double prix_initial, int age, boolean est_etudiant, boolean a_une_carte)
  {
    if(age < 10) { return 0.5 * prix_initial; }
    if(age > 65) { return 0.67 * prix_initial; }
    
    if(est_etudiant == true)
    {
      double prix_final = prix_initial;

      if(prix_final > 20) { prix_final -= 15; }

      if(age >= 18 && age <= 25 & a_une_carte == true)
      {
        double prix_reduit = 0.25 * prix_initial;

        if(prix_final > prix_reduit) { prix_final = prix_reduit; }
      }

      return prix_final;
    }

    return prix_initial;
  }

  public static void main(String[] args)
  {
    System.out.println("Le prix après réduction s'élève à " + prix_final(25.0,19,true,false)+" euros.");
  }
}