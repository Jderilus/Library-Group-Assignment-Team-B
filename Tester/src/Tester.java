import net.dtcc.lib.*;
public class Tester {

	public static void main(String[] args) {
	//Area Testing
		// Test areaOfRectangle
        double rectangleArea = AllInOne.CalcRectangleArea(5.0, 7.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // test areaOfSquare
        double squareArea = AllInOne.CalcSquareArea(5);
        System.out.println("Area of square: " + squareArea);

        // Test areaOfTriangle
        double TriangleArea = AllInOne.CalcTriangleArea(4, 9);
        System.out.println("Area of triangle: " + TriangleArea);

        // Test Circle
        double CircleArea = AllInOne.CalcCircleArea(4);
        System.out.println("Area of Circle: " + CircleArea);

        // Test Trapezoid
        double TrapezoidArea = AllInOne.CalcTrapezoidArea(4, 2, 6);
        System.out.println("Area of Trapezoid: " + TrapezoidArea);

        // Test Ellipse
        double EllipseArea = AllInOne.CalcEllipseArea(10, 6);
        System.out.println("Area of Ellipse: " + EllipseArea);

        // Test Pentagon
        double PentagonArea = AllInOne.areaOfPentagon(10);
        System.out.println("Area of Pentagon: " + PentagonArea);

        // Test Parallelogram
        double ParallelogramArea = AllInOne.CalcParalleglogramArea(16, 4);
        System.out.println("Area of Parallelogram: " + ParallelogramArea);

        // Test Rhombus
        double RhombusArea = AllInOne.CalcRhombusArea(8, 3);
        System.out.println("Area of Rhombus: " + RhombusArea);

        // Test Rhombus
        double HexagonArea = AllInOne.CalcHexagonArea(8);
        System.out.println("Area of Hexagon: " + HexagonArea);
        
        // Test Polygon
        // this is for a general Polygon assuming all sides are equal,  n = number of sides, a = first side length.
        double PolygonArea = AllInOne.CalcPolygonArea(4, 3);
        System.out.println("Area of Polygon: " + PolygonArea);


        //Fractions
        // Test addFractions
        double fractionSum = AllInOne.FractionAddition(1, 2, 2, 3);
        System.out.println("Sum of fractions: " + fractionSum);

        // Test SubtractFractions
        double fractionSubtracting = AllInOne.FractionSubtraction(1, 2, 2, 3);
        System.out.println("Subtracting of fractions: " + fractionSubtracting);

        // Test MultiplyFractions
        double fractionMultiplying = AllInOne.FractionMultiplication(1, 2, 2, 3);
        System.out.println("Multiplying of fractions: " + fractionMultiplying);

        // Test DivideFractions
        double fractionDividing  = AllInOne.FractionDivision(1, 2, 2, 3);
        System.out.println("Divide of fractions: " + fractionDividing);
        
        //Volume
        // Test volumeOfCube
        double volumeOfCube = AllInOne.CubeVolume(8);
        System.out.println("Volume of Cube: " + volumeOfCube);

        // Test volumeOfBox
        double volumeOfBox = AllInOne.BoxVolume(8, 6, 9);
        System.out.println("Volume of Box: " + volumeOfBox);

        // Test volumeOfCylinder
        double volumeOfCylinder = AllInOne.CylinderVolume(4, 9);
        System.out.println("Volume of Cylinder: " + volumeOfCylinder);

        // Test volumeOfCone
        double volumeOfCone = AllInOne.ConeVolume(3, 12);
        System.out.println("Volume of Cone: " + volumeOfCone);

        // Test volumeOfSphere
        double volumeOfSphere = AllInOne.SphereVolume(3);
        System.out.println("Volume of Sphere: " + volumeOfSphere);

        // Add tests for the rest of the methods here
        // 

		
	}// end main

}// end Tester class
