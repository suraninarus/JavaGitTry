public class firstTry{
    public static void main(String[] args){
        System.out.println("Started");
        int number = adderFunc(1, 2, 3);
        System.out.println("The result is: " + number);
    }

    static int adderFunc(int numb1, int numb2, int numb3){
        int sum = numb1 + numb2 + numb3;
        return sum;
    }   
}