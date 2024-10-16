public class JavaStringBuilder {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("hello");
        //reversing sb using string builder, we will use string as array.

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; 

            char backChar = sb.charAt(back);
            char frontChar = sb.charAt(front);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}