 import java.io.*;
 import java.util.Scanner;
 
public class Lab1 {

	//чтение из файла
	private static String readF() {
		String str = "";
		try {
			BufferedReader buf = new BufferedReader(new FileReader("file.txt"));
			StringBuilder sb = new StringBuilder();
			String line = buf.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = buf.readLine();
			}
			str = sb.toString();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return str;
	}

	//запись в файл
	private static void writeF(String str) {
		try{
			FileWriter nFile = new FileWriter("nFale.txt", false);
			nFile.write(str);
			nFile.flush();
		} catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

	//площадь треугольника из 3х точек
	public static double computeArea(Point3d[] point) {
		double a = point[0].distanceTo(point[1]);
		double b = point[1].distanceTo(point[2]);
		double c = point[2].distanceTo(point[0]);
		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

    public static void main(String[] argv) {
        String points = readFile();
        String areas = "";
        String[] threePoints = points.split("!");
        for (String point : threePoints) {
            String[] coordinates = point.split(",");
            if (coordinates.length == 9) {
                Point3D point1 = new Point3D(Double.valueOf(coordinates[0]), Double.valueOf(coordinates[1]), Double.valueOf(coordinates[2]));
                Point3D point2 = new Point3D(Double.valueOf(coordinates[3]), Double.valueOf(coordinates[4]), Double.valueOf(coordinates[5]));
                Point3D point3 = new Point3D(Double.valueOf(coordinates[6]), Double.valueOf(coordinates[7]), Double.valueOf(coordinates[8]));
                if(point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
					System.out.println("Точки совпали! Не верно!");
                } else {
					areas += computeArea(firstPoint, secondPoint, thridPoint) + "\n";
                }
            }
        }
        writeFile(areas);
    }
}