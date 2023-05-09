package CSA_2;

import java.util.*;
public class CSA_SecondWork {
    public static void main(String args[]){
        System.out.println("<-------第一题------->");
        Monkey monkey  =new Monkey("多拉的猴子");
        People people = new People();
        monkey.speak();
        people.speak();
        people.think();
        System.out.println("<-------第二题------->");
        car Car = new car();
        System.out.println("小车车轮个数为4，车重为：1150.0");
        System.out.println("货车车轮个数为4，车重为：15000.0");
        Car.tips(Car.loader=4);
        Car.tips(Car.loader=6);
        Truck truck= new Truck();
        truck.tips(truck.payload = 4000 ,truck.loader= 2);
        truck.tips(truck.payload = 6000 ,truck.loader= 5);
        System.out.println("<-------第三题------->");
        System.out.println(getSum("829579081298345918257","8823897418920918472193"));
        System.out.println("<-------第五题------->");
        //TODO:在此编写第五题测试代码
        System.out.println("最长公共前缀"+longestCommonPrefix(new String[]{"abcd","abc","abd","ab"}));
    }
    //第三题格式要求,在TODO部分实现代码
    public static String getSum(String a,String b){
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> lb = new ArrayList<Integer>();
        String c="";
        for(int i=a.length()-1;i>=0;--i){
            la.add(a.charAt(i)-'0');
        }
        for(int i=b.length()-1;i>=0;--i){
            lb.add(b.charAt(i)-'0');
        }

        //TODO:在此处编写符合要求的代码，并在主类中编写测试代码

        List<Integer> lc = new ArrayList<Integer>();

        int temp=0;
        int maxsize = Math.max(la.size(),lb.size());
        for (int i = 0; i < maxsize; i++) {

            if(i<la.size()){

                temp += la.get(i);
            }

            if(i<lb.size()){
                temp += lb.get(i);
            }

            lc.add(temp%10);

            temp /= 10;
        }


        if(temp>0)
            lc.add(temp%10);
        for(int i = lc.size()-1;i>=0;i--){
            c += lc.get(i);
        }
        return c;
    }

    //第五题格式要求
    public static String longestCommonPrefix(String[] strs) {

        //TODO:在此处编写符合要求的代码，并在主类中编写测试代码

        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();

        int count = strs.length;

        for (int i = 0; i < length; i++) {

            char c = strs[0].charAt(i);

            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
class Monkey {
    Monkey(){

    }
    String name;
    Monkey( String s){
        this.name = s;
    }
    public void speak(){
        System.out.println(name+"说咿咿呀呀~~~");
    }
}
class People extends Monkey{
         String name = "小明";
    public void speak(){
        System.out.println("小明说小样儿，不错嘛！会说话了！");
        }
        void think(){
        System.out.println("小明说别说！认真思考！");
        }
}
 class Vehicle{
    int wheel ;
    double weight;
    void tips(){

    }
}
class car extends Vehicle{
    int loader ;
    void tips(int s){
        if(loader >5){
            System.out.println("汽车超载啦！");
        }else System.out.println("汽车还能拉"+(5-loader)+"个人");
    }
}
class Truck extends Vehicle{
    int loader = 3;
    int payload;
    void tips(int payload ,int loader){
        if ( this.payload > 5000 && this.loader > 3){
            System.out.println("卡车超重啦！超重了"+(this.payload-5000)+"kg");
            System.out.println("卡车超载啦！超载了"+(this.loader-3)+"人");

        }

        else if (this.payload> 5000 && this.loader<3) {
            System.out.println("卡车超重啦！超重了"+(this.payload-5000)+"kg");
            System.out.println("卡车还能装载"+(3-this.loader)+"人");}
            else if (this.payload< 5000 && this.loader>3) {
            System.out.println("卡车还能装载"+(5000-this.payload)+"kg");
            System.out.println("卡车超载啦！超载了"+(this.loader-3)+"人");
        } else System.out.println("卡车还能装载"+(3-this.loader)+"人和"+(5000-this.payload)+"kg");

         }
        }

