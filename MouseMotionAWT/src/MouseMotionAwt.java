import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAwt extends Applet {
	@Override
	public void init() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				showStatus("X: " + e.getX() + " Y: " + e.getY());
			}
		});
	}
}
