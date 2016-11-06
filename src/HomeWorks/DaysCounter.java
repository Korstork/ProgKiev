package HomeWorks;
/*Немного видоизменил.
Теперь программа подсчитывает количество полных лет, месяцев и дней в заданном количестве дней.
*/
public class DaysCounter {
    public static void main(String[] args) {
        int days = 482;

        int year = days/360;
        if (year <=4){
            System.out.print("В " +days+" днях: "+ year+" год, ");
        } else if (year >=5 || year <=0) {
            System.out.print("В " + days + " днях: " + year + " лет, ");
        }
        int month = (days/30)%12;
        if (month <=1){
            System.out.print(month+" месяц и ");
        } else if (month >=5){
            System.out.print(month+ " месяцев и ");
        } else {
            System.out.print(month+ " месяца и ");
        }

        int day = days%30;
        if (day <=1) {
            System.out.print(day + " день");
        } else if (day >=5){
            System.out.print(day + " дней");
        } else {
            System.out.print(day + " дня");
        }
    }
}