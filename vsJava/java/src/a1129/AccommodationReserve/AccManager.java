package a1129.AccommodationReserve;

import java.util.ArrayList;
import java.util.Scanner;

// 숙소 관리
public class AccManager {
    private ArrayList<Accommodation> accommodations; //숙소집합
    private ArrayList<Accommodation> bookedAccommodations; //예약한 숙소

    public AccManager() {
        accommodations = new ArrayList<>(); //초기숙소를 저장할 리스트
        bookedAccommodations = new ArrayList<>();
        //초기 숙소 추가
        accommodations.add(new Accommodation("호텔A", "서울", 100.0));
        accommodations.add(new Accommodation("호텔B", "부산", 80.0));
        accommodations.add(new Accommodation("리조트A", "제주", 120.0));
    }

    // 1번
    public void disAvailAccommodations() {
        System.out.println("예약 가능한 숙소 보기 : ");
        for(Accommodation accommodation : accommodations ){
            if(accommodation.isAvailable()){
                System.out.println(accommodation.toString());
            }
        }
    }

    // 2번
    public boolean bookedAccommodations(String name){
        for (Accommodation accommodation : accommodations) {
            if(accommodation.getName().equalsIgnoreCase(name) && accommodation.isAvailable()){
                accommodation.book(); // isAvailable()에 flase를 넣는다.
                bookedAccommodations.add(accommodation); //예약한 숙소를 arraylist에 추가.
                return true;
            }
        }
    return false;
    }

    // 3번
    public void disBookedAccommodation() {
        System.out.println("예약한 숙소 >> ");
        for (Accommodation accommodation : bookedAccommodations) {
            System.out.println(accommodation);
        }
    }

    // 4번
    public void addAccommodation(String newName, String newLocation, Double newPrice) {
       accommodations.add(new Accommodation(newName, newLocation, newPrice));
    }

    // 5번
    public void deleteAccommodation(String dname) {
        boolean result = false;
        for(Accommodation accommodation : accommodations){
            if(accommodation.getName().equalsIgnoreCase(dname)){
                if(accommodation.isAvailable()){
                    accommodations.remove(accommodation);
                    result = true;
                    break;
                }else{
                    result = false;
                    break;
                }
            }
        }
        if(result){
            System.out.println(" [ 삭제 완료 ] ");
        }else{
            System.out.println(" [ 삭제 실패 ] ");
        }
    }

    // 6번
    public void updateAccommodation(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Accommodation newA = new Accommodation();
        // System.out.println(uname);
        for(Accommodation a : accommodations){ //리스트를 순회하면서 같은 이름이 있는지 확인.
            i++;
            if(a.getName().equals(uname)){
                index = i - 1;
                newA = a; // 이름이 같으면 객체를 생성해서 해당 객체를 newA에 넣어둔다.
            }
            // System.out.println(a.getName().equals(uname) + " " + a.getName() + " " + uname);
        }
        if(index != -1){ //수정할 숙박 이름이 있으면
            System.out.print("어떤 정보를 수정하나요? \n 1. 숙박 업소 이름 \n 2. 지역 \n 3. 가격 \n >> ");
            menu = sc.nextInt();
            sc.nextLine();
            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.print("수정할 이름 >> ");
                        newA.setName(sc.nextLine());
                        accommodations.set(index, newA);
                        flag = false;
                        break;

                    case 2:
                        System.out.print("수정할 지역 >> ");
                        newA.setLocation(sc.nextLine());
                        accommodations.set(index, newA);
                        flag = false;
                        break;

                    case 3:
                        System.out.print("수정할 가격 >> ");
                        newA.setPricePerNight(sc.nextInt());
                        accommodations.set(index, newA);
                        flag = false;
                        break;
                
                    default:
                        System.out.println(" [ 1~3번 중에 하나를 입력해주세요. ] ");
                        break;
                }
            }
        }else{
            System.out.println(" [ 찾는 숙소가 없습니다. 업데이트 실패. ] ");
        }
    }

    // 7번
    public void showAccommodation(String sname) {
        for(Accommodation a : accommodations){
            if(a.getName().equalsIgnoreCase(sname)){
                System.out.println(a.toString());
            }
        }
    }
}
