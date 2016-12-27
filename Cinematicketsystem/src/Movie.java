import java.io.Serializable;

public class Movie implements Serializable{
	static int Movie_Num = 0;
	String Movie_Name;
	String Movie_Date_Released;
	Double Price_Of_Movie;
	int Seats_Of_Movie;
	int Seats_Remained;
	String Movie_Time;
    int[] seat = new int[40];
	Movie() {
		this.Movie_Name = "Null";
		this.Price_Of_Movie = 50.0;
		Movie_Num++;
	}

	Movie(String Name) {
		this.Movie_Name = Name;
		this.Price_Of_Movie = 50.0;
		Movie_Num++;
	}

	void setMoviePrice(double price) {
		this.Price_Of_Movie = price;
	}

	void setMovieDateReleased(String date) {
		this.Movie_Date_Released = date;
	}


	void setMovieName(String name) {
		this.Movie_Name = name;
	}

	String getMovieName() {
		return this.Movie_Name;
	}

	String getMovieDateReleased() {
		return this.Movie_Date_Released;
	}


	Double getMoviePrice() {
		return this.Price_Of_Movie;
	}

	int getMovieNum() {
		return Movie_Num;
	}

	void setMovieSeats(int seat) {
		int Seat_Minus = this.Seats_Of_Movie - this.Seats_Remained;
		this.Seats_Of_Movie = seat;
		this.Seats_Remained = seat - Seat_Minus;
	}

	void setMovieTime(String time) {
		this.Movie_Time = time;
	}

	int getMovieSeat() {
		return this.Seats_Of_Movie;
	}

	int getMovieSeatRemained() {
		return this.Seats_Remained;
	}

	String getMovieTime() {
		return this.Movie_Time;
	}

	int movieTicketBought(int a) {
		int indexofticket;
		if (this.Seats_Remained > 0) {
			Ticket ticket = new Ticket(this.Movie_Name, this.Movie_Time,
					a,
					this.Movie_Date_Released);
			this.Seats_Remained--;
			this.seat[a]=1;
			Interfance.ticketlist.add(ticket);
			return Interfance.ticketlist.indexOf(ticket);
			}
		return -1;
	}
}
