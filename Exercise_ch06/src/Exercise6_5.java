/*
[연습문제 6-5]
다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
 */
class Student3 {

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", "
                + kor + ", " + eng + ", " + math + ", "
                + getTotal() + ", " + getAverage();
    }
}

public class Exercise6_5 {
    public static void main(String[] args) {

        Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}
