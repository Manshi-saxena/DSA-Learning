package Stack;
public class NextGreaterElementBruteForce {

    public static void nextGreater(int arr[]) {

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            ans[i] = -1; // Default: agar next greater na mile

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break;   // Pehla greater mil gaya
                }
            }
        }

        // Print Answer
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 8, 0, 1, 3};

        nextGreater(arr);
    }
}