package a1125.object;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("스켈레톤");
        Monster.battle(orc, skeleton);
    }
}

class Monster{
    private String name;
    private int hp;
    private static int maxHP = 30;

    public Monster(String name){
        this.name = name;
        this.hp = maxHP;
    }

    public static void battle (Monster a, Monster b){
        while(a.hp > 0 && b.hp > 0){
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
            
    private void attack(Monster enemy) {
        System.out.printf("[%s]의 공격", name);
        enemy.hp = enemy.hp - 10;
        System.out.printf("%s 체력 : %d/(%d)\n", enemy.name, enemy.hp, Monster.maxHP);
    }
}
