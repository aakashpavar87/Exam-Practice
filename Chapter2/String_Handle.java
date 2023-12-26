public class String_Handle{
    public static void main(String[] args) {
        // String str = "Demo String";
        String name = new String("Aakash Pavar Bhavesh Pavar");
        String[] nameArr = name.split(" ");
        for (String myStr : nameArr) {
            System.out.println(myStr);
        }
        String second = name.substring(13);
        System.out.println(second);
        // System.out.println(str.length());
        // System.out.println(str);
        // System.out.println(name);
    }
}