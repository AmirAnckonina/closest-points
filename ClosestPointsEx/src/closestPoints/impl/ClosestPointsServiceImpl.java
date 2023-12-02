package closestPoints.impl;

import closestPoints.api.ClosestPointsService;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestPointsServiceImpl implements ClosestPointsService {
    @Override
    public <T extends Number> T[][] getClosestPointsToOrigin(T[][] points, int amountOfPoints) {
        return getClosestPointsToTarget(points, amountOfPoints, (T[]) new Number[]{0, 0});
    }

    @Override
    public <T extends Number> T[][] getClosestPointsToTarget(T[][] points, int amountOfPoints, T[] target) {
        return Arrays
                .stream(points)
                .sorted(Comparator.comparing(point -> getDistanceToTarget(point, target)))
                .limit(amountOfPoints)
                .toArray(size -> (T[][]) new Number[size][2]);
    }

    @Override
    public <T extends Number> Double getDistanceToTarget(T[] point, T[] target) {
        Double distanceResult;

        switch (point.length) {
            case 2:
                distanceResult = new TwoDimensionalDistanceCalculator().calculateDistance(point, target);
                break;
            case 3:
                throw new IllegalArgumentException("3D is not supported yet");
            default:
                throw new IllegalArgumentException("Currently, only 2D is supported");
        }

        return distanceResult;
    }
}
