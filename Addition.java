import java.io.*;
import java.util.*;

public class Addition { // as the class name that contains the main method is "Addition", you have to save this file as "Addition.java", and submit "Addition.java" to Codecrunch
  public static void main(String[] args) {
    LongScanner sc = new LongScanner(System.in);
    while (true) {
      // Here is the full solution for this super simple practice task in pseudo code
      // read two integers A and B
      // if both are -1, stop
      // output A+B
      long a = sc.nextLong();
      long b = sc.nextLong();
      if(a == -1L && b == -1L){
        break;
      }
      else{
        System.out.println(Long.toUnsignedString(a+b)); //parse as unsigned long to print
      }
    }
  }
}

//Edit IntegerScanner to accomodate long datatype
class LongScanner { // coded by Ian Leow, we will use this quite often in CS2010 PSes
  BufferedInputStream bis;
  LongScanner(InputStream is) {
    bis = new BufferedInputStream(is, 1000000);
  }

  public long nextLong() {
    long result = 0L;
    try {
      int cur = bis.read();
      if (cur == -1)
        return -1;

      while ((cur < 48 || cur > 57) && cur != 45) {
        cur = bis.read();
      }

      boolean negate = false;
      if (cur == 45) {
        negate = true;
        cur = bis.read();
      }

      while (cur >= 48 && cur <= 57) {
        result = result*10 + (cur-48);
        cur = bis.read();
      }

      if (negate) {
        return -result;
      }
      return result;
    }
    catch (IOException ioe) {
      return -1;
    }
  }
}
