package prac4.task2;

public class Atelier {
    static public void dressMan(Clothes[] clothes){
        for (Clothes clothe:
             clothes) {
            if (clothe instanceof ManClothing)System.out.println(clothe);
        }
    }

    static public void dressWoman(Clothes[] clothes){
        for (Clothes clothe:
                clothes) {
            if (clothe instanceof WomanClothing)System.out.println(clothe);
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[3];
        clothes[0] = new TShirt(Size.M,50,"красный");
        clothes[1] = new Skirt(Size.L,70,"белый");
        clothes[2] = new Tie(Size.XS,30,"синий");
        dressMan(clothes);
        dressWoman(clothes);
    }
}
