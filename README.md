# kotlin-sample-app

## 環境構築
Intellij IDEAで起動する場合は`FILE`→`Project Structure`→`Project SDK`で`Kotlin SDK 1.4.21`を選択して下さい。

```bash
$ git clone git@github.com:Katsukiniwa/kotlin-sample-app.git
$ cd kotlin-sample-app
$ docker compose up
$ ./gradlew flywayMigrate
$ ./gradlew bootRun
```

Kotlin, Spring Bootの素振りリポジトリです。
[j5ik2o/warikan-domain-java](https://github.com/j5ik2o/warikan-domain-java)
をKotlinで書き換えたりしています。