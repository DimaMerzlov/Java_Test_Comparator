package newHomeSW;


import OldNameMyWork.Init;

import java.util.Arrays;

public class TestAbiturient {
    public static void main(String[] args) {
        Base base = new Base();
        Abiturient abiturient = new Abiturient("Dima", "Smit");
        Abiturient abiturient1 = new Abiturient("Any", "Shwed");
        Abiturient abiturient2 = new Abiturient("Mira", "Moon");
        Abiturient abiturient3 = new Abiturient("Carl", "Shevchenko" );
        Abiturient abiturient4 = new Abiturient("Derek", "Baron" );
        Abiturient abiturient5 = new Abiturient("Den", "Deni" );
        System.out.println("Add abiturient");
        base.add(abiturient);
        base.add(abiturient1);
        base.add(abiturient2);
        base.add(abiturient3);
        base.add(abiturient4);
        base.add(abiturient5);
        abiturient.putOnMap();
        System.out.println("Добавить студенту оценку и придмет");
        abiturient1.putOnMap();
        abiturient2.putOnMap();
        abiturient3.putOnMap();
        abiturient4.putOnMap();
        abiturient5.putOnMap();
        System.out.println(base);
        System.out.println("findByName");
        System.out.println(base.findByName("Dima"));
        System.out.println("findById");
        System.out.println(base.findById(1003));
        System.out.println("Sort BY_MARK");
        base.sort(Abiturient.BY_MARK);
        System.out.println(base);
        System.out.println("Sort BY_NAME");
        base.sort(Abiturient.BY_NAME);
        System.out.println(base);
        System.out.println("Find abiturient with bad marks");
        System.out.println(base.findAbiturientWithBadMarks(10));
        System.out.println("Find abiturient with goods marks");
        System.out.println(base.findAbiturientWithGoodsMarks(10));
        System.out.println("выбрать заданное число n абитуриентов, имеющих самую высокую\n" +
                "сумму баллов ");
        System.out.println(base.maxSumMark(3));
        System.out.println("вывести также полный список абитуриентов, имеющих\n" +
                "полупроходную сумму");
        System.out.println(base.semiPassGrade(8,12));
        System.out.println("Вывести оценки по определенному предмету");
        System.out.println(Arrays.deepToString(base.findItemsAbiturienByNameItems(Items.ENGLISH)));
    }
}
