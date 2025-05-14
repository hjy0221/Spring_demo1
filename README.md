# Spring_demo1

# 🛍️ 상품 서비스 예제 (Spring Boot)

Spring Boot 기반으로 만든 간단한 상품 등록 및 조회 API 예제입니다.  
프론트엔드는 정적 HTML로 구성되어 있어 브라우저에서 바로 테스트 가능합니다.

---

## 📦 프로젝트 구성

| 계층 | 파일명 | 설명 |
|------|--------|------|
| Domain | `Product.java` | 상품 도메인 클래스 |
| Repository | `ProductRepository.java` | 상품 저장소 (메모리 기반) |
| Service | `ProductService.java` | 비즈니스 로직 처리 |
| Controller | `ProductController.java` | 상품 API 제공 |
| View | `index.html` | 정적 HTML UI (상품 등록/조회) |
| Application | `DemoApplication.java` | 스프링 부트 메인 실행 파일 |

---

## ✅ 구현 기능

- [x] 상품 등록 (POST `/products`)
- [x] 상품 상세 조회 (GET `/products/{id}`)

> ❗ *주문자 인증, 수정/삭제/목록/주문 등은 향후 확장 예정입니다.*

---


