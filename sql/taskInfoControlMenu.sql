-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务控制关联', '3', '1', '/module/taskInfoControl', 'C', '0', 'module:taskInfoControl:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '采集任务控制关联菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务控制关联查询', @parentId, '1',  '#',  'F', '0', 'module:taskInfoControl:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务控制关联新增', @parentId, '2',  '#',  'F', '0', 'module:taskInfoControl:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务控制关联修改', @parentId, '3',  '#',  'F', '0', 'module:taskInfoControl:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务控制关联删除', @parentId, '4',  '#',  'F', '0', 'module:taskInfoControl:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
