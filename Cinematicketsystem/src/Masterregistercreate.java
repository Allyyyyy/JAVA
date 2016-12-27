import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Masterregistercreate extends JFrame implements ActionListener {

	JLabel label = new JLabel("√‹¬Î£∫");
	JButton registerbutton = new JButton("µ«¬Ω");
	JPasswordField pwdText = new JPasswordField(10);

	Masterregistercreate() {
		this.setTitle("π‹¿Ì‘±µ«¬Ω");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel eastPanel = new JPanel();
		this.getContentPane().add(eastPanel, BorderLayout.EAST);
		JPanel westPanel = new JPanel();
		this.getContentPane().add(westPanel, BorderLayout.WEST);
		JPanel bottomPanel = new JPanel();
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		pwdText.setBounds(0, 0, 120, 30);
		eastPanel.add(pwdText);
		westPanel.add(label);
		bottomPanel.add(registerbutton);
		registerbutton.addActionListener(this);
		this.setBounds(400, 200, 300, 150);
		this.setVisible(false);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == registerbutton) {
			String a = new String(pwdText.getPassword());
			String b = new String("PASSWORD");
			if (a.equals(b)) {
				this.setVisible(false);
				Interfance.mastermenu.setVisible(true);
				pwdText.setText(null);
			} else {
				JOptionPane.showMessageDialog(null, "√‹¬Î¥ÌŒÛ£°");
				pwdText.setText(null);
			}
		}
	}
}
