class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalT = new ArrayList<List<Integer>>(numRows);
        
        List<Integer> firstRow = new ArrayList<Integer>(1);
        firstRow.add(1);
        pascalT.add(firstRow);
        
        for (int i = 1; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>(i + 1);
            row.add(1);
            for (int j = 0; j < i - 1; ++j) {
                row.add(pascalT.get(i - 1).get(j) + pascalT.get(i - 1).get(j + 1)); // j + 1 < i == pascalT.get(i-1).length
            }
            row.add(1);
            pascalT.add(row);
        }
        
        return pascalT;
    }
}
