
public class datademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data ob = new data(1,"qamreen","bangalore");
		datademo o = new datademo();
		System.out.println(ob);
		boolean output = ((ob) instanceof data);
		System.out.println(output);
		boolean output2 = ((o) instanceof datademo);
		System.out.println(output2);
	}

}
