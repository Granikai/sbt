ThisBuild / scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
	"com.novocode" % "junit-interface" % "0.5" % Test,
	"junit" % "junit" % "4.13.1" % Test,
  "commons-io" % "commons-io" % "2.5" % Runtime,
)

libraryDependencies += scalaVersion("org.scala-lang" % "scala-compiler" % _ ).value
