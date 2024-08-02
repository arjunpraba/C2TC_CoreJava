package com.tns.day4;

public class Student {
		String CollegeName;
		String CollegePlace;
	class Department extends Student {
		String DepartmentType;
		int StaffCount;
		int StudentStrength,BoysCount,GirlsCount;
		void DepartmentDisplay() {
			DepartmentType="CSE";
			System.out.println("Department_Type: "+DepartmentType);
		}
		
	}
	class FirstYear extends Department {
		
		void displayFirst() {
			String CollegeName="REC",CollegePlace="Perambalur",DepartmentType="CSE";
		  int  StaffCount=10,StudentStrength=50,BoysCount=25,GirlsCount=25;
		    System.out.println("CollegeName: "+CollegeName);
			System.out.println("CollegePlace: "+CollegePlace);
			System.out.println("StaffCount: "+StaffCount);
			System.out.println("DepartmentType: "+DepartmentType); 
			System.out.println("StudentStrength: "+StudentStrength);
			System.out.println("BoysCount: "+BoysCount);
			System.out.println("GirlsCount: "+GirlsCount);
			
		}
	}
	class SecondYear extends Department {
		
		void displaySecond() {
			String CollegeName="REC",CollegePlace="Perambalur",DepartmentType="CSE";
		  int  StaffCount=11,StudentStrength=40,BoysCount=20,GirlsCount=20;
		    System.out.println("CollegeName: "+CollegeName);
			System.out.println("CollegePlace: "+CollegePlace);
			System.out.println("StaffCount: "+StaffCount);
			System.out.println("DepartmentType: "+DepartmentType); 
			System.out.println("StudentStrength: "+StudentStrength);
			System.out.println("BoysCount: "+BoysCount);
			System.out.println("GirlsCount: "+GirlsCount);
			
		}
	}
	class ThirdYear extends Department {
		
		void displayThird() {
			String CollegeName="REC",CollegePlace="Perambalur",DepartmentType="CSE";
		  int  StaffCount=15,StudentStrength=60,BoysCount=30,GirlsCount=30;
		    System.out.println("CollegeName: "+CollegeName);
			System.out.println("CollegePlace: "+CollegePlace);
			System.out.println("StaffCount: "+StaffCount);
			System.out.println("DepartmentType: "+DepartmentType); 
			System.out.println("StudentStrength: "+StudentStrength);
			System.out.println("BoysCount: "+BoysCount);
			System.out.println("GirlsCount: "+GirlsCount);
			
		}
	}
	class FinalYear extends Department {
		
		void displayFinal() {
			String CollegeName="REC",CollegePlace="Perambalur",DepartmentType="CSE";
		  int  StaffCount=20,StudentStrength=90,BoysCount=45,GirlsCount=45;
		    System.out.println("CollegeName: "+CollegeName);
			System.out.println("CollegePlace: "+CollegePlace);
			System.out.println("StaffCount: "+StaffCount);
			System.out.println("DepartmentType: "+DepartmentType); 
			System.out.println("StudentStrength: "+StudentStrength);
			System.out.println("BoysCount: "+BoysCount);
			System.out.println("GirlsCount: "+GirlsCount);
			
		}
	}


		public static void main(String[] args) {
			Student s=new Student();
			Department d=s.new Department();
			FirstYear f=d.new FirstYear();
			SecondYear S=d.new SecondYear();
		    ThirdYear T=d.new ThirdYear();
			FinalYear F=d.new FinalYear();
			d.DepartmentDisplay();
			f.displayFirst();
			S.displaySecond();
			T.displayThird();
			F.displayFinal();
			}
	}
