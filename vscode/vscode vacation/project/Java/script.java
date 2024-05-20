public class TripManager {

    public static void main(String[] args) {
        // Example usage:
        String trip = "proposed";
        String status = "pending";
        String time = "proposed";
        int date = 20240519;
        int money = 100;

        trip(trip, status, time, date, money);
    }

    public static void trip(String trip, String status, String time, int date, int money) {
        if (trip.equals("proposed")) {
            status = "agreed";
            time = null;

            if (status.equals("agreed")) {
                textGroupChat();
            }
        }

        if (time == null) {
            status = "ignored";
        } else if (time.equals("proposed")) {
            status = "No Response";
        }

        while (status.equals("ignored")) {
            money = 0;
            time = "Never going to Happen";
            break;
        }

        System.out.println("Trip: " + trip + ", Status: " + status + ", Time: " + time + ", Date: " + date + ", Money: " + money);
    }

    public static void textGroupChat() {
        System.out.println("Sending message to group chat...");
    }
}