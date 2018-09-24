public class Point3d {
	
	private double xCoord;
	private double yCoord;
	private double zCoord;
	
	// Конструкторы
	public Point3d(double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	public Point3d() {
		this(0.0, 0.0, 0.0);
	}
	
	// Получение значений
	public double getX(){
		return xCoord;
	}	  
	public double getY(){
		return yCoord;
	}
	public double getZ(){
		return zCoord;
	}

	// Присвоение значений
	public void setX(double x){
		xCoord = x;
	}
	public void setY(double y){
		yCoord = y;
	}
	public void setZ(double z){
		zCoord = z;
	}
	
	// Сравнение
	public boolean equals(Point3d point) {
		if (this.xCoord == point.xCoord && 
			this.yCoord == point.yCoord && 
			this.zCoord == point.zCoord) {
			return true; } 
		else { return false; }
	}	
	
	// Расстояние
	public double distanceTo(Point3d point){
		return Math.sqrt(Math.pow(this.xCoord-point.xCoord,2)+
		Math.pow(this.yCoord-point.yCoord,2)+ Math.pow(this.zCoord-point.zCoord,2));
	}  
}

