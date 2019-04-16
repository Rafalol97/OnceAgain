import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String [] args){
        StartFrame oknoStartowe=new StartFrame(main.getImage(),100,2);
        oknoStartowe.setMenu();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oknoStartowe.setVisible(false);
        oknoStartowe.exit();
        Window okno=new Window(main.getImage(),400,2);
        okno.setMenu();
    }


    public static BufferedImage getImage( ){
        String path="C:\\Users\\Rafał Cichosz\\Pictures\\em.png";
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
