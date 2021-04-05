import java.util.*;
import java.io.*;
import java.lang.*;

// Question 3:
public class Date
{
  int day, month, year;

  public Date() // 1er constructeur
  {
    Calendar current_day = Calendar.getInstance();
    
    day = current_day.get(Calendar.DAY_OF_MONTH);
    month = current_day.get(Calendar.MONTH) + 1;
    year = current_day.get(Calendar.YEAR);
  }

  public Date(int day, int month, int year) // 2nd constructeur
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean equalDay(Date d)
  {
    if(this.day == d.day) { return true; }
    else { return false; }
  }

  public boolean equalMonth(Date d)
  {
    if(this.month == d.month) { return true; }
    else { return false; }
  }

  public boolean equalYear(Date d)
  {
    if(this.year == d.year) { return true; }
    else { return false; }
  }

  public int getDay()
  {
    return this.day;
  }

  public int getMonth()
  {
    return this.month;
  }

  public int getYear()
  {
    return this.year;
  }

  public boolean equals(Date d)
  {
    if(this.day == d.day && this.month == d.month && this.year == d.year) { return true; }
    else { return false; }
  }

  public int compare(Date d)
  {
    if(equals(d) == true) { return 0; }
    else if(this.year < d.year) { return 1; }
         else
         {
           if(equalYear(d) == true)
           {
             if(this.month < d.month) { return 1; }
             else if(equalMonth(d) == true)
                  {
                    if(this.day < d.day) { return 1; }
                    else { return -1; }
                  }
                  else { return -1; }
           }
           else { return -1; }
         }
  }

  public Date smallest(Date d)
  {
    if(compare(d) == 0 || compare(d) == 1) { return this; }
    else { return d; }
  }

  public String dateToString()
  {
    String result;
    
    result = this.day + "/" + this.month + "/" + this.year;

    return result;
  }

  public String dateInLetters()
  {
    String mois = "";

    switch(this.month)
    {
      case 1:
        mois = "Janvier";
        break;
      case 2:
        mois = "Février";
        break;
      case 3:
        mois = "Mars";
        break;
      case 4:
        mois = "Avril";
        break;
      case 5:
        mois = "Mai";
        break;
      case 6:
        mois = "Juin";
        break;
      case 7:
        mois = "Juillet";
        break;
      case 8:
        mois = "Août";
        break;
      case 9:
        mois = "Septembre";
        break;
      case 10:
        mois = "Octobre";
        break;
      case 11:
        mois = "Novembre";
        break;
      case 12:
        mois = "Décembre";
        break;
    }

    String result = this.day + " " + mois + " " + this.year;
    
    return result;
  }

  // Questions 1 et 2:
  public static void main(String[] args)
  {
    // 1.1:
    Date d1 = new Date();
    System.out.println("La 1ère date a été initialisée.");
    
    // 1.2:
    Date d2 = new Date(28, 1, 2000);
    System.out.println("La 2nde date a été initialisée.");
    
    // 1.3:
    if(d1.smallest(d2) == d1) { System.out.println("La plus petite date des deux est la première."); }
    else if(d1.smallest(d2) == d2) { System.out.println("La plus petite date des deux est la seconde."); }
    
    int N = 15;

    // 2.1:
    int[] tableauEntier = new int[N];

    System.out.print("Le tableau de " + N + " entiers a été initialisé: [ ");
    for(int i = 0; i < tableauEntier.length; i ++)
    {
      tableauEntier[i] = -1;

      System.out.print(tableauEntier[i] + " ");
    }

    System.out.println("]");

    // 2.2:
    Date[] tableauDate1 = new Date[N];

    System.out.println("Le 1er tableau de " + N + " dates a été initialisé.");

    // 2.3:
    String[] tableauDate2 = new String[N];
    
    System.out.print("Le 2nd tableau de " + N + " dates au format 'jour/mois/année' a été initialisé: [ ");

    for(int i = 0; i < tableauDate2.length; i ++)
    {
      Date d = new Date(i+1, 4, 1998);

      tableauDate2[i] = d.dateToString();

      System.out.print(tableauDate2[i] + " ");
    }

    System.out.println("]");
  }
}
  


