package closestPoints.api;

public interface ClosestPointsService {
    <T extends Number> T[][] getClosestPointsToOrigin(T[][] points, int amountOfPoints);
    <T extends Number> T[][] getClosestPointsToTarget(T[][] points, int amountOfPoints, T[] target);
    <T extends Number> Double getDistanceToTarget(T[] point, T[] target);
}
