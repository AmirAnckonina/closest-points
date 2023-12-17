package closestPoints.api;

public interface DistanceCalculator {
    <T extends Number> Double calculateDistance(T[] point, T[] target);
}
