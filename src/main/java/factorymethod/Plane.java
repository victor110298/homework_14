package factorymethod;

import lombok.ToString;

@ToString
public class Plane implements Vehicle {
    private boolean isTrunk;
    private String comfortable;
    public static class Builder {
        private Plane plane;

        public Builder() {
            plane = new Plane();
        }

        public Builder setIsTrunk(boolean isTrunk) {
            plane.isTrunk = isTrunk;
            return this;
        }

        public Builder setCombortable(String combortable) {
            plane.comfortable = combortable;
            return this;
        }

        public Plane build() {
            return plane;
        }
    }

    @Override
    public String getVehicle() {
        return this.toString();
    }
}