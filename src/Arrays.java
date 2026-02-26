public class Arrays {

    public int[] nums;


    public static void main(String[] args) {
        System.out.println("welcome");
        new Arrays();


    }

    public Arrays(){
        nums = new int[10];

        for (int y=0; y<nums.length;y++){
            int rand1 = (int) (Math.random()*100)+1;
            nums[y] = rand1;
        }

        displayarray();
        sumArray();
        Averagenum();
        Maxnum();
        Minnum();

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
        int avg;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }
        avg = sum/10;
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

    }



