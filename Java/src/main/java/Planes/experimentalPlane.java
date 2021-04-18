package Planes;

import models.ClassificationByLevelSecrecy;
import models.ExperimentalTypes;

public class experimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationByLevelSecrecy levelSecrecy;

    public experimentalPlane(String modelPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationByLevelSecrecy levelSecrecy) {
        super(modelPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.levelSecrecy = levelSecrecy;
    }

    public ClassificationByLevelSecrecy getClassificationByLevelSecrecy(){
        return levelSecrecy;
    }

    public void setClassificationByLevelSecrecy(ClassificationByLevelSecrecy levelSecrecy){
        this.levelSecrecy = levelSecrecy;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + modelPlane + '\'' +
                '}';
    }
}
