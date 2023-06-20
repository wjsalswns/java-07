package chap_07;

public class _03_ClassVariables {
	public static void main(String[] args) {
		// 특정 범위를 초과하는 충돌 감지 시 자동신고하는 기능 개발 여부 - false
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
//		b1.canAutoReport = false;
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
//		b2.canAutoReport = false;
		
		// 특정 범위를 초과하는 충돌 감지 시 자동신고하는 기능 개발 여부
		System.out.println(" == 개발 전 ==");
		System.out.println(b1.modelName + ", 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + ", 자동 신고 기능 : " + b2.canAutoReport);
		
		// 위와 같은 방식은 인스턴스를 만들 때마다 canAutoReport 값에 false 값을 계속해서 넣어줘야함
		// 다른 값들은 만들기 전에는 모르는 값이기 때문에 상관 없지만 canAutoReport 값은 개발 되기 전까지는 false 값이기 때문에 상관 있음
		// 또한 canAutoReport 값이 바뀌었다면 다른 인스턴스들에게 값 할당을 해주어야함 -> 매우 비효율적임
		
		// 기능 개발 완료 - canAutoReport = true
		System.out.println(" == 개발 후 ==");
//		b1.canAutoReport = true;
//		b2.canAutoReport = true;
		
		// 클래스 변수에 접근 하는 법
		// 클래스명.변수명 = 값 할당; (클래스 변수는 모든 인스턴스에 영향을 미치기 때문에 인스턴스 변수명을 사용하지 않음)
		BlackBox.canAutoReport = true;
		
		System.out.println(b1.modelName + ", 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + ", 자동 신고 기능 : " + b2.canAutoReport);
	}
}
