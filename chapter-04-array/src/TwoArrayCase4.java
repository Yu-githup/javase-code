/**
 * 二维数组案例4
 *
 * @author Yu
 * @create 2026-03-10 22:23
 */
public class TwoArrayCase4 {
    public static void main(String[] args) {
        // 1、初始化
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵 敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨 过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭 靖", "25", "7100"},
                {"12", "12", "黄 蓉", "27", "9600", "4800"}
        };

        // 2、遍历
        System.out.println("员工类型\t编号\t姓名\t\t年龄\t薪资\t\t奖金\t\t股票");
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                String type = employees[i][0];
                switch (type) {
                    case "10":
                        employees[i][0] = "普通职员";
                        break;
                    case "11":
                        employees[i][0] = "程序员";
                        break;
                    case "12":
                        employees[i][0] = "设计师";
                        break;
                    case "13":
                        employees[i][0] = "架构师";
                        break;
                }
                System.out.print(employees[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
