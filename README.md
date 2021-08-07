# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

### 3단계 자동차 경주 
#### 기능 요구사항
- 초간단 자동차 경주 게임 구현
- 주어진 횟수 동안 n대의 자동차는 전진 or 멈춤 가능
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지 입력할 수 있다
- 전진 조건은 0-9 사이 random 값을 이용하고 random 값이 4이상 인 경우
- 자동차 상태를 화면에 출력. 출력 시점의 제한은 X

#### 프로그래밍 요구사항
- 모든 로직에 단위 테스트 구현 (UI 로직은 제외)
- 자바 코드 컨벤션 지키기
- else 예약어 및 Switch/Case 사용 X 
- Readme.md에 구현할 기능 목록 정리해 추가한 뒤 진행
- Commit 단위는 Readme.md에 정리한 기능 목록 단위로 추가 
- Commit Message Convertion 지키기 

#### TODO
- ~~InputView~~
  - 자동차 대수, 시도 횟수 입력 
  - 입력 받은 데이터 return 
- ~~Application~~
  - InputView에서 받은 데이터로 로직 실행
  - 로직의 결과 ResultView 전달
- ~~ResultView~~
  - Application에서 전달 받은 데이터를 요구사항대로 출력
- ~~Car~~
  - ~~전진 조건 구하기~~
    - Random 값 구하기 (0-9)
    - Random 값 제한 (4이상)
  - ~~전진, 멈춤 구현~~

---

### 2단계 문자열 계산기
#### 기능 요구사항
- 사용자가 `입력한 문자열`에 따라 사칙연산 수행
- 입력 문자열의 숫자와 사칙 연산 사이에 반드시 `빈 공백 문자열`이 있음
- 나눗셈의 결과는 `정수`로 한정
- `입력 값`에 따라 `계산 순서`가 결정됨
  - ex) 2 + 3 * 4 / 2 => 10

#### 프로그래밍 요구사항
- 적절한 메소드 분리

#### TODO
- ~~Calculator~~ 
  - 문자열 입력 후 문자열 분리
  - 계산 결과 받고 반환

- ~~Expression~~
  - 입력된 문자열 숫자, 연산자 구분해 operation 실행
  
- ~~Operation~~  
  - 문자열 > 사칙연산 변환
  - 사칙연산 (+-*/) 구현

---

### 1단계 학습 테스트
#### String 클래스에 대한 학습 테스트 
- TODO
  - ~~1) split test~~
  - ~~2) substring test~~
  - ~~3) exception test~~
    
#### Set Collection에 대한 학습 테스트
- TODO
    - ~~1) Set size test~~
    - ~~2) @ParameterizedTest~~
    - ~~3) @CsvSource~~