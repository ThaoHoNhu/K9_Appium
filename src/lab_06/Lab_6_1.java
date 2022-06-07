package lab_06;

public class Lab_6_1 {

    public static void main(String[] args) {
        String textDefault = "2hrs and 5 minutes";
        //xu ly chuoi
        String texthandel = textDefault.replace(" ","");
        //System.out.println(texthandel);
        String [] HoursMin = texthandel.split("and");
        String Hours = HoursMin[0].replace("hrs","");
        String Mins = HoursMin[1].replace("minutes","");
        int hours = Integer.parseInt(Hours);
        int mins = Integer. parseInt(Mins);
        int totalMins = hours * 60 + mins;
        System.out.println("total: " + totalMins + " mins");
    }
}
