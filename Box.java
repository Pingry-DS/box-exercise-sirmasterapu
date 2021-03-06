public class Box <T>
{

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
  super();
  this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T contents)
  {
  super();
  this.isFull = true;
  this.contents = contents;

  }

  /**
   * Check the contents of the box
   *@return Whatever is in the box
   */
  public T getContents()
  {
    return contents;
  }

  /**
   * Tell whether the box is full or not
   *@return if the box has something is in it
   */
  public boolean isFull()
  {
    return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   *@return what was in the box
   */
  public T empty()
  {
    T junk = contents;
    contents = null;
    isFull = false;
    return junk;
  }
  /*
  *@return if the if the box had something in it return false else true
  */
  public boolean fill(T item)
  {
  	if(isFull())
  		return false;

  	contents = item;
  	isFull = true;
  	return true;
  }
  /*
  *@return what the box contains or if it was empty
  */
  public String toString()
  {
    if(isFull())
      return "The box containts " + contents;
    else
      return "The box is empty";
  }

  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>(666);


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box
    stringBox.fill("The Devil is alive");




    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method
    System.out.println(stringBox.getContents());


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes
    intBox.empty();


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
