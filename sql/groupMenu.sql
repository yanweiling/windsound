-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词组', '3', '1', '/module/group', 'C', '0', 'module:group:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '词组菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词组查询', @parentId, '1',  '#',  'F', '0', 'module:group:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词组新增', @parentId, '2',  '#',  'F', '0', 'module:group:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词组修改', @parentId, '3',  '#',  'F', '0', 'module:group:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('词组删除', @parentId, '4',  '#',  'F', '0', 'module:group:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
