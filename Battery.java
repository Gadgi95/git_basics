public class Battery {
  private boolean battery;
  private int batteryVolume;
  private int batteryLevel;
  private int maxBatteryLevel = 100;
  private int minBatteryLevel = 0;


  public Battery(boolean battary) {
    this.battery = battary;
  }

  public Battery(boolean battary, int batteryVolume, int batteryLevel) {
    this.battery = battary;
    this.batteryVolume = batteryVolume;
    this.batteryLevel = batteryLevel;
  }

  public boolean isBattery() {
    return battery;
  }

  public void setBattery(boolean battery) {
    this.battery = battery;
  }

  public int getBatteryVolume() {
    return batteryVolume;
  }

  public void setBatteryVolume(int batteryVolume) {
    this.batteryVolume = batteryVolume;
  }

  public int getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(int batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public int getMinBatteryLevel() {
    return minBatteryLevel;
  }

  public int getMaxBatteryLevel() {
    return maxBatteryLevel;
  }

  public void printInfoBattery() {
    System.out.println("Battery level: "  + getBatteryLevel() + "%");
  }

  public int chargingBattery(int getBatteryLevel) {
    while (getBatteryLevel < getMaxBatteryLevel()) {
      System.out.println("Уровень заряда батареи " + getBatteryLevel + "%");
      System.out.println("Время заряда батареи до 100% " + (100 - getBatteryLevel));
      getBatteryLevel++;
    }
    return getBatteryLevel;
  }
  //При включении наушников должен срабатывать метод разрядки аккума
  public void discharge(int getBatteryLevel, int getMinBatteryLevel) {
    if (getBatteryLevel == getMinBatteryLevel) {
      System.out.println("Battery level low");

    }

//    public void print() {
//      System.out.println(this);
//    }
//    public String toString() {
//      return text = String.format( "Бренд: %s, Модель: %s\nАккум: %s\nКейс: %s\nTryWireless: %s\n"
//              + "Микрофон: %s\nГолосовой помощник: %s", getNameTM(), getModel(), getBattery(), getCases(),
//          getTryWireless(), isMicrophone(), getVoiceAssistance());
//    }


    //while (getBatteryLevel > getMinBatteryLevel ) {
      //getBatteryLevel--;
      //Сделать разрядку аккума на 7% каждый час
      //Если включено шумоподавление +2%
      //Каждая голосовая комманда ассистенту +0,2%
      //Громкость при 50% формула не меняется(ниже громкость ниже расход и наоборот)
    //}
  }
}
