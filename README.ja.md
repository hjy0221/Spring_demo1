# 상품 서비스 예제 · Product Service Demo

[日本語](README.ja.md) · [English](README.md) · [한국어](README.ko.md)

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
