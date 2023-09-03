package Base.Lesson2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class log {
    public static void main(String[] args) throws IOException {
        Logger fl = Logger.getLogger(log.class.getName());
        String logpath = "Lesson2/log.txt";
        String msg = "test";
        FileHandler fh = new FileHandler(logpath, true);
        fl.addHandler(fh);
        SimpleFormatter form = new SimpleFormatter();
        // XMLFormatter form = new XMLFormatter();
        fh.setFormatter(form);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int j = rand.nextInt(10);
            fl.log(Level.INFO, "Element: " + j);
        }
        fl.log(Level.WARNING, "logger off");
        fl.info(msg);
        fl.warning(logpath);
    
    }
}
    
