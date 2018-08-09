import javax.swing.JFrame;

public class SwingTimerEx extends JFrame {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SwingTimerEx() throws InterruptedException {

        initUI();
    }

    private void initUI() throws InterruptedException {

        add(new Board());

        setResizable(true);
        pack();

        setTitle("Overlay Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws InterruptedException {

            SwingTimerEx ex = new SwingTimerEx();
            ex.setVisible(true);
    }
}