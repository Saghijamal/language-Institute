public class Professor {
    String[][] SavepString=new String[100][3];
    long[][] SavepLong=new long[100][4];
    private int i=0;
    private String name;
    private String lastname;
    private long age;
    private long password;
    private String email;
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
    public void Save(){
        SavepString[i][0]=name;
        SavepString[i][1]=lastname;
        SavepLong[i][0]=age;
        SavepLong[i][1]=password;
        SavepString[i][2]=email;
        System.out.println("Your information has been registered!!!");
        i++;
    }
    public int Checkp(long pas,String email){
        for(int i=0;i<100;i++){
            if(SavepLong[i][1]==pas&&SavepString[i][2]==email) {
                System.out.println("you entered!!!");
                return 1;
            }
        }
        System.out.println("The information is unknown!!!");
        return 0;
    }
}
