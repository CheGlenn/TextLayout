public class CustomBlock implements TextBlock {

  //FIELDS
  TextBlock block;
  TextBlock block2;

  //CONSTRUCTOR

  public CustomBlock (TextBlock block){
    this.block = block;
    this.block2 = new HorizontallyFlipped(block);
  }

  //METHODS
  
  /**
   * Get one row from the block.
   * prints inputted text and horizontally flipped version side by side in new textblock
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception{
    int h = this.block.height();
    // Stuff within the box
    if ((i > 0) && (i <= h)) {
      return this.block.row(i-1) + this.block2.row(i);
    }
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  } //row()

  /**
   * Determine how many rows are in the block.
   */
  public int height(){
    return 2 + this.block.height();
  } //height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return 2 + this.block.width();
  } // width()


}
