import employee.Employee;
import employee.FullTimeE;
import employee.PartTimeE;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new FullTimeE("33981", "Hiếu", 24, "0924133124", "email1", 3100, 1000, 4000);
        Employee e2 = new FullTimeE("32241", "Vinh", 20, "0923458712", "email2", 3400, 1200, 4300);
        Employee e3 = new FullTimeE("12345", "Tuấn", 23, "0947587482", "email3", 3500, 1300, 4400);
        Employee e4 = new FullTimeE("13451", "Hân", 25, "0924133124", "email4", 3700, 1400, 4100);
        Employee e5 = new FullTimeE("34633", "Trung", 27, "0924133124", "email5", 3200, 1200, 4200);
        Employee e6 = new PartTimeE("14366", "Hoàng", 22, "0923485812", "email6", 8);
        Employee e7 = new PartTimeE("83744", "Quân", 27, "0923485812", "email7", 6);
        Employee e8 = new PartTimeE("12394", "Huy", 22, "0923485812", "email8", 5);
        Employee e9 = new PartTimeE("58412", "Phong", 22, "0923485812", "email9", 3);
        Employee e10 = new PartTimeE("43912", "Lương", 24, "0923485812", "email10", 4);
        Employee listE[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};

        System.out.println("Lương thực lĩnh");
        double sumWage = 0;
        for (Employee e : listE) {
            sumWage += e.getWage();
        }
        double average = sumWage / listE.length;
        System.out.println("Mức lương trung bình là");
        System.out.println(average);
        lowerThanAverageSalary(listE, average);
        totalSalaryEmployeePartTime(listE);
        System.out.println("Sắp xếp danh sách FullTime");
        Arrays.sort(listE);
        for (Employee e : listE) {
            if (e instanceof FullTimeE) {
                System.out.println(e);
            }
        }

    }
    //Danh sách có mức lương thấp hơn trung bình

    public static void lowerThanAverageSalary(Employee[] array, double avg) {
        int count = 0;
        System.out.println("Danh sách có mức lương thấp hơn trung bình");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof FullTimeE) {
                FullTimeE employee = (FullTimeE) array[i];
                double Salary = employee.getWage();
                if (Salary < avg) {
                    count++;
                    System.out.print(count + ".");
                    System.out.println(employee.toString());
                }
            }
        }
    }

    //    Tổng số lương phải trả cho nhân viên part_time
    public static void totalSalaryEmployeePartTime(Employee[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof PartTimeE) {
                PartTimeE partTimeE = (PartTimeE) array[i];
                sum += partTimeE.getWage();
            }
        }
        System.out.println("Tổng số lương phải trả cho nhân viên PartTime là : " + sum);

    }


}
