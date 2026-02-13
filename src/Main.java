import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args)  {
        String path = "C:\\Users\\ADMIN\\Desktop\\test.txt";
        String textContent = "mot con vit xoe ra 2 cai canh";
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(textContent);
            System.out.println("da xong");
        }
       catch (IOException e){
            System.out.println("Khong tim duoc duong dan");


        }
        File file = new File(path);

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file tại đường dẫn đã cho.");
        }
    }
}