/**
 * Created by zzqno on 2017-2-26.
 * 单例模式的写法
 * <p>
 * 优点：
 * 在内存中只有一个对象，节省内存空间。
 * 避免频繁的创建销毁对象，可以提高性能。
 * 避免对共享资源的多重占用。
 * 可以全局访问。
 * <p>
 * 适用场景：
 * 需要频繁实例化然后销毁的对象。
 * 创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
 * 有状态的工具类对象。
 * 频繁访问数据库或文件的对象。
 * 以及其他我没用过的所有要求只有一个对象的场景。
 */
package org.goskyer.single;