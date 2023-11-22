package BurcProgrami;
import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int month, day;
		System.out.print("Doğum Tarihinizi Ay Formatında Giriniz: ");
		month = scan.nextInt();
		
		System.out.print("Doğum Tarihinizi Gün Formatında Girtiniz: ");
		day = scan.nextInt();
		
		
		String sign = "";
		String ErrorMsg = "Hatalı Tarih Girişi Yaptınız!! Lütfen Tekrar Deneyiniz!!";
		boolean isError = false;
		
		switch(month) {
		case 1:
			if(day >= 1 && day <= 31) {
				if(day <= 21) {
					sign = "Oğlak";
				}
				else {
					sign = "Kova";
				}
			}
			else {
				isError = true;
			}
			break;
		case 2:
			if(day >= 1 && day <= 28) {
				if(day <= 19) {
					sign = "Kova";
				}
				else {
					sign = "Balık";
				}
			}
			else {
				isError = true;
			}
			break;
		case 3:
			if(day >= 1 && day <= 31) {
				if(day <= 20 ) {
					sign = "Balık";
				}
				else {
					sign = "Koç";
				}
			}
			else {
				isError = true;
			}
			break;
		case 4:
			if(day >= 1 && day <= 31) {
				if(day <= 21) {
					sign = "Koç";
				}
				else {
					sign = "Boğa";
				}
			}
			else {
				isError = true;
			}
			break;
		case 5:
			if(day >= 1 && day <= 31) {
				if(day <= 21) {
					
					sign = "Boğa";
				}
				else {
					sign = "İkizler";
				}
			}
			else {
				isError = true;
			}
			break;
		case 6:
			if(day >= 1 && day <= 31) {
				if(day <= 22) {
					
					sign = "İkizler";
				}
				else {
					sign = "Yengeç";
				}
			}
			else {
				isError = true;
			}
			break;
		case 7:
			if(day >= 1 && day <= 31) {
				if(day <= 23) {
					
					sign = "Yengeç";
				}
				else {
					sign = "Aslan";
				}
			}
			else {
				isError = true;
			}
			break;
		case 8:
			if(day >= 1 && day <= 31) {
				if(day <= 23) {
					
					sign = "Aslan";
				}
				else {
					sign = "Başak";
				}
			}
			else {
				isError = true;
			}
			break;
		case 9:
			if(day >= 1 && day <= 31) {
				if(day <= 23) {
					
					sign = "Başak";
				}
				else {
					sign = "Terazi";
				}
			}
			else {
				isError = true;
			}
			break;
		case 10:
			if(day >= 1 && day <= 31) {
				if(day <= 24) {
					
					sign = "Terazi";
				}
				else {
					sign = "Akrep";
				}
			}
			else {
				isError = true;
			}
			break;
		case 11:
			if(day >= 1 && day <= 31) {
				if(day <= 23) {
					
					sign = "Akrep";
				}
				else {
					sign = "Yay";
				}
			}
			else {
				isError = true;
			}
			break;
			
			default:
				isError = true;
		}
	
		
		if(isError) {
			System.out.println(ErrorMsg);
		}
		else {
			System.out.println("Burcunuz : " + sign);
		}

	}

}
