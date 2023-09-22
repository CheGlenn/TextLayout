public class HorizontallyFlipped implements TextBlock {

  //FIELDS
  TextBlock block;

  //CONSTRUCTORS
  public HorizontallyFlipped(TextBlock block){
    this.block = block;
  }

  //METHODS

  /**
   * Get one row from the block.
   * flips text horizontally
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception{
    int h = this.block.height();
    // Stuff within the box
    if ((i > 0) && (i <= h)) {
      String temp = "";
      char ch;
      for (int j = 0; j < this.block.row(i-1).length(); j++){ 
        //loops through string in block and store each character in string to temp
        ch = this.block.row(i-1).charAt(j);
        temp = ch+temp;
        } //for
        TextLine nText = new TextLine(temp); //makes new text line from temp
        return nText.row(0); 
      } 
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height(){
    return 2 + this.block.height();
  }

  public int width(){
    return 2 + this.block.width();
  }
  
}
