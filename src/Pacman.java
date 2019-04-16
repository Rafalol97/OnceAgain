import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Pacman{
    public static void main(String [] args){
        StartFrame oknoStartowe=new StartFrame(Pacman.getImage(),100,2);
        oknoStartowe.setMenu();
        sleep(5);
        oknoStartowe.setVisible(false);
        oknoStartowe.exit();
        Window okno=new Window(Pacman.getImage(),400,2);
        okno.setMenu();
    }

    static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static BufferedImage getImage( ){
        String path="./images/em.png";
        BufferedImage image= null;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.err.println("Błąd ładowania obrazka");
            e.printStackTrace();
        }
        return image;
    }
}
