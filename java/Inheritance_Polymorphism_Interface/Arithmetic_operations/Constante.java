package Inheritance_Polymorphism_Interface.Arithmetic_operations;

public class Constante extends Expression
{
  private final double constante;

  public Constante(double constante) { this.constante = constante; }

  @Override
  public double Eval() { return constante; }
}