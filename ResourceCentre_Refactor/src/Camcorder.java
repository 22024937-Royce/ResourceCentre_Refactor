
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		// Write your codes here
        return String.format("%-10s %-30s %-10s %-10s %-20d\n", getAssetTag(), getDescription(),

                ResourceCentre.showAvailability(getIsAvailable()), getDueDate(), getOpticalZoom());

    }

		
	}


