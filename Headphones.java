public class Headphones {
  private String nameTM;
  private String model;
  private Battery battery;
  private Case cases;
  private TryWireless tryWireless;
  private boolean microphone;
  private VoiceAssistance voiceAssistance;

  public Headphones(String nameTM, String model, Battery battery, Case cases,
      TryWireless tryWireless,
      boolean microphone, VoiceAssistance voiceAssistance) {
    this.nameTM = nameTM;
    this.model = model;
    this.battery = battery;
    this.cases = cases;
    this.tryWireless = tryWireless;
    this.microphone = microphone;
    this.voiceAssistance = voiceAssistance;
  }

  public String getNameTM() {
    return nameTM;
  }

  public void setNameTM(String nameTM) {
    this.nameTM = nameTM;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Battery getBattery() {
    return battery;
  }

  public void setBattery(Battery battery) {
    this.battery = battery;
  }

  public Case getCases() {
    return cases;
  }

  public void setCases(Case cases) {
    this.cases = cases;
  }

  public TryWireless getTryWireless() {
    return tryWireless;
  }

  public void setTryWireless(TryWireless tryWireless) {
    this.tryWireless = tryWireless;
  }

  public boolean isMicrophone() {
    return microphone;
  }

  public void setMicrophone(boolean microphone) {
    this.microphone = microphone;
  }

  public VoiceAssistance getVoiceAssistance() {
    return voiceAssistance;
  }

  public void setVoiceAssistance(VoiceAssistance voiceAssistance) {
    this.voiceAssistance = voiceAssistance;
  }
}
