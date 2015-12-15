import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonsAwt extends Applet implements ActionListener {
	Button redButton, yellowButton, blueButton, orangeButton, blackButton, pinkButton;
	@Override
	public void init() {
		redButton = new Button("Red");
		yellowButton = new Button("Yellow");
		blueButton = new Button("Blue");
		orangeButton = new Button("Orange");
		blackButton = new Button("Black");
		pinkButton = new Button("Pink");
		add(redButton);
		add(yellowButton);
		add(blueButton);
		add(orangeButton);
		add(blackButton);
		add(pinkButton);
		redButton.addActionListener(this);
		yellowButton.addActionListener(this);
		blueButton.addActionListener(this);
		orangeButton.addActionListener(this);
		blackButton.addActionListener(this);
		pinkButton.addActionListener(this);

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == redButton) {
			setBackground(Color.RED);
		}
		else if (e.getSource() == yellowButton) {
			setBackground(Color.YELLOW);
		}
		else if (e.getSource() == blueButton) {
			setBackground(Color.BLUE);
		}
		else if (e.getSource() == orangeButton) {
			setBackground(Color.ORANGE);
		}
		else if (e.getSource() == blackButton) {
			setBackground(Color.BLACK);
		}
		else if (e.getSource() == pinkButton) {
			setBackground(Color.PINK);
		}
	}
	
}
