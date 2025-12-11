enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}



public class Enum_Switch {
    public static void main(String[] args) {
        Day d = Day.FRIDAY;

        System.out.println(d.getClass().getSuperclass()); // used to check the parent class of enum class of Day

        System.out.println("--------------------------------");

        switch (d){  // switch support enum also 
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");  
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");  
                break;  
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");     
                break;
            default:
                System.out.println("It's Saturday!");     
                break;

        }

        System.out.println("--------------------------------");
        System.out.println("no using the nested if-else");

        if (d == Day.SUNDAY) {  // in if else also enum can be used by class name and dot operator   with constant name
            System.out.println("It's Sunday!");
        } else if (d == Day.MONDAY) {
            System.out.println("It's Monday!");
        } else if (d == Day.TUESDAY) {
            System.out.println("It's Tuesday!");
        } else if (d == Day.WEDNESDAY) {
            System.out.println("It's Wednesday!");
        } else if (d == Day.THURSDAY) {
            System.out.println("It's Thursday!");
        } else if (d == Day.FRIDAY) {
            System.out.println("It's Friday!");
        } else {
            System.out.println("It's Saturday!");
        }
        
    }
    
}
