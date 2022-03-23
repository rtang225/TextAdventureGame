package game;
import java.util.*;

class Room {

	// String name;
	String displayName;
	String description;
	boolean isDark;
	boolean isVisited;
	String N, E, S, W, U, D;
	ArrayList items = new ArrayList();

	// constructor
	Room(String displayName, String description) {
		this.displayName = displayName;
		this.description = description;
	}

	void setExits(String N, String E, String S, String W, String U, String D) {
		this.N = N;
		this.E = E;
		this.S = S;
		this.W = W;
		this.U = U;
		this.D = D;
	}

	/*void characteristics(boolean isDark) {
		this.isDark = isDark;
	}*/

	String getExit(char dir) {
		switch (dir) {
		case 'N': return this.N;
		case 'E': return this.E;
		case 'S': return this.S;
		case 'W': return this.W;
		case 'U': return this.U;
		case 'D': return this.D;
		default: return "";
		}
	}

	static void setupRooms(HashMap<String, Room> roomList) {
		Room r = new Room("Forest",
				"You awake in a forest, the last thing that you remember was flying towards mars when you crashed into a rock and went off course. Now, lying in pieces near you, your ship is unusable. You notice some parts are missing as well. You think you should probably go find them instead of laying here until you die. \n"
				+ "Heading north you come across a river heading West, as well as a mine through a clearing to the east.\n"
				+ "Placeholder East"
				+ "Placeholder South"
				+ "Placeholder West"
				+ "Placeholder Up");
		r.setExits("forest2", "desert","mountains", "lake", "trees", "");
		roomList.put("forest1", r);
		
		r = new Room("Structure in Trees",
				"Placeholder Description\n"
				+ "Placeholder Down");
		r.setExits("", "", "", "", "", "forest1");
		roomList.put("trees", r);

		r = new Room("Desert",
				"Placeholder Description\n"
				+ "Placeholder West");
		r.setExits("", "", "", "Desert", "", "");
		roomList.put("desert", r);

		r = new Room("Forest",
				"Placeholder Description\n"
				+ "Placeholder East"
				+ "Placeholder South"
				+ "Placeholder West");
		r.setExits("", "mine", "forest1", "beach", "", "");
		roomList.put("forest2", r);

		r = new Room("Mines",
				"Placeholder Description\n"
				+ "Placeholder East"
				+ "Placeholder West");
		r.setExits("", "goldmine", "", "forest2", "", "");
		roomList.put("mine", r);

		r = new Room("Gold Mine",
				"Placeholder Description\n"
				+ "Placeholder West");
		r.setExits("", "", "", "mine", "", "");
		roomList.put("goldmine", r);

		r = new Room("Beach",
				"Placeholder Description\n"
				+ "Placeholder East"
				+ "Placeholder South");
		r.setExits("", "forest2", "lake", "", "", "");
		roomList.put("beach", r);
	}
}