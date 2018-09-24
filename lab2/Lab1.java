 import java.io.*;

public class Lab1 {

	public static double getDouble() {
	try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			try {
				double d = Double.parseDouble(s);
				return d;
			}
			catch (NumberFormatException e) {
				return 0.0;
			}
		}
		catch (IOException e) {
			return 0.0;
		}
	}

	//ввод
	public static Point3d[] inputPoint() {
		Point3d[] point = new Point3d[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Введите x,y,z: ");
			point[i] = new Point3d(getDouble(),getDouble(),getDouble());
		}
		return point;
	}

	//площадь
	public static double computeArea(Point3d[] point) {
		double a = point[0].distanceTo(point[1]);
		double b = point[1].distanceTo(point[2]);
		double c = point[2].distanceTo(point[0]);
		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	
	public static void main(String[] argv){
		Point3d[] point = inputPoint();
		if(point[0].equals(point[1]) || point[0].equals(point[2]) || point[1].equals(point[2]))
			System.out.println("Точки совпали! Не верно!");
		else
			System.out.println("Площадь: " + computeArea(point));
	}
}