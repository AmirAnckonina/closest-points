import closestPoints.impl.ClosestPointsServiceImpl;


public class Main {
    public static void main(String[] args) {

        Number[][] points1 = {{1,2.5}, {3.4, 5.3}, {-1,1}, {7,8.5}};
        Number[][] points2 = {{10, 15}, {6,7}, {11,12}, {-29, 0}, {11,12}, {-29,1}, {11,199}, {0.5, 0}};
        Number[][] points3 = {{3f, 2.5}, {4, 4}, {0,0}, {7,8.5}};

        Number[][] closestPoints1 = new ClosestPointsServiceImpl().getClosestPointsToOrigin(points1, 2);
        Number[][] closestPoints12 = new ClosestPointsServiceImpl().getClosestPointsToOrigin(points1, 10);
        Number[][] closestPoints2 = new ClosestPointsServiceImpl().getClosestPointsToOrigin(points2, 3);
        Number[][] closestPoints3 = new ClosestPointsServiceImpl().getClosestPointsToOrigin(points3, 0);
        Number[][] closestPoints32 = new ClosestPointsServiceImpl().getClosestPointsToOrigin(points3, 1);



    }
}