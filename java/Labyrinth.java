import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class Labyrinth
{
  private final int taille = 10;
  private final Cell[][] labyrinth = new Cell[taille][taille];
  private Minautor minautor;

  int genererInt(int borneInf, int borneSup)
  {
    Random random = new Random();
    
    int nb;
   
    nb = borneInf + random.nextInt(borneSup - borneInf);
   
    return nb;
  }

  public Labyrinth()
  {
    for (int i = 0; i < taille; i++)
    {
      for (int j = 0; j < taille; j++) { labyrinth[i][j] = new Cell(); }
    }

    int x = genererInt(0, 9);
    int y = genererInt(0, 9);

    minautor = new Minautor(x, y);

    getCell(x, y).setVisited();
  }

  private Cell getCell(int i, int j) { return labyrinth[i][j]; }

  public void open(int i, int j, Cell.Porte direction) { getCell(i, j).setEtatPorte(direction, Cell.Etat_porte.ouverte); }

  public boolean isOpened(int i, int j, Cell.Porte direction)
  {
    // if(getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte) { return true; }
    //  else { return false; }

    // return (   (getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte)   ?   true  :  false  ) ;

    return getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte;
  }

  public int setNextPosition(int current_position_x, int current_position_y)
  {
    boolean position_valable = false;

    int x = -1;

    if(current_position_x + x < 0 || current_position_x + x > 9 || getCell(current_position_x + x, current_position_y).getVisited() == true)
    {
      x = 1;
      
      if(current_position_x + x < 0 || current_position_x + x > 9 || getCell(current_position_x + x, current_position_y).getVisited() == true)
      {
        y = -1;

        if(current_position_y + y < 0 || current_position_y + y > 9 || getCell(current_position_x, current_position_y + y).getVisited() == true)
        {
          y = 1;

          if(current_position_y + y < 0 || current_position_y + y > 9 || getCell(current_position_x, current_position_y + y).getVisited() == true) { return -1; }
          {
            getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_est, Cell.Etat_porte.ouverte);

            current_position_y += y;

            getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_ouest, Cell.Etat_porte.ouverte);

            return 1;
          }
        }
        else
        {
          getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_ouest, Cell.Etat_porte.ouverte);

          current_position_y += y;

          getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_est, Cell.Etat_porte.ouverte);

          return 1;
        }
      }
      else
      {
        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_nord, Cell.Etat_porte.ouverte);

        current_position_x += x;

        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_sud, Cell.Etat_porte.ouverte);

        return 1;
      }
    }
    else
    {
      getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_sud, Cell.Etat_porte.ouverte);

      current_position_x += x;

      getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_nord, Cell.Etat_porte.ouverte);

      return 1;
    }
  }

  public void Move()
  {
    int result = setNextPosition(minautor.getPositionX(), minautor.getPositionY());

    if(result != -1)
    {
      do
      {
        System.out.println(minautor.currentPosition());

        result = setNextPosition(minautor.getPositionX(), minautor.getPositionY());
      }
      while(result != -1);
    }
    else { System.out.println("Le minautore a parcouru toutes les cellules du labyrinthe. Sa position finale est (" + minautor.getPositionX() + "," + minautor.getPositionY() + ")"); }
  }
}