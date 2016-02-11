# Teddy4J

Tools to invoke the [Teddy templating engine](https://github.com/kethinov/teddy) 
from within Java.

This project depends on my 
[Dependency Bundles](https://github.com/thomasgalvin/DependencyBundles) library 
to compile. Clone that repo and build it before building this one.

The project is built with [Apache Maven](https://maven.apache.org/), 
so you'll need to [download the latest release](https://maven.apache.org/download.cgi)
and [install](https://maven.apache.org/install.html) it to build.

Right now, there are two unit tests that show basic invocation of Java's Js 
runtime environment. These live in `.../src/test/teddy/` and execute when
you run `mvn clean install`.

SimpleScriptTest.java shows how to load the Script Engine Manager, then the 
JavaScript engine, and finally invoke a simple in-memory script.

FileScriptTest.java loads the Engine Manager and Javascript engine, and then
loads a JavaScript source file from the filesystem and executes it.

I haven't done much testing, but apparently no browser-specific functionality is
available. `console.log()` and `alert()` are both unavailable, for example.

I believe the engine is limited to running a single file, so we'd need to package
Teddy up as a single script to run it. I'm still investigating this.