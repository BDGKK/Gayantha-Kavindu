package src;

import java.util.*;

public class Kunit {
  private static List<String> checks;
  private static int checksMade = 0;
  private static int passedChecks = 0;
  private static int failedChecks = 0;


  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", checksMade++, txt));
  }

  
  public static void checkEquals(String value1, String value2) {
    if (value1.equals(value2)) {
      addToReport(String.format("  %d == %d", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d == %d", value1, value2));
      failedChecks++;
    }
  }


  public static void checkNotEquals(String value1, String value2) {
    if (value1 != value2) {
      addToReport(String.format("  %d != %d", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d != %d", value1, value2));
      failedChecks++;
    }
  }
  
  public static void checkEqualsStringValues(String value1, String value2) {
	    if (value1.equals(value2)) {
	        addToReport(String.format("  %s== %s", value1, value2));
	        passedChecks++;
	    } else {
	        addToReport(String.format("  %s!= %s", value1, value2));
	        failedChecks++;
	    }
	}



  public static void reportSTR() {
    System.out.printf("%d checks passed\n", passedChecks);
    System.out.printf("%d checks failed\n", failedChecks);
    System.out.println();
    
    for (String check : checks) {
      System.out.println(check);
    }
  }
}
