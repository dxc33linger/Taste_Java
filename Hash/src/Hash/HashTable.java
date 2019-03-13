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

	@Override
	public String toString() {
		return "HashTable [data=" + Arrays.toString(data) + "]";
	}
}
