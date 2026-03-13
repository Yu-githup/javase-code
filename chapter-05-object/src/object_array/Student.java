package object_array;

/**
 * 学生
 *
 * @author Yu
 * @create 2026-03-13 20:27
 */
public class Student {
    int number;//学号
    int state;//年级
    int score;//成绩

    public void info(){
        System.out.println("number : " + number + ",state : " + state + ",score : " + score);
    }
}
