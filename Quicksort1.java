public class Quicksort1 {
    public static void quicksort(int arr[],int si,int ei){

        if(si<ei) {
            int pindex = partition(arr, si, ei);

            /*System.out.println(pindex);*/
            /*for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }*/
            quicksort(arr, si, pindex - 1);
            quicksort(arr, pindex + 1, ei);
        }
    }
    public static int partition(int arr[], int si,int ei){
        int i=si-1;
        int pivot=arr[ei];

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args){
        int arr[]={6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
