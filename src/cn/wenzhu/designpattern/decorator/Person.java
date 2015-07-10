package cn.wenzhu.designpattern.decorator;
/**
 * 名称: Person.java<br>
 * 描述: <br>
 * 类型: JAVA<br>
 * @since  2015年7月10日
 * @author jy.chen
 */
public class Person {

  private String name;
  public Person(){
  }
  public Person(String name){
    this.name = name;
  }

  public void show(){
    System.out.println(" decorated guy "+this.name);
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
