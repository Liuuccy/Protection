import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1,创建键盘输入对象
        Scanner scanner= new Scanner(System.in);
        //2,定义数组用于存放键盘输入的数据
        int[] num =new int[5];
        for (int i = 0;i< num.length;i++){
            num[i] = scanner.nextInt();//获取键盘输入的整型数据并存入数组中

        }
        //将数组中的元素输出到控制台
        for (int i =0; i< num.length;i++){
            System.out.println(num[i]);
        }

    }
}