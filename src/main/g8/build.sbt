import Deps._

val scala212 = "2.13.8"
val scala213 = "2.13.8"

lazy val noPublishSettings = Seq(
  publish / skip := true,
  publishLocal / skip := true
)

inThisBuild(
  Seq(
    versionScheme := Some("early-semver"),
    organization := "$organization$",
    description := "$description$",
    licenses := List(
      "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
    ),
    homepage := Some(url("$homepage$")),
    developers := List(
      Developer(
        "$githubUserId$",
        "$developerName$",
        "$developerEmail$",
        url("$githubRepo$")
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("$githubRepo$"),
        "$githubSSH$"
      )
    ),
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
    scalaVersion := scala213,
    crossScalaVersions := Seq(scala212, scala213),
    semanticdbEnabled := true,
    semanticdbIncludeInJar := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalacOptions ++= List("-Yrangepos")
  )
)

lazy val input = project.settings(noPublishSettings)

lazy val output = project.settings(noPublishSettings)

lazy val rules = project.settings(noPublishSettings)
lazy val tests = project
  .settings(
    libraryDependencies += "ch.epfl.scala" %% "scalafix-testkit" % Deps.scalafixVersion % Test cross CrossVersion.full,
    scalafixTestkitOutputSourceDirectories :=
      (output / Compile / unmanagedSourceDirectories).value,
    scalafixTestkitInputSourceDirectories :=
      (input / Compile / unmanagedSourceDirectories).value,
    scalafixTestkitInputClasspath :=
      (input / Compile / fullClasspath).value
  )
  .settings(noPublishSettings)
  .dependsOn(rules)
  .enablePlugins(ScalafixTestkitPlugin)

lazy val pkg = project
  .in(file("."))
  .aggregate(
    rules,
    input,
    output,
    tests
  )
  .settings(noPublishSettings)
