package cn.wenzhu.designpattern.decorator;
/**
 * 名称: DecoraterMain.java<br>
 * 描述: 装饰器模式,打扮<br>
 * 语言: JAVA<br>
 * @since  2015年4月1日
 * @author jy.chen
 */
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
