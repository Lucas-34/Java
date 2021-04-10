import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class Cell
{
  public enum Porte // Enumération qui me permet de créer des objets de type Porte avec les valeurs porte_nord, porte_sud, porte_est ou porte_ouest.
  {
    porte_nord, porte_sud, porte_est, porte_ouest
  }

  public enum Etat_porte // Etat de la porte
  {
    ouverte, fermee
  }

  private Etat_porte etat_porte_nord; 
  private Etat_porte etat_porte_sud;
  private Etat_porte etat_porte_est;
  private Etat_porte etat_porte_ouest;
  private boolean visited;

  public void setEtatPorte(Porte porte, Etat_porte etat)
  {
    switch(porte)
    {
      case porte_nord:
        etat_porte_nord = etat;
        break;
      case porte_sud:
        etat_porte_sud = etat;
        break;
      case porte_est:
        etat_porte_est = etat;
        break;
      case porte_ouest:
        etat_porte_ouest = etat;
        break;
    }
  }

  public Cell()
  {
    etat_porte_nord = Etat_porte.fermee;
    etat_porte_sud = Etat_porte.fermee;
    etat_porte_est = Etat_porte.fermee;
    etat_porte_ouest = Etat_porte.fermee;
    visited = false;
  }

  public Etat_porte etat(Porte porte)
  {
    switch(porte)
    {
      case porte_nord:
        return etat_porte_nord;
      case porte_sud:
        return etat_porte_sud;
      case porte_est:
        return etat_porte_est;
      case porte_ouest:
        return etat_porte_ouest;
      default:
        return Etat_porte.fermee;
    }
  }

  public void setVisited()
  {
    visited = true;
  }

  public boolean getVisited()
  {
    return visited;
  }
}