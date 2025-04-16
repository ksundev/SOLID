# SOLID 원칙 및 Spring 배경 학습 프로젝트

이 프로젝트는 객체지향 설계의 SOLID 원칙을 실제 예제로 이해하고, Spring 프레임워크가 등장하게 된 배경을 학습하기 위한 코드 모음입니다.

## 목차
- [SOLID 원칙](#solid-원칙)
  - [단일 책임 원칙 (SRP)](#단일-책임-원칙-srp)
  - [개방-폐쇄 원칙 (OCP)](#개방-폐쇄-원칙-ocp)
  - [리스코프 치환 원칙 (LSP)](#리스코프-치환-원칙-lsp)
  - [인터페이스 분리 원칙 (ISP)](#인터페이스-분리-원칙-isp)
  - [의존성 역전 원칙 (DIP)](#의존성-역전-원칙-dip)
- [Spring 등장 배경](#spring-등장-배경)
<br><br>

## SOLID 원칙

### 단일 책임 원칙 (SRP)
**Single Responsibility Principle**: 클래스는 단 하나의 책임만 가져야 한다.

#### 예제 설명
- **위반 사례** (`com.ksundev.srp.bad`): `UserService` 클래스가 사용자 정보 저장, 이메일 발송, 비밀번호 관리 등 여러 책임을 가지고 있음.
- **개선 사례** (`com.ksundev.srp.good`): 책임에 따라 `UserService`, `EmailService`, `SecurityService` 등으로 분리됨.

### 개방-폐쇄 원칙 (OCP)
**Open-Closed Principle**: 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.

#### 예제 설명
- **위반 사례** (`com.ksundev.ocp.bad`): `Calculator` 클래스가 도형이 추가될 때마다 새로운 메서드를 추가해야 함.
- **개선 사례** (`com.ksundev.ocp.good`): 추상 클래스 `Shape`를 도입하고 각 도형이 이를 구현하도록 함으로써, 새로운 도형이 추가되어도 `Calculator` 클래스를 수정할 필요가 없음.

### 리스코프 치환 원칙 (LSP)
**Liskov Substitution Principle**: 하위 타입은 항상 상위 타입을 대체할 수 있어야 한다.

#### 예제 설명
- **예제 1** (`com.ksundev.lsp.ex1`): `Person`과 `Student` 클래스 관계를 통해 기본적인 LSP 개념 설명.
- **위반 사례** (`com.ksundev.lsp.ex2.bad`): `Train`은 `Vehicle`을 상속받지만 `turnRight()`와 같은 동작을 수행할 수 없음(기차는 좌우 회전이 불가능).
- **개선 사례** (`com.ksundev.lsp.ex2.good`): `RoadVehicle`과 `RailVehicle`로 구분하여 각 이동 수단에 적합한 기능만 상속받음.

### 인터페이스 분리 원칙 (ISP)
**Interface Segregation Principle**: 클라이언트는 자신이 사용하지 않는 메서드에 의존하지 않아야 한다.

#### 예제 설명
- **구현 사례** (`com.ksundev.isp`): 차량의 기능을 `Movable`, `Turnable`, `EngineControl`, `TemperatureControl`, `Identifiable` 등 다양한 인터페이스로 분리하여, 필요한 기능만 구현할 수 있도록 함.

### 의존성 역전 원칙 (DIP)
**Dependency Inversion Principle**: 고수준 모듈은 저수준 모듈에 의존해서는 안 되며, 둘 다 추상화에 의존해야 한다.

#### 예제 설명
- **위반 사례** (`com.ksundev.dip.bad`): `Switch` 클래스가 구체적인 `Door`와 `Light` 클래스에 직접 의존함.
- **개선 사례** (`com.ksundev.dip.good`): `Switchable` 인터페이스를 도입하여 `Switch`가 추상화에 의존하도록 개선함.

<br><br>
## Spring 등장 배경

Spring 프레임워크는 객체지향 설계 원칙을 적용하여 기존 엔터프라이즈 애플리케이션의 문제점을 해결하기 위해 등장했습니다.

### whyspring 패키지 예제 설명

`com.ksundev.whyspring` 패키지는 DI(Dependency Injection)와 IoC(Inversion of Control) 컨테이너의 필요성을 보여주는 예제를 제공합니다:

- **인터페이스 계층** (`interfaces`): 각 컴포넌트가 구현해야 할 기능을 정의 (`EngineControl`, `Movable` 등)
- **컴포넌트 계층** (`component`): 실제 기능을 구현한 컴포넌트들 (`Engine`, `MovementSystem` 등)
- **구현 클래스** (`vehicle`): 여러 컴포넌트를 조합한 최종 구현체 (`Car`)

**의존성 주입 문제점**: 
- `Car` 클래스에서 `engine = new FuelEngine()` 처럼 구체 클래스에 직접 의존하고 있어 DIP를 위반함
- 만약 `ElectricEngine`으로 변경하려면 코드를 직접 수정해야 함
- Spring은 이러한 문제를 DI와 IoC 컨테이너를 통해 해결함

이 예제를 통해 Spring이 객체 생성과 의존성 관리를 담당하는 IoC 컨테이너의 필요성을 이해할 수 있습니다.
