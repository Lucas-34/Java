package graph;

import graph.*;

public class TestGraph
{
  public static void main(String[] args) throws IllegalArgumentException
  {
    Vertex v0 = new Vertex();
    System.out.println(v0);
    Vertex v1 = new Vertex();
    System.out.println(v1);

    try
    {
      Edge edge1 = new DirectedEdge(v0, v1, 0);
      System.out.println(edge1.toString());
    }
    catch(IllegalArgumentException exception) { System.out.println(exception.toString()); }
    
    try
    {
      Edge edge2 = new DirectedEdge(v1, v0, 5);
      System.out.println(edge2.toString());
    }
    catch(IllegalArgumentException exception) { System.out.println(exception.toString()); } 
  }
}