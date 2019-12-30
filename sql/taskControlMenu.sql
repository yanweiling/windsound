-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务控制', '3', '1', '/module/taskControl', 'C', '0', 'module:taskControl:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '任务控制菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务控制查询', @parentId, '1',  '#',  'F', '0', 'module:taskControl:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务控制新增', @parentId, '2',  '#',  'F', '0', 'module:taskControl:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务控制修改', @parentId, '3',  '#',  'F', '0', 'module:taskControl:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务控制删除', @parentId, '4',  '#',  'F', '0', 'module:taskControl:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
