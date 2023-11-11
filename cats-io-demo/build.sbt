ThisBuild / scalaVersion := "2.13.17"

name := "cats-io-demo"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.12.0",
  "org.typelevel" %% "cats-effect" % "3.5.4"
)
