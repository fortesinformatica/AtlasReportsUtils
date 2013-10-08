public class DataUtils {
    public static String secondsToTime(String seconds){
        try{
            int secondsInt = Integer.parseInt(seconds);
            int hrs = secondsInt / 3600;
            secondsInt = secondsInt % 3600;
            int minuts = secondsInt / 60;
            int secs = secondsInt % 60;

            return twoDigits(hrs) + ":" + twoDigits(minuts) + ":" + twoDigits(secs);
        }catch (Exception ex){
            return "00:00:00";
        }
    }

    public static String twoDigits(int number){
        String prefix = "";
        if(number < 10){
            prefix = "0";
        }

        return prefix + number;
    }

    public static void main(String args[]){
        System.out.println(DataUtils.secondsToTime("20000"));
    }
}
