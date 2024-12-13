package a0814.data;

import java.util.ArrayList;

import a0814.entity.History;

public class HistoryDB {//거래내역
    private static final HistoryDB historyDB = new HistoryDB();

    public static HistoryDB getInstance() {
        return historyDB;
    }

    private final ArrayList<History> histories = new ArrayList<>();

    public ArrayList<History> getAllHistory(){
        return histories;
    }
    public void insertHistory(History history){
        histories.add(history);
    }
    public void deleteHistoriesByAccountNumber(String accountNum) {
        //histories.stream().filter(a -> a.getAccountNum().equals(accountNum)).toList().forEach(h -> histories.remove(h));
        for(int i=0; i < histories.size();i++){
            History h = histories.get(i);
            if(h.getAccountNum().equals(accountNum)){
                histories.remove(i);
                i--; //요소를 제거했으므로 인덱스를 감소시켜야 함
            }
        }
    }


}
