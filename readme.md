管理者権限による制限で、pathを通すことができないので、cmdを立ち上げるたびに以下のコマンドでパスを通す
```bash
set PATH="C:\Program Files\Java\jdk1.8.0_92\bin"
set classpath=.;
echo %PATH%
echo %classpath%
```
