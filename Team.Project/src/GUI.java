import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { "Backspace", "", "C", "/",  "7", "8", "9", "x", "4", "5", "6",  "-",
			"1", "2", "3", "+", "0", "00", ".", "="};

	public GUI() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);

		panel.setLayout(new GridLayout(5, 5, 2, 2));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 4; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 5)
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}

		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}

	public static void main(String args[]) {
		GUI s = new GUI();
	}
}
