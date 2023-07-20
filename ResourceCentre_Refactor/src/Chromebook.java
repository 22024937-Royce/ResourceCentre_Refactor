
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		// Write your codes here
        return String.format("%-10s %-30s %-10s %-10s %-20s\n", getAssetTag(), getDescription(),

                ResourceCentre.showAvailability(getIsAvailable()), getDueDate(), getOs());

    }
}

 


