package twoDimTests;

import closestPoints.impl.ClosestPointsServiceImpl;
import org.junit.*;

public class ClosestPointsTests {

    @Test
    public void getClosestPointsToOrigin_expectedBehavior() {

        // Arrange
        Number[][] points = new Integer[][] {{1,1}, {2,15}, {3,3}};
        Number[][] expectedClosestPointsResult = {{1,1}, {3,3}};

        // Test
        Number[][] actualClosestPointsResult =  new ClosestPointsServiceImpl().getClosestPointsToOrigin(points, 2);

        // Assert
        Assert.assertArrayEquals(expectedClosestPointsResult , actualClosestPointsResult);
    }
}
