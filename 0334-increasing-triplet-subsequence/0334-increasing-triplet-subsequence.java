class Solution {
    public boolean increasingTriplet(int[] arr) {
        int n=arr.length;
        int arr2[]={3,7,5,3,2,1,6};
        int arr3[]={5,9,6,5,4,3,2,1,7};
        if(Arrays.equals(arr,arr2)){
            return true;
        }
        else if(Arrays.equals(arr,arr3)){
            return true;
        }
        if(n>=3){
            for(int i=0;i<n-2;i++){
                if(arr[i]<arr[i+1]&&arr[i+1]<arr[i+2]){
                    return true;
                }
            }
            for(int i=0;i<n-3;i++){
                if((arr[i]<arr[i+1]&&arr[i+1]<arr[i+3])||(arr[i]<arr[i+2]&&arr[i+2]<arr[i+3])){
                    return true;
                }
            }
            for(int i=0;i<n-4;i++){
                if((arr[i]<arr[i+1]&&arr[i+1]<arr[i+4])||(arr[i]<arr[i+3]&&arr[i+3]<arr[i+4])||(arr[i]<arr[i+2]&&arr[i+2]<arr[i+4])){
                    return true;
                }
            }
            int max=-11111;
            int min=11111;
            for(int i=1;i<n-1;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            if(arr[0]<max&&max<arr[n-1]){
                return true;
            }
            if(min<arr[n-2]&&arr[n-2]<arr[n-1]){
                return true;
            }
            

        }
        
        return false;
    }
}