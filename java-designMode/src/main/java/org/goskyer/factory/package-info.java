/**
 * Created by zzqno on 2017-2-26.
 * 工厂模式demo
 * <p>
 * 可以使代码结构清晰，有效地封装变化。在编程中，产品类的实例化有时候是比较复杂和多变的，
 * 通过工厂模式，将产品的实例化封装起来，使得调用者根本无需关心产品的实例化过程，
 * 只需依赖工厂即可得到自己想要的产品。
 * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 * 有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过new就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 */
package org.goskyer.factory;