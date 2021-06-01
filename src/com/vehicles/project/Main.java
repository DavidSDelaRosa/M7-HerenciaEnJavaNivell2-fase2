package com.vehicles.project;

import java.util.*;
import java.util.Scanner;

import com.vehicles.project.exceptions.InvalidWheelDiameterException;
import com.vehicles.project.vehicles.Bike;
import com.vehicles.project.vehicles.Car;
import com.vehicles.project.vehicles.Truck;
import com.vehicles.project.vehicles.Wheel;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("�Qu� quieres crear? \n1. Un coche\n2. Una moto\n3. Un camion");
		int eleccion = sc.nextInt();
		sc.nextLine();
		
		if(eleccion==1) {
			
			System.out.println("Introduce la matr�cula del coche: ");
			String matriculaCoche = sc.nextLine();
			
			System.out.println("Introduce ahora la marca: ");
			String marcaCoche = sc.nextLine();
			
			System.out.println("Especifica el color del coche: ");
			String colorCoche = sc.nextLine();
			
			Car car = new Car(matriculaCoche, marcaCoche, colorCoche);
			
			System.out.println("Ahora vamos a ponerle las ruedas delanteras...");
			Wheel ruedaDelantera = pedirRueda();
			
			System.out.println("Vamos con las traseras...");
			Wheel ruedaTrasera = pedirRueda();
			
			List<Wheel> ruedasDelanteras = new ArrayList<>();
			ruedasDelanteras.add(ruedaDelantera);
			ruedasDelanteras.add(ruedaDelantera);
			
			List<Wheel> ruedasTraseras = new ArrayList<>();
			ruedasTraseras.add(ruedaTrasera);
			ruedasTraseras.add(ruedaTrasera);
			
			car.addWheels(ruedasDelanteras, ruedasTraseras);
			
			System.out.println(car.toString());
			
		}else if(eleccion==2) {
			
			System.out.println("Introduce la matr�cula de la moto: ");
			String matriculaMoto = sc.nextLine();
			
			System.out.println("Introduce la marca: ");
			String marcaMoto = sc.nextLine();
			
			System.out.println("Color de la moto: ");
			String colorMoto = sc.nextLine();
			
			Bike bike = new Bike(matriculaMoto, marcaMoto, colorMoto);
			
			System.out.println("Ahora vamos a ponerle las ruedas delanteras...");
			Wheel ruedaDelantera = pedirRueda();
			
			System.out.println("Vamos con las traseras...");
			Wheel ruedaTrasera = pedirRueda();
			
			bike.addWheels(ruedaDelantera, ruedaTrasera);
			
			System.out.println(bike.toString());
			
		}else if(eleccion==3){
			
			System.out.println("Introduce la matr�cula del cami�n: ");
			String matriculaCamion = sc.nextLine();
			
			System.out.println("Introduce ahora la marca: ");
			String marcaCamion = sc.nextLine();
			
			System.out.println("Especifica el color del cami�n: ");
			String colorCamion = sc.nextLine();
			
			Truck truck = new Truck(matriculaCamion, marcaCamion, colorCamion);
			
			System.out.println("Cu�ntas ruedas tiene el cami�n: 4, 6, 8, 10 � 12 ?");
			
			int ruedasTotalesCamion = sc.nextInt();
			sc.nextLine();
			
			List<Wheel> ruedasCamion = new ArrayList<>();
			
			System.out.println("Necesitar� la marca y di�metro de las ruedas... ");
			
			for(int i=0;i<ruedasTotalesCamion/2;i++) {
				
				System.out.println("Pidiendo par de ruedas n� " + (i+1));
				Wheel rueda = pedirRueda();
				ruedasCamion.add(rueda);
				ruedasCamion.add(rueda);
			}
			
			truck.addWheels(ruedasCamion);
			
			System.out.println("N�mero correcto de ruedas: " + truck.suitableNumberOfWheels());
			
		}else {
			System.err.println("S�lo hay tred opciones v�lidas: [1 -> Coche | 2 -> Moto | 3 -> Camion]");
		}
		
		sc.close();
	}
	
	public static Wheel pedirRueda() throws InvalidWheelDiameterException {
		
		Wheel rueda;
		
		System.out.println("De qu� marca quieres la rueda: ");
		String marcaRueda = sc.nextLine();
		
		System.out.println("Di�metro de la rueda trasera: ");
		double diametroRueda = sc.nextDouble();
		sc.nextLine();
		
		rueda = new Wheel(marcaRueda, diametroRueda);
		
		return rueda;
	}
}
