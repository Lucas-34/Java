package graph;

import graph.*;
import java.lang.Math;

public class IncidenceArrayGraph implements Graph
{
  private Vertex[] tab_vertices;
  private Edge[] tab_edges;
  private Edge[][] incidenceArray;
  private EdgeKind edgeKind;
  
  public IncidenceArrayGraph(int n, EdgeKind edgeKind)
  {
    int taille = 2 * n;
    tab_vertices = new Vertex[n];
    this.edgeKind = edgeKind;

    if(this.edgeKind == EdgeKind.directed)
    {
      tab_edges = new DirectedEdge[taille];
      incidenceArray = new DirectedEdge[n][taille];
    }
    else
    {
      tab_edges = new UndirectedEdge[taille];
      incidenceArray = new UndirectedEdge[n][taille];
    }
  }

  public Edge[] reorderEdge(Edge[] tab_edges) // Removes the null values from the arrays of edges.
  {
    int index = 0;
    int taille = 0;
    int i = 0;

    while(index < tab_edges.length)
    {
      if(tab_edges[index] != null) { taille ++; }

      index ++;
    }

    Edge[] final_result = new Edge[taille];

    for(int j = 0; j < tab_edges.length; j ++)
    {
      if(tab_edges[j] != null)
      {
        final_result[i] = tab_edges[j];
        
        i ++;
      }
    }

    return final_result;
  }

  public Vertex[] reorderVertex(Vertex[] tab_vertices) // Removes the null values from the arrays of vertices.
  {
    int index = 0;
    int taille = 0;
    int i = 0;

    while(index < tab_vertices.length)
    {
      if(tab_vertices[index] != null) { taille ++; }

      index ++;
    }

    Vertex[] final_result = new Vertex[taille];

    for(int j = 0; j < tab_vertices.length; j ++)
    {
      if(tab_vertices[j] != null)
      {
        final_result[i] = tab_vertices[j];

        i ++;
      }
    }

    return final_result;
  }

  @Override
  public Vertex[] getAllVertices() { return tab_vertices; }

  @Override
  public Edge[] getAllEdges() { return tab_edges; }

  public Edge[][] getIncidenceArray() { return incidenceArray; }
  // public void setIncidenceArray(int[][] incidenceArray) { this.incidenceArray = incidenceArray; }

  public EdgeKind getEdgeKind() { return edgeKind; }
  public void setEdgeKind(EdgeKind edgeKind) { this.edgeKind = edgeKind; }

  @Override
  public int nbOfVertices() { return tab_vertices.length; }

  @Override
  public int nbOfEdges() { return tab_edges.length; }

  @Override
  public void addVertex(Vertex vertex)
  {
    tab_vertices[vertex.getId()] = vertex;
  }

  
  @Override
  public void addEdge(Vertex v0, Vertex v1, int source) throws IllegalArgumentException // On considère v0 comme origine et v1 comme fin.
  {   
    int j = 0;
    Edge new_edge;

    if(edgeKind == EdgeKind.directed) { new_edge = new DirectedEdge(v0, v1, source); }
    else { new_edge = new UndirectedEdge(v0, v1); }

    tab_edges[new_edge.getId()] = new_edge; 
    
    while(incidenceArray[v0.getId()][j] != null) { j ++; }
    incidenceArray[v0.getId()][j] = new_edge; 
    
    j = 0; 
    
    while(incidenceArray[v1.getId()][j] != null) { j ++; }
    incidenceArray[v1.getId()][j] = new_edge;
  }

  @Override
  public Edge[] getEdges(Vertex v0, Vertex v1)
  {
    Edge[] result;

    if(edgeKind == EdgeKind.directed) { result = new DirectedEdge[nbOfEdges()]; }
    else { result = new UndirectedEdge[nbOfEdges()]; }
    
    int j = 0;

    Vertex[] ends1 = new Vertex[2];
    ends1[0] = v0;
    ends1[1] = v1;
    
    Vertex[] ends2 = new Vertex[2];
    ends2[0] = v1;
    ends2[1] = v0;

    for(int i = 0; i < nbOfEdges(); i ++)
    {
      if(tab_edges[i] != null)
      {
        if((tab_edges[i].getEnds()[0] == ends1[0] && tab_edges[i].getEnds()[1] == ends1[1]) || (tab_edges[i].getEnds()[0] == ends2[0] && tab_edges[i].getEnds()[1] == ends2[1]))
        {
          result[j] = tab_edges[i];

          j ++;
        }
      }
    }

    result = reorderEdge(result);
    return result;
  }

  @Override
  public boolean areConnected(Vertex v0, Vertex v1)
  {
    Edge[] e = getEdges(v0, v1);

    if(e.length == 0) { return false; }
    else { return true; }
  }

  @Override
  public boolean areAllConnected()
  {
    boolean result = true;
    int  i = 0;

    while(result == true && i != tab_vertices.length)
    {
      for(int j = 0; j < tab_vertices.length; j ++)
      {
        if(areConnected(tab_vertices[i], tab_vertices[j]) == false)
        {
          result = false;
          break;
        }
      }

      i ++;
    }
    
    return result;
  }

  @Override
  public Edge[] getConnectedEdges(Vertex vertex)
  {
    int i = 0;
    Edge[] result;

    if(edgeKind == EdgeKind.directed) { result = new DirectedEdge[nbOfEdges()]; }
    else { result = new UndirectedEdge[nbOfEdges()]; }

    int id_vertex = vertex.getId();

    for(int j = 0; j < nbOfEdges(); j ++)
    {
      if(tab_edges[j] != null)
      {
        if(tab_edges[j].getEnds()[0] == vertex || tab_edges[j].getEnds()[1] == vertex)
        {
          result[i] = tab_edges[j];
          
          i ++;
        }
      }
    }
    
    result = reorderEdge(result);
    return result;
  }

  /*
  public String toString()
  { 
    String result;

    for(Vertex v : tab_vertices)
    {
      result = result + "Vertex n° " + v.getId() + " [ ";

      for(int i = 0; i < nbOfEdges(); i ++)
      {
        result = result + "[Vertex " + tab_edges[i].getEnds()[0].getId() + "," + tab_edges[i].getEnds()[1].getId() + "],";
      }

      result = result + "[" + tab_edges[i].getEnds()[0].getId() + "," + tab_edges[i].getEnds()[1].getId() + "] ]";
    } 
  
    return "Voici votre tableau d'incidence : \n" + result + "\n";
  }
  */





  public String toString()
  { 
    String result = "";

    Edge[] tab_edges_of_the_vertex;

    for(Vertex v : tab_vertices)
    {
      result = result + "V" + v.getId() + " -> ";

      tab_edges_of_the_vertex = getConnectedEdges(v);

      for(int i = 0; i < tab_edges_of_the_vertex.length - 1; i ++)
      {
        result = result + "Edge " + tab_edges_of_the_vertex[i].getId() + " : [V" + tab_edges_of_the_vertex[i].getEnds()[0].getId() + ", V" + tab_edges_of_the_vertex[i].getEnds()[1].getId() + "], ";
      }

      result = result + "Edge " + tab_edges_of_the_vertex[tab_edges_of_the_vertex.length - 1].getId() + " : [V" + tab_edges_of_the_vertex[tab_edges_of_the_vertex.length - 1].getEnds()[0].getId() + ", V" + tab_edges_of_the_vertex[tab_edges_of_the_vertex.length - 1].getEnds()[1].getId() + "] \n";
    }

    return result;
  }
}

