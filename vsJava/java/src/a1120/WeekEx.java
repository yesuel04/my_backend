package a1120;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        
        //week 열거 타입 변수 선언
        Week1 today = null;
        
        // Calender 얻기
        Calendar cal = Calendar.getInstance();
        
        // 오늘 요일 얻기(1-7)
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        
        switch(week){
            case 1 : today = Week1.SUNDAY; break;
            case 2 : today = Week1.MONDAY; break;
            case 3 : today = Week1.TUESDAY; break;
            case 4 : today = Week1.WENDSEDAY; break;
            case 5 : today = Week1.THURSDAY; break;
            case 6 : today = Week1.FRIDAY; break;
            case 7 : today = Week1.SATURDAY; break;
        }   

        if(today == Week1.SUNDAY){
            System.out.println("집에서 쉬기");
        }else{
            System.out.println("학원 다니기");
        }
    }
}
