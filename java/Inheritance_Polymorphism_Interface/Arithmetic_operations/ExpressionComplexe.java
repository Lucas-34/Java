package Inheritance_Polymorphism_Interface.Arithmetic_operations;

public class ExpressionComplexe extends Expression
{
  private Expression e1, e2;
  private char operateur;

  public ExpressionComplexe(Expression operande1, char operateur, Expression operande2) throws Exception
  {
    if(operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/') { throw new Exception("Erreur: l'opérateur arithmétique ne peut qu'être +, -, * ou /."); }

    e1 = operande1;
    this.operateur = operateur;
    e2 = operande2;
  }

  /*
  public Expression getExpression1() { return e1; }
  public void setExpression1(Expression e1) { this.e1 = e1; }

  public Expression getExpression2() { return e2; }
  public void setExpression2(Expression e2) { this.e2 = e2; }
   */

  public char getOperateur() { return operateur; }
  public void setOperateur(char operateur) { this.operateur = operateur; }

  @Override
  public double Eval() throws Exception
  {
    switch(operateur)
    {
      case '+':
        return e1.Eval() + e2.Eval();
      case '-':
        return e1.Eval() - e2.Eval();
      case '*':
        return e1.Eval() * e2.Eval();
      case '/':
        if(e2.Eval() == 0) { throw new Exception("Erreur: le dénominateur doit être non-nul."); }
        return e1.Eval() / e2.Eval();
      default:
        throw new Exception("ERREUR");
    }
  }
}