import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class StartFrame extends Canvas {
    private JFrame ramka;
    private  int ScreenWidth;
    private  int ScreenHeight;
    private  int MultiplicationSize;
    private Image image;
    public StartFrame(Image image, int Height, int SizeM) {
        this.MultiplicationSize = SizeM;
        this.ScreenHeight = Height * this.MultiplicationSize;
        this.ScreenWidth = this.MultiplicationSize * this.ScreenHeight * (16 / 9);
        this.image=image;
    }


    public StartFrame(GraphicsConfiguration config, JFrame ramka) {
        super(config);
        this.ramka = ramka;
    }
    public void setMenu(){
        ramka=new JFrame("SSD");
        ramka.setIconImage(image);
        ramka.setUndecorated(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setPreferredSize(new Dimension(this.ScreenWidth,this.ScreenHeight));
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        ramka.pack();
        ramka.setLocationRelativeTo(null);
        ramka.setResizable(false);
        ramka.setVisible(true);
    }
    public JFrame getRamka() {
        return ramka;
    }

    public  int getScreenHeight() {
        return ScreenHeight;
    }

    public  int getScreenWidth() {
        return ScreenWidth;
    }

    public  int getMultiplicationSize() {
        return MultiplicationSize;
    }
    public void exit(){
        ramka.dispose();
    }


}
