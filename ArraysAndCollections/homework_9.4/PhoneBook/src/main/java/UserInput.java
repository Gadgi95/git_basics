import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {


  public static String getLine() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String userInput = reader.readLine();
    return userInput;

  }
}