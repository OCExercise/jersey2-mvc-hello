# Jersey 2 MVC Hello, World Exercise

Nothing more, nothing less.

## Usage

1. Edit [`src/main/webapp/WEB-INF/web.xml`](src/main/webapp/WEB-INF/web.xml) and change the value of `context-param` `hello.name` to whatever you like.
    * Consider marking `web.xml` `--assume-unchanged`.
        ```bash
        $ git update-index --assume-unchanged src/main/webapp/WEB-INF/web.xml
        ```
1. Execute the following
    ```bash
    $ ./gradlew clean build appRunWar

    # or...

    $ ./gradlew clean build appRunWar -PhttpPort=<your preferred port>

    # Debugging 
    $ ./gradlew clean build appRunWarDebug

    # or...

    $ ./gradlew clean build appRunWar -PhttpPort=<your preferred application listening port> -PdebugPort=<your preferred debugging port>
    ```
1. Browse to [http://localhost:8080/hello](http://localhost:8080/hello), replacing `8080` with your preferred application listening port if you so configured. Don't forget to attach a debugger if you're running `appRunWarDebug`.
