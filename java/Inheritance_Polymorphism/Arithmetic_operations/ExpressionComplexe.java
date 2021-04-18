public class ExpressionComplexe
{
  private Constante constante1, constante2;
  private char operateur;

  public ExpressionComplexe(Constante operande1, char operateur, Constante operande2)
  {
    if(operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/') { throw new Exception("Erreur: l'opérateur arithmétique ne peut qu'être +, -, * ou /."); }

    constante1 = operande1;
    this.operateur = operateur;
    constante2 = operande2;
  }

  public Constante getConstante1() { return constante1; }
  public void setConstante1(Constante constante1) { this.constante1 = constante1; }

  public Constante getConstante2() { return constante2; }
  public void setConstante2(Constante constante2) { this.constante2 = constante2; }

  public char getOperateur() { return operateur; }
  public void setOperateur(char operateur) { this.operateur = operateur; }

  public double Eval()
  {
    switch(operateur)
    {
      case '+':
        return constante1.getConstante() + constante2.getConstante();
      case '-':
        return constante1.getConstante() - constante2.getConstante();
      case '*':
        return constante1.getConstante() * constante2.getConstante();
      case '/':
        if(constante2.getConstante() == 0) { throw new Exception("Erreur: le dénominateur doit être non-nul."); }
        return constante1.getConstante() / constante2.getConstante();
      default:
        System.out.println("ERREUR");
        break;
    }
  }
}