package cn.wenzhu.designpattern.decorator;

public class DecoraterMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Person lin = new Person("Lincoln");
    System.out.println("The first show:");

    Sneaker s = new Sneaker();
    Hat h = new Hat();
    TShirt t = new TShirt();
    
    s.decorate(lin);
    h.decorate(s);
    t.decorate(h);
    t.show();
    
    System.out.println("The second show:");

    
    h.decorate(lin);
    t.decorate(h);
    s.decorate(t);
    s.show();
  }

}
