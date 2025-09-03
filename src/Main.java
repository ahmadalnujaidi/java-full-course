import java.util.Scanner;
import java.util.Random;
public class Main {
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    } INTRO

//    public static void main(String[] args){
//        int x = 5;
//        double y = 10.50;
//        char symbol = 'A';
//        String name = "Ahmad Alnujaidi";
//        boolean isStudent = false;
//        System.out.println(name + ' '+ y);
//    } VARIABLES
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter your name: ");
//        String name = scanner.nextLine(); // entire line
//        String name = scanner.next() //  next doesnt read after whitespace
//        System.out.print("Enter Age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("enter gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("are you student (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello "+name + " you are age: "+age+" with gpa of: "+gpa);
//
//        if (isStudent){
//            System.out.println("you are student");
//        } else {
//            System.out.println("you are NOT student");
//        }
//
//        scanner.close();
//    } USER INPUT

//    public static void main(String[] args){
//       Scanner scanner = new Scanner((System.in));
//       String adj1;
//       String noun1;
//       String adj2;
//       String verb1;
//       String adj3;
//
//        System.out.print("enter an adj: ");
//        adj1 = scanner.nextLine();
//        System.out.print("enter a noun: ");
//        noun1 = scanner.nextLine();
//        System.out.print("enter an adj: ");
//        adj2 = scanner.nextLine();
//        System.out.print("enter a verb: ");
//        verb1 = scanner.nextLine();
//        System.out.print("enter an adj: ");
//        adj3 = scanner.nextLine();
//
//        System.out.println("today i went to a "+adj1+" zoo");
//        System.out.println("in an exhibit,i saw a "+noun1);
//        System.out.println(noun1 +" was "+adj2+ " and "+verb1);
//        System.out.println("i was "+adj3+"!");
//
//        scanner.close();
//    } MADLIBS GAME (SCANNER PRACTICE)

//    public static void main(String[] args){
//        int x = 10;
//        int y = 2;
//        int z;
////        z = x + y;
////        z = x * y;
//
////        x *= y;
////        System.out.println(x);
////        System.out.println(z);
//        x++;
//        System.out.println(x);
//
//    } // ARITHMETIC

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String item;
//        double price;
//        int qty;
//        char currency = '$';
//        double total;
//
//        System.out.print("what would you like to buy?: ");
//        item = scanner.nextLine();
//
//        System.out.print("price?: ");
//        price = scanner.nextDouble();
//
//        System.out.print("enter qty: ");
//        qty = scanner.nextInt();
//
//        total = price * qty;
//        System.out.println("you have bought "+qty+" "+item+" for a total of: "+currency+total);
//
//        scanner.close();
//    } // SHOPPING CART PROGRAM

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        if (age >= 18){
//            System.out.println("you are old");
//        } else {
//            System.out.println("you are young");
//        }
//        scanner.close();
//    } // IF STATEAMENTS
//
//
//    public static void main(String[] args){
//        Random random = new Random();
//        int number;
//        number = random.nextInt(1,6); // 1 inclusive, 6 exclusive
//        System.out.println(number);
//
//        double dbl = random.nextDouble();
//        System.out.println(dbl);
//
//        boolean isHeads = random.nextBoolean();
//        if(isHeads){
//            System.out.println("its heads");
//        } else {
//            System.out.println("its tails");
//        }
//    } // RANDOM NUMBERS

//    public static void main(String[] args){
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
////        result = Math.pow(2,3);
////        result = Math.abs(-5);
//        result = Math.max(10, 7);
//        // Math.round Math.sqrt, Math.ceil, Math.floor etc...
//
////        System.out.println(result);
//
//        Scanner scanner = new Scanner(System.in);
//        // hypotenuse
//        double a;
//        double b;
//        double c;
//        System.out.print("enter side a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("enter side b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
//        System.out.print("hypotenuse: "+c);
//        scanner.close();
//    } MATH CLASS

//    public static void main(String[] args){
//        // printF format
//         // %[flags][width][.precision][specifier-character]
////        String name = "Spongebob";
////        char firstLetter = 'S';
////        int age = 30;
////        double height = 60.5;
////        boolean isEmployed = true;
////
////        System.out.printf("Hello %s\n", name);
////        System.out.printf("Your name starts with a %c\n", firstLetter);
////        System.out.printf("your age is %d years old\n", age);
////        System.out.printf("You are %f cm tall\n", height);
////        System.out.printf("employed: %b\n", isEmployed);
////
////        System.out.printf("%s is %d years old",name,age);
//
////        double price1 = 9.99;
////        double price2 = 100.15;
////        double price3 = -54.01;
////
////        System.out.printf("%.1f\n", price1);
////        System.out.printf("%.2f\n", price2);
////        System.out.printf("%.1f\n", price3);
//
//        int id1 = 1;
//        int id2 = 23;
//        int id3 = 456;
//        int id4 = 7890;
//
//        System.out.printf("%4d\n", id1);
//        System.out.printf("%4d\n", id2);
//        System.out.printf("%4d\n", id3);
//        System.out.printf("%4d\n", id4);
//
//    } // PRINTF
}
