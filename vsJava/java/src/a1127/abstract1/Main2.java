package a1127.abstract1;

abstract class GameCharacter {
    public void performAction() {
        prepare();
        action();
        finish();
    }

    private void prepare(){
        System.out.println("캐릭터를 준비합니다.");
    }
    protected abstract void action();

    private void finish(){
        System.out.println("행동을 마무리 합니다.");
    }
}

class Warrior extends GameCharacter{

    @Override
    protected void action() {
        System.out.println("전사가 칼을 휘두릅니다.");
    }

}

class Mage extends GameCharacter{

    @Override
    protected void action() {
        System.out.println("마법사가 마법을 시전합니다.");
    }

}

public class Main2 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();

        System.out.println("\n전사 행동 : ");
        warrior.performAction();

        System.out.println("\n마법사 행동 : ");
        mage.performAction();
    }
}