package a1126.sec02;

public class SmartPhoneEX {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델 : "+myPhone.model);
        System.out.println("모델 : "+myPhone.color);

        System.out.println("와이파이 상태 : "+myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요. 반갑습니다.");
        myPhone.sendVoice("예 말씀하세요.");
        myPhone.hangUp();
    }
}
