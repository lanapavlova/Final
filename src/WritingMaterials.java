abstract  public class WritingMaterials {
	static enum  ink{
		blue,
		green,
		red,
		black
	}
	abstract boolean theyCanWrite();
	ink inka;
	
	public double size;//��������
	public String brand;//�������
	
	WritingMaterials( double size, String brand,ink ink){
		this.size=size;
		this.brand=brand;
		this.inka=ink;
				
	}
	

}
