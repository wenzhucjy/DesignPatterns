package cn.wenzhu.designpattern.decorator;
/**
 * 名称: Hat.java<br>
 * 描述: <br>
 * 类型: JAVA<br>
 * @since  2015年7月10日
 * @author jy.chen
 */
public class Hat extends Finery {

  @Override
  public void show(){
    System.out.print(" red hat ");
    super.show();
  }
}
