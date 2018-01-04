import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
class PrintTela {
    public static void main(String[] args) {
        try {	
            Robot robot = new Robot();
            String format = "png";
            String fileName = "PrintScreenshot." + format;
	    
	    /*configurando o tamanho da tela
    	    int x = 100;
    	    int y = 100;
            int width = 200;
            int height = 200;
            Rectangle telaDesktop = new Rectangle(x, y, width, height);
            */

	    //capiturando o tamanho da tela
            Rectangle telaDesktop = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	    //
		
            BufferedImage screenFullImage = robot.createScreenCapture(telaDesktop);
            ImageIO.write(screenFullImage, format, new File(fileName));
             
            System.out.println("Imagem salva!!!");

        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}
