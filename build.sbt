/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterGenSourcePlugin)

scalaVersion := "2.13.2"
name := "react-i18next-slinky"
version := "0.1.1"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "@types/react" -> "16.9.34",
  "@types/react-dom" -> "16.9.6",
  "i18next" -> "19.5.2",
  "react-i18next" -> "11.7.0"
)

Test / npmDependencies ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1",
)

libraryDependencies ++= Seq(
  "org.scalatest" %%% "scalatest" % "3.2.0" % Test
)

/* disabled because it somehow triggers many warnings */
scalaJSLinkerConfig ~= (_.withSourceMap(false))

// because npm is slow
useYarn := true

stExperimentalEnableImplicitOps := true

// say we want custom code for slinky
stFlavour := Flavour.SlinkyNative

// focus only on these libraries
stMinimize := Selection.AllExcept("i18next", "react-i18next")

// shade into another package
stOutputPackage := "vision.id.i18next.facade"

publishMavenStyle := true
homepage := Some(new URL("https://github.com/mcallisto/react-i18next-slinky"))
startYear := Some(2020)
pomExtra := (
  <scm>
    <connection>scm:git:github.com:/mcallisto/react-i18next-slinky</connection>
    <developerConnection>scm:git:git@github.com:mcallisto/react-i18next-slinky.git</developerConnection>
    <url>github.com:mcallisto/react-i18next-slinky.git</url>
  </scm>
    <developers>
      <developer>
        <id>mcallisto</id>
        <name>Mario Càllisto</name>
      </developer>
    </developers>
  )
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "libs"
