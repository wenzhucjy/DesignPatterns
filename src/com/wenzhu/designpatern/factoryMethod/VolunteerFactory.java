package com.wenzhu.designpatern.factoryMethod;

public class VolunteerFactory implements IFactory {

  public LeiFeng createLeiFeng() {
    return new Volunteer();
  }

}
