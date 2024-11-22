package a1122.shopping;

public class ProductEX {
    public static void main(String[] args) {
        Product1 laptop = new Product1("노트북", 1200000, 10);
        Product1 desktop = new Product1("데탑", -1500000, -10);
        
        // System.out.println("제품명 : "+ laptop.getName());
        // System.out.println("제품가격 : "+ laptop.getPrice());
        // System.out.println("제품재고 : "+ laptop.getStock());

        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());

        // 가격 수정
        laptop.setPrice(-500);
        System.out.println("수정된 가격 : "+laptop.getPrice());

        // 재고 수정
        laptop.addStock(5);

        // 재고 판매
        laptop.sellProduct(7);

    }
}
