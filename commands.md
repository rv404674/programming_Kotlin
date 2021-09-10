# COMMANDS

## Kotlin Installation

```bash
kotlinc-jvm -version
info: kotlinc-jvm 1.5.10 (JRE 15.0.1+9-18)
```

## Kotlin Compilation

```bash
kotlinc-jvm hello.kt -d hello.jar
java -jar hello.jar
```

In case you have more classes and stuff
```bash
kotlinc-jvm Hello.kt -d Hello.jar
java -classpath Hello.jar:$KOTLIN_PATH/lib/kotlin-stdlib.jar HelloKt
```

else you will get "java.lang.NoClassDefFoundError"

### Kotlin Scripts
```bash
kotlinc-jvm -script listktsfiles.kts
./listktsfiles.kts
```

