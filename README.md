# Streaming-App

To run this code please use the syntax below.

`java -jar stream-reader.jar <path-to-dataset.csv> <top-k> <nlines>`

`top-k` - Number of frequent items to be calculated

`nlines` - Number of lines to be read from a file

Project Structure

```
README.md
├── build.sbt
├── project
│   ├── build.properties
│   ├── plugins.sbt
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   ├── scala
│   │   └── scala-2.11
│   │       ├── SpaceSaveAlgo.scala
│   │       └── StreamReader.scala
│   └── test
│       ├── java
│       ├── resources
│       │   └── test.csv
│       ├── scala
│       └── scala-2.11
│           └── AlgoTest.scala
└── target
    └── scala-2.11
        └── stream-reader.jar
```
