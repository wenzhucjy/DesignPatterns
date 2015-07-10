package cn.wenzhu.designpattern.proxy;
/**
 * ����: Proxy.java<br>
 * ����: ����ģʽ������<br>
 * ����: JAVA<br>
 * @since  2015��4��1��
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
