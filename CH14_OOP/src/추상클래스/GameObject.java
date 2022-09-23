package 추상클래스;
//추상 클래스는 abstract를 붙이고 완성되지 않은 클래스이다.
public abstract class GameObject {
	//추상 메서드 (함수 몸체즉 내용이 없음)
	public abstract void describe();
}

class Player extends GameObject {
	public void describe() {
		System.out.println("플레이어!");	
	}	
}

class Monster extends GameObject {
	public void describe() {
		System.out.println("몬스터!");	
	}	
}