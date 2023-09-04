LeetCode Q :- 350

class Solution {
	
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        ArrayList<Integer> insection = new ArrayList<>();
        while ( i < nums1.length && j < nums2.length ){
            if ( nums1[i] < nums2[j] ) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                insection.add(nums1[i]);
                i++;
                j++;
            }
        }
        return insection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

	
	// O(n)
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] smallArr;
        int[] longArr;
        if ( nums1.length < nums2.length ){
            smallArr = nums1;
            longArr = nums2;
        } else {
            smallArr = nums2;
            longArr = nums1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i < smallArr.length; i++ ) {
            if ( map.containsKey( smallArr[i]) ){
                map.put( smallArr[i], map.get( smallArr[i]) + 1);
            } else {
                map.put( smallArr[i], 1);
            }
        }
        
        int count = 0;
        int[] tempResult = new int[smallArr.length];
        for ( int i = 0; i < longArr.length; i++ ) {
            if ( map.containsKey( longArr[i]) ){
                tempResult[count] = longArr[i];
                count++;
                int countValue = map.get( longArr[i]);
                if ( countValue - 1 == 0 ) {
                    map.remove( longArr[i]);
                } else {
                    map.put( longArr[i], countValue - 1);
                }
            }
            
        }
        int[] result = new int[count];
        System.arraycopy( tempResult, 0, result, 0, count);
        
        return result;
    }
}