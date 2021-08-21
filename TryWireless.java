public class TryWireless {

  private boolean tryWireless;
  private boolean bluetooth; //Возможно потребуется создать enum с перечислением bluetooth 3, 4, 5
  private boolean wifi;

  public TryWireless(boolean tryWireless) {
    this.tryWireless = tryWireless;
  }

  public TryWireless(boolean tryWireless, boolean bluetooth) {
    this.tryWireless = tryWireless;
    this.bluetooth = bluetooth;
  }

  public TryWireless(boolean tryWireless, boolean bluetooth, boolean wifi) {
    this.tryWireless = tryWireless;
    this.bluetooth = bluetooth;
    this.wifi = wifi;
  }

  public boolean isTryWireless() {
    return tryWireless;
  }

  public void setTryWireless(boolean tryWireless) {
    this.tryWireless = tryWireless;
  }

  public boolean isBluetooth() {
    return bluetooth;
  }

  public void setBluetooth(boolean bluetooth) {
    this.bluetooth = bluetooth;
  }

  public boolean isWifi() {
    return wifi;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
  }
}

//  public void print() {
//    System.out.println(this);
//  }
//  public String toString() {
//    return text = String.format( "Бренд: %s, Модель: %s\nАккум: %s\nКейс: %s\nTryWireless: %s\n"
//            + "Микрофон: %s\nГолосовой помощник: %s", getNameTM(), getModel(), getBattery(), getCases(),
//        getTryWireless(), isMicrophone(), getVoiceAssistance());
//  }

