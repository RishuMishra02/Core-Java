package com.rahul.interfacetest;

 interface WithoutImplement_Any_Class {
 void show() ;

}
 class Rahul{
		static WithoutImplement_Any_Class inter = new WithoutImplement_Any_Class() {
			public void show() {
				System.out.println("hi");
			}
		};
		public static void main(String[] args) {
			inter.show();
		}
		
}