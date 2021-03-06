package  Hash;

import java.util.Arrays;

public class TestHashTable {

	public static void main(String[] args) {
		StuInfo s1 = new StuInfo(16, 3);
		StuInfo s2 = new StuInfo(17, 11);
		StuInfo s3 = new StuInfo(18, 23);
		StuInfo s4 = new StuInfo(19, 24);
		StuInfo s5 = new StuInfo(20, 9);

		HashTable ht = new HashTable();
		ht.put(s1);
		ht.put(s2);
		ht.put(s3);
		ht.put(s4);
		ht.put(s5);


		StuInfo target = new StuInfo(20);
		StuInfo info = ht.get(target);
		System.out.println(info + "\n");
		
		
		System.out.println(ht + "\n");

		System.out.println("Change Hash Table to age%10 and see the result again! "+ "\n" +
		"public int hashCode() {"+ "\n" +
				"return age%10;");
				
	}

}
