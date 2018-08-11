import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ChessFrame extends JFrame{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 830;
	public ChessFrame() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mpanel = new Display();
		this.add(mpanel);
		
		this.setVisible(true);
		this.setTitle("Chess AI");
	}
	
	static class Display extends JPanel{
		private static final long serialVersionUID = 1L;
		private static final int size = 100;
		
		public Display() {
			setLayout(null);
			/*try {
				image = ImageIO.read(new File());
			} catch (IOException ex) {
				System.out.println("IO Exception, Exit Program");
			}*/
			addbuttons();
		}
		
		private void addbuttons() {
			JButton button_start_first = new JButton("Start as Black");
			button_start_first.setBounds(850, 50, 120, 30);
			JButton button_start_Second = new JButton("Start as White");
			button_start_Second.setBounds(850, 100, 120, 30);
			JButton button_Undo = new JButton("Undo");
			button_Undo.setBounds(850, 150, 120, 30);
			this.add(button_start_first);
			this.add(button_start_Second);
			this.add(button_Undo);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.WHITE);
			g.setColor(Color.GRAY);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if ((i+j)%2 == 1)
						continue;
					g.fillRect(i*size, j*size, size, size);
				}
			}
		}
	}
}
