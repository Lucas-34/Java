package graph;

import graph.*;

public class TestGraphImpl
{
  public static void main(String[] args) throws IllegalArgumentException, GraphOverflowException
  {
    IncidenceArrayGraph incidence_array_graph = new IncidenceArrayGraph(3, EdgeKind.undirected);

    Vertex v0 = new Vertex();
    System.out.println(v0.toString());

    try { incidence_array_graph.addVertex(v0); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    Vertex v1 = new Vertex();
    System.out.println(v1.toString());

    try { incidence_array_graph.addVertex(v1); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    Vertex v2 = new Vertex();
    System.out.println(v2.toString());

    try { incidence_array_graph.addVertex(v2); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    Edge e1 = new UndirectedEdge(v0, v1);
    System.out.println(e1.toString());

    try { incidence_array_graph.addEdge(e1.getEnds()[0], e1.getEnds()[1], 0); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    Edge e2 = new UndirectedEdge(v1, v2);
    System.out.println(e2.toString());
    
    try { incidence_array_graph.addEdge(e2.getEnds()[0], e2.getEnds()[1], 0); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    System.out.println("Est-ce que tous les sommets du graphe sont connectés ? " + incidence_array_graph.areAllConnected() + "\n"); // Doit retourner false.

    System.out.println("Est-ce que v0 est connecté à v1 ? " + incidence_array_graph.areConnected(v0, v1) + "\n"); // Doit retourner true.

    System.out.println("Est-ce que v1 est connecté à v2 ? " + incidence_array_graph.areConnected(v1, v2) + "\n"); // Doit retourner true.

    System.out.println("Est-ce que v0 est connecté à v2 ? " + incidence_array_graph.areConnected(v0, v2) + "\n"); // Doit retourner false.

    System.out.println(incidence_array_graph.toString()); // Montre la liste des vertices.

    Vertex v3 = new Vertex();
    System.out.println(v3.toString());

    try { incidence_array_graph.addVertex(v3); }
    catch(GraphOverflowException exception) { System.out.println(exception.toString()); }

    try
    {
      Edge e3 = new DirectedEdge(v0, v2, 5);
      System.out.println(e3.toString());
    }
    catch(IllegalArgumentException exception) { System.out.println(exception.toString()); }
  }
}