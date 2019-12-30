-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务', '3', '1', '/module/taskInfo', 'C', '0', 'module:taskInfo:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '采集任务菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务查询', @parentId, '1',  '#',  'F', '0', 'module:taskInfo:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务新增', @parentId, '2',  '#',  'F', '0', 'module:taskInfo:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务修改', @parentId, '3',  '#',  'F', '0', 'module:taskInfo:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('采集任务删除', @parentId, '4',  '#',  'F', '0', 'module:taskInfo:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
