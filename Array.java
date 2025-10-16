public class Array {
    public static void main(String[] args) {
        // int i=10;
        // while(i<=20){
        //     System.out.println(i+2);
        //     i++;
        // }
        // int ii[]={10,20,30,40};
        // for (int j : ii) {
        //     System.out.println(j);
        // }


        //maximum in array

        // int arr[]={10,20,30,40,50};
        // int max= arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
                
        //     }
        // }
        // System.out.println("maximum value is "+max);



//array reverse
// int a[]={30,40,50,70};
// int start=0;
// int end=a.length-1;

// while(start<end){
//     int temp=a[start];
//     a[start]=a[end];
//     a[end]=temp;
//     start++;
//     end--;
// }
// // Optionally, print the reversed array
// for(int i=0; i<a.length; i++){
//     System.out.print(a[i] + " ");
// }



// array target search

// int target =50;
// int arr1[]={10,20,30,40,50};
// for (int i=0;i<arr1.length;i++){
//     if(arr1[i]==target){
//         System.out.println("target found at "+i);
//         break;
//     }
// }



//


int arr2[]={10,20,30,40,50};
int target=40;

int start=0;
int end=arr2.length-1;

while(start<=end){
    int mid=(start+end)/2;
    if(arr2[mid]==target){
        System.out.println("target found at "+mid);
        break;
    }
    else if(arr2[mid]<target){
        start=mid+1;

    }
    else{
        end=mid-1;
    }
}
    }
}





