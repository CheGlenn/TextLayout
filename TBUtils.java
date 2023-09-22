
import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2014
 */
public class TBUtils {

  
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    // Note: This strategy probably represents an overkill in
    // attempts at efficiency.
    // Make sure the collection of dashes is big enough
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    // As with dashes, this is probably overkill.
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)

  /*
   * Checks if the contents of the t1 is equal to t2
   */
  static void equal(TextBlock t1, TextBlock t2) throws Exception{
    int h1 = t1.height();
    int h2 = t2.height();
    int h3 = Math.max(h1, h2); //set max height between two blocks

    PrintWriter pen = new PrintWriter(System.out, true);
    for (int i = 0; i < h3; i++){ //loops through rows
      if (t1.row(i).equals(t2.row(i))){ //checks if contents of row is equal
        pen.println("True");
      }//if
      else{
        pen.println("False");
      } //else
    }
  }
  /*
   * Checks if the value of t1 is equal to t2
   */
  public static void eq(TextBlock t1, TextBlock t2){
    PrintWriter pen = new PrintWriter(System.out, true);
    if (t1 == t2){ //compares two blocks
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }

  static void eqv(TextBlock t1, TextBlock t2){
    
  }

} // class TBUtils
