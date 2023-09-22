

public class Truncated implements TextBlock {

  //FIELDS

  TextBlock block;
  int width;

  //CONSTRUCTORS

  public Truncated(TextBlock block, int width){
    this.block = block;
    this.width = width;
  }

  //METHODS

  /**
   * Get one row from the block.
   * 
   * Truncates block to width
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int width = this.width;

    if (width < this.block.width()){
      return this.block.row(i-1).substring(0, width);

    }
    else {
      // Stuff within the box
      if ((i > 0) && (i <= width)) {
        return this.block.row(i - 1) + TBUtils.spaces(width);
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
