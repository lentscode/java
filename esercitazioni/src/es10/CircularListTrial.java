package es10;

class CircularListTrial {
	public static void main(String[] args) {
		try {
						CircularList<Integer> list = new CircularList<Integer>();

						list.add(1);
						System.out.println(list.getCurrentPosition());
						System.out.println(list.getCurrentElement());
						System.out.println(list.getSize());

						list.next();
						System.out.println(list.getCurrentPosition());

						list.add(3);
						list.add(5);
						list.add(6);
						System.out.println(list.getCurrentPosition());
						System.out.println(list.getSize());
						list.next();
						list.next();
						list.previous();
						System.out.println(list.getCurrentPosition());

						list.remove(3);
						System.out.println(list.getSize());

						list.next();
						list.remove(2);
						System.out.println(list.getCurrentPosition());

						list.remove(1);
						list.remove(0);
						list.remove(-42);
		} catch (EmptyListException | InvalidIndexException e) {
			System.out.println(e.toString());
		}
	}
}
