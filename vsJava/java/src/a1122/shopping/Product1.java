package a1122.shopping;

public class Product1 {
    private String name;
    private double price;
    private int stock;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0){
            this.stock = 0;
        }else{
            this.stock = stock;
        }
    }

    public Product1(String name, double price, int stock) {
        this.name = name;
        // this.price = price;
        setPrice(price);
        // this.stock = stock;
        setStock(stock);
    }

    public String toStr() {
        return String.format("제품명 : %s , 가격 : %.1f , 재고 : %d", name, price, stock);
    }

    public void addStock(int amount) {
        if(amount < 0){
            System.out.println("재고 추가 실패 : 음수값은 입력 불가.");
        }else{
            stock += amount;
            System.out.println(amount + "개의 재고가 추가 되었습니다.");
        }
    }

    public void sellProduct(int amount) {
        if(amount > stock){
            System.out.println("재고 부족 - 주문 수량이 현재 재고보다 많습니다.");
        }else if(amount <= 0){
            System.out.println("판매 실패 - 주문 수량을 다시 입력해주세요.");
        }else{
            stock -= amount;
            System.out.println("현재 " +amount + "개 판매 성공.");
            System.out.println("현재 남아있는 물량은 " + stock +"개 입니다.");
        }
    }
}
