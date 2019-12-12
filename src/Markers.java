public class Markers extends WritingMaterials {
	
	int weight;//тегло
	double thicknessOfTheFiller;//дебелина на пълнителя
	boolean permanentOrNot;

	Markers(double size, String brand,ink ink, int weight,double thicknessOfTheFiller,boolean permanentOrNot ) {
		
		super(size, brand, ink);
		this.weight=weight;
		this.thicknessOfTheFiller=thicknessOfTheFiller;
		this.permanentOrNot=permanentOrNot;
	}


	@Override
	boolean theyCanWrite() {
		// TODO Auto-generated method stub
		return false;
	}
	 public int WeightControl(int weight) {
	      if (weight < 0 || weight > 500) {
	         throw new IllegalArgumentException();
	      } else {
	         this.weight = weight;
	      }
		return weight;
		}
	 }


