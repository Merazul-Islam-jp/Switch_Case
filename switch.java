import java.util.Scanner;

public class Swtice_case {

    // int day = 1;

    // String day;

    // 1(fan) 2(Light) 3(tv) 4(computer)
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter the day in 1~7:");
        int day = user_input.nextInt();

        switch (day) {
            case 1:
                System.out.println("sat day");

                break;

            case 2:
                System.out.println("sun day");

            case 3:
                System.out.println("mon day");
                break;
            case 4:
                System.out.println("tue day");
                break;
            case 5:
                System.out.println("wed day");
                break;
            case 6:
                System.out.println("tus day");
                break;
            case 7:
                System.out.println("fri day");
                break;

            default:
                System.out.println("invalid day");

                break;
        }

    }

}
