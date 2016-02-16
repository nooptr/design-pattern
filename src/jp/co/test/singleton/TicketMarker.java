package jp.co.test.singleton;

public class TicketMarker {
	private int ticket = 1000;
	private static TicketMarker ticketMarker = null;

	private TicketMarker() {
		System.out.println("インスタンスを生成しました");
	}

	public static TicketMarker getInstance() {
		if (ticketMarker == null) {
			ticketMarker = new TicketMarker();
		} else {
			System.out.println("インスタンスが存在しました");
		}

		return ticketMarker;
	}

	public int getNextTicketMarker() {
		ticket++;
		showTicketNumber();
		return ticket;
	}

	public void showTicketNumber() {
		System.out.println("Ticket = " + ticket);
	}

	public static void main(String[] args) {
		TicketMarker ticketMarker = TicketMarker.getInstance();
		ticketMarker.getNextTicketMarker();
		ticketMarker.getNextTicketMarker();
		ticketMarker.getNextTicketMarker();
		ticketMarker.getNextTicketMarker();

		TicketMarker ticketMarker2 = TicketMarker.getInstance();
		ticketMarker2.getNextTicketMarker();
		ticketMarker2.getNextTicketMarker();
		ticketMarker2.getNextTicketMarker();
	}
}
