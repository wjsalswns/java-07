package chap_07;

public class _06_ClassMethod {
	public static void main(String[] args) {
		BlackBox bbox = new BlackBox();
		bbox.modelName = "까망이";
		bbox.resolution = "FHD";
		bbox.price = 10000;
		bbox.colcr = "BLACK";
		System.out.println(bbox.modelName);
		
		// 자동 신고 기능 개발 전
		// 클래스 필드는 플래스 이름.필드로 접근함
		// 클래스 필드는 클래스 파일에서 바꾸는 것이지 인스턴트 파일에서 바꾸는 것이 아님
		System.out.println(BlackBox.canQutoReport);
		
		bbox.autoReport();
		
		bbox.insertMemoryCard(512);
		
		// 1 : 일반 영상 / 2 : 이벤트 영상 / 0 : 모든 영상
		int filcount = bbox.getVideoFileCount(0);
		System.out.println(filcount);
		
		
		BlackBox.callServiceCenter();	
		
		
	}
}
