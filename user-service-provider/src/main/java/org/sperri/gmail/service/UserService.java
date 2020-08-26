package org.sperri.gmail.service;

import org.sperri.gmail.bean.UserAddress;

import java.util.List;

/**
 * @Author Jie Zhao
 * @Date 2020/8/26
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
