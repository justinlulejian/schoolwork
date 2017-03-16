package week1;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL(
				"https://i.ytimg.com/vi/twTUAGjG2oM/hqdefault.jpg");
		JOptionPane.showMessageDialog(null, "whooaaaaaaa", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}

}
