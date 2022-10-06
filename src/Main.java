//import java.util.ArrayList;
//import java.util.Collections;

//public class Main {
//  public static void main(String[] args){
//     ArrayList<String> cars = new ArrayList<String>();
//     cars.add("Volvo");
//    cars.add("BMW");
//   cars.add("Ford");
//  cars.add("Mazda");
// System.out.println(cars);
//   }
//}

//public class Main{
//   public static void main(String []args){
//        ArrayList<String> cars = new ArrayList<String>();
//       cars.add("Volvo");
//       cars.add("BMW");
//       cars.add("Ford");
//       cars.add("Mazda");
//        for (int i = 0; i<cars.size(); i++){
//           System.out.println(cars.get(i));
//       }
//   }
//}


//public class Main{
//   public static void main(String []args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars){
//System.out.println(i);
//        }
//    }
//}


//public class Main{
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new = ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(20);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//
//   }
//}

//public class Main{
//    public static void main(String []args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars);
//        for (String i : cars){
//            System.out.println(i);
//        }
//    }
//}


//public class Main{
//    public static void main(String[] args){
//ArrayList<Integer> myNumbers = new = ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//
//    }
//}

//  public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> cars = new Arraylist<String>();
//        cars.add("Volvo");
//         cars.add("BMW");
//           cars.add("FORD");
//           cars.add("Mazda");
//           System.out.println(cars);

//           String car = cars.get(0);
//           System.out.println("get method: " + car);

//           cars.set(0, "Opel");
//           System.out.println("set  method:" + cars);

//           cars.remove(0);
//           System.out.println("remove method " + cars);

//          cars.clear();
//          System.out.println("clear method:" + cars);

//          int s = cars.size();
//           System.out.println("list size " + s);
//       }
//  }


//problem 1
//   public static void Main(String[] args) {
//      ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Black");
//        System.out.println( colors );
//    }
//}
//problem2
//public class Main {
//   public static void Main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Blue");
//        colors.add("yellow");
//        colors.add("Red");
//        colors.add("Orange");
//        System.out.println(colors);

//        colors.add(0, "Pink");
//        colors.add(4, "White");
//
//        System.out.println( + colors);
//        }
//    }


//problem3
//       String element = colors.get(2);
//      System.out.println("retrieve First element: "+element);

//problem4
//        colors.set(2, "Pink");
//        System.out.println("update " + colors);

//problem5
//               colors.remove(2);
//System.out.println("remove 3 element " + colors);

//problem6
//              for (int i = 0; i < colors.size(); i++){
//                 if (colors.get(i).equals("Pink")){
//                    System.out.println(i);
//              break;
//          }
//      }
//        int problem6 = colors.indexOf("blue");
//       System.out.println(problem6);

//problem7
//        ArrayList<String> colors2 = new ArrayList<String>(colors);
//       System.out.println(colors2);

//problem8
//        Collections.shuffle(colors);
//       for (String i : colors){
//          System.out.println(i);
//       }
//problem9
//       System.out.println("before reverse: " + colors);
//       Collections.reverse(colors);
//       System.out.println("after reverse: " + colors);
