/*
[연습문제 6-4]
문제 6-3에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
1.  메서드명 : getTotal
    기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
    반환타입 : int
    매개변수 : 없음

2.  메서드명 : getAverage
    기능 : 총점(국어점수 + 영어점수 + 수학점수)을 과목수로 나눈 평균을 구한다.
           소수점 둘째자리에서 반올림할 것.
    반환타입 : float
    매개변수 : 없음
 */
class Student2 {

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}

public class Exercise6_4 {
    public static void main(String[] args) {

        Student2 s = new Student2();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}
