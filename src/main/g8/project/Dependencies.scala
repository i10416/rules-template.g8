import sbt._
object Deps {
  val scalafixVersion = "$scalafix_version$"

  val collectionCompat = Seq(
    "org.scala-lang.modules" %% "scala-collection-compat" % "2.7.0"
  )

  val scalafix = Seq(
    "ch.epfl.scala" %% "scalafix-core" % scalafixVersion
  )
}
