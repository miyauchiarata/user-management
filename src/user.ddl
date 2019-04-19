CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(32) NOT NULL default '',
  `gender` varchar(32) NOT NULL default '',
  `hobby` varchar(32) NOT NULL default '',
  `work` varchar(32) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;