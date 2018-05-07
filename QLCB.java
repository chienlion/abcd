package Quanlycanbo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	public static void main(String[] args) {
		ArrayList<Canbo> List = new ArrayList<>();
		ArrayList<Nhanvien> List1 = new ArrayList<>();
		ArrayList<Kysu> List2 = new ArrayList<>();
		ArrayList<Congnhan> List3 = new ArrayList<>();
		int[] Array;
		Scanner sc = new Scanner(System.in);
		int n, luachon;
		// tai sao a = 0?
		int a = 0 ,b = 0,c,d,f;
		do {
			
			menu();
			try {
				System.out.println("Moi ban nhap vao lua chon. ");
				luachon = Integer.parseInt(sc.nextLine());
				if(luachon<0) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("Ban nhap sai. Moi nhap lai");
				luachon = 0;
			}
			switch (luachon) {
			case 1:
				do {
					System.out.println("1. Nhan vien");
					System.out.println("2. Ky su");
					System.out.println("3. Cong nhan");
					
						try {
							System.out.println("Chon lop can bo can them");
							a = Integer.parseInt(sc.nextLine());
							if(a<0) {
								throw new NumberFormatException();
							}
							
						} catch (NumberFormatException e) {
							System.out.println("Ban nhap sai. Mai nhap lai");
							a= 0;
						}
					
					switch (a) {
					case 1:
						System.out.println("So luong nhan vien can nhap");
						n = Integer.parseInt(sc.nextLine());
					    Array =new int[n];
						for(int i =0;i<Array.length;i++) {
							Nhanvien nv = new Nhanvien();
							nv.add();
							List1.add(nv);
						}
						break;
					case 2:
						
						System.out.println("So luong kysu can nhap");
						d = Integer.parseInt(sc.nextLine());
					    Array =new int[d];
						for(int i =0;i<Array.length;i++) {
							Kysu ks = new Kysu();
							ks.add();
							List2.add(ks);
						}
						break;
					case 3:
						System.out.println("So luong cong nhan can nhap");
						f = Integer.parseInt(sc.nextLine());
					    Array =new int[f];
						for(int i =0;i<Array.length;i++) {
							Congnhan cn = new Congnhan();
							cn.add();
							List3.add(cn);
						}
						break;
					}
					break;
				}while(a!=3);
				break;
			case 2:
				do {
					System.out.println("1. Nhan vien");
					System.out.println("2. Ky su");
					System.out.println("3. Cong nhan");
					
						try {
							System.out.println("Chon lop can can hien thi thong tin");
							a = Integer.parseInt(sc.nextLine());
							if(a<0) {
								throw new NumberFormatException();
							}
							
						} catch (NumberFormatException e) {
							System.out.println("Ban nhap sai. Mai nhap lai");
							a =0;
						}
					switch (a) {
					case 1:
						System.out.printf("%-5s %-10s %-10s %-10d","Ho ten","Gioi tinh","Dia chi", "Nam sinh");
						for(int i=0;i<List1.size();i++) {
							List1.get(i).show();
						}
						break;
					case 2:
						System.out.printf("%-5s %-10s %-10s %-10d","Ho ten","Gioi tinh","Dia chi", "Nam sinh");
						for(int i=0;i<List2.size();i++) {
							List2.get(i).show();
						}
						break;
					case 3:
						System.out.printf("%-5s %-10s %-10s %-10d","Ho ten","Gioi tinh","Dia chi", "Nam sinh");
						for(int i=0;i<List3.size();i++) {
							List3.get(i).show();
						}
						break;
					
					}
					break;
				}while(a!=3);
			    break;
			case 3:
				String ten;
				System.out.println("Nhap ten can bo can tim: ");
				ten = sc.nextLine();
				for(int i=0;i<List.size();i++) {
					if(ten.equalsIgnoreCase(List.get(i).getName())) {
						List.get(i).show();
					}
				}
				break;
			case 4: 
				break;
			}
		}while(luachon!=4);
		
	}
	public static void menu() {
		System.out.println("1. Nhap thong tin can bo can quan ly ");
		System.out.println("2. Hien thi thong tin can bo can quan ly");
		System.out.println("3. Tim kiem can bo theo ten ");
		System.out.println("4. Thoat chuong trinh!");
	}

}
