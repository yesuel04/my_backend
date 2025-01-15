package a1129.AccommodationReserve;

// 숙박 예약 
// 숙소 클래스
public class Accommodation {
    private String name; // 이름
    private String location; //위치 
    private double pricePerNight; //가격
    private boolean available; //예약가능한지 여부

    public Accommodation(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }
    
    public Accommodation() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void book(){
        this.available = false;
    }

    @Override
    public String toString() {
        return "숙소 이름 : " + name + ", 장소 : "+location+", 1박당 가격 : "+pricePerNight+
        ", 예약 여부 : "+(available ? "예약가능" : "예약불가능");
    }
}
