
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;
	private boolean availability;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	public String toString() {
		
		// Write your codes here
		return String.format("%-10s %-30s %-10s %-10s", assetTag,
				description, showAvailability(isAvailable),dueDate);
	}
	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String showAvailability(boolean isAvailable) {
		String avail;
		if(isAvailable==true) {
			avail="yes";
		}
		else {
			avail="no";
		}
		return avail;
	}
}

