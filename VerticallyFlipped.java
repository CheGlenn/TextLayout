public class VerticallyFlipped implements TextBlock {
  TextBlock block;
  
    public VerticallyFlipped(TextBlock block){
      this.block = block;
   
    }
    /*
     * returns row from a block
     * 
     * vertically flips inputted block
     */
    public String row(int i) throws Exception{
      int h = this.block.height();
      return this.block.row(h - i - 1); 
   
    }
    
    public int height(){
      return 1 + this.block.height();
    }
  
    public int width(){
      return 2 + this.block.width();
    }
  
}
