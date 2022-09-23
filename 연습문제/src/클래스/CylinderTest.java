package 클래스;

public class CylinderTest {
	public static void main(String[] args) {
		// 객체 생성
		Cylinder c = new Cylinder();

		// 속성 값 입력
		c.r = 4;
		c.h = 5;
		
		// 출력
		System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	}
}

class Cylinder {
	/* 필드와 메소드를 구현하시오. */
	int r; //반지름
	int h; //높이
	
	double getVolume() {
		return Math.PI*r*r*h; //﻿ πr2h﻿
	}
	double getArea() {
		return 2*Math.PI*r*r + 2*Math.PI*r*h; //﻿2πr2+2πrh﻿
	}
}
