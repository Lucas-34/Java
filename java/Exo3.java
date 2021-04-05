import java.util.*;
import java.io.*;
import java.lang.*;

public class Exo3
{
  private static void chi_fo_mi()
  {
    int nb_points_ordinateur = 0;
    int nb_points_joueur = 0;
    Scanner saisie_utilisateur = new Scanner(System.in);
    String objet_joueur;
    int indice_tour = 1;

    do
    {
      System.out.print("Saisissez un objet parmi 'pierre', 'feuille' et 'ciseaux' : ");
      objet_joueur = saisie_utilisateur.next();

      int objet_ordinateur = (int) (Math.random() * 3) + 1; // 1: 'pierre', 2: 'feuille', 3: 'ciseaux'

      switch(objet_joueur)
      {
        case "pierre":
        {
          switch(objet_ordinateur)
          {
            case 1:
              break;
            case 2:
              nb_points_ordinateur ++;
              break;
            case 3:
              nb_points_joueur ++;
              break;
          }
        }
        break;

        case "feuille":
        {
          switch(objet_ordinateur)
          {
            case 1:
              nb_points_joueur ++;
              break;
            case 2:
              break;
            case 3:
              nb_points_ordinateur ++;
              break;
          }
        }
        break;
        
        case "ciseaux":
        {
          switch(objet_ordinateur)
          {
            case 1:
              nb_points_ordinateur ++;
              break;
            case 2:
              nb_points_joueur ++;
              break;
            case 3:
              break;
          }
        }
        break;
      }

      System.out.println("Tour "+indice_tour+" :");
      System.out.println("    Nombre de points du joueur : "+nb_points_joueur);
      System.out.println("    Nombre de points de l'ordinateur : "+nb_points_ordinateur);

      indice_tour ++;
    }
    while(Math.abs(nb_points_joueur - nb_points_ordinateur) != 2);

    if((nb_points_joueur - nb_points_ordinateur) < 0) { System.out.println("Le gagnant est l'ordinateur."); }
    else { System.out.println("Le gagnant est le joueur."); }
  }

  public static void main(String[] args)
  {
    chi_fo_mi();
  }
}