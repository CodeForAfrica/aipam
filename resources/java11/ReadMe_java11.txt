Lots of problems trying to get AIPam to work with Java11

Need to ass extra arguments for JavaFX eclipse/Maven bug and tio allow access to Skin classes

```
-Djava.library.path=C:/
--add-opens=javafx.controls/javafx.scene.control.skin=ALL-UNNAMED
--add-exports=javafx.controls/com.sun.javafx.scene.control.inputmap=ALL-UNNAMED
```

- tsne does not have a valied name for modules so has to be an external jar file.

- controlsfx range slider does now work with exception...

```
Caused by: java.lang.IllegalAccessError: class impl.org.controlsfx.version.VersionChecker (in module controlsfx) cannot access class com.sun.javafx.runtime.VersionInfo (in module javafx.base) because module javafx.base does not export com.sun.javafx.runtime to module controlsfx
	at controlsfx@9.0.0/impl.org.controlsfx.version.VersionChecker.<clinit>(VersionChecker.java:50)
	at controlsfx@9.0.0/org.controlsfx.control.ControlsFXControl.<init>(ControlsFXControl.java:35)
	at controlsfx@9.0.0/org.controlsfx.control.RangeSlider.<init>(RangeSlider.java:175)
```

- style class error caused by JMetro most likely in CSS

```
Caused by: java.lang.NoClassDefFoundError: com/sun/javafx/scene/control/skin/ButtonSkin
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1016)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1095)
	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:206)
	at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:761)
	at java.base/jdk.internal.loader.BuiltinClassLoader.findClassInModuleOrNull(BuiltinClassLoader.java:682)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:607)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:398)
	at javafx.controls/javafx.scene.control.Control.loadClass(Control.java:124)
	at javafx.controls/javafx.scene.control.Control.loadSkinClass(Control.java:720)
	at javafx.controls/javafx.scene.control.Control$5.invalidated(Control.java:680)
	at javafx.base/javafx.beans.property.StringPropertyBase.markInvalid(StringPropertyBase.java:110)
	at javafx.base/javafx.beans.property.StringPropertyBase.set(StringPropertyBase.java:145)
	at javafx.graphics/javafx.css.StyleableStringProperty.set(StyleableStringProperty.java:83)
	at javafx.controls/javafx.scene.control.Control$5.set(Control.java:672)
	at javafx.graphics/javafx.css.StyleableStringProperty.applyStyle(StyleableStringProperty.java:69)
	at javafx.graphics/javafx.css.StyleableStringProperty.applyStyle(StyleableStringProperty.java:45)
	at javafx.graphics/javafx.scene.CssStyleHelper.transitionToState(CssStyleHelper.java:787)
	at javafx.graphics/javafx.scene.Node.doProcessCSS(Node.java:9647)
	at javafx.graphics/javafx.scene.Node.access$900(Node.java:398)
	at javafx.graphics/javafx.scene.Node$1.doProcessCSS(Node.java:471)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSSImpl(NodeHelper.java:192)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.superProcessCSSImpl(ParentHelper.java:93)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.superProcessCSS(ParentHelper.java:63)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1366)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.controls/com.sun.javafx.scene.control.ControlHelper.superProcessCSSImpl(ControlHelper.java:63)
	at javafx.controls/com.sun.javafx.scene.control.ControlHelper.superProcessCSS(ControlHelper.java:55)
	at javafx.controls/javafx.scene.control.Control.doProcessCSS(Control.java:886)
	at javafx.controls/javafx.scene.control.Control.access$000(Control.java:83)
	at javafx.controls/javafx.scene.control.Control$1.doProcessCSS(Control.java:89)
	at javafx.controls/com.sun.javafx.scene.control.ControlHelper.processCSSImpl(ControlHelper.java:67)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1397)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1397)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1397)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1397)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Parent.doProcessCSS(Parent.java:1397)
	at javafx.graphics/javafx.scene.Parent.access$400(Parent.java:79)
	at javafx.graphics/javafx.scene.Parent$1.doProcessCSS(Parent.java:125)
	at javafx.graphics/com.sun.javafx.scene.ParentHelper.processCSSImpl(ParentHelper.java:98)
	at javafx.graphics/com.sun.javafx.scene.NodeHelper.processCSS(NodeHelper.java:145)
	at javafx.graphics/javafx.scene.Node.processCSS(Node.java:9529)
	at javafx.graphics/javafx.scene.Scene.doCSSPass(Scene.java:569)
	at javafx.graphics/javafx.scene.Scene.preferredSize(Scene.java:1745)
	at javafx.graphics/javafx.scene.Scene$2.preferredSize(Scene.java:393)
	at javafx.graphics/com.sun.javafx.scene.SceneHelper.preferredSize(SceneHelper.java:66)
	at javafx.graphics/javafx.stage.Window$12.invalidated(Window.java:1086)
	at javafx.base/javafx.beans.property.BooleanPropertyBase.markInvalid(BooleanPropertyBase.java:110)
	at javafx.base/javafx.beans.property.BooleanPropertyBase.set(BooleanPropertyBase.java:145)
	at javafx.graphics/javafx.stage.Window.setShowing(Window.java:1174)
	at javafx.graphics/javafx.stage.Window.show(Window.java:1189)
	at javafx.graphics/javafx.stage.Stage.show(Stage.java:273)
	at AiPAM/com.jamdev.maven.aipam.AIPamApp.start(AIPamApp.java:52)
	at javafx.graphics/com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$9(LauncherImpl.java:846)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runAndWait$12(PlatformImpl.java:455)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:428)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$11(PlatformImpl.java:427)
	at javafx.graphics/com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:96)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication.lambda$runLoop$3(WinApplication.java:174)
	... 1 more
Caused by: java.lang.ClassNotFoundException: com.sun.javafx.scene.control.skin.ButtonSkin
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:583)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	... 85 more
Exception running application com.jamdev.maven.aipam.AIPamApp
```
