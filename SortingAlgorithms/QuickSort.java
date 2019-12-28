class QuickSort 
{ 
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pivot=low;
            int i=low;
            int j=high;
            int temp;

            while(i<j)
            {
                while(arr[i]<=arr[pivot] && i<high)
                    i++;
                while(arr[j]>arr[pivot])
                    j--;

                if(i<j)
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }

            temp=arr[pivot];
            arr[pivot]=arr[j];
            arr[j]=temp; 
 
            sort(arr, low, j-1); 
            sort(arr, j+1, high); 
        } 
    } 

    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 

        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 

        System.out.println("sorted array"); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
} 
