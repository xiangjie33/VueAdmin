package com.markerhub.service;

import com.markerhub.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-09-23
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> listRoleByUserId(Long userId);
}
