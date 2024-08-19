package org.example.day01;

//import java.util.Scanner;

/**
 * @author Xiao明
 */
public class Example01 {

    /*
        一.关键字
           1.定义数据类型
                class   interface   enum   byte
                short   int         long   float
                double  char        boolean  void
           2.流程控制
                if      else    switch   case   default
                while   do      for      break   continue
                return
          3.访问权限
                private     protected   public
          4.多线程
                synchronized    volatile
          5.类的继承与接口实现
                extends         implements
          6.建立实例，引用实例及判断实例
                new     this    super      instanceof
          7.异常处理
                try     catch   finally     throw     throws
          8.包
                package     import
          9.类，方法，变量
                abstract  final    static  native
                transient       strictfp
         10.测试相关
            assert
     */

    /*
        二.变量
            1.先声明，后使用
            2.格式： 数据类型  变量名 = 值
            3.数据类型： int,long,short,byte
                       float(l),double
                       char
                       string
                       boolean
                       引用类型：class
                               interface
                               enum
                               array[]
            4.运算符：&&短路与
                    ||短路或
                    ？：三位运算符 eg：a>b?a:b <=> if a>b => a
            5.常见转义字符：\b  退格
                         \n  换行
                         \r  回车
                         \t  制表 => 获得一个Tab键空间大小
                         \"  双引
                         \'  单引
                         \\  反斜杠
           6.数据类型转换:自动转换(小转大)
                        强制转换(大转小) 格式：(目标类型)数据值
     */

    /*
        三.流程控制语句
            1.if语句  格式：if(条件表达式){语句块}
            2.if...else 格式：if(条件表达式){语句块}else{语句块}
            3.if...else if 格式：if(条件表达式){语句块}else if(条件表达式){语句块}
            4.switch-case(类型：int,char,string)
                   格式：switch(变量/表达式){
                                case 常量:
                                    语句1;
                                    break;
                                ...
                                default:
                                    语句;
                                    break;
                        }
            5.循环结构
                  while(循环条件 ){循环体;迭代表达式}
                  do...while语句,先执行一次
            6.for语句
            for(循环变量初始化;循环条件;迭代表达式){
                循环体语句
            }
            例子：for(int i = 0; i <= 0; i++){System.out.println("执行了" + i + "次hello" );}

     */

    /*
        四.数组
            1.一维数组
                声明：元素数据类型[] 数组名;
                例子:int[] elements;
            2.初始化：
                元素数据类型[] 数组名 = new 元素数据类型[]{元素1,元素2,...};
                例子:int[] arr = new int[]{1,3,5,7,9};
            3.动态初始化
                例子:int[] arr = new int[5];
            4.使用
                  数组名.length -> 获取数组长度
                  数组名[下标] = 新的值 -> 获取指定位置元素范围[0,arr.length - 1]
                  数组下标从0开始标记
                  打印数组名，显示的是数组维度信息，元素类型及哈希值
            5.算法
                 元素特征值统计
                 最值查找
                 顺序查找
                 二分法查找
                 冒泡排序等十种排序
     */

    /*
        五.类与对象
            1.类的声明
                修饰符 class 类名{
                                0个或者多个属性定义
                                0个或者多个构造器定义
                                0个或者多个方法定义
                                ...
                            }
           2.常见成员：属性
                     构造器
                     方法
           3.[动态]对象的创建
     */

    public static void main(String[] args) {

/*
       int index = (int)(Math.random() * 100);
        System.out.println("随机猜一个数字0~99");
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();

        if (target == index){
            System.out.println("恭喜猜对了，随机数为：" + index);
        } else {
            System.out.println("遗憾，猜错了，随机数为：" + index);
        }
        System.out.println("hello\t" + "world");
            int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.println(arr);
        }
*/

    }

}
