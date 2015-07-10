package cn.wenzhu.designpattern.strategy;

/**
 * 
 * 名称: CashContext.java<br>
 * 描述: 策略模式，商城打折<br>
 * 语言: JAVA<br>
 * @since  2015年4月1日
 * @author jy.chen
 */
public class CashContext {
    private CashSuper cs;
    
    public CashContext(String type){
      if(type.equals("normal")){
        this.cs = new CashNormal();
      }else if(type.equals("debate")){
        this.cs = new CashRebate(8.0);
      }else{
        this.cs = new CashReturn(300.0,100.0);
      }
    }
    
    public CashSuper getCs() {
      return cs;
    }

    public void setCs(CashSuper cs) {
      this.cs = cs;
    }

    public double getCash(double money){
      return this.cs.acceptCash(money);
    }
}
