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
        }
    }


