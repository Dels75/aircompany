package planes;

import java.util.Objects;

abstract public class Plane {
    String modelPlane;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    protected  Plane(String modelPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.modelPlane = modelPlane;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModelPlane() {
        return modelPlane;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        int result = this.maxLoadCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelPlane + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(modelPlane, plane.modelPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
