public class VoiceAssistance {
  private boolean voiceAssistance;
  private String assistanceName;

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
}
