package CSA_ThirdWork;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("<-------第一题------->");
        UseCompute us = new UseCompute();
        us.useCom(new sum(),1,2);
        us.useCom(new jian(),3,1);
        us.useCom(new chu(),4,2);
        us.useCom(new chu(),4,0);
        us.useCom(new cheng(),4,2);
        System.out.println("<-------第二题------->");
        Scanner in = new Scanner(System.in);
        System.out.println("输入您的分数:");
        input x = new input();
        try{
            x.input(in.nextInt());
        }catch (inputExcept e){
            System.out.println("输入成绩时出现问题：");
            System.out.println(e.warnMassage());
        }
        System.out.println("<-------第三题------->");
        System.out.print("输入您想求取平均数的个数：");
        int count = in.nextInt();
        int a[] = new int[count];
        float sum = 0;
        checkNum num = new checkNum();
        for(int i= 0 ; i < count ; i ++ ) {
            System.out.print("请输入第"+(i+1)+"个求平均的数字:");
            a[i] = in.nextInt();
            try {
                int n = a[i];
                if (n > 0) {
                    sum += a[i];
                }
                num.checkNum(n);

            } catch (checkArray e) {
                System.out.println("输入时出现问题：");
                System.out.println(e.warnmas());
                System.out.println("请重新输入数字。");
                i--;
            }
        }
        System.out.println("这"+count+"个数字的平均值是："+sum/count);
        System.out.println("<-------第四题------->");
        System.out.println("类已写，想实现的功能还有点问题。。。");
//        MyDate date = new MyDate() ;
//        Employee e = new Employee();
//        System.out.print("请输入姓名：");
//        String name = in.next();
//        System.out.print("请输入电话号码：");
//        int phone = in.nextInt();
//        System.out.print("请输入生日年份： ");
//        date.setYear(in.nextInt());
//        date.earnings();
//        System.out.print("请输入生日月份： ");
//        date.setMonth(in.nextInt());
//        date.earnings();
//        System.out.print("请输入生日日期： ");
//        date.setDay(in.nextInt());
//        date.earnings();
//        e.Employee(name,phone,date);
//         date.MyDate();
//        e.toString();
        System.out.println("<-------第五题------->");
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        panDuan pd = new panDuan();
        System.out.println("words里面有"+pd.panDuan(words,s)+"个S的子序列的单词");
    }
}
interface Compute {
    int n = 0;
    int m = 0;
    String a = "";

     int computer(int n, int m) ;
    }

    class sum implements Compute {

        public  int computer(int n, int m) {
            return m + n;
        }
    }

    class jian implements Compute {
        public int computer(int n, int m) {
            return n - m;
        }
    }

    class cheng implements Compute {
        public int computer(int n, int m) {

            return n * m;
        }
    }

    class chu implements Compute {
        public int computer(int n, int m) {
            if(m == 0){
                System.out.println("分母不能为0");
                return 0;
            }else {
                return n / m;
            }

        }
    }

    class UseCompute {
        public void useCom(Compute com, int one, int two) {
            System.out.println(com.computer(one,two));
        }
    }


    class inputExcept extends Exception {
        String massage;

        public inputExcept(int n) {
            massage = "数字 " + n + " 不符合应该小于100而且大于0的规则.";
        }

        public String warnMassage() {
            return massage;
        }
    }

    class input {
        int n;

        public void input(int n) throws inputExcept {
            if (n < 0 || n > 100) {
                throw new inputExcept(n);
            }
        }
//    public  int  getInput(int n ){
//        return this.n;
//    }
    }
    class checkArray extends Exception{
    String mas;
    public checkArray (int n ){
        mas = "数字："+n+"不符合必须是整数或者0的规则！！！";
    }
    public String warnmas(){
        return mas;
    }
    }
class checkNum{
    public void checkNum (int n) throws checkArray{
        if(n < 0){
            throw new checkArray(n);

        }
    }
}
 class Employee{
     private String name;
     private int num;
     private MyDate birthday;
  void   Employee(String name ,int num,MyDate birthday){
        this.name= name;
        this.num=num;
        this.birthday = birthday;
    }

      void  earnings(){};
   public  String toString(){
        return name + num + birthday;
    }
}
class MyDate extends Employee{

    int year;
   int month;
    int day;
    void setYear(int year){
        this.year= year;
    }
     void setMonth(int month) {
        this.month = month;
    }
     void setDay(int day) {
        this.day = day;
    }

    void earnings(){
        int n = 0 ;
        if((year) >  2023){
            System.out.println("年份输入错误！");
        } else if ((month)>12||(month)<0) {
            System.out.println("月份输入错误！");
        } else if ((day)>31||(day)<1) {
            System.out.println("日期输入错误！");
        }else n = 2;
     };
   public String  MyDate(){

        return this.year+"."+this.month+"."+this.day;

    }
}
 class panDuan{

    String words[];
    String s;

    int  panDuan(String words[],String s){
        int count = words.length;
        int flag = 1;
        int l = 0;
        char x;
        char k ;
        for(int i = 0 ; i < words.length;i++){
            for (int y = 0 ; y <words[i].length();y++){
                x = words[i].charAt(y);

                int o[] = new  int[words[i].length()];
                for (int m = 0 ;m<s.length();m++){

                    k = s.charAt(m);
                     if ((x != k&& m==s.length()-1) ){
                        count--;
                        flag = 0;
                        break;
                    } else if (x==k ) {

                     }
                      break;
                }
                if( flag == 0 ) break;
            }
        }
        for(int i = 0 ; i <words.length;i++){
            for (int y = 0 ; y <words[i].length();y++){
                if(y <words[i].length()-1&&words[i].charAt(y)==words[i].charAt(y+1)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
