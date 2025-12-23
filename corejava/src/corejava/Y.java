package corejava;


class Y extends X{
int num=10;
	@Override
	void show() {
		System.out.println("num="+num);
		
	}
	public static void main(String[] args) {
		new Y();
	}
	
}