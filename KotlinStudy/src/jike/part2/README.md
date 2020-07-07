第二章：深入学习篇
--------------------
Kotlin 高级特性

* [解构](lesson13) - lesson13
* [循环与集合操作符](lesson14) - lesson14,lesson15
* [运算符重载]()
* [作用域函数](lesson16)
* [中缀表达式](lesson13)
* [DSL](lesson13)

常用操作符
----------------
* **元素操作类**
   * **contains** --- 判断是否有指定元素
   * **elementAt** --- 返回对应的元素，越界会抛出IndexOutOfBoundsException
   * **firstOrNull** --- 返回符合条件的第一个元素，没有就返回null
   * **lastOrNull** --- 返回符合条件的最后一个元素，没有就返回null
   * **indexOf** --- 返回指定元素的下标，没有返回-1
   * **singleOrNull** --- 返回符合条件的单个元素，如有没有符合或超过一个，返回null 

* **判断类**
  * **any**  --- 判断集合中是否有满足条件的元素
  * **all**  --- 判断集合中的元素 是否都满足条件
  * **none**  --- 判断集合中是否都不满足条件，是则返回true
  * **count**  --- 查询集合中 满足条件的元素个数
  * **reduce**  --- 从第一项到最后一项进行累计
  
* **过滤类**
  * **filter**  --- 过滤掉所有满足条件的元素
  * **filterNot**  --- 过滤掉所有不满足条件的元素
  * **filterNotNull**  --- 过滤NULL
  * **take**  --- 返回前n个元素
  
* **转换类**
  * **map**  --- 转换成另一集合（与代码中实现的convert方法作用一样）
  * **mapIndexed**  --- 除了转换成另一个集合，还可以拿到Index（下标）
  * **mapNotNull**  --- 执行转换前过滤掉为NULL的元素
  * **flatMap**  --- 自定义逻辑合并两个集合
  * **groupBy**  --- 按照某个条件分组，返回Map
  
* **排序类**
  * **reversed**  --- 反序
  * **sorted**  --- 升序
  * **sortedBy**  --- 自定义排序
  * **sortedDescending**  --- 降序


