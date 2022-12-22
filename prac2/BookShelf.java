package prac2;

public class BookShelf {
    private Book[] shelf = new Book[10];
    private int count = 0;

    public void addBook(String author, String title, int year){
        shelf[count]=new Book(author,title,year);
        count++;
    }

    public Book early(){
        int min = shelf[0].getYear(),k=0;
        for (int i = 1; i < count+1; i++) {
            if (shelf[i].getYear()<min){
                min = shelf[i].getYear();
                k=i;
            }
        }
        return shelf[k];
    }

    public Book late(){
        int max = shelf[0].getYear(),k=0;
        for (int i = 1; i < count+1; i++) {
            if (shelf[i].getYear()>max){
                max = shelf[i].getYear();
                k=i;
            }
        }
        return shelf[k];
    }


    public void bookSort(){
        int arr1[] = new int[count];
        int arr2[] = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[i]=shelf[i].getYear();
            arr2[i]=i;
        }

        int temp;
        for(int i=0; i < count; i++){
            for(int j=1; j < (count-i); j++){
                if(arr1[j-1] > arr1[j]){
                    temp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = temp;

                    temp = arr2[j-1];
                    arr2[j-1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        Book arrBook[] = new Book[count];
        for (int i = 0; i < count; i++) {
            arrBook[i]=shelf[arr2[i]];
        }
        shelf=arrBook;
    }

    public void printBooks(){
        for (int i = 0; i < count; i++) {
            System.out.println(shelf[i].getAuthor()+" - \""+shelf[i].getTitle()+"\" - "+shelf[i].getYear());
        }
    }
}
