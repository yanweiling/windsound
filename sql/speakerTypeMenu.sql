-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('说话人类型', '3', '1', '/module/speakerType', 'C', '0', 'module:speakerType:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '说话人类型菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('说话人类型查询', @parentId, '1',  '#',  'F', '0', 'module:speakerType:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('说话人类型新增', @parentId, '2',  '#',  'F', '0', 'module:speakerType:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('说话人类型修改', @parentId, '3',  '#',  'F', '0', 'module:speakerType:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('说话人类型删除', @parentId, '4',  '#',  'F', '0', 'module:speakerType:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
