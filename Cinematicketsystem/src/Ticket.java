import java.util.Random;

public class Ticket {
	String Ticket_Code;
	String Movie_Name;
	String Movie_Time;
	int Seat_Num;
	String Movie_Date;
	private static Random strGen = new Random();
	private static char[] strings = ("0123456789abcdefghijklmnopqrstuvwxyz")
			.toCharArray();

	public static final String randomString(int length) {
		if (length < 1) {
			return null;
		}
		char[] randBuffer = new char[length];
		for (int i = 0; i < randBuffer.length; i++) {
			randBuffer[i] = strings[strGen.nextInt(35)];
		}
		return new String(randBuffer);
	}

	Ticket(String name, String time, int seat, String Date) {
		this.Movie_Name = name;
		this.Movie_Time = time;
		this.Seat_Num = seat + 1;
		this.Movie_Date = Date;
		this.Ticket_Code = randomString(4);
	}

	String getTicketCode() {
		return this.Ticket_Code;
	}

	 String getTicketMovieName() {
		return this.Movie_Name;
	}

	String getTicketMovieTime() {
		return this.Movie_Time;
	}

	int getSeatNum() {
		return this.Seat_Num;
	}

	String getTicketMovieDate() {
		return this.Movie_Date;
	}
}
