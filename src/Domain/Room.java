package Domain;

public class Room {
    private int id;
    private int numberOfPeople;
    private int roomNumber;
    private int days;
    private boolean leftRoom=false;
    private String feedback;
    private double rating;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfPeople=" + numberOfPeople +
                ", roomNumber=" + roomNumber +
                ", days=" + days +
                ", leftRoom=" + leftRoom +
                ", feedback='" + feedback + '\'' +
                ", rating=" + rating +
                '}';
    }
    public Room (int id, int numberOfPeople, String roomNumber, int days) {
        this.id = id;
        this.numberOfPeople = numberOfPeople;
        this.roomNumber = roomNumber;
        this.days = days;
        leftRoom = false; // nu e necesar, e default
    }
    public Room(int id, int numberOfPeople, int roomNumber, int days, boolean leftRoom, String feedback, int rating) {
        this.id = id;
        this.numberOfPeople = numberOfPeople;
        this.roomNumber = roomNumber;
        this.days = days;
        this.leftRoom = leftRoom;
        this.feedback = feedback;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isLeftRoom() {
        return leftRoom;
    }

    public void setLeftRoom(boolean leftRoom) {
        this.leftRoom = leftRoom;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
