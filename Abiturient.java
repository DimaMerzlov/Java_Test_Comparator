package newHomeSW;



import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Abiturient {
    private Map<Items, Integer> map = new HashMap<Items, Integer>();
    private int mark;
    private String name;
    private String surname;
    private String middleName;
    public static Comparator<Abiturient> BY_NAME;
    public static Comparator<Abiturient> BY_MARK;
    private static long idNext = 1000;
    private long id;

    static {
        BY_NAME = new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient ab1, Abiturient ab2) {
                return ab1.name.compareTo(ab2.name);
            }
        };
        BY_MARK = new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient ab1, Abiturient ab2) {
                return ab1.mark - ab2.mark;
            }
        };
    }

    {
        this.id = ++idNext;
    }

    public Abiturient(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Abiturient(String name, String surname, int mark, String middleName) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
        this.middleName = middleName;
    }

    public void putOnMap() {
        //this.mark=mark;
        Init init=new Init();
        for (int i = 0; i < Items.values().length; i++) {
            int temp=init.initMark();
            this.mark+=temp;
            map.put(init.initItems(i), temp);
        }
    }


    public Map<Items, Integer> getMap() {
        return map;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public static long getIdNext() {
        return idNext;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "map=" + map +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", id=" + id + '}';
    }
}
