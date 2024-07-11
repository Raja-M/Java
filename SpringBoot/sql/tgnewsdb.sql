use tgnews;

CREATE TABLE `tgncategory_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE SEQUENCE tgncategory_sequence START WITH 1 INCREMENT BY 1;

select next value  from tgncategory_sequence

CREATE TABLE `tgncategory` (
  `categoryid` bigint NOT NULL,
  `categorycreatedby` int NOT NULL,
  `categorydescription` varchar(255) NOT NULL,
  `categoryupdatetime` varchar(255) NOT NULL,
  PRIMARY KEY (`categoryid`),
  UNIQUE KEY `categorydescription_unique` (`categorydescription`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into tgncategory values ( 1, 1 , 'news', current_time() ) ;


CREATE TABLE `tgnuser_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `tgnuser` (
  `userid` bigint NOT NULL,
  `useraddressaptorsuiteno` varchar(255) DEFAULT NULL,
  `useraddresshousenumber` varchar(255) DEFAULT NULL,
  `useraddressstreet` varchar(255) DEFAULT NULL,
  `useralternatephone` bigint DEFAULT NULL,
  `usercity` varchar(255) DEFAULT NULL,
  `usercountry` varchar(255) DEFAULT NULL,
  `useremail` varchar(255) DEFAULT NULL,
  `userphone` bigint DEFAULT NULL,
  `userphonecountrycode` int DEFAULT NULL,
  `userstate` varchar(255) DEFAULT NULL,
  `userzipcode` varchar(255) DEFAULT NULL,
  `usercreatetime` varchar(255) DEFAULT NULL,
  `userfirstname` varchar(255) DEFAULT NULL,
  `userlastname` varchar(255) DEFAULT NULL,
  `usermodifiedtime` varchar(255) DEFAULT NULL,
  `userrole` varchar(255) DEFAULT NULL,
  `userstatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into tgnuser ( userid ) values ( 1 ) ;


CREATE TABLE `tgncontent` (
  `contentid` bigint NOT NULL,
  `contentbody` text,
  `contentcity` varchar(255) DEFAULT NULL,
  `contentcreatetime` varchar(255) DEFAULT NULL,
  `contentmandal` varchar(255) DEFAULT NULL,
  `contentpicurl` varchar(255) DEFAULT NULL,
  `contentplaceid` int NOT NULL,
  `contentstatus` char(1) NOT NULL,
  `contenttitle` varchar(255) DEFAULT NULL,
  `contentupdatetime` varchar(255) DEFAULT NULL,
  `contentapproverid` bigint NOT NULL,
  `contenteditorid` bigint NOT NULL,
  PRIMARY KEY (`contentid`),
  KEY `FKsp53fv18nys1afep7vnj50i9q` (`contentapproverid`),
  KEY `FK8hrvf0diqxuvaxrfjqu81j4au` (`contenteditorid`),
  CONSTRAINT `FK8hrvf0diqxuvaxrfjqu81j4au` FOREIGN KEY (`contenteditorid`) REFERENCES `tgnuser` (`userid`),
  CONSTRAINT `FKsp53fv18nys1afep7vnj50i9q` FOREIGN KEY (`contentapproverid`) REFERENCES `tgnuser` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into tgncontent values ( 1, 'content body', 'karimnagar', CURRENT_TIME(),  'pegadapally', '', 
1, 'A', 'content title', CURRENT_TIME(), 1, 1 );

commit ;

CREATE TABLE `tgncontent_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tgncontentcategorymap` (
  `contentid` bigint NOT NULL,
  `categoryid` bigint NOT NULL,
  KEY `FKfp2acx6g3od2jf6se2g8gaipk` (`categoryid`),
  KEY `FKve76iea5pobstc0ppmqw2wf1` (`contentid`),
  CONSTRAINT `FKfp2acx6g3od2jf6se2g8gaipk` FOREIGN KEY (`categoryid`) REFERENCES `tgncategory` (`categoryid`),
  CONSTRAINT `FKve76iea5pobstc0ppmqw2wf1` FOREIGN KEY (`contentid`) REFERENCES `tgncontent` (`contentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

