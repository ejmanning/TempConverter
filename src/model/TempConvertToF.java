package model;

public class TempConvertToF {
		private float degreesEntered;
		private float degreesFahrenheit;
		
		public TempConvertToF() {
			super();
		}
		
		public TempConvertToF(float degreesEntered) {
			super();
			this.degreesEntered = degreesEntered;
			toFahrenheit(degreesEntered);
		}

		public void setToFahrenheit(float degreesEntered) {
			this.degreesEntered = degreesEntered;
			toFahrenheit(degreesEntered);
		}
		
		public float getDegreesEntered() {
			return degreesEntered;
		}

		public void setDegreesEntered(float degreesEntered) {
			this.degreesEntered = degreesEntered;
		}

		public float getDegreesFahrenheit() {
			return degreesFahrenheit;
		}

		public void setDegreesFahrenheit(float degreesFahrenheit) {
			this.degreesFahrenheit = degreesFahrenheit;
		}
		
		private void toFahrenheit(float degreesEntered) {
			// TODO Auto-generated method stub
			degreesFahrenheit = (degreesEntered * 9/5) + 32;
			
		}

		@Override
		public String toString() {
			return "TempConvertToF [degreesEntered=" + degreesEntered + ", degreesFahrenheit=" + degreesFahrenheit + "]";
		}
		
		
		
	}

