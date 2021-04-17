import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class Minautor
{
   private int position_x, position_y;

   public Minautor(int x, int y)
   {
     position_x = x;
     position_y = y;
   }

   public String currentPosition()
   {
     return "La position actuelle du minautore est (" + position_x + "," + position_y + ")";
   }

   public int getPositionX()
   {
     return position_x;
   }
   public void setPositionX(int x) { position_x += x; }

   public int getPositionY()
   {
     return position_y;
   }
   public void setPositionY(int y) { position_y += y; }
}
