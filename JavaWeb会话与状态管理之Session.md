## JavaWeb会话与状态管理之Session

服务端产生Session Id 保存在Cookie中，回传给客户端

Session保存在服务端

![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\30.png)

![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\32.png)

#### session id的几种方法

![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\34.png)

![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\35.png)

![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\36.png)

#### HttpSession的常用方法

#### HttpSession 的生命周期

##### 创建

##### 销毁

#### URL重写

#### 绝对路劲与相对的问题

#### Session的典型案例

##### 防止表单重复提交

##### 实现购物车

实现购物车的方式

- 使用Cookie来存储购物车信息
- 使用Session存储购物车信息
- 使用Cookie + 数据库存储购物车信息

###### 基于Session的购物车

- 分析

  将购物信息保存在Session中



  ![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\37.png)

  ![](C:\Users\听音乐的酒\Desktop\笔记\学习笔记\imgs1\38.png)

- domain

  - 所购商品
  - 购物车

##### 实现一次性验证

###### 验证码的实现

###### 验证码的使用及换张