import com.sun.org.apache.xpath.internal.objects.XString;
import sun.util.calendar.BaseCalendar;

import java.time.Duration;
import java.time.LocalTime;

public class AirTrip {
    private String destination;
    private String flightNumber;
    private LocalTime flightTime;
    private String status; // Flight status can be "Departed", "Delayed", "Boarding", "OnTime"
    private Duration delay;

    public AirTrip(String destination, String flightNumber, LocalTime flightTime) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightTime = flightTime;
        this.status = "OnTime"; // Default status
        this.delay = Duration.ZERO; // Default delay
    }

    public String getStatus() {
        switch (status) {
            case "OnTime":
                return "سروقت";
            case "Departed":
                return "پرواز کرد";
            case "Delayed":
                return "تاخیر دارد، میزان تاخیر: " + formatDelay();
            case "Boarding":
                return "در حال مسافر گیری";
            default:
                return "وضعیت نامشخص";
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelay(Duration delay) {
        this.delay = delay;
        if (!delay.isZero()) {
            this.status = "Delayed";
        }
    }

    private String formatDelay() {
        long hours = delay.toHours();
        long minutes = delay.toMinutes() % 60;
        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        AirTrip trip = new AirTrip("Shiraz", "IR246", LocalTime.of(12, 45));

        System.out.println(trip.getStatus());

        trip.setStatus("Boarding");
        System.out.println(trip.getStatus());

        trip.setDelay(Duration.ofHours(2).plusMinutes(30));
        System.out.println(trip.getStatus());

        trip.setStatus("Departed");
        System.out.println(trip.getStatus());
    }
}

