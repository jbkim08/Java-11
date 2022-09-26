package 상속인터페이스;

public class ElvesTest {
	public static void main(String[] args) {
		// 객체 생성
		Elf elf = new Elf("티란데", 100);
		HighElf high = new HighElf("말퓨리온", 160, 100);
		ElfLord lord = new ElfLord("마이에브", 230, 140, 100);
		// 객체 배열 생성
		Elf[] elves = { elf, high, lord };
		// 모든 객체 정보 출력
		for (int i = 0; i < elves.length; i++) {
			System.out.println(elves[i].toString());
		}
	}
}

class Elf {
	protected String name;
	protected int hp;

	public Elf(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return String.format("[엘프] Name: %s, HP: %d", name, hp);
	}
}

class HighElf extends Elf {
	protected int mp;

	public HighElf(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	public String toString() {
		return String.format("[하이엘프] Name: %s, HP: %d, MP: %d", name, hp, mp);
	}
}

class ElfLord extends HighElf {
	protected int shield;

	public ElfLord(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	public String toString() {
		return String.format("[엘프로드] Name: %s, HP: %d, MP: %d, SH: %d", name, hp, mp, shield);
	}
}
