import java.awt.*;

public class Arrays {

    public int[] nums;
    public Star[] stars;


    public static void main(String[] args) {
        System.out.println("welcome");
        new Arrays();


    }

    public Arrays(){
        nums = new int[10];
        stars = new Star[7];

        stars[0] = new Star();
        Star s1 = new Star();

        s1.color = "blue";
        s1.points = 10;
        s1.printinfo();

        stars[0].color = "red";
        stars[0].points = 20;
        stars[0].printinfo();

        for (int x=0; x<stars.length;x++){
            stars[x]= new Star();
            int rand1 = (int) (Math.random()*11);
            stars[x].color = "yellow";
            stars[x].points = rand1;
        }




        for (int y=0; y<nums.length;y++){
            int rand1 = (int) (Math.random()*100)+1;
            nums[y] = rand1;
        }

        displayarray();
        sumArray();
        Averagenum();
        Maxnum();
        Minnum();
        Greaterthan50();
        maxindex();
        displaystars();

    }

    public void displayarray(){
        for(int x = 0;x < nums.length; x++)
        System.out.println(x+": "+nums[x]);

    }

    public void sumArray(){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }
        System.out.println(sum);
        System.out.println(" ");
        }

    public void Averagenum (){
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }
        avg = sum/nums.length;
        System.out.println(avg);
        System.out.println(" ");
    }
    public void Maxnum(){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(" ");

    }
    public void Minnum(){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }

    public void maxindex(){
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        System.out.println(index);
    }
    public void Greaterthan50(){
    int count = nums[0];

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] <= 59) {
            count++;
        }
    }
        System.out.println(count);
}

public void displaystars(){
    for(int x = 0;x < stars.length; x++)
        System.out.println(x+": "+stars[x]);

}

}





