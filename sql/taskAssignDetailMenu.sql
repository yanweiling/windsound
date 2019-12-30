-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('用户任务分配任务详情', '3', '1', '/module/taskAssignDetail', 'C', '0', 'module:taskAssignDetail:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '用户任务分配任务详情菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('用户任务分配任务详情查询', @parentId, '1',  '#',  'F', '0', 'module:taskAssignDetail:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('用户任务分配任务详情新增', @parentId, '2',  '#',  'F', '0', 'module:taskAssignDetail:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('用户任务分配任务详情修改', @parentId, '3',  '#',  'F', '0', 'module:taskAssignDetail:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('用户任务分配任务详情删除', @parentId, '4',  '#',  'F', '0', 'module:taskAssignDetail:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
