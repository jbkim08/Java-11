package game.objects;

public class GameObject {

	private int id; //가위 바위 보를 구분
	private String name;
	//가위 바위 보 비교표 
	private int[][] comparison = {
			//				   가위		바위		보
			/* 가위 */ 		{	 0,		-1,		 1		},
			/* 바위 */		{	 1,		 0,		-1		},
			/* 보 */ 		{	-1,		 1,		 0		},
	};
	
	//누가 이겼는지 비교
	public int compareTo(GameObject ob) {
		return comparison[id][ob.id];
	}
	
	//id에 접근을 같은 패키지및 상속 클래스에서만 가능
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}

}
