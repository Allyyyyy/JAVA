import java.awt.GridLayout;
import static javax.swing.JFrame.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Firsthandler extends JFrame implements ActionListener {
	JButton[] film = new JButton[6];
	SeatHandler buyHandler0 = new SeatHandler(0);
	SeatHandler buyHandler1 = new SeatHandler(1);
	SeatHandler buyHandler2 = new SeatHandler(2);
	SeatHandler buyHandler3 = new SeatHandler(3);
	SeatHandler buyHandler4 = new SeatHandler(4);
	SeatHandler buyHandler5 = new SeatHandler(5);
	Buttonhandler film0Handler = new Buttonhandler(buyHandler0, 0);
	Buttonhandler film1Handler = new Buttonhandler(buyHandler1, 1);
	Buttonhandler film2Handler = new Buttonhandler(buyHandler2, 2);
	Buttonhandler film3Handler = new Buttonhandler(buyHandler3, 3);
	Buttonhandler film4Handler = new Buttonhandler(buyHandler4, 4);
	Buttonhandler film5Handler = new Buttonhandler(buyHandler5, 5);
	Firsthandler() {
		for (int i = 0; i < 6; i++) {
			film[i] = new JButton("NULL");
			film[i].setVisible(false);
		}
		this.setTitle("订票");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridLayout gridlayout = new GridLayout(6, 1);
		this.setLayout(gridlayout);
		film[0].addActionListener(film0Handler);
		film[1].addActionListener(film1Handler);
		film[2].addActionListener(film2Handler);
		film[3].addActionListener(film3Handler);
		film[4].addActionListener(film4Handler);
		film[5].addActionListener(film5Handler);
		film[0].addActionListener(this);
		film[1].addActionListener(this);
		film[2].addActionListener(this);
		film[3].addActionListener(this);
		film[4].addActionListener(this);
		film[5].addActionListener(this);
		this.getContentPane().add(film[0]);
		this.getContentPane().add(film[1]);
		this.getContentPane().add(film[2]);
		this.getContentPane().add(film[3]);
		this.getContentPane().add(film[4]);
		this.getContentPane().add(film[5]);
		this.setBounds(400, 400, 800, 400);
		this.setVisible(false);

	}

	public void actionPerformed(ActionEvent e) {
		this.setVisible(true);
		for(int j =0;j<6;j++)
		if(e.getSource()==film[j])
			this.setVisible(false);
		for (int i = 0; i < Interfance.movielist.size(); i++) {
			film[i].setText("电影:  " + Interfance.movielist.get(i).Movie_Name + "   时间:  "
					+ Interfance.movielist.get(i).Movie_Date_Released + " " + Interfance.movielist.get(i).Movie_Time
					+"  "+Interfance.movielist.get(i).Price_Of_Movie+"元");
			film[i].setVisible(true);
		}

	}
}
