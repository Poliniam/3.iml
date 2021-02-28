package office;

import dean.Dean;

public abstract class Deans_Office extends Dean {
    public Deans_Office(String position, int experience) {
        super(position, experience);
    }

    Dean imp_1 = new Dean("Dean", 3);
    Dean imp_2 = new Dean ("Deputy Dean", 4 );
    Dean imp_3 = new Dean ("Secretary", 1 );

    public void ShowInf()
    {
        System.out.println(imp_1.toString() + imp_2.toString() + imp_3.toString());
    }

    @Override
    public String toString() {
        return "Deans_Office{" +
                "imp_1=" + imp_1 +
                ", imp_2=" + imp_2 +
                ", imp_3=" + imp_3 +
                '}';
    }
}
