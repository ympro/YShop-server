SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '内容类目ID',
  `title` varchar(200) NOT NULL DEFAULT '' COMMENT '内容标题',
  `sub_title` varchar(100) NOT NULL DEFAULT '' COMMENT '子标题',
  `desc` varchar(500) NOT NULL DEFAULT '' COMMENT '标题描述',
  `url` varchar(500) NOT NULL DEFAULT '' COMMENT '链接',
  `pic` varchar(300) NOT NULL DEFAULT '' COMMENT '图片绝对路径',
  `content` text NOT NULL DEFAULT '' COMMENT '内容',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for content_category
-- ----------------------------
DROP TABLE IF EXISTS `content_category`;
CREATE TABLE `content_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `is_parent` tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '分类名称',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '状态。可选值:200(正常),400(停售)',
  `sort_order` tinyint(4) NOT NULL DEFAULT '0' COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`status`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='内容分类';

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `product_id` varchar(20) NOT NULL DEFAULT '' COMMENT '商品id，同时也是商品编号',
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '商品标题',
  `sell_point` varchar(500) NOT NULL DEFAULT '' COMMENT '商品卖点',
  `market_price` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品价格，单位为：分',
  `sell_price` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品价格，单位为：分',
  `inventory` int(10) NOT NULL DEFAULT '0' COMMENT '库存数量',
  `barcode` varchar(30) NOT NULL DEFAULT '' COMMENT '商品条形码',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '商品图片',
  `category_id` bigint(10) NOT NULL COMMENT '所属类目，叶子类目',
  `status` int(4) NOT NULL DEFAULT '100' COMMENT '商品状态，100-新建，200-上架，300-下架，400-冻结',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `is_parent` tinyint(1) NOT NULL DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '类目名称',
  `status` int(4) DEFAULT '200' COMMENT '状态。可选值:200(正常),400(冻结)',
  `sort_order` tinyint(4) NOT NULL DEFAULT '0' COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`) USING BTREE,
  KEY `sort_order` (`sort_order`)
) ENGINE=InnoDB AUTO_INCREMENT=1183 DEFAULT CHARSET=utf8 COMMENT='商品类目';

-- ----------------------------
-- Table structure for product_desc
-- ----------------------------
DROP TABLE IF EXISTS `product_desc`;
CREATE TABLE `product_desc` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `product_id` varchar(20) NOT NULL DEFAULT '' COMMENT '商品ID',
  `product_desc` text COMMENT '商品描述',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品描述表';

-- ----------------------------
-- Table structure for product_param_template
-- ----------------------------
DROP TABLE IF EXISTS `product_param_template`;
CREATE TABLE `product_param_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_category_id` bigint(20) NOT NULL DEFAULT '' COMMENT '商品类目ID',
  `param_template` varchar(100) NOT NULL DEFAULT '' COMMENT '参数模板,可以多行，格式为json格式 eg:{"paramKey":"clientId","paramName":"58客户ID"}',
  `type` varchar(20) NOT NULL DEFAULT 'default' COMMENT '类型',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `product_category_id` (`product_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='商品规则参数';

-- ----------------------------
-- Table structure for product_params
-- ----------------------------
DROP TABLE IF EXISTS `product_params`;
CREATE TABLE `product_params` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) NOT NULL DEFAULT '' COMMENT '商品ID',
  `param_key` varchar(50) NOT NULL DEFAULT 'default' COMMENT '属性key',
  `param_name` varchar(50) NOT NULL DEFAULT 'default' COMMENT '属性名称',
  `param_value` varchar(100) NOT NULL DEFAULT 'default' COMMENT '属性',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='商品规格和商品的关系表';

-- ----------------------------
-- Table structure for product_param_content
-- ----------------------------
DROP TABLE IF EXISTS `product_param_content`;
CREATE TABLE `product_param_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(20) NOT NULL DEFAULT '' COMMENT '商品ID',
  `param_data` text COMMENT '参数数据，格式为json格式',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='商品规格和商品的关系表';

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) NOT NULL DEFAULT '' COMMENT '订单id',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '状态：100、未付款，200、已付款，300、未发货，400、已发货，500、交易成功，600、交易关闭',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id',
  `payment_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分',
  `payment_type` tinyint(2) NOT NULL DEFAULT '1' COMMENT '支付类型，1、在线支付，2、货到付款',
  `payment_time` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '付款时间',
  `post_fee` bigint(50) NOT NULL DEFAULT '0' COMMENT '邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分',
  `consign_time` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '发货时间',
  `shipping_name` varchar(20) NOT NULL DEFAULT '' COMMENT '物流名称',
  `shipping_code` varchar(20) NOT NULL DEFAULT '' COMMENT '物流单号',
  `buyer_message` varchar(100) NOT NULL DEFAULT '' COMMENT '买家留言',
  `buyer_nick` varchar(50) NOT NULL DEFAULT '' COMMENT '买家昵称',
  `buyer_rate` int(2) NOT NULL DEFAULT '0' COMMENT '买家是否已经评价',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `order_id` (`order_id`),
  KEY `user_id` (`user_id`),
  KEY `buyer_nick` (`buyer_nick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `item_id` varchar(50) NOT NULL DEFAULT '' COMMENT '商品id',
  `order_id` varchar(50) NOT NULL COMMENT '订单id',
  `num` int(10) NOT NULL DEFAULT '0' COMMENT '商品购买数量',
  `title` varchar(200) NOT NULL DEFAULT '' COMMENT '商品标题',
  `product_id` varchar(20) NOT NULL DEFAULT '' COMMENT '商品ID',
  `price` bigint(50) NOT NULL DEFAULT '0' COMMENT '商品单价',
  `total_fee` bigint(50) NOT NULL DEFAULT '0' COMMENT '商品总金额',
  `pic_path` varchar(200) NOT NULL DEFAULT '' COMMENT '商品图片地址',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `item_id` (`item_id`),
  KEY `order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for order_shipping
-- ----------------------------
DROP TABLE IF EXISTS `order_shipping`;
CREATE TABLE `order_shipping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) NOT NULL DEFAULT '' COMMENT '订单ID',
  `receiver_name` varchar(20) NOT NULL DEFAULT '' COMMENT '收货人全名',
  `receiver_mobile` varchar(30) NOT NULL DEFAULT '' COMMENT '移动电话',
  `state_code` varchar(10) NOT NULL DEFAULT '' COMMENT '省份',
  `city_code` varchar(10) NOT NULL DEFAULT '' COMMENT '城市',
  `district_code` varchar(20) NOT NULL DEFAULT '' COMMENT '区/县',
  `detail_address` varchar(200) NOT NULL DEFAULT '' COMMENT '收货地址，如：xx路xx号',
  `zip_code` varchar(6) NOT NULL DEFAULT '' COMMENT '邮政编码,如：310001',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码，加密存储',
  `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '注册手机号',
  `email` varchar(50) NOT NULL DEFAULT '' COMMENT '注册邮箱',
  `ctime` timestamp NOT NULL DEFAULT '1970-01-02 00:00:00' COMMENT '创建时间',
  `mtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `phone` (`phone`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户表';
