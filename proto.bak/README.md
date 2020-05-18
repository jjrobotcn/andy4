### 如何使用
proto文件通过docker镜像[namely/protoc-all:latest](https://hub.docker.com/r/namely/protoc-all)生成

```bash
# 生成go, ruby, csharp, java, python, objc, gogo, php, node, cpp
./proto/protoc.sh -dir=$PWD/proto/messaging

# 指定生成语言
./proto/protoc.sh -dir=$PWD/proto/messaging -lan=go
```
