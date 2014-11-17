package item;
import java.io.Serializable;
import java.util.HashMap;
import view.GUI;
public class Inventory implements Serializable {
	private static final long serialVersionUID = 4612177081063302900L;
	private HashMap<String, Item> items;
	private static String username;
	private int credits;

	public Inventory() {
		items = new HashMap<String, Item>();
		username = GUI.getUsername();
		credits = 0;
	}
	
	public boolean addItem(String s) {
		return items.put(s, Item.superitem) != null;
	}
	
	public boolean removeItem(String s) {
		return items.remove(s) != null;
	}

	public Item getItem(String s) {
		return items.get(s);
	}

	public String getUsername() {
		return username;
	}
	
	public void setCredits(int i) {
		if(i>=0) {
			credits = i;
		} else return;
	}
	
	public int getCredits() {
		return credits;
	}
}