import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class Labyrinth
{
  final int taille = 10;
  private Cell[][] labyrinth = new Cell[taille][taille];

  public Labyrinth()
  {
    for(int i = 0; i < taille; i ++)
    {
      for(int j = 0; j < taille; j ++) { labyrinth[i][j] = new Cell(); }
    }
  }

  private Cell getCell(int i, int j)
  {
    return labyrinth[i][j];
  }

  public void open(int i, int j, Cell.Porte direction)
  {
    getCell(i, j).setEtatPorte(direction, Cell.Etat_porte.ouverte);
  }

  public boolean isOpened(int i, int j, Cell.Porte direction)
  {
   // if(getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte) { return true; }
   //  else { return false; }

  return (   (getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte)   ?   true  :  false  ) ;

  }

}
