public class VoiceAssistance {
  private boolean voiceAssistance;
  private String assistanceName;
  private String command;
  private String text;

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

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public void print() {
    System.out.println(this);
  }
  public String toString() {
    return text = String.format( "%s\nИмя голосового помощника: %s\nСписок комманд: %s",
        isVoiceAssistance(), getAssistanceName(), getCommand());
  }

  //Добавить список комманд, которые можно вводить.

}
