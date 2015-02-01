public class SleepIn {
  public static void main (String [] args) {
    SleepIn si = new SleepIn();
    System.out.println(si.sleepIn(false, false));
    System.out.println(si.sleepIn(true, false));
    System.out.println(si.sleepIn(false, true));

    return;
  }

  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    }
    else {
        return false;
    }
  }
}
