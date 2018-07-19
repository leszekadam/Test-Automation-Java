public class Flight {

    private String fromLocation;
    private String toLocation;
    private String departureDate;
    private String returnDate;
    private String guests;

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getGuests() {
        return guests;
    }

    public Flight() {
        fromLocation = "Warsaw";
        toLocation = "New York";
        departureDate = "27/09/2018";
        returnDate = "03/05/2019";
        guests = "1";
    }
}
