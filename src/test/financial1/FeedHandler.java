package test.financial1;

import java.util.HashSet;
import java.util.Set;

public class FeedHandler {

	/**
	 * Count number of distinct elements in the range of a byte array.
	 *
	 * @param buffer array to be evaluated.
	 * @param offset index of the first array element (inclusive)
	 * @param length number of array elements to be considered
	 * @return number of distinct elements in <code>buffer[offset]</code>,
	 *         <code>buffer[offset + 1]</code> ...
	 *         <code>buffer[offset + length - 1]</code>
	 */
	public static int handleFeed(byte[] buffer, int offset, int length) {
		// buffer = Arrays.copyOfRange(buffer, offset, length);
		if(offset<0 || offset > buffer.length || offset + length > buffer.length)
			return 0;
		else {
			Set map = new HashSet<Integer>();
			for (int i = offset; i < offset + length; i++) {
				if(map.contains(buffer[i])) {
					break;
				}else {
					map.add(buffer[i]);
				}	
			}
			return map == null ? 0 : map.size();
		}
	}
	public static int handleFeed1(byte[] buffer, int offset, int length) {
        int count = 0;
		for (int i = offset; i < offset + length; i++) {
			 for(int j = i + 1; j < offset + length; j++) {  
                if(buffer[i] == buffer[j])  
                    count++; 
            }  
		}
		return count;
    }
	
	public static int handleFeed2(byte[] buffer, int offset, int length) {
		
		byte[] arr = new byte[256];
		if(offset > buffer.length) {
			return 0;
		}
		int max = offset + length ;
		for (int i = offset; i < offset + length; i++) {
			arr[buffer[i]] = 1;
			// arr[buffer[i] + 128] = 1;
		}
		
        int count = 0;
		for (int j = 0; j < 256; j++) {
			if(arr[j]==1) {
				count ++;
			}
			
		}
		return count;
    }


	public static void main(String[] args) {
		byte[] sample = { 1, 2, 3, 1, 2, 3 };
		
		System.out.println("-----------handleFeed------------");
		System.out.println(handleFeed(sample, 0, sample.length)); // 3
		System.out.println(handleFeed(sample, 1, 2)); // 3
		System.out.println("-----------handleFeed1------------");
		System.out.println(handleFeed1(sample, 0, sample.length)); // 3
		System.out.println(handleFeed1(sample, 1, 2)); // 3
		System.out.println("-----------handleFeed2------------");
		System.out.println(handleFeed2(sample, 0, sample.length)); // 3
		System.out.println(handleFeed2(sample, 1, 2)); // 3
	}
}