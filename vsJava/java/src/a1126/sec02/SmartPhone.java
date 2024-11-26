package a1126.sec02;

public class SmartPhone extends Phone {
    // 부모인 phone으로부터 스마트폰이 필드와 메소드를 상속 받는다.
    public boolean wifi;

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }

    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
}
