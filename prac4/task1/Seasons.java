package prac4.task1;

enum Seasons {
    SUMMER(21),
    AUTUMN(10),
    WINTER(-5),
    SPRING(8);

    private final int srTemp;

    Seasons(int temp) {
        srTemp = temp;
    }

    public int getSrTemp() {
        return srTemp;
    }

    public void getDescription() {
        if (this == Seasons.SUMMER) System.out.println("Тёплое время года");
        else System.out.println("Холодное время года");
    }

    public void info() {
        switch (this) {
            case SUMMER -> System.out.println("Одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды. В день летнего солнцестояния дни самые длинные, а ночи самые короткие.");
            case WINTER -> System.out.println("Зима — одно из четырёх времён года, между осенью и весной. Основной признак этого времени года — устойчивая низкая температура (ниже 0 градусов по Цельсию) во многих районах Земли, на поверхность земли выпадает и ложится снег.");
            case AUTUMN -> System.out.println("Одно из четырёх времён года, между летом и зимой. Осень - переходный сезон, когда заметно уменьшение светового дня, и постепенно понижается температура окружающей среды. ");
            case SPRING -> System.out.println("Одно из четырёх времён года, переходный сезон между зимой и летом. Существуют различные методы определения начала и окончания весны, отличающиеся в зависимости от местного климата, культур и обычаев. Когда в Северном полушарии весна, то в Южном полушарии осень и наоборот.");
        }
    }

    public void favSeason() {
        System.out.print("Я люблю ");
        switch (this) {
            case AUTUMN -> System.out.println("Осень");
            case SPRING -> System.out.println("Весну");
            case SUMMER -> System.out.println("Лето");
            case WINTER -> System.out.println("Зиму");
        }
    }


    public void getName() {
        switch (this) {
            case WINTER -> System.out.println("Зима");
            case SUMMER -> System.out.println("Лето");
            case SPRING -> System.out.println("Весна");
            case AUTUMN -> System.out.println("Осень");
        }
    }
}
