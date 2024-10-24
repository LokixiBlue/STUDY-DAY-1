public class test1 {
    public static void main(String[] args) {
        //测试各类定义
        int x=0,y=x+3;
        System.out.println("x="+x);
        System.out.println("y="+y);
        //long类型，未超出int范围，可以省略L，未超出int范围，可以加L，超出了int范围，必须加L
        long num =2200000000L;
        long arr=198L;
        long next=198;
        System.out.println(num);
        System.out.println(arr);
        System.out.println(next);
        //为double变量赋值，可以加上或者省略字母d，为float赋值，必须加上字母f
        float f=123.4f;
        double d1=100.1;
        double d2=100.2d;
        //为浮点数赋值一个整数
        float f1=100;
        double d3=100;
        System.out.println(f);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println(d3);
        //定义字符类变量
        char c='a';
        char ch=97;
        System.out.println(c);
        System.out.println(ch);
        //布尔类型变量
        boolean flag=false;
        flag=true;
        System.out.println(flag);

    }
}
