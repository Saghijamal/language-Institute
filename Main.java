import java.util.Scanner;
public abstract class Main {
    static Scanner scanner = new Scanner(System.in);
    static Student stu = new Student();
    static Professor pro = new Professor();
    static Class cls = new Class();

    public static void main(String[] args) {
        Menu();
    }

    static void Menu() {
        int x;
        do {
            System.out.println();
            System.out.println("Main Menu : Select the desired option :");
            System.out.println("1:Register / 2:Log in / 3:Exit");
            x = scanner.nextInt();
            if (x == 1 || x == 2)
                Selection(x);
            else if(x==3)
                System.out.println("Goodbye");
        } while (x != 1 || x != 2 || x != 3);
    }

    static void Selection(int x) {
        int y;
        do {
            System.out.println("Select the desired option :");
            System.out.println("1:Student / 2:Professor / 3:Exit / 4:Return");
            y = scanner.nextInt();
            if (y == 1 || y == 2)
                Station(x, y);
            else if (y == 3)
                System.out.println("Goodbye");
            else if (y == 4)
                Menu();
        } while (y != 1 || y != 2 || y != 3 || y != 4);
    }

    static void Station(int x, int y) {
        //Register Student
        if (x == 1 && y == 1) {
            //khat badi serfan baray ejray dorost
            String c = scanner.nextLine();
            System.out.println("name : ");
            String n = scanner.nextLine();
            stu.setName(n.toLowerCase());
            System.out.println("lastname : ");
            String ln = scanner.nextLine();
            stu.setLastname(ln.toLowerCase());
            System.out.println("age : ");
            long a = scanner.nextLong();
            stu.setAge(a);
            //password faghat be sorat adadi
            System.out.println("password (Only numerical) : ");
            long p = scanner.nextLong();
            stu.setPassword(p);
            System.out.println("email : ");
            String e = scanner.nextLine();
            stu.setEmail(e.toLowerCase());
            //khat badi serfan baray ejray dorost
            String b = scanner.nextLine();
            stu.Save();
            center();
        }
        //Register Professor
        if (x == 1 && y == 2) {
            //baray ejray dorost
            String c = scanner.nextLine();
            System.out.println("name : ");
            String n = scanner.nextLine();
            pro.setName(n.toLowerCase());
            System.out.println("lastname : ");
            String ln = scanner.nextLine();
            pro.setLastname(ln.toLowerCase());
            System.out.println("age : ");
            long a = scanner.nextLong();
            pro.setAge(a);
            System.out.println("password (Only numerical) : ");
            long p = scanner.nextLong();
            pro.setPassword(p);
            System.out.println("email : ");
            String e = scanner.nextLine();
            pro.setEmail(e);
            //baray ejray dorost
            String b = scanner.nextLine();
            pro.Save();
            center2();
        }
        //Log in student
        if (x == 2 && y == 1) {
            System.out.println("Enter your password : ");
            long pas = scanner.nextLong();
            System.out.println("Enter your email : ");
            String email = scanner.nextLine();
            String email2=scanner.nextLine();
            if(stu.Checks(pas, email)==1){
                center();
            }
                else
                    Menu();
        }
        //Log in professor
        if (x == 2 && y == 2) {
            System.out.println("Enter your password : ");
            long pas = scanner.nextLong();
            System.out.println("Enter your email : ");
            String email = scanner.nextLine();
            String email2=scanner.nextLine();
            if(pro.Checkp(pas, email)==1){
                center2();
            }
            else
                Menu();
        }
    }
    static void center(){
        int z = intermediary();
        if (z==1) {
            cls.print();
            center();
        }
        else
            Menu();
    }
    static void center2(){
        int z=intermediary2();
        if(z==1){
            Selection3(z);
            center2();
        }
        else if(z==2) {
            cls.print();
            center2();
        }
        else
            Menu();
    }

    //baray student
    static int intermediary() {
        System.out.println("Select the desired option :");
        System.out.println("1:Class selection / 2:Return / 3:logout");
        int z = scanner.nextInt();
        return z;
    }

    //baray professor
    static int intermediary2() {
        System.out.println("Select the desired option :");
        System.out.println("1:Create a new class / 2:Class selection / 3:Return / 4:logout");
        int z = scanner.nextInt();
        return z;
    }

    //baray professor
    static void Selection3(int z) {
        //khat badi serfan baray ejray dorost
        String c = scanner.nextLine();
        System.out.println("Class Name :");
        String n = scanner.nextLine();
        cls.setName(n.toLowerCase());
        System.out.println("Class language :");
        String l = scanner.nextLine();
        cls.setLanguage(l.toLowerCase());
        System.out.println("Number of months :");
        int nm = scanner.nextInt();
        cls.setMonth(nm);
        System.out.println("capacity :");
        int cap = scanner.nextInt();
        cls.setCapacity(cap);
        System.out.println("information :");
        String inf = scanner.nextLine();
        String info = scanner.nextLine();
        cls.setInformation(inf.toLowerCase());
        System.out.println("price :");
        int price = scanner.nextInt();
        cls.setPrice(price);
        System.out.println("start time :");
        String start = scanner.nextLine();
        String start2 = scanner.nextLine();
        cls.setBeginning(start.toLowerCase());
        System.out.println("end time :");
        String end = scanner.nextLine();
        cls.setEnd(end.toLowerCase());
        System.out.println("exam time :");
        String exam = scanner.nextLine();
        cls.setExam(exam.toLowerCase());
        System.out.println("holding :");
        String hold = scanner.nextLine();
        cls.setHolding(hold.toLowerCase());
        //khat badi serfan baray ejray dorost
        String b = scanner.nextLine();
        cls.Save();
    }
}