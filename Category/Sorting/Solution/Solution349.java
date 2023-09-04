Leet Code Q :- 349
class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for ( int num : nums1 ) {
            set1.add(num);
        }
        Set<Integer> insection = new HashSet<>();
        for ( int num : nums2 ) {
            if ( set1.contains(num) ){
                insection.add(num);
            }
        }

        int[] array = insection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return array;
    }
	
}