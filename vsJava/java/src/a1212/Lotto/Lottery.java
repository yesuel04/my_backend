package a1212.Lotto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lottery {
    String randomNum = " ";
    String [] randomNumbers = new String[6];

    //랜덤으로 로도 번호 생성.
    //범위를 갖는 랜덤값을 생성하여 리턴하는 메소드
    public void randomLotteryNum() {
        for(int i = 0; i < 6; i++){
            randomNum = randomNum + random(0,9);
        }
        this.randomNum = randomNum;
    }
    private static int random(int min, int max){
        int num = (int) ((Math.random()*(max-min+1)));
        return num;
    }


    public void lotteryNum() {
        System.out.println("\n[INFO] 로또 당첨 번호 안내 드립니다.");
		System.out.println("\n★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★☆[" + randomNum + " ]★☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //날짜와 시간 형식을 지정
        Calendar time = Calendar.getInstance();
        String format_time1 = format1.format(time.getTime());
        System.out.println(format_time1);
        System.out.println("\n=================================================================");
    }


    public void result(Membership m, Purchase p) {
        System.out.println("\n[INFO] " + m.name + "님의 당첨결과를 3초 후에 안내합니다. \n");
        System.out.println("=================================================================\n");
        Loading l = new Loading();
        l.loading();

        if(p.customerNum.equals(randomNum)){
            System.out.println("[INFO] 로또 당첨 번호는 [ " + randomNum + " ] 입니다. ");
            System.out.println("[INFO] " + m.name + "님의 로또 번호는 " + p.customerNum + " 입니다. ");
            System.out.println("[INFO] 축하드립니다. 당첨되셨습니다.");
        }else{
            System.out.println("[INFO] 로또 당첨 번호는 [ " + randomNum + " ] 입니다. ");
            System.out.println("[INFO] " + m.name + "님의 로또 번호는 " + p.customerNum + " 입니다. ");
            System.out.println("[INFO] 낙첨입니다. 다음 기회를 노려보세요. ");
        }
        System.out.println("\n=================================================================\n");
        System.out.println("[INFO] 로또 추첨이 완료됐습니다. 감사합니다.");
        System.out.println("\n=================================================================");
    }

}
