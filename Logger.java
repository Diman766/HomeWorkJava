import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logger {
    public static void writer(Toy winer) {
        Path path = Paths.get("WinBase.txt");
        String text = winer.getInfo() + "\n";

        try {
            Files.write(path,
                    text.getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
