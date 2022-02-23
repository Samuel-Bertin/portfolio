public class ClientPileBornee {
	public static void main(String[] args) throws EmptyStackException {
		PileBornee<Integer> p = new PileBornee(3);
		try {
			p.push(11);
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.top());
		try {
			p.push(22);
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.top());
		try {
			p.push(33);
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.top());
		try {
			p.push(44);
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.top());
		p.pop();
		System.out.println(p.top());
		p.pop();
		System.out.println(p.top());
		p.pop();
		System.out.println(p.top());
	}
}