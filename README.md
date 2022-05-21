# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 구현 기능 목록
### 숫자
- [x] 숫자가 정상적인 값인지 확인
- [x] 입력된 문자를 정수형으로 변경

### 연산자
- [x] 문자에 따라 연산자 Enum 객체 생성
- [x] 연산자 객체엔 (+,-,*,/) 존재
- [x] 연산자에 따라 사칙연산 계산

### 공식
- [x] 공식이 빈 문자열 인지 확인
- [x] 공식이 정상적인 패턴인지 확인


## 로또 구현 기능 목록
### 입력
- [X] 구매 금액 입력 받음
- [X] 지난 주 당첨 금액 입력 받음
- [X] 보너스 볼을 입력받음

### 출력
- [X] 각 로또 번호 출력
- [X] 로또 구매 갯수
- [X] 당첨 통계
- [X] 총 수익률

### 구매 금액
- [X] 구매 금액이 정상적인 값인지 확인

### 로또 번호 자동 생성
- [X] 구매 갯수에 따라 로또 생성
- [X] 로또 번호는 1 ~ 45 사이의 6개 숫자 생성

### 수익률
- [X] 총 수익률 계산 (당첨 총금액 / 구매 갯수)

## 로또
- [X] 갯수에 따라서 로또 생성

## 순위
- [X] 일치하는 번호 별로 상금과 순위를 결정
- [X] 5개 번호가 일치할 경우 보너스 번호가 같은지 비교 후 2,3등 결정
