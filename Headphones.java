public class Headphones {
  private String name;
  private BattaryLevel batteryLevel;
  private boolean noiseSuppression;
  private boolean tryWirelles;

  public Headphones(String name, int batteryLevel, boolean noiseSuppression, boolean tryWirelles) {
    this.name = name;
    BattaryLevel battaryLevel = new BattaryLevel();
    this.noiseSuppression = noiseSuppression;
    this.tryWirelles = tryWirelles;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(int batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public boolean isNoiseSuppression() {
    return noiseSuppression;
  }

  public void setNoiseSuppression(boolean noiseSuppression) {
    this.noiseSuppression = noiseSuppression;
  }

  public boolean isTryWirelles() {
    return tryWirelles;
  }

  public void setTryWirelles(boolean tryWirelles) {
    this.tryWirelles = tryWirelles;
  }
}
