public class Student {
    String[][] SaveString=new String[100][3];
    long[][] SaveLong=new long[100][4];
    private int i=0;
    private String name;
    private String lastname;
    private long age;
    private long password;
    private String email;
    private String email2;

    public void setName(String n) {
        name = n;
    }
    public void setLastname(String ln) {
        lastname = ln;
    }
    public void setAge(long a) {
        age = a;
    }
    public void setPassword(long p) {
        password = p;
    }

    public void setEmail(String e) {
        email = e;
    }
    public void Save() {
        SaveString[i][0] = name;
        SaveString[i][1] = lastname;
        SaveLong[i][0] = age;
        SaveLong[i][1] = password;
        SaveString[i][2] = email;
        System.out.println("Your information has been registered!!!");
        i++;
    }
    public int Checks(long pas2,String email2) {
        for (int i = 0; i < 100; i++) {
            if (SaveLong[i][1] == pas2 && SaveString[i][2] == email2) {
                System.out.println("you entered!!!");
                return 1;
            }
            else {
                System.out.println("The information is unknown!!!");
                return 0;
            }
        }
        return 0;
    }
}
