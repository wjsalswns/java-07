package chap_07;

public class _04_Method {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
//		클래스 메소드 호출
		b1.autoReport();
		// 자동신고 기능 업데이트 완료
		BlackBox.canAutoReport = true;
		b1.autoReport();
		
		// 메모리 카드 삽입
		b1.insertMemoryCard(512);
		
		// 일반 영상 : 1(type)
		// 이벤트 영상(충돌 감지) : 2
		
		int fileCount = b1.getVideoFileCoun(1);	// 일반 영상
		System.out.println("일반 영상 파일 수 :" + fileCount + "개");
		
		fileCount = b1.getVideoFileCoun(2);	// 이벤트 영상
		System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
		
		fileCount = b1.getVideoFileCoun(0);	// 총 영상
		System.out.println("총 영상 파일 수 : " + fileCount + "개");
		
	}
}
