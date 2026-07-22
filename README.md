# 상품 서비스 예제 · Product Service Demo

[한국어](#한국어) · [English](#english)

## 한국어

Spring Boot로 만든 간단한 상품 등록·조회 API 예제입니다. 정적 HTML 화면에서 브라우저로 기능을 확인할 수 있습니다.

### 구조

| 계층 | 파일 | 역할 |
| --- | --- | --- |
| Domain | `Product.java` | 상품 도메인 모델 |
| Repository | `ProductRepository.java` | 메모리 기반 상품 저장소 |
| Service | `ProductService.java` | 비즈니스 로직 |
| Controller | `ProductController.java` | HTTP API |
| View | `index.html` | 상품 등록·조회 UI |

### 구현 기능

- `POST /products`: 상품 등록
- `GET /products/{id}`: 상품 상세 조회

### 실행하기

```bash
cd demo
./gradlew bootRun
```

## English

A small Spring Boot example for creating and retrieving products. A static HTML page is included so the API flow can be tested in a browser.

### Architecture

| Layer | File | Responsibility |
| --- | --- | --- |
| Domain | `Product.java` | Product domain model |
| Repository | `ProductRepository.java` | In-memory product storage |
| Service | `ProductService.java` | Business logic |
| Controller | `ProductController.java` | HTTP API |
| View | `index.html` | Product creation and lookup UI |

### Features

- `POST /products`: create a product
- `GET /products/{id}`: retrieve a product by ID

### Run locally

```bash
cd demo
./gradlew bootRun
```
