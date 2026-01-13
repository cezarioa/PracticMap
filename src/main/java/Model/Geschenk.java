package Model;

public class Geschenk {
    int id;
    int tributId;
    String itemName;
    int value;
    int day;
    public Geschenk() {
    }
    public Geschenk(int id, int tributId, String itemName, int value, int day) {
        this.id = id;
        this.tributId = tributId;
        this.itemName = itemName;
        this.value = value;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTributId() {
        return tributId;
    }

    public void setTributId(int tributId) {
        this.tributId = tributId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Geschenk{" +
                "id=" + id +
                ", tributId=" + tributId +
                ", itemName='" + itemName + '\'' +
                ", value=" + value +
                ", day=" + day +
                '}';
    }
}
