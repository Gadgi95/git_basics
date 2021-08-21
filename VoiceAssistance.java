public class VoiceAssistance {
  private boolean voiceAssistance;
  private String assistanceName;
  private String command;

  public VoiceAssistance(boolean voiceAssistance) {
    this.voiceAssistance = voiceAssistance;
  }

  public VoiceAssistance(boolean voiceAssistance, String assistanceName) {
    this.voiceAssistance = voiceAssistance;
    this.assistanceName = assistanceName;
  }

  public boolean isVoiceAssistance() {
    return voiceAssistance;
  }

  public void setVoiceAssistance(boolean voiceAssistance) {
    this.voiceAssistance = voiceAssistance;
  }

  public String getAssistanceName() {
    return assistanceName;
  }

  public void setAssistanceName(String assistanceName) {
    this.assistanceName = assistanceName;
  }

//  public void print() {
//    System.out.println(this);
//  }
//  public String toString() {
//    return text = String.format( "Бренд: %s, Модель: %s\nАккум: %s\nКейс: %s\nTryWireless: %s\n"
//            + "Микрофон: %s\nГолосовой помощник: %s", getNameTM(), getModel(), getBattery(), getCases(),
//        getTryWireless(), isMicrophone(), getVoiceAssistance());
//  }

}
