/**Author: Elizabeth Hayes
 * Generic ArrayList Lab/
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstList<Integer> aList=new FirstList<Integer>();
		//Or FirstList<Integer> aList=new FirstList();
		for(int i = 0;i<10;i++)
		{
			aList.addItem(i);
		}
		//Add an item past the end of the list
		aList.addItem(10);
		//Check if the list doubled
		System.out.println("New Size is: "+ aList.getLength());
		//Add an item in index 3
		aList.addItem(6,3);
		System.out.println("Item number 3 is: "+ aList.getItem(3)+ " and should be a 6");
		//Now delete item 2
		aList.deleteItem(2);
		//The first items should be 0,1,6,3
		System.out.println("The first four items in the list are:");
		for(int i=0;i<4;i++)
		{
			System.out.print(aList.getItem(i)+" ");
		}
		
		

		
		/*
		 INSTRUCTIONS
		 1. Instantiate a new FirstList to store Square objects
		 2. Store 20 squares in your list. The first square should 
		 	have a side=0, the second square side=1 and so on.
		 3. Print the square (toString()) stored at index 1 and index 15.
		 4. Using the same reference variable instantiate a new FirstList
		 	to store your point objects
		 5. Store 20 points in your list. Point stored at index zero should be 
		  	x,y,z = 0,0,0. The point at index 1 would be 1,1,1 and so on.
		 6. Using the distance formula, calculate and print the distance
		 	between the point stored at index 3 and index 12 to two decimal places.
		 
        Part 3
        7. Instantiate a new FirstLIst object to store both Points and Squares

        8. Call addItem() to add a new PointThreeD with the following parameters: 2.0,3.0,5.0
        9. Call addItem() to add a new Square with side 2.0
        10. Call getItem(0) and call its toString() method to print the point
        11. Call getItem(1) and call its toString() method to print the square


        Program Output will look like this:

        New Size is: 20
        Item number 3 is: 6 and should be a 6
        The first four items in the list are:
        0 1 6 3 
        Squares:
        Square [side=1.0, area=1.0]
        Square [side=15.0, area=225.0]
        Point Distance: 15.59
        ShapeList contents:
        PointThreeD [xPoint=2.0, yPoint=3.0, zPoint=5.0]
        Square [side=2.0, area=4.0]➜         
         */
          FirstList<Square> squareList = new FirstList<Square>(20);
          for(int i=0;i<20;i++){
            squareList.addItem(new Square(i));
          }
          System.out.println("Squares:");
          System.out.println(squareList.getItem(1).toString());
          System.out.println(squareList.getItem(15).toString());
          
          FirstList<PointThreeD> pointList = new FirstList<>(20);
          for(int i=0;i<20;i++){
            pointList.addItem(new PointThreeD(i, i, i));
          }
          PointThreeD p3 = pointList.getItem(3);
          PointThreeD p12 = pointList.getItem(12);

          double distance = Math.sqrt(Math.pow(p12.getxPoint() - p3.getxPoint(), 2)+ Math.pow(p12.getyPoint() - p3.getyPoint(), 2) + Math.pow(p12.getzPoint() - p3.getzPoint(), 2));
          System.out.printf("Point Distance: %.2f%n%n", distance);

          FirstList<Object> shapeList = new FirstList<>();
          shapeList.addItem(new PointThreeD(2.0, 3.0, 5.0));
          shapeList.addItem(new Square(2.0));

          System.out.println("ShapeList contents:");
          System.out.println(shapeList.getItem(0).toString());
          System.out.println(shapeList.getItem(1).toString());
          
	}

}
