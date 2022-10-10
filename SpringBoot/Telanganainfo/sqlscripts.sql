select * from tinfocontent_sequence;
select * from tinfouser_sequence;
select * from tinfocategory_sequence;

select * from tinfouser;
select * from tinfocontent;
select * from tinfocategory;
commit;
delete from tinfocontent where contentid = 2;
update tinfocontent
set contenteditorid = 1,
	contentapproverid = 1
where contentid = 2 ;

drop table tinfocontent_sequence;
drop table tinfouser_sequence;
drop table tinfocategory_sequence;

drop table tinfocontentcategorymap;
drop table tinfocontent;
drop table tinfouser;
drop table tinfocategory;

commit;

CREATE TABLE `tinfouser` (
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





