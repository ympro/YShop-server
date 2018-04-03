package com.yshop.common.own;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * id 生成器
 *
 * @author Yan Meng
 * @date 2018/3/6
 */
public interface IDGenerator<T> {
    /**
     * 默认生辰犯法
     * 
     * @return 生成的数据
     */
    T generate();

    IDGenerator<String> UUID = java.util.UUID.randomUUID()::toString;

    IDGenerator<String> UUID_STRING = () -> java.util.UUID.randomUUID().toString().replace("-", "");

    IDGenerator<String> UUID_NUMBER = () -> {
        long curr = System.currentTimeMillis();
        String currStr = String.valueOf(curr);

        int hashCode = java.util.UUID.randomUUID().hashCode();
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        String hashCodeStr = String.valueOf(hashCode) + currStr;
        if (hashCodeStr.length() <= 12) {
            return hashCodeStr;
        }
        return hashCodeStr.substring(0, 12);
    };

    IDGenerator<String> RANDOM = RandomUtil::randomChar;

    IDGenerator<String> MD5 = () -> {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(UUID.generate().concat(RandomUtil.randomChar()).getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    };
}
