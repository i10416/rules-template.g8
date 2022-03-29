## $name$
[![Release]($githubRepo$/actions/workflows/release.yaml/badge.svg)]($githubRepo$/actions/workflows/release.yaml)

$description$

| scala version | pre-release                                                                                                                                                                                                                          | release                                                                                                                                                 |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 2.13          | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$organization$/$name$_2.13.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$organization;format="packaged"$/$name$_2.13/) | [![Maven Central](https://img.shields.io/maven-central/v/$organization$/$name$_2.13.svg)](https://search.maven.org/artifact/$organization$/$name$_2.13) |



## Install

sbt
```scala
ThisBuild / scalafixDependencies  += "$organization$" %% "$name$" % "0.0.1"
```

Mill
```scala
def scalafixIvyDeps = Agg(ivy"$organization$::$name$:0.0.1")
```

## How to Use
| rule | description |
| ---- | ----------- |
| ???  | ???         |


## How to contribute?

- Give it a star⭐
- Drop the feedback to the author @$githubUserId$
- Send a PR with fixes of typos/bugs/etc🐛

## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
