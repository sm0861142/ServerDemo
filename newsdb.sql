/*
SQLyog Ultimate v8.32 
MySQL - 5.5.25a : Database - newsdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newsdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `newsdb`;

/*Table structure for table `adminuser` */

DROP TABLE IF EXISTS `adminuser`;

CREATE TABLE `adminuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `adminuser` */

insert  into `adminuser`(`id`,`username`,`password`) values (1,'admin','admin');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `newsId` int(11) DEFAULT NULL,
  `commentContent` varchar(200) DEFAULT NULL,
  `submitTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`id`,`userId`,`newsId`,`commentContent`,`submitTime`) values (1,1,11,'原来这样啊','2020-05-15 00:00:00'),(2,2,11,'哦哦','2020-05-16 00:00:00'),(3,3,11,'哦知道了','2020-05-17 00:00:00'),(4,1,10,'原来这样啊','2020-05-15 00:00:00'),(5,2,10,'哦哦','2020-05-16 00:00:00'),(6,3,10,'哦知道了','2020-05-17 00:00:00');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` text,
  `typeId` int(11) DEFAULT NULL,
  `imagePath` varchar(100) DEFAULT NULL,
  `publishDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `news` */

insert  into `news`(`id`,`title`,`content`,`typeId`,`imagePath`,`publishDate`) values (1,'九成国内航班恢复 上海虹桥机场数据环比增长超50%','最近10天的统计数据显示，上海虹桥机场日均国内航班起降量650架次左右，日均旅客吞吐量突破8万人次，环比4月各增长约56%和58%。国内航班量已恢复到去年同期的九成左右，旅客运输量恢复至去年同期的七成左右。东航每天在上海虹桥机场执行的国内航班量占到整个虹桥机场的一半，近期，东航加大上海到深圳、广州、成都等地的国内航班量的投放，客座率达到70%以上，客流中以商务客流为主，航班量增加和客座率上升意味着航线两地之间的经济联系更活跃了。',1,'images/1.png','2020-05-01 00:00:00'),(2,'网信管理体系延伸至村镇：河北一地挂牌2430个','为贯彻落实省委网络安全和信息化委员会第二次会议精神，落实省委书记王东峰、市委书记朱政学关于加强基层网信工作体系建设重要批示指示精神，秦皇岛市委网信办精心部署、强力推进，全部完成全市“一中心一站”机构建设工作任务。截止6月2日，共在乡镇、街道成立综合指挥和信息化网络中心98个，在村、社区挂牌网信工作服务站2430个，确定乡镇街道主管领导及工作人员196人，网信工作联络员4860人，实现了市、县、乡、村网信机构的全覆盖和延伸。',1,'images/2.png','2020-05-02 00:00:00'),(3,'英国考虑摆脱对华为5G依赖?中方:望给予非歧视环境','据报道，英国政府正在考虑摆脱对华为的5G依赖，对此，中国外交部发言人赵立坚今天（4日）表示，希望英方保持政策独立性，给予中国企业开放、公平、非歧视的营商环境。',2,'images/3.png','2020-05-03 00:00:00'),(4,'民航局：6月8日起 平均每日入境人数约4700人','为继续做好新形势下统筹推进疫情防控和经济社会发展工作，有序恢复部分国际客运航班，进一步满足我国留学生和海外华侨华人回国的迫切需求，本月4日，《民航局关于调整国际客运航班的通知》（以下简称《通知》）发布，自6月8日起对现行国际客运航班“五个一”措施进行调整。调整后航班量和入境人数将有什么变化？如何继续做好疫情防控工作？记者带着一系列问题采访了民航局运输司相关负责人。',1,'images/4.png','2020-05-04 00:00:00'),(5,'香港特区立法会三读通过《国歌条例草案》','会议期间反对派议员陈志全、朱凯迪突破冲出主席台，有议员指陈扔出一物体，内藏有白色的虫，代主席李慧琼随即宣布暂停会议。朱凯迪事后称是“有机肥料”，大批警员于下午1时10分抵达会议厅调查。随后于下午4时45分复会，并改于其他会议室进行。',1,'images/5.png','2020-05-05 00:00:00'),(6,'猪肉价格14周连跌 每公斤零售均价比最高点降13元','农业农村部最新数据显示，近3个月全国生猪存栏环比增长，生猪和猪肉价格连续14周下跌，30个监测省份猪肉价格均下降。全国猪肉批发均价已从2月中旬每公斤50元的阶段高点降至每公斤38元；全国猪肉零售均价比最高点下降近四分之一，每公斤降了约13元。',1,'images/6.png','2020-05-06 00:00:00'),(7,'美司法部长：\"外国势力\"在美国挑拨离间煽动暴力','美国司法部长巴尔在新闻发布会上称,联邦政府有证据表明左翼无政府主义组织”安提法”以及其他极端组织利用抗议活动煽动暴力，实施非法行为。他还表示，有一股长期存在于美国的“特定外国势力”也在其中扮演了恶化事态的角色，他们制造虚假信息、挑拨离间、制造不稳定，但他并没有明确指出外国势力来自哪里。',2,'images/9.png','2020-05-07 00:00:00'),(8,'弗洛伊德好友忆其最后时刻:他从未拒捕 边哭边恳求','摘要：美国非裔男子弗洛伊德遭警察暴力执法致死后，引发的大规模抗议示威活动已蔓延全美140多个城市。其好友莫里斯·霍尔在接受采访时回忆了这名男子遭警察“跪杀”前的最后时刻。',2,'images/10.png','2020-05-08 00:00:00'),(9,'白宫安保再升级：2.5米铁丝网外 又加固水泥墩','据CNN报道，为应对抗议人群，白宫附近安保态势不断升级，除了竖起近2.5米高的铁网围栏，又加固了可以防范车辆撞击的水泥墩。而这种场面，往往会在每四年一次的庆祝总统就职游行才会看到。',3,'images/11.png','2020-05-09 00:00:00'),(10,'“说中医不好就要被抓？”官方回应：这是误读','近日，《北京市中医药条例（草案公开征求意见稿）》中关于“不得诋毁、污蔑中医药”及相应追责处罚条文引发大量讨论与争议。北京市中医管理局相关负责人称，网民对草案存在误读，并不是说诋毁就判刑，且草案目前在征求意见，结合对反馈建议的综合评估，不排除修改或删除部分条文的可能。',1,'images/7.png','2020-05-10 00:00:00'),(11,'从浙大副校长到\"阶下囚\"：褚健的\"过山车\"人生','5月22日，上交所官网消息，上交所科创板发审委重新恢复了对浙江中控技术股份有限公司（简称：“中控技术”）的上市审核。如果一切顺利，中控技术这家由校企改制而来企业将登陆资本市场，褚健或将凭借其超过25%的持股比例身家飞升。',1,'images/8.png','2020-05-11 00:00:00');

/*Table structure for table `newstype` */

DROP TABLE IF EXISTS `newstype`;

CREATE TABLE `newstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `newstype` */

insert  into `newstype`(`id`,`typeName`) values (1,'国内新闻'),(2,'国际新闻'),(3,'军事新闻');

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `headImage` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `userinfo` */

insert  into `userinfo`(`id`,`username`,`password`,`phone`,`email`,`headImage`) values (1,'a','123456','18011111111','a@qq.com',NULL),(2,'b','123456','18055555555','b@qq.com',NULL),(3,'c','123456','13955555555','c@qq.com',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
