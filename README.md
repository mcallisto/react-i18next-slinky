# react-i18next-slinky

[react-i18next](https://github.com/i18next/react-i18next) bindings for [slinky](https://slinky.dev/) (powered by [ScalablyTyped](https://scalablytyped.org))

It is distributed for Scala 2.13 and Scala.js 1

```
resolvers += Resolver.bintrayRepo("mcallisto", "libs")
libraryDependencies ++= Seq(
    "default" %%% "react-i18next-slinky" % "0.1.4" 
) 
```

## Minimization

See the following compilation output:

```
[warn] Wrote i18next-browser-languagedetector (6 files)
[warn] Wrote i18next (30 files)
[warn] Wrote react-i18next (37 files)
[warn] Wrote minimized prop-types (0 files)
[warn] Wrote minimized react-dom (0 files)
[warn] Wrote minimized react (44 files)
[warn] Wrote minimized std (11 files)
[warn] Wrote minimized csstype (487 files)
```