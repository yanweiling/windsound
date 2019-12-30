-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('录音资源', '3', '1', '/module/taskVideoResource', 'C', '0', 'module:taskVideoResource:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '录音资源菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('录音资源查询', @parentId, '1',  '#',  'F', '0', 'module:taskVideoResource:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('录音资源新增', @parentId, '2',  '#',  'F', '0', 'module:taskVideoResource:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('录音资源修改', @parentId, '3',  '#',  'F', '0', 'module:taskVideoResource:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('录音资源删除', @parentId, '4',  '#',  'F', '0', 'module:taskVideoResource:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
