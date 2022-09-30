package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.simple.parser.ParseException;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JTextField address; //어드레스 입력창
	public JLabel resAddress, resX, resY, jibunAddress, imageLabel; //라벨글자들
	
	public MainFrame(String title) {
		super(title); //윈도우창 제목
		//위쪽에 라벨,주소입력,클릭버튼
		JPanel pan = new JPanel();
		JLabel addressLbl = new JLabel("주소입력");
		address = new JTextField(50); //입력창 객체 생성
		JButton btn = new JButton("클릭");
		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		// 버튼을 눌렀을때 현클래스 MainFrame객체를 매개변수로 전달
		btn.addActionListener(e -> {
				try {
					new NaverMap(this);
				} catch (IOException | ParseException e1) {
					e1.printStackTrace();
				}		
		});		
		// 지도 입력 라벨
		imageLabel = new JLabel("지도보기");
		// 아래의 주소정보 표시 패널
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(4,1));
		resAddress = new JLabel("도로명");
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
		pan1.add(resAddress);
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);
		
		// 레이아웃 설정
		setLayout(new BorderLayout());
		add(pan, BorderLayout.NORTH);
		add(imageLabel, BorderLayout.CENTER);
		add(pan1, BorderLayout.SOUTH);
		
		setSize(730, 660); //사진크기보다 조금 크게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
