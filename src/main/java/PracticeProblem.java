public class PracticeProblem{
        static int[] bubbleSort(double[] num){
                int[] ret = new int[2];
                for(int i = 0; i < num.length; ++i){
                        boolean sorted = true;
                        for(int j = 0; j < num.length-i-1; ++j){
                                ret[1]++;
                                if(num[j] > num[j+1]){
                                        double temp = num[j];
                                        num[j] = num[j+1];
                                        num[j+1] = temp;
                                        sorted = false;
                                        ret[0] += 3;
                                }
                        }
                        if(sorted){
                                break;
                        }
                }
                return ret;
        }

        static int[] selectionSort(double[] num){
                int[] ret = new int[2];
                for(int i = 0; i < num.length-1; ++i){
                        int maxIndex = i;
                        for(int j = i+1; j < num.length; ++j){
                                ret[1]++;
                                if(num[j] < num[maxIndex]){
                                        maxIndex = j;
                                        ret[0]++;
                                }
                        }
                        double temp = num[i];
                        num[i] = num[maxIndex];
                        num[maxIndex] = temp;
                        ret[0] += 3;
                }
                return ret;
        }

        static int[] insertionSort(double[] num){
                int[] ret = new int[2];
                for(int i = 1; i < num.length; ++i){
                        double key = num[i];
                        ret[0]++;
                        int index = i-1;
                        for(;index > -1 && key < num[index]; --index){
                                ret[1]++;
                                num[index+1] = num[index];
                                ret[0]++;
                        }
                        num[index+1] = key;
                        ret[0]++;
                }
                return ret;
        }

        static String leastSwaps(double[] nums){
                double[] nums1 = nums.clone();
                double[] nums2 = nums.clone();
                int bubbleSwaps = bubbleSort(nums)[0];
                int selectionSwaps = selectionSort(nums1)[0];
                int insertionSwaps = insertionSort(nums2)[0];
                if(bubbleSwaps <= insertionSwaps && bubbleSwaps <= selectionSwaps){
                        return "Bubble";
                }else if(insertionSwaps <= selectionSwaps){
                        return "Insertion";
                }else{
                        return "Selection";
                }
        }

        static String leastIterations(double[] nums){
                double[] nums1 = nums.clone();
                double[] nums2 = nums.clone();
                int bubbleIters = bubbleSort(nums)[1];
                int selectionIters = selectionSort(nums1)[1];
                int insertionIters = insertionSort(nums2)[1];
                if(bubbleIters <= insertionIters && bubbleIters <= selectionIters){
                        return "Bubble";
                }else if(insertionIters <= selectionIters){
                        return "Insertion";
                }else{
                        return "Selection";
                }
        }


        public static void main(String args[]){}
}
