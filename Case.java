public class Case {
  private boolean cases;
  private Battery battery; //Добавляем всю информация про аккум, уровень заряда батареи и т.д.
  private boolean charging;

  public Case(boolean cases) {
    this.cases = cases;
  }

  public Case(boolean cases, Battery battery) {
    this.cases = cases;
    this.battery = battery;
  }

  public Case(boolean cases, Battery battery, boolean charging) {
    this.cases = cases;
    this.battery = battery;
    this.charging = charging;
  }

  public boolean isCases() {
    return cases;
  }

  public void setCases(boolean cases) {
    this.cases = cases;
  }

  public Battery getBattery() {
    return battery;
  }

  public void setBattery(Battery battery) {
    this.battery = battery;
  }

  public boolean isCharging() {
    return charging;
  }

  public void setCharging(boolean charging) {
    this.charging = charging;
  }

  //if(charging = true) {
    //getBattaryLevel -= Headphones.getBattaryLevel;
    //Расчитать объем зарядки кейса - заряд потраченный на наушники, вывести
    //sout(уровень заряда кейса)
    //Продумать скорость зарядки для указания индикатора батареи

}
