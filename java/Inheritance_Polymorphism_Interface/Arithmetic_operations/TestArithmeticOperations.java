package Inheritance_Polymorphism_Interface.Arithmetic_operations;

public class TestArithmeticOperations
{
  public static void main(String[] args) throws Exception
  {
    Constante a = new Constante(5);
    Constante b = new Constante(2);
    Constante c = new Constante(3);

    ExpressionComplexe e1 = new ExpressionComplexe(a, '+', b);
    ExpressionComplexe e2 = new ExpressionComplexe(e1, '*', c);
    ExpressionComplexe e3 = new ExpressionComplexe(new Constante(4), '*', e2);

    System.out.println(a.Eval());
    System.out.println(e1.Eval());
    System.out.println(e2.Eval());
    System.out.println(e3.Eval());
  }
}