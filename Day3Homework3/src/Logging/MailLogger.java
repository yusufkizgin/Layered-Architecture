package Logging;

public class MailLogger extends Logger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Maile Loglandı "+ data);
    }
}
