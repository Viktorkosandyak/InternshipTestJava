package person.consciousness;

public class Knowledge {
	
	private int level;
	
	public Knowledge(int level) {
        this.level = level;
    }
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return "Knowledge [level=" + level + "]";
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
