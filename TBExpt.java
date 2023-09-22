
import java.beans.Transient;
import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");

    TextBlock block2 = new TextLine("Goodbye");

    BoxedBlock boxedHello = new BoxedBlock(block);
    BoxedBlock boxedGoodbye = new BoxedBlock(block2);

    HComposition newBlock = new HComposition(block, block2);
    
    VComposition vert = new VComposition(boxedHello, boxedGoodbye);

    Truncated test1 = new Truncated(boxedHello, 5);

    Centered test2 = new Centered(boxedHello, 4);

    RightJustified test3 = new RightJustified(boxedHello, 9);

    HorizontallyFlipped test4 = new HorizontallyFlipped(newBlock);

    VerticallyFlipped test5 = new VerticallyFlipped(vert);

    CustomBlock test6 = new CustomBlock(boxedHello);

    //TBUtils.equal(boxedHello,block);

    

    // Print out the block
    // TBUtils.print(pen, test1);
    // TBUtils.print(pen, test2);
    //TBUtils.print(pen, test3);
    //TBUtils.print(pen, test4);
    TBUtils.print(pen, test5);
    //TBUtils.print(pen , test6);
    //TBUtils.print(pen, newBlock);
    TBUtils.equal(test1, test1);

  

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt