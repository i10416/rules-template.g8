resolvers += Resolver.sonatypeRepo("releases")

addSbtPlugin("ch.epfl.scala" %% "sbt-scalafix" % "$scalafix_version$")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
