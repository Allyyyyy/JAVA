import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ticketbutton extends JFrame implements ActionListener {
	JLabel label = new JLabel("ȡƱ��:");
	JButton ticketget = new JButton("ȡƱ");
	JTextField ticketcode = new JTextField();

	Ticketbutton() {
		this.setTitle("ȡƱ");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel eastPanel = new JPanel();
		this.getContentPane().add(eastPanel, BorderLayout.EAST);
		JPanel westPanel = new JPanel();
		this.getContentPane().add(westPanel, BorderLayout.WEST);
		JPanel bottomPanel = new JPanel();
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		eastPanel.add(ticketcode);
		westPanel.add(label);
		bottomPanel.add(ticketget);
		ticketcode.setEditable(true);
		ticketcode.setHorizontalAlignment(SwingConstants.LEFT);
		ticketcode.setColumns(25);
		ticketget.addActionListener(this);
		this.setBounds(400, 200, 400, 120);
		this.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		int i = 0, ifticket = 0;
		this.setVisible(true);
		if (e.getSource() == ticketget) {
			for (i = 0; i < Interfance.ticketlist.size(); i++) {
				if (ticketcode.getText().equals(Interfance.ticketlist.get(i).getTicketCode())) {
					JOptionPane.showMessageDialog(null, "��Ӱ:" + Interfance.ticketlist.get(i).getTicketMovieName()
							+ "\nʱ��:" + Interfance.ticketlist.get(i).getTicketMovieDate() + "  "
							+ Interfance.ticketlist.get(i).getTicketMovieTime() + "\n��λ:"
							+ Interfance.firstbuttonHandler.buyHandler0.button[Interfance.ticketlist.get(i).Seat_Num
									- 1].getText());
					ticketcode.setText(null);
					ifticket = 1;
					break;
				}

			}
			if (ifticket == 0) {
				JOptionPane.showMessageDialog(null, "ȡƱ��δƥ������޴�ȡƱ�룡");
				ticketcode.setText(null);
			}
		}
	}
}
