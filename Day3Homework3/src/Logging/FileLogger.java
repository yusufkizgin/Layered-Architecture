package Logging;

public class FileLogger extends Logger implements ILogger{

    @Override
    public void log(String data) {
        System.out.println("Dosyaya Loglandı "+ data);
    }
}
