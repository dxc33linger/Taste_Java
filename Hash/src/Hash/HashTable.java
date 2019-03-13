package  Hash;

import java.util.Arrays;

public class HashTable {
	private StuInfo[] data = new StuInfo[100];
	
	
	public void put(StuInfo stuInfo) {
		
		int index = stuInfo.hashCode();
		data[index] = stuInfo;
		
	}
	
	public StuInfo get(StuInfo stuInfo) {
		return data[stuInfo.hashCode()];
	}

	/* These lines can be added automatically by Eclipse.
	 * Right click inside the Class and click on Source -> Generate toStrings()
	 */
	@Override
	public String toString() {
		return "HashTable [data=" + Arrays.toString(data) + "]";
	}
}
