package cn.wenzhu.designpattern.proxy;
/**
 * 名称: Proxy.java<br>
 * 描述: 代理模式，送礼<br>
 * 语言: JAVA<br>
 * @since  2015年4月1日
 * @author jy.chen
 */
public class Proxy implements GiveGift {
  Pursuit gg;

  public Proxy(SchoolGirl mm) {
    this.gg = new Pursuit(mm);
  }

  public void giveChocolate() {
    gg.giveChocolate();
  }

  public void giveDolls() {
    gg.giveDolls();
  }

  public void giveFlowers() {
    gg.giveFlowers();
  }

}
