import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        int arr1[]={1, 23, 4, 56, 47, 95, 2};
        Arrays.sort(arr1);
        System.out.println(arr1);
        
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}