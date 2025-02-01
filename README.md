# maven-in-5-minutes

Getting started with Apache Maven with [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

## Prerequisites

[OpenJDK](https://openjdk.org/) and [Maven](https://maven.apache.org/) installed. Open the project in Eclipse or another Java IDE of your choice for an optimal experience.

This project has been tested with OpenJDK 17 and Maven 3.6.

## Quickstart

Fork this repository, then clone your fork and make it your working directory.

Now execute the following Maven phases in order:

1. `clean` - clean build artifacts, if any
1. `test` - run unit tests
1. `package` - compile sources and generate JAR archive under `target/`

```bash
mvn clean test package
```

Run the app from the JAR archive:

```bash
java -cp target/maven-in-5-minutes-0.0.1.jar com.donaldsebleung.app.App
```

Sample output:

```text
Hello World!
```

Generate project documentation \(optional\):

```bash
mvn site
```

Site assets are generated under `target/site/`.

## License

[Apache 2.0](./LICENSE)
