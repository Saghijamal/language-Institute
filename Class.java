import java.util.Scanner;
public class Class {
    String[][] SaveString = new String[100][7];
    int[][] SaveInt = new int[100][3];
    String[][] SaveClass=new String[100][2];
    Scanner scanner = new Scanner(System.in);
    private int i = 0;
    private int k=0;
    private String name;
    private String language;
    private int month;
    private int capacity;
    private String information;
    private int price;
    private String beginning;
    private String end;
    private String exam;
    private String holding;

    public void setName(String n) { name = n; }

    public void setLanguage(String l) {
        language = l;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setCapacity(int c) {
        capacity = c;
    }

    public void setInformation(String inf) {
        information = inf;
    }
    public void setPrice(int p){ price=p; }
    public void setBeginning(String begin){ beginning=begin;}
    public void setEnd(String end1){ end=end1; }
    public void setExam(String exam1){ exam=exam1; }
    public void setHolding(String hold){ holding=hold; }

    public void Save() {
        SaveString[i][0] = name;
        SaveString[i][1] = language;
        SaveInt[i][0] = month;
        SaveInt[i][1] = capacity;
        SaveString[i][2] = information;
        SaveInt[i][2]=price;
        SaveString[i][3]=beginning;
        SaveString[i][4]=end;
        SaveString[i][5]=exam;
        SaveString[i][6]=holding;
        System.out.println("Your class information has been entered!!!");
        i++;
    }

    public void print() {
        //print class hay taeen shode tavasot ostad
        outer : for (int j = 0; j <= i; j++) {
            if (SaveString[j][0] == null)
                break outer;
            else {
                int code = j;
                System.out.println("code :" + j);
                System.out.println("name :" + SaveString[j][0]);
                System.out.println("language :" + SaveString[j][1]);
                System.out.println("month :" + SaveInt[j][0]);
                System.out.println("capacity :" + SaveInt[j][1]);
                System.out.println("information :" + SaveString[j][2]);
                System.out.println("price :" + SaveInt[j][2]);
                System.out.println("start time :" + SaveString[j][3]);
                System.out.println("end time :" + SaveString[j][4]);
                System.out.println("exam time :" + SaveString[j][5]);
                System.out.println("holding :" + SaveString[j][6]);
                System.out.println();
                System.out.println("Do you want to participate ?");
                System.out.println("1:yes / 2:no ");
                int b = scanner.nextInt();
                if (b == 1) {
                    if (SaveInt[j][1] != 0) {
                        System.out.println("Enter your email :");
                        String email = scanner.nextLine();
                        String email2= scanner.nextLine();
                        SaveClass[k][0] = email;
                        SaveClass[k][1] = SaveString[j][0];
                        k++;
                        System.out.println("You are enrolled in this class!!!");
                        System.out.println("class code :" + j);
                        System.out.println();
                        SaveInt[j][1]--;
                    }
                }
            }
        }
        //print class hay az pish taeen shodeh
        //class az pish taeen shodeh 1 :
        int l = 1;
        System.out.println("code :" + l);
        System.out.println("name : Six-month IELTS course");
        System.out.println("language : English");
        System.out.println("month : 6");
        System.out.println("capacity : 30");
        int c = 30;
        System.out.println("information : The professor of this course is Dr.Ahmadi and you will study IELTS completely in 6 months");
        System.out.println("price : 6_000_000");
        System.out.println("start time : 1 tir");
        System.out.println("end time : 1 dey");
        System.out.println("exam time : 8 dey");
        System.out.println("holding : 1 time a week for 120 minutes");
        System.out.println();
        System.out.println("Do you want to participate ?");
        System.out.println("1:yes / 2:no ");
        int a = scanner.nextInt();
        if (a == 1) {
            if(c!=0){
                System.out.println("Enter your email :");
                String email=scanner.nextLine();
                String email2=scanner.nextLine();
                SaveClass[k][0]=email;
                SaveClass[k][1]= "Six-month IELTS course";
                k++;
                System.out.println("You are enrolled in this class!!!");
                System.out.println("class code :" + l);
                System.out.println();
                c--;
            }
        }
        //class az pish taeen shodeh 2 :
        l++;
        System.out.println("code :" + l);
        System.out.println("name : Elementary Russian class");
        System.out.println("language : Russian");
        System.out.println("month : 3");
        System.out.println("capacity : 15");
        int ca = 15;
        System.out.println("information : The teacher of this course is Dr. Mohammadi, who studied Russian language in Moscow," +
                "and the previous students were very satisfied");
        System.out.println("price : 4_000_000");
        System.out.println("start time : 15 mordad");
        System.out.println("end time : 15 mehr");
        System.out.println("exam time : 30 mehr");
        System.out.println("holding : 2 time a week for 60 minutes");
        System.out.println();
        System.out.println("Do you want to participate ?");
        System.out.println("1:yes / 2:no ");
        int d = scanner.nextInt();
        if (d == 1) {
            if(ca!=0){
                System.out.println("Enter your email :");
                String email=scanner.nextLine();
                String email2=scanner.nextLine();
                SaveClass[k][0]=email;
                SaveClass[k][1]="Elementary Russian class";
                k++;
                System.out.println("You are enrolled in this class!!!");
                System.out.println("class code :" + l);
                System.out.println();
                ca--;
            }
        }
        //class az pish taeen shodeh 3 :
        l++;
        System.out.println("code :" + l);
        System.out.println("name : Intermediate French course");
        System.out.println("language : ّFrench");
        System.out.println("month : 6");
        System.out.println("capacity : 10");
        int cap = 10;
        System.out.println("information : The professor of this course is Dr. Daneshvari," +
                "who studied in France and completed his graduate studies at Tehran University");
        System.out.println("price : 10_000_000");
        System.out.println("start time : 1 mehr");
        System.out.println("end time : 20 esfand");
        System.out.println("exam time : 24 esfand");
        System.out.println("holding : 2 time a week for 90 minutes");
        System.out.println();
        System.out.println("Do you want to participate ?");
        System.out.println("1:yes / 2:no ");
        int e = scanner.nextInt();
        if (e == 1) {
            if(cap!=0){
                System.out.println("Enter your email :");
                String email=scanner.nextLine();
                String email2=scanner.nextLine();
                SaveClass[k][0]=email;
                SaveClass[k][1]="Intermediate French course";
                k++;
                System.out.println("You are enrolled in this class!!!");
                System.out.println("class code :" + l);
                System.out.println();
                cap--;
            }
        }
        //class az pish taeen shodeh 4 :
        l++;
        System.out.println("code :" + l);
        System.out.println("name : Ph.D exam language class course");
        System.out.println("language : English");
        System.out.println("month : 1");
        System.out.println("capacity : 20");
        int capi = 20;
        System.out.println("information : This course is only for graduate students who intend to participate in the doctoral exam." +
                "The professor of the course is Dr. Salmani");
        System.out.println("price : 2_000_000");
        System.out.println("start time : 1 mordad");
        System.out.println("end time : 1 shahrivar");
        System.out.println("exam time : 5 shahrivar");
        System.out.println("holding : 2 time a week for 120 minutes");
        System.out.println();
        System.out.println("Do you want to participate ?");
        System.out.println("1:yes / 2:no ");
        int h = scanner.nextInt();
        if (h == 1) {
            if(capi!=0){
                System.out.println("Enter your email :");
                String email=scanner.nextLine();
                String email2=scanner.nextLine();
                SaveClass[k][0]=email;
                SaveClass[k][1]="Ph.D exam language class course";
                k++;
                System.out.println("You are enrolled in this class!!!");
                System.out.println("class code :" + l);
                System.out.println();
                capi--;
            }
        }
    }
}
