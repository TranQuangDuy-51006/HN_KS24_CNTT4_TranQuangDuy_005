package Bai1;
//
//Xay dung chuong trinh quan ly van chuyen cua cac don hang trong ngay
//a  Tim chi phi van chuyen cao nhat
//b. Tinh tong doanh thu phi van chuyen va phi trung binh moi don
//c. Hien thi danh sach don thep thu tu giam dan (Khong trung)
//d. Dem so luong don hang co phi Hoa toc (phi >= 50)
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Rong!!");
            return;
        }

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextDouble());
        }

        double max = Collections.max(list);

        double sum = 0;
        for (double fee : list) {
            sum += fee;
        }

        double avg = sum / n;

        Set<Double> set = new TreeSet<>(Collections.reverseOrder());
        set.addAll(list);

        int express = 0;
        for (double fee : list) {
            if (fee >= 50) {
                express++;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Total: " + sum);
        System.out.println("Average: " + avg);

        System.out.print("Descending: ");
        for (double fee : set) {
            System.out.print(fee + " ");
        }

        System.out.println("\nExpress: " + express);
    }
}
