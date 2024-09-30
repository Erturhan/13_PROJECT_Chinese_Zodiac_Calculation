import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int year ;

        System.out.print("Pleas, enter the year of birth :");
        year = scan.nextInt();

       /* if(year % 12 == 0){ System.out.print("your birth year is dragon");
        }
        else if(year % 12 == 1){ System.out.print("your birth year is rabit");
        }
        else if(year % 12 == 2){ System.out.print("your birth year is tiger");
        }

        else if(year % 12 == 3){ System.out.print("your birth year is ox");
        }
        else if(year % 12 == 4){ System.out.print("your birth year is mouse");
        }
        else if(year % 12 == 5){ System.out.print("your birth year is goat");
        }
        else if(year % 12 == 6){ System.out.print("your birth year is dog");
        }
        else if(year % 12 == 7){ System.out.print("your birth year is cock");
        }
        else if(year % 12 == 8){ System.out.print("your birth year is monkey");
        }
        else if(year % 12 == 9){ System.out.print("your birth year is sheep");
        }
        else if(year % 12 == 10){ System.out.print("your birth year is horsr");
        }
        else if(year % 12 == 11){ System.out.print("your birth year is snake");
        } */


        // switch case


        switch(year % 12) {
            case 0:
                System.out.print("Your birth year is dragon");
                break;
            case 1:
                System.out.print("Your birth year is rabbit");
                break;
            case 2:
                System.out.print("Your birth year is tiger");
                break;
            case 3:
                System.out.print("Your birth year is ox");
                break;
            case 4:
                System.out.print("Your birth year is mouse");
                break;
            case 5:
                System.out.print("Your birth year is goat");
                break;
            case 6:
                System.out.print("Your birth year is dog");
                break;
            case 7:
                System.out.print("Your birth year is rooster");
                break;
            case 8:
                System.out.print("Your birth year is monkey");
                break;
            case 9:
                System.out.print("Your birth year is sheep");
                break;
            case 10:
                System.out.print("Your birth year is horse");
                break;
            case 11:
                System.out.print("Your birth year is snake");
                break;
            default:
                System.out.print("Invalid year");
                break;


        }



    }

}