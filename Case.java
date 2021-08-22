public class Case {
  private boolean cases;
  private Battery battery; //Добавляем всю информация про аккум, уровень заряда батареи и т.д.
  private boolean charging;
  private String text;

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

  public void chargingHeadphones() {
  //Кейс заряжает наушники и в то же время разряжается
  }
  public void chargingIndicator() {
    //Если наушники заряжаются индикатор горит крассным (до 45%), желтым (от 46 до 75%) или зеленым (от 76%)
  }

  public void print() {
    System.out.println(this);
  }
  public String toString() {
    return text = String.format( "%s\nАккум кейса: %s\nЗаряжает наушники: %s",
        isCases(), getBattery(), isCharging());
  }


  //if(charging = true) {
    //getBattaryLevel -= Headphones.getBattaryLevel;
    //Расчитать объем зарядки кейса - заряд потраченный на наушники, вывести
    //sout(уровень заряда кейса)
    //Продумать скорость зарядки для указания индикатора батареи

}
