package imperative;


    class SimpleConsecutivePairs{
        public static void main(String[] args) {
            int [] array = {1,3,4,5,7,8};
            System.out.println(solve(array));
        }



        public static int solve(int [] arr){
            //..
            int count = 0;
            int i=0;
            //checks if the length of array is even
            if ((arr.length % 2) == 0) {
                // loops through the length two two
            for (int j =0; j<arr.length-1; j+=2) {
                if((arr[j] - arr[j+1] == 1) || (arr[j] - arr[j+1] == -1))
                    count++;
                    }
            } else {
                for (int j =0; j<arr.length-2; j+=2) {
                    if((arr[j] - arr[j+1] == 1) || (arr[j] - arr[j+1] == -1))
                        count++;
                }

                }
                return count;
        }

}
