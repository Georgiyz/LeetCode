public class OcadoDemo {

    public int solution(int[] A) {
        int missing = Integer.MAX_VALUE;

        sort(A);

        for(int i = 0; i <= A.length - 1; i++){
            if(A[i] <= missing && A[i] != 0)
                missing = A[i] + 1;
        }
        return missing;
    }

    private int[] sort(int[] A){
        int temp;
        boolean change = true;

        while(change == true){
            change = false;
            for(int i = 0; i < A.length - 1; i++){
                if(A[i] > A[i + 1]){
                    change = true;
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
        }

        return A;
    }
}
