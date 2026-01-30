public class BlueJPattern{
    public static void main(String[] args) {
        String st = "ABCDE";

        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                System.out.print(st.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}