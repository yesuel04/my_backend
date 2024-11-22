package a1122.aven;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
        thor.punch(thanos);
        thanos.punch(thor);
            }
        }
        
        class Avenger {
            String name;
            int hp;
            public Avenger(String name, int hp) {
                this.name = name;
                this.hp = hp;
            }
            public void punch(Avenger enemy) {
                System.out.printf("[%s]의 펀치\n", name);
                System.out.printf("[%s]의 펀치를 [%s]가 맞았다!\n", name, enemy.name);
                enemy.hp = enemy.hp - 10;
                System.out.printf("-> [%s]의 체력 : %d\n", enemy.name , enemy.hp);
            }
    
}
