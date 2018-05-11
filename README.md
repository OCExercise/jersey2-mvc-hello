# Jersey 2 MVC Hello, World Exercise

Nothing more, nothing less.

## Usage

```
$ ./gradlew clean build appRunWar

# or...

$ ./gradlew clean build appRunWar -PhttpPort=<your preferred port>

# Debugging 
$ ./gradlew clean build appRunWarDebug

# or...

$ ./gradlew clean build appRunWar -PhttpPort=<your preferred application listening port> -PdebugPort=<your preferred debugging port>
```

Then browse to [http://localhost:8080/hello](http://localhost:8080/hello), replacing `8080` with your preferred application listening port if you so configured. Don't forget to attach a debugger if you're running `appRunWarDebug`.
