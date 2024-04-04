class Solution {
    public List<Integer> generateRow(int row){
        int res = 1 ;
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        for(int col =1; col<row;col++){
            res = res*(row-col);
            res = res/(col);
            tempList.add(res);
        }
        return tempList;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int r = 1 ;r<=numRows;r++){
            list.add(generateRow(r));
        }
        return list;
    }
}
