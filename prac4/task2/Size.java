package prac4.task2;


public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40)
    ;

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription(){
        if (this == Size.XXS) System.out.println("Детский размер");
        else System.out.println("Взрослый размер");
    }


}
