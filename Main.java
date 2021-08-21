public class Main {

  public static void main(String[] args) {

    Headphones headphones = new Headphones(
        "Sony",
        "wf-1000x",
        new Battery(true, 460, 100),
        new Case(true, new Battery(true, 1250, 95)),
        new TryWireless(true, true),
        false,
        new VoiceAssistance(true, "Alisa"));

    headphones.print();


  }

}
