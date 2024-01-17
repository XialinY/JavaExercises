package at.technikum.Einheit6.library;

public abstract class Item {
    private String id; //'protected' - if the child class needs access to this variable
    private Member rentedBy;

    public Item(String id) {
        this.id = id;
    }

    //public abstract String getObjectName();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getRentedBy() {
        return rentedBy;
    }

    public Status getStatus() {
        if (null == rentedBy) {
            return Status.FREE;
        }
        return Status.RENTED;
    }

    public void setRentedBy(Member rentedBy) {
        this.rentedBy = rentedBy;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", rentedBy=" + rentedBy +
                '}';
    }
}
