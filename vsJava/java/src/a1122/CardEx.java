package a1122;

public class CardEx {
    public static void main(String[] args) {

        System.out.println("카드의 넓이 : " + Card.width);
        System.out.println("카드의 높이 : " + Card.height);
        System.out.println();

        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;
        
        System.out.println("c1은 " + c1.kind + " 모양이다.");
        System.out.println("c1은 " + c1.number + " 이다.");
        System.out.println("c1의 넓이는 " + c1.width + " 이다.");
        System.out.println("c1의 높이는 " + c1.height + " 이다.");
        System.out.println();

        System.out.println("c2은" + c2.kind + " 모양이다.");
        System.out.println("c2은" + c2.number + " 이다.");
        System.out.println("c2의 넓이는" + c2.width + " 이다.");
        System.out.println("c2의 높이는" + c2.height + " 이다.");
        System.out.println();

        c1.width = 150;
        c1.height = 300;
        System.out.println("c1은 " + c1.kind + " 모양이다.");
        System.out.println("c1은 " + c1.number + " 이다.");
        System.out.println("c1의 넓이는 " + c1.width + " 이다.");
        System.out.println("c1의 높이는 " + c1.height + " 이다.");
        System.out.println();

        System.out.println("c2은 " + c2.kind + " 모양이다.");
        System.out.println("c2은 " + c2.number + " 이다.");
        System.out.println("c2의 넓이는 " + c2.width + " 이다.");
        System.out.println("c2의 높이는 " + c2.height + " s이다.");
        System.out.println();

    }
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}