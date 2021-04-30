package planes;

import models.ClassificationByLevelSecrecy;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalType;
    private ClassificationByLevelSecrecy levelSecrecy;

    public ExperimentalPlane(String modelPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalType, ClassificationByLevelSecrecy levelSecrecy) {
        super(modelPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
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
