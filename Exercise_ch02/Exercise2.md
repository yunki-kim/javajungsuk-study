# Chpater02 - Exercise

### 2-1
#### 다음 표의 빈 칸에 8개의 기본형을 알맞은 자리에 넣으시오.

||1 byte|2 byte|4 byte|8 byte|
|:----:|:-----:|:-----:|:-----:|:-----:|
|논리형|boolean||||
|문자형||char|||
|정수형|byte|short|**int**|long|
|실수형|||float|**double**|

---
### 2-2
#### 주민등록번호를 숫자로 지정하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형을 선택해야 할까? <br/>`regNo`라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.

```Java
long regNo = 0012313456789L;
```

---
### 2-3
#### 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.

```Java
int i = 100;
long l = 100L;
final float PI = 3.14f;
```

- 리터럴 : 100, 100L, 3.14f
- 변수 : `i`, `l`
- 상수 : `PI`
- 키워드 : int, long, final, float

---
### 2-4
#### 다음 중 기본형이 아닌 것은?

1. int
2. **Byte**
3. double
4. boolean

---
### 2-5
#### 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우 '오류' 라고 적으시오.

`System.out.println("1" + "2")` -> 12 <br/>
`System.out.println(true + "")` -> true <br/>
`System.out.println('A' + 'B')` -> 131 <br/>
`System.out.println('1' + 2)` -> 51 <br/>
`System.out.println('1' + '2')` -> 99 <br/>
`System.out.println('J' + "ava")` -> Java <br/>
`System.out.println(true + null)` -> 오류

---
### 2-6
#### 다음 중 키워드가 아닌 것은?

1. if
2. **True**
3. **Null**
4. **Class**
5. **System**

---
### 2-7
#### 다음 중 변수의 이름으로 사용할 수 있는 것은?

1. **$ystem**
2. channel#5
3. 7eleven
4. **If**
5. **자바**
6. new
7. **$MAX_NUM**
8. hello@com

---
### 2-8
#### 참조형 변수와 같은 크기의 기본형은?

1. **int**
2. long
3. short
4. **float**
5. double

---
### 2-9
#### 다음 중 형변환을 생략할 수 있는 것은?

```Java
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;
```

1. `b = (byte) i;`
2. `ch = (char) b;`
3. `short s = (short) ch;`
4. **`float f = (float) l;`**
5. **`i = (int) ch;`**

---
### 2-10
#### char타입의 변수에 저장될 수 있는 정수 값의 범위는?

0 ~ 65536

---
### 2-11
#### 다음 중 변수를 잘못 초기화 한 것은?

1. **`byte b = 256;`**
2. **`char c = '';`**
3. **`char answer = 'no';`**
4. **`float f = 3.14;`**
5. `double d = 1.4e3f;`

---
### 2-12
#### 다음 중 main메서드의 선언부로 알맞은 것은?

1. **`public static void main(String[] args)`**
2. **`public static void main(String args[])`**
3. **`public static void main(String[] arv)`**
4. `public void static main(String[] args)`
5. **`static public void main(String[] args)`**

---
### 2-13
#### 다음 중 타입과 기본값이 잘못 연결된 것은?

1. boolean - false
2. char - '₩u0000'
3. **float - 0.0**
4. int - 0
5. **long - 0**
6. **String - ""**

---
