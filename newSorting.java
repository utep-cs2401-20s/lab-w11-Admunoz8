import java.util.Arrays;

public class newSorting {
    public  void newSorting(int[] a, int size) {
        if (size <= 1) {
            newSorting(a, a.length + 1);
        }
        else if
            (a.length < size) {
                    quickSort(a);
            }

        else {
            //sets up the positions
                int middle = (a.length / 2);

                int[] left = new int[middle];

                int[] right = new int[a.length - middle];

                for (int i = 0; i < left.length; i++) {
                    left[i] = a[i];
                }
                for (int i = 0; i < a.length - middle; i++) {
                    right[i] = a[middle + i];
                }

                //recursive
                newSorting(left, size);
                newSorting(right, size);


            mergeSortedHalves(a, left, right);
            }
        }

    public  void  mergeSortedHalves(int []a,int[] left, int[] right) {
        //left index
        int i = 0;
        //left index
        int k = 0;
        //left index
        int n = 0;
        while(n < a.length) {
            if(i < left.length) {
                if(k < right.length) {
                    if(left[i] < right[k]) {
                        a[n] = left[i];
                        n++;
                        i++;
                    }
                    else {
                        a[n] = right[k];
                        n++;
                        k++;
                    }
                }
                //out of bounds
                else {
                    a[n] = left[i];
                    n++;
                    i++;
                }
            }
            else if(k < right.length) {
                a[n] = right[k];
                n++;
                k++;
            }
        }
    }
    private void quickSort (int[] A){
        quickSort(A, 0, A.length-1);
    }

    //Recursively sorts an array
    private void quickSort(int[] A, int begin, int end) {
        if (begin < end) {
        //contains index position of pivot
            int partIndex = part(A, begin, end);

            quickSort(A, begin, partIndex-1);
            quickSort(A, partIndex+1, end);
        }
    }


    public  int part(int[] a, int low, int high) {
        int piv = a[low];//sets pivot
        int i = high;
        int j = low + 1;
        // separate
        while(j <= low){
            //if  element is less than pivot
            if(a[j] < piv){
                // increase
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j++;
        }
        //swap pivot
        int temp = a[i];
        a[i] = a[low];
        a[low] = temp;
        return i;
    }
}
//done