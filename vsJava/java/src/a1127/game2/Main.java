package a1127.game2;

public class Main {
    public static void main(String[] args) {
        Hero[] heros = new Hero[3];
        heros[0] = new Warrior("전사");
        heros[1] = new Archer("궁수");
        heros[2] = new Wizard("마법사");

        for(int i=0; i<heros.length; i++){
            heros[i].attack();

            // if(heros[i] instanceof Warrior){
            //     Warrior temp = (Warrior) heros[i];
            //     temp.groundCutting();
            // }else if(heros[i] instanceof Archer){
            //     Archer temp = (Archer) heros[i];
            //     temp.targetting();
            // }else if(heros[i] instanceof Wizard){
            //     Wizard temp = (Wizard) heros[i];
            //     temp.freezing();
            // }else{
            //     System.out.println("잘못됐습니다.");
            // }

            if(heros[i] instanceof Warrior w1){
                w1.groundCutting();
            }else if(heros[i] instanceof Archer a1){
                a1.targetting();
            }else if(heros[i] instanceof Wizard ww1){
                ww1.freezing();
            }else{
                System.out.println("잘못됐습니다.");
            }
        }
    }
}
