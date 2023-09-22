public class Centered implements TextBlock{

  //FIELDS
  TextBlock block;
  int width;

  //CONSTRUCTORS

  public Centered(TextBlock block, int width){
    this.block = block;
    this.width = width;
  }

   /**
   * Get one row from the block.
   * centers text when width is greater than length of text
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int width = this.width;
    int p = (width/2) + (width % 2); //size of space between Border and text in a BoxedBlock

    if (width <= this.block.width()){ 
      //checks if width is less than or equal to width of text, 
      //then creates centered text block accordingly 
        if((i > 0) && (i <= width)) {
          return  TBUtils.spaces(p) + this.block.row(i-1).substring(0, width) + TBUtils.spaces(p);
        }
        else {
          throw new Exception("Invalid row " + i);
        } //else
    } //if
    else{ 
        // Stuff within the box
        if ((i > 0) && (i <= width)) {
          return  TBUtils.spaces(p) + this.block.row(i - 1) + TBUtils.spaces(p);
        } //else if
        // Everything else
        else {
          throw new Exception("Invalid row " + i);
        } //else
      }
  } // row(int)


    /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return 2 + this.block.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return 2 + this.block.width() + this.width;
  } // width()

}
