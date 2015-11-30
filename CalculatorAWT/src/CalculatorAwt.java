import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorAwt extends Applet implements KeyListener {
	TextField number1TextField;
	TextField number2TextField;
	TextField operation;
	@Override
	public void init() {
		number1TextField = new TextField(10);
		number2TextField = new TextField(10);
		add(number1TextField);
		add(number2TextField);
		operation = new TextField(2);
		operation.addKeyListener(this);
		add(operation);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Hello");
		int number1;
		int number2;
		int answer = 0;
		switch (e.getKeyChar()) {
		case 'a':
			number1 = Integer.parseInt(number1TextField.getText());
			number2 = Integer.parseInt(number2TextField.getText());
			answer = number1 + number2;
			break;
		case 's':
			number1 = Integer.parseInt(number1TextField.getText());
			number2 = Integer.parseInt(number2TextField.getText());
			answer = number1 - number2;
			break;
		case 'd':
			number1 = Integer.parseInt(number1TextField.getText());
			number2 = Integer.parseInt(number2TextField.getText());
			answer = number1 / number2;
			break;
		case 'm':
			number1 = Integer.parseInt(number1TextField.getText());
			number2 = Integer.parseInt(number2TextField.getText());
			answer = number1 * number2;
			break;
		default:
			return;
		}
		displayAnswer(answer);
	}

	public void displayAnswer(int answer) {
		getGraphics().clearRect(0, 0, 200, 200);
		String answerString = answer + "";
		getGraphics().drawString(answerString, 100, 100);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}