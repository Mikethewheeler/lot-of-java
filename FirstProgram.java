public class Main {
  public static void main(String[] args) {
    int IntTooDouble = 4;
    double DoubleTooInt = IntTooDouble;
    System.out.println(DoubleTooInt);
    double ManualDoubleCast = 2.43d;
    int ManualTypeCast = (int) ManualDoubleCast;
    System.out.println(ManualTypeCast);
    String txt = "this txt is many letter long";
    System.out.println("number of char in string:" + txt.length());
    System.out.println(txt.indexOf("txt"));
    System.out.println(txt.toUpperCase());;
    System.out.println(Math.sqrt(64)); // square root of 64, equal to 8
    System.out.println(Math.sin(103)); // Sine value of 103
    System.out.println(Math.cos(103)); // Cosine value of 103
    int lessThanX = 1;
    int X = 3;
   
   System.out.println(X > lessThanX);
    if (X > lessThanX) {
     String Message = "X is greater";
     System.out.println(Message);
    } else {
     System.out.println("lessThanX is somehow greater");
    }
    
    final int timeOfDay = 10;
    if (timeOfDay < 11) { // If under 10 then its morning?
    System.out.println("Good Morning");
    } else if (timeOfDay <20) { // If under 20 its afternoon?
    System.out.println("Good afternoon");
    } else { // If not first or second condition, than its evening
    System.out.println("Good evening");
   }    
 
  }
 }
