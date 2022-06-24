public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.testLCStarter();
        //main.testSortArray();
    }

    private void testOCado(){
        int[] A = {1, 3, 6, 4, 1, 2};
        OcadoDemo ocadoDemo = new OcadoDemo();
        System.out.println(ocadoDemo.solution(A));
    }

    private void testSortArray(){
        int[] nums = {5,1,1,2,0,0};
        SortArrayLC sort = new SortArrayLC();
        sort.mergeSort(nums);
    }

    private void testLCStarter(){
        LCStarter test = new LCStarter();
        String[] testCases = {};

    }

}
