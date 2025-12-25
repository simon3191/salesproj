# 华信贩卖系统

基于 Spring Boot + MyBatis + Thymeleaf 的销售管理系统

## 功能模块

### ✅ 已实现功能

1. **登录模块**
   - 员工登录验证
   - 部门选择
   - 密码验证

2. **供货商管理模块**
   - 供货商信息查询
   - 按名称模糊搜索
   - 信息列表展示

3. **订单管理模块**
   - 订单输入：支持选择供货商、商品，自动计算总金额
   - 订单列表：支持按订单编号、日期、状态查询
   - 订单状态管理：待处理、已确认、已完成、已取消

4. **商品管理模块**
   - 商品信息维护：新增、编辑、删除商品
   - 商品列表查询：支持按名称、编码、类别、状态查询
   - 商品信息管理：商品名称、编码、类别、单价、库存、供货商关联等

## 技术栈

- **后端框架**：Spring Boot 2.7.0
- **持久层框架**：MyBatis
- **模板引擎**：Thymeleaf
- **数据库**：MySQL 5.7+
- **构建工具**：Maven
- **JDK版本**：1.8+

## 项目结构

```
salesproj/
├── pom.xml                          # Maven依赖配置
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/dhee/fanmaisystem/
│   │   │       ├── FanmaiSystemApplication.java  # 启动类
│   │   │       ├── controller/      # 控制器层
│   │   │       ├── service/         # 业务逻辑层
│   │   │       ├── dao/             # 数据访问层
│   │   │       └── entity/          # 实体类
│   │   └── resources/
│   │       ├── application.yml      # 配置文件
│   │       ├── mapper/              # MyBatis映射文件
│   │       ├── templates/           # Thymeleaf模板
│   │       └── static/              # 静态资源
│   └── test/                        # 测试代码
├── database/
│   └── init.sql                     # 数据库初始化脚本
└── README.md                        # 项目说明
```

## 快速开始

### 1. 环境要求

- JDK 1.8 或更高版本
- Maven 3.6+
- MySQL 5.7+ 或 MySQL 8.0+

### 2. 数据库配置

1. 创建数据库：
```sql
CREATE DATABASE fanmaisystem DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2. 执行初始化脚本：
```bash
mysql -u root -p fanmaisystem < database/init.sql
```

或者直接在MySQL客户端中执行 `database/init.sql` 文件。

### 3. 配置文件修改

编辑 `src/main/resources/application.yml`，修改数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/fanmaisystem?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai
    username: root      # 修改为你的数据库用户名
    password: root      # 修改为你的数据库密码
```

### 4. 运行项目

#### 方式一：使用Maven命令
```bash
mvn spring-boot:run
```

#### 方式二：使用IDE
1. 导入项目到 IntelliJ IDEA 或 Eclipse
2. 找到 `FanmaiSystemApplication.java`
3. 右键运行 `main` 方法

### 5. 访问系统

- 访问地址：http://localhost:8080/tologin
- 默认测试账号：
  - 员工编号：1
  - 部门：销售部 (dId=1)
  - 密码：123456

## 数据库表结构

### 主要数据表

1. **department** - 部门表
2. **employee** - 员工表
3. **supplier** - 供货商表
4. **product** - 商品表
5. **order** - 订单表

详细表结构请查看 `database/init.sql` 文件。

## 功能说明

### 订单管理

- **订单输入** (`/order/input`)
  - 选择供货商和商品
  - 输入数量和单价，自动计算总金额
  - 系统自动生成订单编号和日期
  - 可设置订单状态和备注

- **订单列表** (`/order/list`)
  - 查看所有订单
  - 支持按订单编号、日期、状态查询
  - 显示订单详细信息

### 商品管理

- **商品列表** (`/product/list`)
  - 查看所有商品
  - 支持按商品名称、编码、类别、状态查询
  - 可进行编辑和删除操作

- **商品编辑** (`/product/toEdit`)
  - 新增商品：填写商品基本信息
  - 编辑商品：修改商品信息
  - 关联供货商
  - 设置商品状态（在售/停售）

## 注意事项

1. **数据库表名**：订单表使用了MySQL关键字 `order`，在SQL中需要使用反引号 `` `order` `` 包裹
2. **日期格式**：系统使用字符串类型存储日期，格式为 `yyyy-MM-dd`
3. **订单编号**：系统自动生成，格式为 `ORD + 日期时间戳`
4. **总金额计算**：订单总金额 = 数量 × 单价，系统自动计算

## 开发说明

### 添加新功能

1. 创建实体类（Entity）
2. 创建DAO接口和XML映射文件
3. 创建Service接口和实现类
4. 创建Controller控制器
5. 创建前端页面（Thymeleaf模板）

### 代码规范

- 实体类使用小驼峰命名（如：`eId`, `pName`）
- 数据库字段使用下划线命名（如：`e_id`, `p_name`）
- MyBatis自动进行驼峰转换
- Controller层处理HTTP请求，调用Service层
- Service层处理业务逻辑，调用DAO层
- DAO层负责数据库操作

## 许可证

本项目仅供学习使用。

## 联系方式

如有问题，请联系开发团队。

