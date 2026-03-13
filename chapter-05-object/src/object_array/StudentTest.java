package object_array;

/**
 * 测试类
 *
 * @author Yu
 * @create 2026-03-13 20:28
 */
public class StudentTest {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.number = 1;
        // s1.state = (int)(Math.random() * 6 + 1);//[1,6]
        // s1.score = (int)(Math.random() * 101);//[0,100]
        //
        // Student s2 = new Student();
        // s2.number = 2;
        // s2.state = (int)(Math.random() * 6 + 1);//[1,6]
        // s2.score = (int)(Math.random() * 101);//[0,100]
        //
        // //....
        // 对象数组
        // String[] arr = new String[10];
        // 数组的创建
        Student[] students = new Student[20];
        // 通过循环结构给数组的属性赋值
        for (int i = 0; i < students.length; i++) {
        // 数组元素的赋值
            students[i] = new Student();
        // 数组元素是一个对象，给对象的各个属性赋值
            students[i].number = (i + 1);
            students[i].state = (int) (Math.random() * 6 + 1);// [1,6]
            students[i].score = (int) (Math.random() * 101);// [0,100]
        }
        // 问题一：打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
               // System.out.println("number:" + students[i].number + ",state:" + students[i].state
               // +",score:" + students[i].score);
               // students[i].info();
            }
        }
        System.out.println("******************************");
        // 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        // 排序前
        for (int i = 0; i < students.length; i++) {
            // System.out.println(
            // "number:" + students[i].number + ",state:" +
            // students[i].state + ",score:" + students[i].score);
            students[i].info();
        }
        System.out.println();
        // 排序：
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        // 排序后：
        for (int i = 0; i < students.length; i++) {
            // System.out.println(
            // "number:" + students[i].number + ",state:" +
            // students[i].state + ",score:" + students[i].score);
            students[i].info();
        }
    }
}
