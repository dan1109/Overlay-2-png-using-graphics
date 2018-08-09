import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final int B_WIDTH = 500;
    private final int B_HEIGHT = 450;

    private Image star;
    private Image back;
    private int x, y;

    public Board() throws InterruptedException {

        initBoard();
    }

    private void loadBack() {

        ImageIcon ii = new ImageIcon("resources\\1.png");
        back = ii.getImage();
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("resources\\2.png");
        star = ii.getImage();
    }

    /**
     * The true function visible in main
     * @throws InterruptedException
     */
    private void initBoard() throws InterruptedException {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setDoubleBuffered(true);

        loadBack();
        loadImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        drawStar(g);
    }

    private void drawBackground(Graphics g) {
        g.drawImage(back, x, y, this);
        //Toolkit.getDefaultToolkit().sync();
    }

    private void drawStar(Graphics g) {

        g.drawImage(star, x, y, this);
        Toolkit.getDefaultToolkit().sync();
    }
}