package Logging;

public class DataBaseLogger extends Logger implements ILogger{

    @Override
    public void log(String data) {
        System.out.println("Veritabanına Loglandı "+ data);
    }
}
