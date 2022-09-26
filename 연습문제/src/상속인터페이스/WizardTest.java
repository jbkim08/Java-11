package 상속인터페이스;

public class WizardTest {
	  public static void main(String[] args) {
	    // 객체 생성
	    GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);
	    // 상태 출력
	    System.out.println(gandalf.toString());
	    // 에너지볼트
	    gandalf.energeVolt();
	  }
	}

	class Novice {
	  // 필드
	  protected String name;
	  protected int hp;

	  // 생성자
	  public Novice(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  // toString
	  public String toString() {
	    return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
	  }
	}

	class Wizard extends Novice {
	  // 필드
	  protected int mp;

	  // 생성자
	  public Wizard(String name, int hp, int mp) {
	    super(name, hp);
	    this.mp = mp;
	  }

	  // 에너지볼트
	  public void energeVolt() {
	    System.out.printf("%s의 에너지볼트!\n", this.name);
	  }
	}
	class GreatWizard extends Wizard {
	  /* 1. 보호막 속성을 필드에 추가하시오. */
	  protected int shield;	
	  /* 2. 생성자를 완성하시오. */
	  public GreatWizard(String name, int hp, int mp, int shield) {
		  super(name, hp, mp);
		  this.shield = shield;
	  }

	  /* 3. toString() 메소드를 오버라이딩 하시오. */
	  public String toString() {
		    return String.format("[대마법사] %s(HP: %d, MP: %d, SHIELD: %d)", 
		    		this.name, this.hp, this.mp, this.shield);
	  }	  
	  /* 4. 에너지볼트 마법을 오버라이딩 하시오. */
	  public void energeVolt() {
		    System.out.printf("%s의 에너지볼트!(대마법사 버프로 데미지 +30 추가)\n", this.name);
	  }
	}
