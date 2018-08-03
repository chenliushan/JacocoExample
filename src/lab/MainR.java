package lab;

public class MainR {
    public static void main (String[] args){
        Rectangle rectangle=new Rectangle(3,4,4,3);
        System.out.println(rectangle.toString());
        rectangle.rotate();
        System.out.println(rectangle.toString());
//        sort(new int[]{3,5,8,4,6,9,7,1});

    }
    public static int[] sort(int[] toBeOrdered){
        for(int i=0;i<toBeOrdered.length;i++){
            for(int j=i+1;j<toBeOrdered.length;j++){
                if(toBeOrdered[i]>toBeOrdered[j]){
                    int tmp=toBeOrdered[i];
                    toBeOrdered[i]=toBeOrdered[j];
                    toBeOrdered[j]=tmp;
                }
            }
        }
        return toBeOrdered;
    }
}
