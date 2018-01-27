# Design-Pattern

icing幻的设计模式学习笔记

## 参考

[设计模式Java版](https://quanke.gitbooks.io/design-pattern-java/)

## 博客

[设计模式学习笔记](http://www.icinghuan.top/?p=351)

## 内功与招式

>关于金庸小说中到底是招式重要还是内功重要的争论从未停止，我们在这里并不分析张无忌的九阳神功和令狐冲的独孤九剑到底哪个更厉害，但我想每个武林人士梦寐以求的应该是既有淋漓的招式又有深厚的内功。看到这里大家可能会产生疑问了？搞什么，讨论什么招式与内功，我只是个软件开发人员。别急，正因为你是软件开发人员我才跟你谈这个，因为我们的软件开发技术也包括一些招式和内功：Java、C#、C++等编程语言，Eclipse、Visual Studio等开发工具，JSP、ASP.net等开发技术，Struts、Hibernate、JBPM等框架技术，所有这些我们都可以认为是招式；而数据结构、算法、设计模式、重构、软件工程等则为内功。招式可以很快学会，但是内功的修炼需要更长的时间。我想每一位软件开发人员也都希望成为一名兼具淋漓招式和深厚内功的“上乘”软件工程师，而对设计模式的学习与领悟将会让你“内功”大增，再结合你日益纯熟的“招式”，你的软件开发“功力”一定会达到一个新的境界。既然这样，还等什么，赶快行动吧。下面就让我们正式踏上神奇而又美妙的设计模式之旅。

## 面向对象设计原则

|设计原则名称|定义|使用频率|
|---|---|---|
|单一职责原则 (Single Responsibility Principle, SRP)|一个类只负责一个功能领域中的相应职责|★★★★☆|
|开闭原则 (Open-Closed Principle, OCP)|软件实体应对扩展开放，而对修改关闭|★★★★★|
|里氏代换原则 (Liskov Substitution Principle, LSP)|所有引用基类对象的地方能够透明地使用其子类的对象|★★★★★|
|依赖倒转原则 (Dependence Inversion Principle, DIP|抽象不应该依赖于细节，细节应该依赖于抽象|★★★★★|
|接口隔离原则 (Interface Segregation Principle, ISP)|使用多个专门的接口，而不使用单一的总接口|★★☆☆☆|
|合成复用原则 (Composite Reuse Principle, CRP)|尽量使用对象组合，而不是继承来达到复用的目的|★★★★☆|
|迪米特法则 (Law of Demeter, LoD)|一个软件实体应当尽可能少地与其他实体发生相互作用|★★★☆☆|

## 简单工厂模式 + GoF 23种设计模式

|类型|模式名称|学习难度|使用频率|
|---|---|---|---|
|创建型模式 Creational   Pattern|单例模式 Singleton Pattern|★☆☆☆☆|★★★★☆|
|创建型模式 Creational Pattern|简单工厂模式 Simple   Factory Pattern|★★☆☆☆|★★★☆☆|
|创建型模式 Creational Pattern|工厂方法模式 Factory Method Pattern|★★☆☆☆|★★★★★|
|创建型模式 Creational Pattern|抽象工厂模式 Abstract  Factory   Pattern|★★★★☆|★★★★★|
|创建型模式 Creational Pattern|原型模式 Prototype Pattern|★★★☆☆|★★★☆☆|
|创建型模式 Creational Pattern|建造者模式 Builder Pattern|★★★★☆|★★☆☆☆|
|结构型模式 Structural Pattern|适配器模式 Adapter Pattern|★★☆☆☆|★★★★☆|
|结构型模式 Structural Pattern|桥接模式 Bridge  Pattern|★★★☆☆|★★★☆☆|
|结构型模式 Structural Pattern|组合模式 Composite  Pattern|★★★☆☆|★★★★☆|
|结构型模式 Structural Pattern|装饰模式 Decorator  Pattern|★★★☆☆|★★★☆☆|
|结构型模式 Structural Pattern|外观模式 Fa?ade  Pattern|★☆☆☆☆|★★★★★|
|结构型模式 Structural Pattern|享元模式 Flyweight  Pattern|★★★★☆|★☆☆☆☆|
|结构型模式 Structural Pattern|代理模式 Proxy  Pattern|★★★☆☆|★★★★☆|
|行为型模式 Behavioral Pattern|职责链模式 Chain  of Responsibility   Pattern|★★★☆☆|★★☆☆☆|
|行为型模式 Behavioral Pattern|命令模式 Command  Pattern|★★★☆☆|★★★★☆|
|行为型模式 Behavioral Pattern|解释器模式 Interpreter  Pattern|★★★★★|★☆☆☆☆|
|行为型模式 Behavioral Pattern|迭代器模式 Iterator  Pattern|★★★☆☆|★★★★★|
|行为型模式 Behavioral Pattern|中介者模式 Mediator  Pattern|★★★☆☆|★★☆☆☆|
|行为型模式 Behavioral Pattern|备忘录模式 Memento  Pattern|★★☆☆☆|★★☆☆☆|
|行为型模式 Behavioral Pattern|观察者模式 Observer  Pattern|★★★☆☆|★★★★★|
|行为型模式 Behavioral Pattern|状态模式 State  Pattern|★★★☆☆|★★★☆☆|
|行为型模式 Behavioral Pattern|策略模式 Strategy  Pattern|★☆☆☆☆|★★★★☆|
|行为型模式 Behavioral Pattern|模板方法模式 Template  Method Pattern|★★☆☆☆|★★★☆☆|
|行为型模式 Behavioral Pattern|访问者模式 Visitor  Pattern|★★★★☆|★☆☆☆☆|
