public class Main{
    public static void main(String[] args){
        String name = "Elvin";
        char firstLetter = 'E';
        int age = 28;
        double height = 60.5;
        boolean isEmployed = true;

//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("You are %f inches tall\n", height);
//        System.out.printf("Employed %b\n", isEmployed);
//        System.out.printf("%s is %d years old\n", name, age);
        double price = 1900.99;
        /*
        * + thêm dấu cộng vào trước số
        * , ngăn cách số vd 19000 = 19,000
        * ( số  âm sẽ được ngăn cách trong ()
        * space hiển thị dấu trừ với số âm, dấu cách với số dương
        * */
        System.out.printf("%.4f\n",height);
        System.out.printf("%+.1f\n",price);
    }
}