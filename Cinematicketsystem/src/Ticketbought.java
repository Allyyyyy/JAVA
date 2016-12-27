import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Ticketbought implements ActionListener {

	 int movienum;
	 int seatnum;
	public Ticketbought(int num_Of_Movie, int i) {
		this.movienum=num_Of_Movie;
		this.seatnum=i;
	}

	public void actionPerformed(ActionEvent e) {
		int ticketnum = Interfance.movielist.get(movienum).movieTicketBought(seatnum);
		if (ticketnum != -1) {
			JOptionPane.showMessageDialog(null,
					"µçÓ°:" + Interfance.movielist.get(movienum).Movie_Name + "\nÊ±¼ä:"
							+ Interfance.movielist.get(movienum).Movie_Date_Released
							+ Interfance.movielist.get(movienum).Movie_Time + "\n×ùÎ»:"
							+ Interfance.firstbuttonHandler.buyHandler0.seat[seatnum] + "\nÁìÆ±Âë:"
							+ Interfance.ticketlist.get(ticketnum).Ticket_Code);
			switch(movienum)
			{
			case 0:Interfance.firstbuttonHandler.buyHandler0.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film0Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film0Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film0Handler.Num).getMovieSeat());break;
			case 1:Interfance.firstbuttonHandler.buyHandler1.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film1Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film1Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film1Handler.Num).getMovieSeat());break;
			case 2:Interfance.firstbuttonHandler.buyHandler2.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film2Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film2Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film2Handler.Num).getMovieSeat());
			break;
			case 3:Interfance.firstbuttonHandler.buyHandler3.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film3Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film3Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film3Handler.Num).getMovieSeat());break;
			case 4:Interfance.firstbuttonHandler.buyHandler4.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film4Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film4Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film4Handler.Num).getMovieSeat());break;
			case 5:Interfance.firstbuttonHandler.buyHandler5.button[seatnum].setEnabled(false);
			Interfance.firstbuttonHandler.film5Handler.label.setText("×ùÎ»Ê£Óà"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film5Handler.Num).getMovieSeatRemained()+"/"+
			Interfance.movielist.get(Interfance.firstbuttonHandler.film5Handler.Num).getMovieSeat());break;
			}
		} else if (ticketnum == -1) {
			JOptionPane.showMessageDialog(null,"¹ºÆ±´íÎó");
		}
	}


}
