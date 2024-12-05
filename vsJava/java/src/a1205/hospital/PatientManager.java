package a1205.hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager {
    private static ArrayList<Patient> patients;
    Scanner sc = new Scanner(System.in);
    public String hospital = "#     #    " + " ###     " + " ####     " + "#####    " + "#####    " + "#####      "
            + "#        " + "#\n"
            + "#     #    " + "#   #    " + "#         " + "#   #    " + "  #      " + "  #       " + "# #       "
            + "#\n"
            + "#######    " + "#   #    " + "#####     " + "#####    " + "  #      " + "  #      " + "#####      "
            + "#\n"
            + "#     #    " + "#   #    " + "    #     " + "#        " + "  #      " + "  #     " + "#     #     "
            + "#\n"
            + "#     #    " + " ###     " + "####      " + "#        " + "#####    " + "  #    " + "#       #    "
            + "#####\n";

    public PatientManager() {
        patients = new ArrayList<>();
        patients.add(new Patient("홍길동", "010-1234-1234", "경기도 성남시", "치과", "12:30"));
        // 더미데이터를 PatientManager() 객체가 생성되면 한 개 넣기
    }

    // 1. 환자 등록
    public void patientAppointment() {
        System.out.println("=========== 환자 등록 =============");
        System.out.print("이름 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("전화번호(-포함) : ");
        String phone = sc.next();
        sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
        System.out.print("진료 내용 : ");
        String disease = sc.next();
        sc.nextLine();
        System.out.print("예약 시간 : ");
        String time = sc.nextLine();
        sc.nextLine();
        patients.add(new Patient(name, phone, address, disease, time));
        System.out.println("접수중 입니다.");
        System.out.println("\n" + name + " 님, 진료가 접수되었습니다.");
    }

    // 2. 등록 정보 보기
    public void patientPrint() {
        boolean patientAppoint = false;
        System.out.print("등록된 정보를 보고 싶은 환자의 이름 : ");
        String name = sc.next();
        for (Patient list : patients) {
            patientAppoint = true;
            if (list.getName().equalsIgnoreCase(name)) {
                System.out.println("등록 정보 : " + list.getDisease() + " / " + list.getTime());
            }
        }
        if (!patientAppoint) {
            System.out.println("정보가 존재하지 않습니다.");
            return;
        }
    }

    // 3. 관리자 메뉴
    public void adminMenu() {
        while (true) {
            System.out.println("\n======= 관리자 메뉴 =======\n");
            System.out.println("1. 환자 등록 목록");
            System.out.println("2. 환자 등록 삭제");
            System.out.println("3. 환자 정보 수정");
            System.out.println("4. 메인으로 돌아가기\n");
            System.out.print("입력 > ");

            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    printAll();
                    break;
                case 2:
                    cancleAppoint();
                    break;
                case 3:
                    updateAppoint();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        }
    }

    //////////////////// 관리자 메뉴 ////////////////////////

    // 1. 환자 등록 목록
    private void printAll() {
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
        if (patients.isEmpty()) { // patients 에 아무것도 없으면
            System.out.println("환자가 존재하지 않습니다.");
            return;
        }
    }

    // 2. 환자 등록 삭제
    private void cancleAppoint() {
        System.out.print("삭제하고 싶은 환자 이름 : ");
        String cancleName = sc.next();
        boolean patientFound = false;
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(cancleName)) {
                patients.remove(patient);
                System.out.println("삭제중 입니다.");
                System.out.println("\n" + cancleName + " 님의 정보 삭제");
                patientFound = true;
                break;
            }
        }
        if (!patientFound) {
            System.out.println("환자가 존재하지 않습니다.");
        }
    }

    // 3. 환자 정보 수정

    private void updateAppoint() {
        boolean patientFound = false;
        System.out.print("정보를 수정할 환자 이름 : ");
        String name = sc.next();
        for (Patient list : patients) {
            if(list.getName().equals(name)){
                patientFound = true;
                System.out.println("수정하고 싶은 정보를 선택하세요.");
                System.out.println("1. 전화번호 | 2. 주소 | 3. 예약시간 ");
                System.out.println(" 입력 > ");
                String updateNum = sc.next();

                if (updateNum.equals("1")) {
                    System.out.println("전화번호 수정 > ");
                    String updatePhone = sc.next();
                    list.setPhone(updatePhone);
                    System.out.println(name + " 님의 전화번호가 수정되었습니다.");
                }else if(updateNum.equals("2")) {
                    System.out.println("주소 수정 > ");
                    String updateAddress = sc.next();
                    list.setAddress(updateAddress);
                    System.out.println(name + " 님의 주소가 수정되었습니다.");
                    break;
                }else if(updateNum.equals("3")) {
                    System.out.println("예약시간 수정 > ");
                    String updateTime = sc.next();
                    list.setTime(updateTime);
                    System.out.println(name + " 님의 예약시간이 수정되었습니다.");
                    break;
                }else{
                    System.out.println("잘못 입력했습니다.");
                    break;
                }
            }
        }
        if (!patientFound) {
            System.out.println("존재하지 않습니다.");
        }
    }

}
