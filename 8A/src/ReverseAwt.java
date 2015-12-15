import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseAwt extends Applet implements ActionListener {
	TextField tf;
	Button b;
	@Override
	public void init() {
		tf = new TextField(5);
		b = new Button("Reverse");
		add(tf);
		add(b);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuilder bs = new StringBuilder(tf.getText());
		bs.reverse();
		showStatus(bs.toString());
	}
}
