package Bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi danh muc (cach nhau boi dau phay): ");
        String categories = sc.nextLine();
        if (categories.length() == 0){
            System.out.println("Chuoi rong");
            return;
        }
        System.out.println(categories);

        // su dung map de luu tru
        Map<String, Integer> category = new HashMap();

        String [] arr = categories.split(", ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isHas = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    if (i > j && count == 0) {
                        isHas = true;
                        break;
                    }
                    count++;
                }
            }
            if (!isHas) {
                category.put(arr[i].toLowerCase(), count);
            }
        }
        System.out.println(category);

        String searchCategory = sc.nextLine();
        System.out.println("Search "+ searchCategory.toLowerCase() +": " + category.get(searchCategory.toLowerCase()));

    }
}
