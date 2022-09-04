# Chapter 04 Exercise -1

### 4-1
#### 다음의 문장들을 조건식으로 표현하라.

1. int형 변수 `x`가 10보다 크고 20보다 작을 때 true인 조건식
   - ```
     x > 10 && x < 20
     ```
2. char형 변수 `ch`가 공백이나 탭이 아닐 때 true인 조건식
   - ```
     ch != ' ' && ch != \t
     ```
3. char형 변수 `ch`가 ‘x' 또는 ’X'일 때 true인 조건식
   - ```
     ch = 'x' || ch = 'X'
     ```
4. char형 변수 `ch`가 숫자(‘0’~‘9’)일 때 true인 조건식
   - ```
     ch >= '0' && ch <= '9'
     ```
5. char형 변수 `ch`가 영문자(대문자 또는 소문자)일 때 true인 조건식
   - ```
     (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
     ```
6. int형 변수 `year`가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
   나눠떨어지지 않을 때 true인 조건식
   - ```
     (year % 400 == 0 || year % 4 == 0) && year % 100 != 0
     ```
7. boolean형 변수 `powerOn`가 false일 때 true인 조건식
   - ```
     powerOn == false
     ```
8. 문자열 참조변수 `str`이 “yes”일 때 true인 조건식
   - ```
     str.equlas("yes")
     ```
