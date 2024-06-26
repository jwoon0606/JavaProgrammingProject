package bbq;

public class Reservation {
    private String name;
    private String phone;
    private String seat;
    private String date;
    private String time;

    public Reservation(String name, String phone, String seat, String date, String time) {
        this.name = name;
        this.phone = phone;
        this.seat = seat;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSeat() {
        return seat;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("%-5s,%-14s,%-6s,%-9s,%-8s", name, phone, seat, date, time);
    }
}