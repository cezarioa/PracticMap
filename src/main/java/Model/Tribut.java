package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tribut {
    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("district")
    int district;
    @JsonProperty("status")
    TributStatus status;
    @JsonProperty("skillLevel")
    int skillLevel;


    public enum TributStatus {
        ALIVE("ALIVE"),
        TOT("TOT");

        private final String status;

        TributStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "TributStatus{" +
                    "status='" + status + '\'' +
                    '}';
        }
    }
    public Tribut() {
    }
    public Tribut(int id, String name, int district, int skillLevel, TributStatus status) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.skillLevel = skillLevel;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public TributStatus getStatus() {
        return status;
    }

    public void setStatus(TributStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tribut{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", skillLevel=" + skillLevel +
                ", status=" + status +
                '}';
    }
}

