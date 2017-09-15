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
  public  T getContents()
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
   * Empty out the box, and give back hatever was in it
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
  	if(full)
  		return false;
  		
  	contents = item;
  	isFull = true;
  	return true;
  }

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
    stringBox.putInBox("The Devil is alive");
    



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
