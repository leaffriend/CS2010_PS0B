import java.io.*;
import java.util.*;
import java.math.*;

public class Addition { // as the class name that contains the main method is "Addition", you have to save this file as "Addition.java", and submit "Addition.java" to Codecrunch
  public static void main(String[] args) {
    BigIntScanner sc = new BigIntScanner(System.in);
    while (true) {
      // Here is the full solution for this super simple practice task in pseudo code
      // read two integers A and B
      // if both are -1, stop
      // output A+B
      BigInteger a = sc.nextBigInt();
      BigInteger b = sc.nextBigInt();

      //System.out.println(a.toString());
      //System.out.println(a.toString());

      String breakVal = "-1";
      BigInteger breakValBigInt = new BigInteger(breakVal);

      if(a.compareTo(breakValBigInt) == 0 && b.compareTo(breakValBigInt) == 0){
        break;
      }
      else{
        System.out.println(a.add(b));
      }
    }
  }
}

//Edit IntegerScanner to accomodate BigInteger datatype
class BigIntScanner { // coded by Ian Leow, we will use this quite often in CS2010 PSes
  BufferedInputStream bis;
  String error = "-1";
  BigIntScanner(InputStream is) {
    bis = new BufferedInputStream(is, 1000000);
  }

  public BigInteger nextBigInt() {
    String result = "";
    try {
      int cur = bis.read();
      if (cur == -1)
        return new BigInteger(error);

      while ((cur < 48 || cur > 57) && cur != 45) {
        cur = bis.read();
      }
      if (cur == 45) {
        result = "-";
        cur = bis.read();
      }

      while (cur >= 48 && cur <= 57) {
        result = result + Character.toString((char) cur);
        cur = bis.read();
      }
      return new BigInteger(result);
    }
    catch (IOException ioe) {
      return new BigInteger(error);
    }
  }
}
