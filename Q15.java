abstract class AbstractClass 
{
  public abstract void AbstractMethod();
  
  public void NonAbstractMethod() {
    System.out.println("Currently in Non Abstract Method.");
  }
}

class Demo extends AbstractClass 
{
  public void AbstractMethod() {
    System.out.println("Currently in Abstract Method.");
  }
}

class Q15 
{
  public static void main(String[] args) 
  {
    Demo obj = new Demo();
    obj.AbstractMethod();
    obj.NonAbstractMethod();
  }
}