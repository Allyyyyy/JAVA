import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SeatHandler extends JFrame implements ActionListener {
	JButton[] button = new JButton[40];
	String[] seat = { "1-1", "1-2", "1-3", "1-4", "1-5", "1-6", "1-7", "1-8", "2-1", "2-2", "2-3", "2-4", "2-5", "2-6",
			"2-7", "2-8", "3-1", "3-2", "3-3", "3-4", "3-5", "3-6", "3-7", "3-8", "4-1", "4-2", "4-3", "4-4", "4-5",
			"4-6", "4-7", "4-8", "5-1", "5-2", "5-3", "5-4", "5-5", "5-6", "5-7", "5-8", };
	int Num_Of_Movie;

	SeatHandler(int num) {
		this.Num_Of_Movie = num;
		this.setTitle("×ùÎ»");
		GridLayout gridlayout = new GridLayout(5, 8);
		this.setLayout(gridlayout);
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(seat[i]);
			button[i].setEnabled(false);
			this.getContentPane().add(button[i]);
		}
		this.setBounds(400, 200, 900, 500);
		this.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		this.setVisible(true);
		for (int i = 0; i < Interfance.movielist.get(Num_Of_Movie).getMovieSeat(); i++) {
			if (Interfance.movielist.get(Num_Of_Movie).seat[i] == 0) {
				button[i].setEnabled(true);
			}
			button[i].addActionListener(new Ticketbought(Num_Of_Movie, i));
		}
	}
}
