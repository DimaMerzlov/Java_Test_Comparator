package newHomeSW;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Base {
    private ArrayList<Abiturient> abiturients;

    public Base() {
        abiturients = new ArrayList<>();
    }

    public void add(Abiturient a) {
        abiturients.add(a);
    }

    public void sort(Comparator<Abiturient> c) {
        abiturients.sort(c);
    }

    public void delete(Abiturient a) {
        abiturients.remove(a);
    }


    public ArrayList<Abiturient> findByName(String abName) {
        ArrayList<Abiturient> list = new ArrayList<>();
        for (Abiturient abit : abiturients) {
            if (abit != null) {
                if (abit.getName().equalsIgnoreCase(abName)) list.add(abit);
            }
        }
        return list;
    }

    public ArrayList<Abiturient> findById(int id) {
        ArrayList<Abiturient> list = new ArrayList<>();
        for (Abiturient abit : abiturients) {
            if (abit != null) {
                if (abit.getId() == id) list.add(abit);
            }
        }
        return list;
    }

    public ArrayList<Abiturient> findAbiturientWithBadMarks(int badMarks) {
        ArrayList<Abiturient> list = new ArrayList<>();
        for (Abiturient ab : abiturients) {
            if (ab.getMark() < badMarks) list.add(ab);
        }
        return list;
    }
    public Abiturient[] findItemsAbiturienByNameItems(Items items){
        Map<Items,Integer> returnMap=new HashMap<Items,Integer>();
        int count=0;
        for (Abiturient abiturient : abiturients) {
            for (Map.Entry<Items, Integer> entry : abiturient.getMap().entrySet()) {
                if (entry.getKey().equals(items))
                {
                    count++;

                }
            }
        }
        Abiturient[] masAb=new Abiturient[count];
        count=0;
        for (Abiturient abiturient : abiturients) {
            for (Map.Entry<Items, Integer> entry : abiturient.getMap().entrySet()) {

                if (entry.getKey().equals(items))
                {

                    masAb[count]=new Abiturient(abiturient.getName(),abiturient.getSurname());
                    masAb[count].getMap().put(entry.getKey(),entry.getValue());
                    //returnMap.put(entry.getKey(),entry.getValue());
                    count++;
                }
            }
        }
        return masAb;
    }
    public ArrayList<Abiturient> findAbiturientWithGoodsMarks(int goodMarks) {
        ArrayList<Abiturient> list = new ArrayList<>();
        for (Abiturient ab : abiturients) {
            if (ab.getMark() >= goodMarks) list.add(ab);
        }
        return list;
    }

    public ArrayList<Abiturient> maxSumMark(int n) {
        if (n<=0) return null;
        ArrayList<Abiturient> arrayList = new ArrayList<>(abiturients);
        ArrayList<Abiturient> returnAr = new ArrayList<>();
        arrayList.sort(Abiturient.BY_MARK.reversed());

        for (int i = 0; i < n; i++) {
            returnAr.add(arrayList.get(i));
        }
        return returnAr;
    }

    public ArrayList<Abiturient> semiPassGrade(int minMark, int maxMark) {
        ArrayList<Abiturient> ab = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getMark() > minMark && abiturient.getMark()<maxMark) ab.add(abiturient);
        }
        return ab;
    }

    public ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    @Override
    public String toString() {
        return "BaseAbiturients{" +
                "abiturients=" + abiturients +
                '}';
    }
}
