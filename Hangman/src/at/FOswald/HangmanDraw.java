package at.FOswald;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class HangmanDraw extends JLabel {

	
	public void fail1(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		repaint();
		
	}


	public void fail2(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		repaint();

	}

	public void fail3(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		repaint();

	}

	public void fail4(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		repaint();

	}

	public void fail5(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		repaint();

	}

	public void fail6(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		repaint();

	}

	public void fail7(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		repaint();

	}

	public void fail8(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		// legs
		g2d.drawLine(730, 200, 705, 225);
		repaint();

	}

	public void fail9(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		// legs
		g2d.drawLine(730, 200, 705, 225);
		g2d.drawLine(730, 200, 755, 225);
		repaint();

	}

	public void fail10(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		// legs
		g2d.drawLine(730, 200, 705, 225);
		g2d.drawLine(730, 200, 755, 225);
		// arms
		g2d.drawLine(730, 170, 705, 195);
		repaint();

	}

	public void fail11(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		// legs
		g2d.drawLine(730, 200, 705, 225);
		g2d.drawLine(730, 200, 755, 225);
		// arms
		g2d.drawLine(730, 170, 705, 195);
		g2d.drawLine(730, 170, 755, 195);
		repaint();

	}

	public void fail12(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.black);
		// gibbet
		g2d.drawLine(560, 300, 830, 300);
		g2d.drawLine(580, 100, 580, 300);
		g2d.drawLine(580, 100, 730, 100);
		g2d.drawLine(580, 170, 650, 100);
		g2d.drawLine(730, 100, 730, 130);
		// head
		g.drawRoundRect(715, 130, 30, 30, 100, 100);
		// body
		g2d.drawLine(730, 160, 730, 200);
		// legs
		g2d.drawLine(730, 200, 705, 225);
		g2d.drawLine(730, 200, 755, 225);
		// arms
		g2d.drawLine(730, 170, 705, 195);
		g2d.drawLine(730, 170, 755, 195);
		// lose
		g.drawString("e n j o y   h a n g i n g", 680, 275);
		repaint();
	}
	
	public void cleanDraw(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		
		g2d.clearRect(530, 10, 335, 312);
		
	}

}