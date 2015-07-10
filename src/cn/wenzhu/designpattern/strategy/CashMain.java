package cn.wenzhu.designpattern.strategy;

public class CashMain {

  /**
   * @lincoln liu
   */
  public static void main(String[] args) {
    double price = 100.0;
    double num = 10;
    String type = "normal";
    
    CashContext cc = new CashContext(type);
    
  
    System.out.print(cc.getCash(price*num));
  }

}
