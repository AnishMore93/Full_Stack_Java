package abstraction.sports;

public class Football implements Coach{

	
	public String getPractice() {
		
		return "Keeping";
	}

	@Override
	public String getWorkout() {
		
		return "Running";
	}

	
	public String getBreakfast() {
		
		return null;
	}

	
	public String getlunch() {
		
		return null;
	}
	

}
