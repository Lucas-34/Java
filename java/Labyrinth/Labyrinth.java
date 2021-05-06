import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class Labyrinth
{
    private final int taille = 2;
    private int nb_cells_minautor_visited;
    private final Cell[][] labyrinth = new Cell[taille][taille];
    private Minautor minautor;
    private Human Theseus;

    public Labyrinth()
    {
        for (int i = 0; i < taille; i ++)
        {
            for (int j = 0; j < taille; j ++)
            {
                labyrinth[i][j] = new Cell();
            }
        }

        int x = genererInt(0, taille-1);
        int y = genererInt(0, taille-1);
        minautor = new Minautor(x, y);
        getCell(x, y).setMinautorVisited();
        nb_cells_minautor_visited = 1;

        Theseus = new Human(0, 0);
        getCell(0, 0).setTheseusVisited();
    }

    // borneInf et borneSup incluses
    int genererInt(int borneInf, int borneSup)
    {
        Random random = new Random();
        int nb;

        nb = borneInf + random.nextInt(borneSup - borneInf +1);

        return nb;
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

        // return (   (getCell(i, j).etat(direction) == Cell.Etat_porte.ouverte)   ?   true  :  false  ) ;

        return getCell(i, j).getEtatPorte(direction) == Cell.Etat_porte.ouverte;
    }


    public void setNextPositionMinautor()
    {
        int current_position_x = minautor.getPositionX();
        int current_position_y = minautor.getPositionY();

        int direction = genererInt(1, 4); // 1: nord, 2: sud, 3: ouest, 4: est

        switch (direction)
        {
            case 1:
                if (current_position_x + 1 < taille)
                {
                    if (getCell(current_position_x + 1, current_position_y).getMinautorVisited() == false)
                    {
                        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_nord, Cell.Etat_porte.ouverte);
                        getCell(current_position_x + 1, current_position_y).setEtatPorte(Cell.Porte.porte_sud, Cell.Etat_porte.ouverte);
                        nb_cells_minautor_visited++;
                        getCell(current_position_x + 1, current_position_y).setMinautorVisited();
                    }

                    minautor.setPositionX(1);
                }
                break;

            case 2:
                if (current_position_x - 1 >= 0)
                {
                    if (getCell(current_position_x - 1, current_position_y).getMinautorVisited() == false)
                    {
                        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_sud, Cell.Etat_porte.ouverte);
                        getCell(current_position_x - 1, current_position_y).setEtatPorte(Cell.Porte.porte_nord, Cell.Etat_porte.ouverte);
                        nb_cells_minautor_visited++;
                        getCell(current_position_x - 1, current_position_y).setMinautorVisited();
                    }

                    minautor.setPositionX(-1);
                }
                break;

            case 3:
                if (current_position_y - 1 >= 0)
                {
                    if (getCell(current_position_x, current_position_y - 1).getMinautorVisited() == false)
                    {
                        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_ouest, Cell.Etat_porte.ouverte);
                        getCell(current_position_x, current_position_y - 1).setEtatPorte(Cell.Porte.porte_est, Cell.Etat_porte.ouverte);
                        nb_cells_minautor_visited++;
                        getCell(current_position_x, current_position_y - 1).setMinautorVisited();
                    }

                    minautor.setPositionY(-1);
                }
                break;

            case 4:
                if (current_position_y + 1 < taille)
                {
                    if (getCell(current_position_x, current_position_y + 1).getMinautorVisited() == false)
                    {
                        getCell(current_position_x, current_position_y).setEtatPorte(Cell.Porte.porte_est, Cell.Etat_porte.ouverte);
                        getCell(current_position_x, current_position_y + 1).setEtatPorte(Cell.Porte.porte_ouest, Cell.Etat_porte.ouverte);
                        nb_cells_minautor_visited++;
                        getCell(current_position_x, current_position_y + 1).setMinautorVisited();
                    }

                    minautor.setPositionY(1);
                }
                break;

            default:
                System.out.println("ERREUR");
                break;
        }
    }

    public void moveMinautor()
    {
        String preview_position = minautor.currentPosition();

        System.out.println("La position initiale du minautore est (" + minautor.getPositionX() + "," + minautor.getPositionY() + ")");

        while (nb_cells_minautor_visited < (taille * taille))
        {
            setNextPositionMinautor();

            if(preview_position.equals(minautor.currentPosition()) == false)
            {
                System.out.println(minautor.currentPosition());

                preview_position = minautor.currentPosition();
            }
        }

        System.out.println("Le minautore a parcouru toutes les cellules du labyrinthe. Sa position finale est (" + minautor.getPositionX() + "," + minautor.getPositionY() + ") \n");
    }

    public void etatFinalPortes()
    {
        for (int i = 0; i < taille; i ++)
        {
            for (int j = 0; j < taille; j ++)
            {
                System.out.println("Cellule (" + i + "," + j + "): porte nord " + getCell(i, j).getEtatPorte(Cell.Porte.porte_nord) + ", porte sud " + getCell(i, j).getEtatPorte(Cell.Porte.porte_sud) + ", porte ouest " + getCell(i, j).getEtatPorte(Cell.Porte.porte_ouest) + ", porte est " + getCell(i, j).getEtatPorte(Cell.Porte.porte_est));
            }
        }

        System.out.println();
    }

    public void setNextPositionTheseus()
    {
        int current_position_x = Theseus.getPositionX();
        int current_position_y = Theseus.getPositionY();

        int direction = genererInt(1, 4); // 1: nord, 2: sud, 3: ouest, 4: est

        switch (direction)
        {
            case 1:
                if (current_position_x + 1 < taille)
                {
                    if (getCell(current_position_x, current_position_y).getEtatPorte(Cell.Porte.porte_nord) == Cell.Etat_porte.ouverte && getCell(current_position_x + 1, current_position_y).getEtatPorte(Cell.Porte.porte_sud) == Cell.Etat_porte.ouverte)
                    {
                        Theseus.setPositionX(1);
                        getCell(current_position_x, current_position_y).setTheseusVisited();
                    }
                }
                break;

            case 2:
                if (current_position_x - 1 >= 0)
                {
                    if (getCell(current_position_x, current_position_y).getEtatPorte(Cell.Porte.porte_sud) == Cell.Etat_porte.ouverte && getCell(current_position_x - 1, current_position_y).getEtatPorte(Cell.Porte.porte_nord) == Cell.Etat_porte.ouverte)
                    {
                        Theseus.setPositionX(-1);
                        getCell(current_position_x, current_position_y).setTheseusVisited();
                    }
                }
                break;

            case 3:
                if (current_position_y - 1 >= 0)
                {
                    if (getCell(current_position_x, current_position_y).getEtatPorte(Cell.Porte.porte_ouest) == Cell.Etat_porte.ouverte && getCell(current_position_x, current_position_y - 1).getEtatPorte(Cell.Porte.porte_est) == Cell.Etat_porte.ouverte)
                    {
                        Theseus.setPositionY(-1);
                        getCell(current_position_x, current_position_y).setTheseusVisited();
                    }
                }
                break;

            case 4:
                if (current_position_y + 1 < taille)
                {
                    if (getCell(current_position_x, current_position_y).getEtatPorte(Cell.Porte.porte_est) == Cell.Etat_porte.ouverte && getCell(current_position_x, current_position_y + 1).getEtatPorte(Cell.Porte.porte_ouest) == Cell.Etat_porte.ouverte)
                    {
                        Theseus.setPositionY(1);
                        getCell(current_position_x, current_position_y).setTheseusVisited();
                    }
                }
                break;

            default:
                System.out.println("ERREUR");
                break;
        }
    }

    public void moveTheseus()
    {
        String preview_position = Theseus.currentPosition();

        System.out.println("La position initiale de Theseus est (" + Theseus.getPositionX() + "," + Theseus.getPositionY() + ")");

        while (Theseus.getPositionX() != minautor.getPositionX() || Theseus.getPositionY() != minautor.getPositionY())
        {
            setNextPositionTheseus();

            if(preview_position.equals(Theseus.currentPosition()) == false)
            {
                System.out.println(Theseus.currentPosition());

                preview_position = Theseus.currentPosition();
            }
        }

        System.out.println("Theseus a trouvé le minautore à la position (" + Theseus.getPositionX() + "," + Theseus.getPositionY() + ") \n");
    }

    public void cheminTheseus()
    {
        for (int i = 0; i < taille; i ++)
        {
            for (int j = 0; j < taille; j ++)
            {
                System.out.println("Cellule (" + i + "," + j + ") visitée par Theseus: " + getCell(i, j).getTheseusVisited());
            }
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Labyrinth labyrinth = new Labyrinth();

        labyrinth.moveMinautor();
        labyrinth.etatFinalPortes();

        labyrinth.moveTheseus();
        labyrinth.cheminTheseus();
    }
}