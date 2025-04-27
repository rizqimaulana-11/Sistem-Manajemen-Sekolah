package tampilan;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BGHalamanMenu extends JPanel {
    private Image image;
    
    public BGHalamanMenu() {
        image = new ImageIcon(getClass().getResource("/Gambar/background-welcome.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        g2d.dispose();
    }
}
