-- 华信贩卖系统数据库初始化脚本
-- 数据库名：fanmaisystem

-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS fanmaisystem DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE fanmaisystem;

-- 1. 部门表
CREATE TABLE IF NOT EXISTS department (
    d_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '部门ID',
    d_name VARCHAR(50) NOT NULL COMMENT '部门名称',
    d_permission VARCHAR(100) COMMENT '部门权限'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='部门表';

-- 2. 员工表
CREATE TABLE IF NOT EXISTS employee (
    e_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '员工ID',
    e_name VARCHAR(50) NOT NULL COMMENT '员工姓名',
    e_password VARCHAR(50) NOT NULL COMMENT '密码',
    d_id VARCHAR(10) COMMENT '部门ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工表';

-- 3. 供货商表
CREATE TABLE IF NOT EXISTS supplier (
    s_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '供货商ID',
    s_name VARCHAR(100) NOT NULL COMMENT '供货商名称',
    s_address VARCHAR(200) COMMENT '地址',
    s_postal_code VARCHAR(20) COMMENT '邮编',
    s_phone VARCHAR(50) COMMENT '电话',
    s_fax VARCHAR(50) COMMENT '传真',
    s_r_date VARCHAR(20) COMMENT '注册日期',
    s_employee VARCHAR(50) COMMENT '联系人',
    outstanding_payment DECIMAL(10,2) DEFAULT 0.00 COMMENT '未付款金额'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='供货商表';

-- 4. 商品表
CREATE TABLE IF NOT EXISTS product (
    p_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '商品ID',
    p_name VARCHAR(100) NOT NULL COMMENT '商品名称',
    p_code VARCHAR(50) UNIQUE COMMENT '商品编码',
    p_category VARCHAR(50) COMMENT '商品类别',
    p_unit VARCHAR(20) COMMENT '单位',
    p_price DECIMAL(10,2) NOT NULL COMMENT '单价',
    stock INT DEFAULT 0 COMMENT '库存数量',
    s_id INT COMMENT '供货商ID',
    p_description TEXT COMMENT '商品描述',
    p_status VARCHAR(20) DEFAULT '在售' COMMENT '商品状态（在售/停售）',
    FOREIGN KEY (s_id) REFERENCES supplier(s_id) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表';

-- 5. 订单表
CREATE TABLE IF NOT EXISTS `order` (
    o_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '订单ID',
    o_number VARCHAR(50) UNIQUE NOT NULL COMMENT '订单编号',
    o_date VARCHAR(20) NOT NULL COMMENT '订单日期',
    s_id INT COMMENT '供货商ID',
    p_id INT COMMENT '商品ID',
    quantity INT NOT NULL COMMENT '数量',
    unit_price DECIMAL(10,2) NOT NULL COMMENT '单价',
    total_amount DECIMAL(10,2) NOT NULL COMMENT '总金额',
    e_id VARCHAR(10) COMMENT '员工ID（下单员工）',
    status VARCHAR(20) DEFAULT '待处理' COMMENT '订单状态（待处理/已确认/已完成/已取消）',
    remark VARCHAR(500) COMMENT '备注',
    FOREIGN KEY (s_id) REFERENCES supplier(s_id) ON DELETE SET NULL,
    FOREIGN KEY (p_id) REFERENCES product(p_id) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

-- 插入测试数据

-- 部门数据
INSERT INTO department (d_id, d_name, d_permission) VALUES
(1, '销售部', '订单管理'),
(2, '采购部', '商品管理'),
(3, '财务部', '财务管理');

-- 员工数据
INSERT INTO employee (e_id, e_name, e_password, d_id) VALUES
(1, '张三', '123456', '1'),
(2, '李四', '123456', '2'),
(3, '王五', '123456', '3');

-- 供货商数据
INSERT INTO supplier (s_id, s_name, s_address, s_postal_code, s_phone, s_fax, s_r_date, s_employee, outstanding_payment) VALUES
(1, '华信电子有限公司', '北京市朝阳区xxx路xxx号', '100000', '010-12345678', '010-12345679', '2020-01-01', '张经理', 0.00),
(2, '上海贸易公司', '上海市浦东新区xxx路xxx号', '200000', '021-87654321', '021-87654322', '2019-06-15', '李经理', 5000.00);

-- 商品数据
INSERT INTO product (p_id, p_name, p_code, p_category, p_unit, p_price, stock, s_id, p_description, p_status) VALUES
(1, '笔记本电脑', 'PROD001', '电子产品', '台', 5999.00, 50, 1, '高性能笔记本电脑', '在售'),
(2, '无线鼠标', 'PROD002', '电子产品', '个', 99.00, 200, 1, '无线蓝牙鼠标', '在售'),
(3, '办公桌椅', 'PROD003', '办公用品', '套', 899.00, 30, 2, '舒适办公桌椅', '在售');

-- 订单数据
INSERT INTO `order` (o_number, o_date, s_id, p_id, quantity, unit_price, total_amount, e_id, status, remark) VALUES
('ORD20240101000001', '2024-01-01', 1, 1, 10, 5999.00, 59990.00, '1', '已确认', '测试订单1'),
('ORD20240101000002', '2024-01-01', 1, 2, 50, 99.00, 4950.00, '1', '已完成', '测试订单2');

