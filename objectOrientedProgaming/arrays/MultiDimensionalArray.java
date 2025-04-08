package objectOrientedProgaming.arrays;

public class MultiDimensionalArray {

    public static void main(String[] args){

        int[][] nums = new int[3][4];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }


        for (int[] arr : nums){
            for (int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        System.out.println("=========jagged array==========");

        // jagged array
        int[][] jdArr = new int[3][];
        jdArr[0] = new int[3];
        jdArr[1] = new int[4];
        jdArr[2] = new int[5];

        for (int i = 0; i < jdArr.length; i++) {

            for (int j = 0; j < jdArr[i].length; j++) {
                jdArr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] arr : jdArr){
            for (int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }



        // 3d array
        System.out.println("=========3d array==========");
        int[][][] threeD = new int[3][4][3];

        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    threeD[i][j][k] = (int) (Math.random() * 10);

                }
            }
        }


        for (int[][] arr : threeD){
            for (int[] narr : arr){
                for (int num : narr){
                    System.out.print(num+" ");
                }
                System.out.print(" || ");
            }
            System.out.println();
        }

    }
}
