# 상품 서비스 예제 · Product Service Demo

[日本語](https://github.com/hjy0221/Spring_demo1#%E6%97%A5%E6%9C%AC%E8%AA%9E) · [English](https://github.com/hjy0221/Spring_demo1#english) · [한국어](https://github.com/hjy0221/Spring_demo1#%ED%95%9C%EA%B5%AD%EC%96%B4)

## 日本語

Spring Boot による商品の登録・取得 API のサンプルです。静的 HTML 画面からブラウザーで動作を確認できます。

### 構成

| 層 | ファイル | 役割 |
| --- | --- | --- |
| Domain | `Product.java` | 商品モデル |
| Repository | `ProductRepository.java` | メモリ内の商品保存 |
| Service | `ProductService.java` | ビジネスロジック |
| Controller | `ProductController.java` | HTTP API |
| View | `index.html` | 商品登録・取得画面 |

### 機能

- `POST /products`: 商品を登録
- `GET /products/{id}`: ID で商品を取得

### 実行方法

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
