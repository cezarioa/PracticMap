package Model;

public class Ereignis {
    int id;
    int tributeId;
    String type;
    int day;
    EventType eventType;
    public enum EventType {
        ATTACK("ATTACK"),
        FOUND_SUPPLIES("FOUND_SUPPLIES"),
        HELPED_ALLY("HELPED_ALLY"),
        INJURED("INJURED"),
        SPONSORED("SPONSORED");

        private final String type;

        EventType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "EventType{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }

    public Ereignis() {
    }
    public Ereignis(int id, int tributeId, String type, int day, EventType eventType) {
        this.id = id;
        this.tributeId = tributeId;
        this.type = type;
        this.day = day;
        this.eventType = eventType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTributeId() {
        return tributeId;
    }

    public void setTributeId(int tributeId) {
        this.tributeId = tributeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "Ereignis{" +
                "id=" + id +
                ", tributeId=" + tributeId +
                ", type='" + type + '\'' +
                ", day=" + day +
                ", eventType=" + eventType +
                '}';
    }
}
