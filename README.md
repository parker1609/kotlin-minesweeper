# kotlin-minesweeper

## 🚀 1단계 - 지뢰 찾기(그리기)

### 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.

- 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 지뢰는 눈에 잘 띄는 것으로 표기한다. 
- 지뢰는 가급적 랜덤에 가깝게 배치한다.

### 프로그래밍 요구 사항
객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.

객체지향 생활 체조 원칙

1. 한 메서드에 오직 한 단계의 들여쓰기만 한다. 
2. else 예약어를 쓰지 않는다. 
3. 모든 원시 값과 문자열을 포장한다. 
4. 한 줄에 점을 하나만 찍는다. 
5. 줄여 쓰지 않는다(축약 금지). 
6. 모든 엔티티를 작게 유지한다. 
7. 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다. 
8. 일급 컬렉션을 쓴다. 
9. getter/setter/프로퍼티를 쓰지 않는다.

### TODO
- [x] 지뢰찾기 게임판의 높이를 입력받는다.
- [x] 지뢰찾기 게임판의 너비를 입력받는다.
- [x] 지뢰의 개수를 입력받는다.
- [x] 지뢰찾기 게임판은 높이, 너비, 지뢰의 개수, 그리고 생성규칙을 입력받아 생성한다.
  - 생성시, 지뢰를 랜덤으로 생성하는 규칙을 함께 정의한다.
  - 높이/너비/지뢰 개수는 따로 클래스로 분리한다.
- [x] 지뢰찾기 게임판을 그린다.
  - 지뢰는 '*'로 표시한다.
  - 지뢰가 아닌 부분은 'C'로 표시한다.

--- 피드백 반영
- [x] 게임판의 자료구조를 좌표를 갖는 Map 으로 변경
  - x, y 좌표는 0부터 시작
  - x는 가로, y는 세로