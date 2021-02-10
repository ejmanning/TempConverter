package model;

public class TempConvertToC {
	private float degreesEntered;
	private float degreesCelsius;
	
	public TempConvertToC() {
		super();
	}
	
	public TempConvertToC(float degreesEntered) {
		super();
		this.degreesEntered = degreesEntered;
		toCelsius(degreesEntered);
	}

	public void setToCelsius(float degreesEntered) {
		this.degreesEntered = degreesEntered;
		toCelsius(degreesEntered);
	}
	
	public float getDegreesEntered() {
		return degreesEntered;
	}

	public void setDegreesEntered(float degreesEntered) {
		this.degreesEntered = degreesEntered;
	}

	public float getDegreesCelsius() {
		return degreesCelsius;
	}

	public void setDegreesCelsius(float degreesCelsius) {
		this.degreesCelsius = degreesCelsius;
	}
	
	private void toCelsius(float degreesEntered) {
		// TODO Auto-generated method stub
		degreesCelsius = (degreesEntered - 32) * 5/9;
		
	}

	@Override
	public String toString() {
		return "TempConvertToC [degreesEntered=" + degreesEntered + ", degreesCelsius=" + degreesCelsius + "]";
	}
	
	
	
}
