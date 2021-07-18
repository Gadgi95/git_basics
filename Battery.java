public class Battery {
  private boolean battery;
  private int batteryVolume;
  private int batteryLevel;

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
    int minBatteryLevel = 0;
    return minBatteryLevel;
  }

  public int getMaxBatteryLevel() {
    int maxBatteryLevel = 100;
    return maxBatteryLevel;
  }

  public void printInfoBattery() {
    //System.out.println("Battery level: "  + getBatteryLevel + "%");
  }
}
