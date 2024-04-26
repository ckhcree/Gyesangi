# Kotlin문법 기초 과제 - 계산기




  > **Goal : 나만의 계산기 만들기**
  >
  > - 지금까지 배운 Kotlin 문법을 응용해서 나만의 계산기를 만들어봅니다.

1. Lv.1
    - 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들기
    - 생성한 클래스를 이용하여 연산을 진행하고 출력하기

2. Lv.2
    - Lv1에서 만든 Calculator 클래스에 “나머지 연산”이 가능하도록 코드를 추가하고, 연산 진행 후 출력
    - 생성한 클래스를 이용하여 연산을 진행하고 출력하기

```java
Lv.2까지 구현한 내용
class 생성과 사칙연산 함수 생성
```

## 코드 상세설명

num1, num2의 변수 타입은 정수로 설정
```
class Calculator {
   var num1: Int = 0
   var num2: Int = 0}
```
연산자의 변수 타입은 문자열로 설정
```
val operator: String = ""
```
class 내 5개의 함수 설정
```
 fun Sum(): Int {
        val plus = num1 + num2
        return plus
    }
    
    fun Sub(): Int {
        val minus = num1 - num2
        return minus
    }

    fun Multi(): Int {
        val star = num1 * num2
        return star
    }

    fun Div(): Int {
        val div = num1 / num2
        return div
    }

    fun Rem(): Int {
        val rem = num1 % num2
        return rem
    }
```
메인 펑션 내에서 if else를 대신하여 when으로 조건 설정
```
 when (operator) {
        "+" -> {
            println(result.Sum())
        }

        "-" -> {
            println(result.Sub())
        }

        "*" -> {
            println(result.Multi())
        }

        "/" -> {
            println(result.Div())
        }

        "%" -> {
            println(result.Rem())
        }
    }
```