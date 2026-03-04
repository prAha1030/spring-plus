# SPRING PLUS

## 📝 개발 개선 이력

> 기능 구현 이후 발생한 문제들을 단계적으로 식별하고, 안정성·성능·보안을 순차적으로 개선했습니다.

---

### 📌 목차
- [Step 1. 트랜잭션 오류 수정](#step-1-트랜잭션-오류-수정)
- [Step 2. 닉네임 기능 추가](#step-2-닉네임-기능-추가)
- [Step 3. 할 일 조회 필터 추가](#step-3-할-일-조회-필터-추가)
- [Step 4. 테스트 코드 수정](#step-4-테스트-코드-수정)
- [Step 5. AOP 어드바이스 수정](#step-5-aop-어드바이스-수정)
- [Step 6. 영속성 전이 수정](#step-6-영속성-전이-수정)
- [Step 7. N+1 문제 해결 (fetch join)](#step-7-n1-문제-해결-fetch-join)
- [Step 8. N+1 문제 해결 (QueryDSL)](#step-8-n1-문제-해결-querydsl)
- [Step 9. Spring Security 도입](#step-9-spring-security-도입)

---

### 🔧 1단계 — 버그 수정

#### Step 1. 트랜잭션 오류 수정
`saveTodo` 트랜잭션 오류 수정 — `readOnly` 트랜잭션을 쓰기 가능 트랜잭션으로 변경

#### Step 4. 테스트 코드 수정
단건 조회 성공 테스트의 `UserResponse` 누락 필드 수정

---

### ⚙️ 2단계 — 기능 개선

#### Step 2. 닉네임 기능 추가
`User`에 `nickname` 추가 — 회원가입·JWT 토큰·`AuthUser` 전반에 nickname 반영, 유저 조회를 토큰 기반으로 전환

#### Step 3. 할 일 조회 필터 추가
할 일 페이지 조회에 날씨 및 수정일 기간 필터 조건 추가

#### Step 5. AOP 어드바이스 수정
`logAfterChangeUserRole`이 `changeUserRole` 실행 **전** 동작하도록 수정

#### Step 6. 영속성 전이 수정
할 일 생성 시 생성자가 담당자로 자동 등록되도록 영속성 전이 설정 수정

---

### 🚀 3단계 — 성능 최적화

#### Step 7. N+1 문제 해결 (fetch join)
댓글 전체 조회 N+1 문제 해결 — `findByTodoIdWithUser` fetch join 적용

#### Step 8. N+1 문제 해결 (QueryDSL)
`findByIdWithUser` QueryDSL 전환 및 N+1 문제 사전 방지

---

### 🔒 4단계 — 보안 강화

#### Step 9. Spring Security 도입
JWT 토큰 기반 인증을 유지하며 인증/인가 처리를 Security 필터 체인으로 전환