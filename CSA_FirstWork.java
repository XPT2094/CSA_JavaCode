import java.util.Scanner;
public class CSA_FirstWork {
    public static void sumArray(int b[]){
        int max = b[0];
        int min = b[0];
        for(int i = 0 ; i < b.length  ; i ++){
            if(b[i] > max){
                max = b[i];
            } else if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.println("数组的最大值是" + max);
        System.out.println("数组的最小值是" + min);
        System.out.println("数组的最大值加最小值的和是" + (max+min));
    }
    public  static void showTriangle( int n ){
        int m = 2*n-1;
        int y = n-1;
        String a[] = new String[m];
        for(int i = 0 ; i < m ; i ++){

            a[i]=" ";

            if(i == n -1){
                a[i] = "*";
            }
        }
        for(int i = 1 ; i <= n ; i++){
            for(int x= 0 ; x <2*n-1 ; x++){
                System.out.print(a[x]);
            }
            if((y+i )< a.length) {
                a[y + i] = a[y];
                a[y - i] = a[y];
            }
            System.out.println();
        }
    }
    public static void reverseString(String s){
        char[]  chars  = s.toCharArray();
        char x = ' ';
        for (int i = 0  ; i < chars.length/2;i++){

            x  =   chars[i] ;
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-1-i] = x;
        }
        s = String.valueOf(chars);
        System.out.println(s);

    }
    public static  void  isPalindrome(int i) {
        int sum=0;
        int num=i;
        int tem=num;
        for(;num>0;num/=10) {
            sum=sum*10+(num%10);
        }
        boolean flag=(sum==tem);
        if(flag==true) {
            System.out.println("是的");
        }else System.out.println("不是");
    }
    public static void main(String[] args){
        System.out.println("1、B   2、B  3、D  4、B  5、D");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintTriangle.showTriangle(n);

        String b = in.next();
        ReverseString.reverseString(b);


        int a;
        a=in.nextInt();
        HuiWenShu.isPalindrome(a);


        int x,y,z;
        System.out.println("三位数的水仙花数有：");
        for(int i = 100 ; i < 1000 ; i++){
            x = i % 10;
            y = i % 100 / 10 ;
            z = i /100;
            if(i == x*x*x+y*y*y+z*z*z){
                System.out.print(i+" ");
            }
        }


        int[] a1 = new int[10];


        for(int i =0 ; i< a1.length  ;i++){
            a1[i] = in.nextInt();
        }
        SumArray.sumArray(a1);
    }





}

