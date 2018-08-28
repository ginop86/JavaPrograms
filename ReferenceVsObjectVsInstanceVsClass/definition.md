- A 'class' is like a blue print to building a house.
- Each house you build uses the 'new' keyword. This creates a new Object also known as an 'instance'
- Each house you build points to a certain spot in memory. This is known as 'reference'
- You can copy that 'reference' by assigning a variable to that house, but know that it does NOT create a new spot in memory. Insead, it points to the same place as the original house. This means that if you modify the copy of the house, it will affect the original house.
Ex. 
public class Main {

	public static void main(String[] args) {
		// anotherHouse can modify blueHouse
		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;

		// conversely, if you use the 'new' key word, this
		// creates a brand new home (Object)
		House greenHouse = new House("green");
		
	}
}

- We can pass references as params to constructors and methods.
