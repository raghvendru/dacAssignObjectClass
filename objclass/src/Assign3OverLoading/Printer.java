package Assign3OverLoading;
class Printer {
 public String print(String message) {
     System.out.println("Printing message" + message);
     return message;
 }
 public String print(String mssage) {
	 System.out.println("Printing message" + mssage);
	 return mssage;
 }

 public void print(int number) {
     System.out.println("Printing integer" + number);
 }

 public void print(double value) {
     System.out.println("Printing decimal:" + value);
 }

 public void print(String[] items) {
     System.out.println("Printing string array:");
     for (String item : items) {
         System.out.println(item);
     }
 }

 public void print(Object o) {
     System.out.println("Printing object: " + o.toString());
 }
 public static void main(String[] args) {
     Printer p = new Printer();
     p.print("Hello World");
     p.print(42);
     p.print(99.99);
     p.print(new String[]{"Apple", "Banana", "Mango"});
     p.print(new java.util.Date()); 
 }
}
