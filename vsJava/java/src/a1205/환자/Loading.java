package Hospital;

public class Loading {

    public void loading() {
        //프로그램을 주어진 시간동안 대기하도록 하는 처리
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
