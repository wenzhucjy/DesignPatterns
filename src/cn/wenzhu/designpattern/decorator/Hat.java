package cn.wenzhu.designpattern.decorator;
/**
 * ����: Hat.java<br>
 * ����: <br>
 * ����: JAVA<br>
 * @since  2015��7��10��
 * @author jy.chen
 */
public class Hat extends Finery {

  @Override
  public void show(){
    System.out.print(" red hat ");
    super.show();
  }
}
