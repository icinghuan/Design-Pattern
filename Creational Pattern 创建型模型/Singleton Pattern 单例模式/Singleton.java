//Initialization Demand Holder (IoDH)

class Singleton
{
	private Singleton() {
		System.out.println("³õÊ¼»¯µ¥Àý");
	}
	
	private static class HolderClass {
		private final static Singleton instance= new Singleton();
	}
	
	public static Singleton getInstance() {
		return HolderClass.instance;
	}
	
	public static void main(String[] args){
		Singleton s1,s2,s3,s4;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s3 = Singleton.getInstance();
		s4 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}