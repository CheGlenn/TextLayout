public class RightJustified implements TextBlock{

  //FIELDS

  TextBlock block;
  int width;

  //CONSTRUCTORS

  public RightJustified(TextBlock block, int width){
    this.block = block;
    this.width = width;
  }

  //METHODS

   /**
   * Get one row from the block.
   * right justifies block when width is greater than width of text, truncates otherwise
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int w = this.block.width();
    int width = this.width;

    if(width <= w){ //checks if width is less than or equal to length of text
      if((i > 0) && (i <= width)) {
        return this.block.row(i-1).substring(0, width); //truncates
      } //else if
      else {
        throw new Exception("Invalid row " + i);
      } //else
    } //if
    else {
      // Stuff within the box
      if ((i > 0) && (i <= width)) {
        return TBUtils.spaces(width - w) + this.block.row(i - 1); //adds spaces to left side
      }
      // Everything else
      else {
        throw new Exception("Invalid row " + i);
      }
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
