import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

class Code_unaire
{
  public static void main(String args[])
  {
    System.out.println("Veuillez saisir le message à convertir en code unaire : ");

    Scanner in = new Scanner(System.in); // Structure de données à laquelle on affectera la valeur qu'on saisit au clavier (entrée standard).

    String message_a_convertir = in.nextLine(); // On met dans 'message_a_convertir' le message saisi au clavier.

    String code_binaire = ""; // Chaîne de caractères contenant le code binaire du 'message_a_convertir'. On l'initialise comme étant une chaîne vide.
    
    for(int i = 0; i < message_a_convertir.length(); i ++) // On convertit chaque caractère de notre 'message_a_convertir' en bit.
    {
      String bit = Integer.toBinaryString((byte) message_a_convertir.charAt(i));

      for(int j = 0; j < 7 - bit.length(); j ++) { bit = 0 + bit; } // On concatène 0 à gauche 

      code_binaire += bit; // On concatène 'bit' (conversion du caractère d'indice i) à 'code_binaire'.
    }

    System.out.println("Tout d'abord, en code binaire, la conversion du message "+ message_a_convertir + " donne " + code_binaire + "\n");

    String code_unaire = ""; // Chaîne de caractères contenant le code unaire du 'message_a_convertir' (ou du 'code_binaire'). On l'initialise comme étant une chaîne vide.
    
    int indice = 0;

    while(indice < code_binaire.length()) // On convertit notre 'code_binaire' en code unaire.
    {
      if(code_binaire.charAt(indice) == '0') // On rencontre une série d'un ou plusieurs 0 dans le code binaire.
      {
        code_unaire += "00 "; // Quand on rencontre une série de 0, on ajoute '00 ' ...

        while(indice < code_binaire.length() && code_binaire.charAt(indice) == '0') // ... puis on ajoute tous les 0 rencontrés.
        {
          code_unaire += '0';

          indice ++;
        }
      }

      else if(code_binaire.charAt(indice) == '1') // On rencontre une série d'un ou plusieurs 1 dans le code binaire.
      {
        code_unaire += "0 "; // Quand on rencontre une série de 1, on ajoute '0 ' ...

        while(indice < code_binaire.length() && code_binaire.charAt(indice) == '1') // ... puis on ajoute tous les 1 rencontrés.
        {
          code_unaire += '0';

          indice ++;
        }
      }

      code_unaire += ' '; // On ajoute un espace à la fin de la conversion de chaque bit issu du code binaire en le code unaire qui lui correspond, afin de bien les distinguer.
    }

    code_unaire = code_unaire.substring(0, code_unaire.length() - 1); // On retire le dernier saut d'espace dans notre code unaire.

    System.out.println("Finalement, en code unaire, la conversion du message " + message_a_convertir + " donne " + code_unaire + "\n");
  }
}