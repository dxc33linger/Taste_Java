package Hash;

public class StuInfo {

		// TODO Auto-generated method stub
		private int age;
		private int count;
		
		
		/* These lines can be added automatically by Eclipse.
		 * Right click inside the Class and click on Source -> Generate Getters and Setters
		 */
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getCount() {
			return count;
		}
		
		public void setCount(int count) {
			this.count = count;
		}
		
		
		
		/* These lines can be added automatically by Eclipse.
		 * Right click inside the Class and click on Source -> Generate Constructors using Fields
		 */
		public StuInfo(int age, int count) {
			super();
			this.age = age;
			this.count = count;
		}
		
		public StuInfo(int age) {
			super();
			this.age = age;
		}

		
		public int hashCode() {
			return age;
			
		}
		/* These lines can be added automatically by Eclipse.
		 * Right click inside the Class and click on Source -> Generate toStrings()
		 */
		@Override
		public String toString() {
			return "StuInfo [age=" + age + ", count=" + count + "]";
		}
	

}
