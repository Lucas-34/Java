package src.company;

public class Accountant extends Employee
{
  private String serviceName;

  public Accountant(serviceName) { this.serviceName = serviceName; }
  
  public String getServiceName() { return serviceName; }
  public void setServiceName(String serviceName) { this.serviceName = serviceName; }
}