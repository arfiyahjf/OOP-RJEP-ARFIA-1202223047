import java.sql.Date;

public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String name;
    private Date date;
    private String location;
    private Double ticketprize;

    public void setname(String name) {
        this.name = name;
    }
    public void setdate(Date date) {
        this.date = date;
    }
    public void setlocation(String location) {
        this.location = location;
    }
    public void setticketprize(Double ticketprize) {
        this.ticketprize = ticketprize;
    }
    public String getname() {
        return name;
    }
    public Date getetdate() {
        return date;
    }
    public String getlocation() {
        return location;
    }
    public Double getticketprize() {
        return ticketprize;
    }
}
