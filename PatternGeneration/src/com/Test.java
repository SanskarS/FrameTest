package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Test extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		ApplicationFrame af = new ApplicationFrame("Test v1.0");
		af.setLayout(new BorderLayout());
		af.setSize(600, 400);
		af.center();
		af.setResizable(true);

		Test t1 = new Test();
		af.add(t1, BorderLayout.CENTER);
		af.setVisible(true);
	}

	public void paint(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.BLUE);

		pattern1(g2, 0, 0, 1);

		pattern1(g2, 200, 50, 2);

	}

	private void pattern1(Graphics2D g2, int a, int b, int c) {

		g2.drawLine(a + 50, 50, a + 50, 125);
		g2.drawLine(a + 150, 50, a + 150, 125);

		g2.drawLine(a + 40, 40, a + 40, 135);
		g2.drawLine(a + 160, 40, a + 160, 135);

		if (c == 1) {

			g2.drawLine(a + 50, 50, a + 150, 50);
			g2.drawLine(a + 40, 40, a + 160, 40);

			g2.drawLine(a + 50, 125, a + 80, 125);
			g2.drawLine(a + 120, 125, a + 150, 125);

			g2.drawLine(a + 40, 135, a + 80, 135);
			g2.drawLine(a + 120, 135, a + 160, 135);
			bow(g2, 0, -3);

		}

		else if (c == 2) {
			g2.drawLine(a + 85, 50, a + 150, 50);
			g2.drawLine(a + 85, 40, a + 160, 40);

			g2.drawLine(a + 50, 125, a + 150, 125);
			// g2.drawLine(a + 120, 125, a + 150, 125);

			g2.drawLine(a + 40, 135, a + 160, 135);
			// g2.drawLine(a + 120, 135, a + 160, 135);

			g2.drawString("*           *", a + 44, b - 8);

			bow(g2, 165, -95);

		}

		g2.drawLine(a + 60, 135, a + 60, 145);
		g2.drawLine(a + 140, 135, a + 140, 145);

		g2.drawLine(a + 50, 145, a + 150, 145);

		g2.drawLine(a + 50, 145, a + 35, 165);
		g2.drawLine(a + 150, 145, a + 165, 165);

		g2.drawLine(a + 35, 165, a + 165, 165);

		/*
		 * g2.drawRect(50, 50, 100, 75); g2.drawRect(40, 40, 120, 90);
		 */
		g2.drawString(" 0          0", a + 75, 75);
		g2.drawString(" - ", a + 95, 100);
		g2.drawString("\\____/ ", a + 83, 110);
		g2.drawString("******************", a + 55, 157);
		g2.drawString("********************", a + 50, 164);

		g2.drawString("..................................", 150, 145);


	}

	private void bow(Graphics2D g2, int a, int b) {
		g2.drawLine(a + 80, b + 130, a + 80, b + 145);
		g2.drawLine(a + 120, b + 130, a + 120, b + 145);

		g2.drawLine(a + 80, b + 130, a + 94, b + 136);
		g2.drawLine(a + 120, b + 130, a + 106, b + 136);

		g2.drawLine(a + 80, b + 145, a + 94, b + 139);
		g2.drawLine(a + 120, b + 145, a + 106, b + 139);

		g2.drawLine(a + 94, b + 136, a + 106, b + 136);
		g2.drawLine(a + 94, b + 139, a + 106, b + 139);

	}

}
