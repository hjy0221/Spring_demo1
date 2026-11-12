# 상품 서비스 예제 · Product Service Demo

[日本語](README.ja.md) · [English](README.md) · [한국어](README.ko.md)

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
