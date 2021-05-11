package graph;

import graph.*;

public class DirectedEdge extends Edge
{
  private int source;

  public DirectedEdge(double value, Vertex v0, Vertex v1, int source) throws IllegalArgumentException
  {
    super(value, v0, v1);
    if(source != 0 && source != 1) { throw new IllegalArgumentException("Erreur: l'indice de la source ne peut qu'être 0 ou 1. \n"); }
    this.source = source;
  }

  public DirectedEdge(Vertex v0, Vertex v1, int source) throws IllegalArgumentException
  {
    super(v0, v1);
    if(source != 0 && source != 1) { throw new IllegalArgumentException("Erreur: l'indice de la source ne peut qu'être 0 ou 1. \n"); }
    this.source = source;
  }

  public Vertex getSource() 
  {
    return getEnds()[source];
  }
  
  public Vertex getSink()
  { 
    if(source == 1) { return getEnds()[0]; }
    else { return getEnds()[1]; }
  }

  public int getSourceIndex() { return source; }

  public void setSource(int source) throws IllegalArgumentException 
  {
    if(source != 0 && source != 1) { throw new IllegalArgumentException("Erreur: l'indice de la source ne peut qu'être 0 ou 1."); }

    this.source = source;
  }

  @Override
  public String toString()
  {
    int source = this.source;
    int fin;

    if(source == 1) { fin = 0; }
    else { fin = 1; }

    return "Une transition orientée a été créée. Ses caractéristiques sont :\nId : " + this.getId() + "\nColor : " + this.getColor() + "\nValue : " + this.getValue() + "\nSource id : " + source + "\nIl relie le vertex " + this.getEnds()[source].getId() + " au vertex " + this.getEnds()[fin].getId() + "\n";
  }
}