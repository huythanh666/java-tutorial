

public class Main{
    public static void main(String[] args){
        String name = "      Huy Thanh    ";
        int length = name.length();
        char letter  = name.charAt(0);
        int index = name.indexOf("u");
        int lastIndex = name.lastIndexOf("h");
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim(); // xoá khoảng cách
        name = name.replace("h","k");
        System.out.println(name);

        if(name.isEmpty()){ // kiểm tra chuỗi rỗng hay 0
            System.out.println("");
        }else{
            System.out.println("");
        }

        if(name.contains(" ")){ // kiểm tra chuỗi có chứa ký tự này 0
            System.out.println("");
        }else{
            System.out.println("");
        }

        if(name.equals(" ")){ // so sánh chuỗi
            System.out.println("");
        }else{
            System.out.println("");
        }

    }
}