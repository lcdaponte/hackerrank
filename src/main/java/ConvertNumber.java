public class ConvertNumber {
    public static void main(String[] args) {
        int number = 500;
        String convertNumber = convertNumber(number);

        if(number == Integer.parseInt(convertNumber)){
            System.out.println("Good work");
        }else{
            System.out.println("Wrong answer");
        }
    }


    public static String convertNumber(int i){
        return String.valueOf(i);
    }
}
