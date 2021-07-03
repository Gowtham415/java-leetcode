package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
 */
public class PascalsTriangle {
	public static void main(String[] args) {
		PascalsSolution ps = new PascalsSolution();
//		for(List<Integer> list: ps.generate(1)) {
//			list.stream().map(s->(s.toString()+" ")).forEach(System.out::print);
//			System.out.println();
//		}
		
		ps.getRow(3).forEach(System.out::println);
		
	}

}

class PascalsSolution {
    public List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> result = new ArrayList<>();
    	
    	for(int i=0;i<numRows;i++) {
    		List<Integer> list = new ArrayList<>();
    		
    		if(i==0) {
    			list.add(1);
    		}else if(i==1) {
    			list.add(1);
    			list.add(1);
    		}else {
    			list.add(1);// First row
    			List<Integer> prevRows = new ArrayList<>(result.get(result.size()-1));
    			for(int j=0;j<prevRows.size()-1;j++) {
    				list.add(prevRows.get(j)+prevRows.get(j+1));
    			}
    			list.add(1);// Last row
    		}result.add(list);
    		
    	}
    	return result;
    }
    
    public List<Integer> getRow(int rowIndex) {
    	return generate(rowIndex+1).get(rowIndex);
        
    }
}