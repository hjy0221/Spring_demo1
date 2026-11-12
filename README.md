# 상품 서비스 예제 · Product Service Demo

[日本語](https://github.com/hjy0221/Spring_demo1#%E6%97%A5%E6%9C%AC%E8%AA%9E) · [English](https://github.com/hjy0221/Spring_demo1#english) · [한국어](https://github.com/hjy0221/Spring_demo1#%ED%95%9C%EA%B5%AD%EC%96%B4)

## 日本語

[日本語](https://github.com/hjy0221/Spring_demo1#%E6%97%A5%E6%9C%AC%E8%AA%9E) · [English](https://github.com/hjy0221/Spring_demo1#english) · [한국어](https://github.com/hjy0221/Spring_demo1#%ED%95%9C%EA%B5%AD%EC%96%B4)

Spring Bootで作った簡単な商品登録・照会APIの例です。静的HTML画面からブラウザで機能を確認できます。

### 構造

|階層ファイル|役割|
| --- | --- | --- |
|ドメイン| `Product.java` |商品ドメインモデル|
|リポジトリ| `ProductRepository.java` |メモリベースの商品ストア
|サービス| `ProductService.java` |ビジネスロジック
| Controller | `ProductController.java` | HTTP API |
| View | `index.html` |商品登録・照会UI |

### 実装機能

- `POST /products`：商品登録
- `GET /products/{id}`: 商品詳細照会

### を実行する

```bash
cd demo
./gradlew bootRun
```

## English

[日本語](https://github.com/hjy0221/Spring_demo1#%E6%97%A5%E6%9C%AC%E8%AA%9E) · [English](https://github.com/hjy0221/Spring_demo1#english) · [한국어](https://github.com/hjy0221/Spring_demo1#%ED%95%9C%EA%B5%AD%EC%96%B4)

This is a simple product registration/inquiry API example created with Spring Boot. You can check the functionality in your browser on a static HTML screen.

### Structure

| tier | file | Role |
| --- | --- | --- |
| Domain | `Product.java` | Product domain model |
| Repository | `ProductRepository.java` | Memory-based product storage |
| Service | `ProductService.java` | business logic |
| Controller | `ProductController.java` | HTTP API |
| View | `index.html` | Product registration/inquiry UI |

### Implementation features

- `POST /products`: Product registration
- `GET /products/{id}`: Product details inquiry

### Run

```bash
cd demo
./gradlew bootRun
```

## 한국어

[日本語](https://github.com/hjy0221/Spring_demo1#%E6%97%A5%E6%9C%AC%E8%AA%9E) · [English](https://github.com/hjy0221/Spring_demo1#english) · [한국어](https://github.com/hjy0221/Spring_demo1#%ED%95%9C%EA%B5%AD%EC%96%B4)

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
