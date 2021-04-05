import java.util.*;
import java.io.*;
import java.lang.*;

// Question 4:
public class Period
{
  Date startingDate, endingDate;

  public Period(Date endingDate) // 1er constructeur
  {
    startingDate = new Date(); // La date courante correspond à la date de début de la période.

    this.endingDate = endingDate;
  }

  public Period(Date startingDate, Date endingDate) // 2nd constructeur
  {
    this.startingDate = startingDate;
    this.endingDate = endingDate;
  }

  public boolean equals(Period p)
  {
    if(startingDate.equals(p.startingDate) == true && endingDate.equals(p.endingDate) == true) { return true; }
    else { return false; }
  }

  public boolean isBefore(Period p)
  {
    if(endingDate.compare(p.startingDate) == 1 || endingDate.equals(p.startingDate) == true) { return true; }
    else { return false; }
  }

  public boolean intersectsWith(Period p)
  {
    if(endingDate.compare(p.startingDate) == 1 || startingDate.compare(p.endingDate) == -1) { return false; }
    else { return true; }
  }

  public String periodToString()
  {
    String result; 
    
    result = this.startingDate.day + "/" + this.startingDate.month + "/" + this.startingDate.year + " - " + this.endingDate.day + "/" + this.endingDate.month + "/" + this.endingDate.year;

    return result;
  }

  public static void main(String[] args)
  {
    Date endingDate1 = new Date(1, 28, 2022);
    Period p1 = new Period(endingDate1);

    System.out.println("La 1ère période a été initialisée: " + p1.periodToString());

    Date startingDate2 = new Date(10, 10, 1999);
    Date endingDate2 = new Date(11, 11, 2000);
    Period p2 = new Period(startingDate2, endingDate2);

    System.out.println("La 2nde période a été initialisée: " + p2.periodToString());

    System.out.println("La première période chevauche-t-elle la 2nde ? " + p1.intersectsWith(p2));
    System.out.println("La 2nde période est-t-elle antérieure à la 1ère ? " + p2.isBefore(p1));
  }
}
  


