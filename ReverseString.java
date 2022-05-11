public class ReverseString {
    public static void main(String args[])
    {
        ReverseString reverseString= new ReverseString();
        String name="abcd";
        String rev= reverseString.reverseString(name);
        System.out.println("Reverse String" +rev);
    }
    public String reverseString(String input){
        String array[] = input.split("");
        String reverse = "";
        for (int i=array.length-1;i>=0;i--){
            reverse=reverse+array[i];

        }
        return reverse;


    }
}