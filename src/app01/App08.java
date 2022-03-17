package app01;

public class App08 {
	public static void main(String[] args) {
		Human human=new Human();
		
		Human human01=new Human();
		Human human02=new Human();
		
		System.out.println("is same?"+human01.equals(human02));
		
		human.setHumanName("sk");
		human.setHumanAge(22);
		human.setHumanHeight(180);
		human.setHumanWeight(67);
		
		
		
		human.setAddress(human.createAddressObj());
		
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanAge());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanWeight());
		
		System.out.println(human.getAddress());
		
		System.out.println(human);
		
		human.setHumanName("sk");
		human.setHumanAge(23);
		human.setHumanHeight(180);
		human.setHumanWeight(75);
		System.out.println(human);
	}
}
