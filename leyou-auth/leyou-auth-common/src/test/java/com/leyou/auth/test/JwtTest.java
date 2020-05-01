package com.leyou.auth.test;


import com.leyou.common.pojo.UserInfo;
import com.leyou.common.utils.*;
import org.junit.*;

import java.security.*;

public class JwtTest {

    /**
     * 存放公钥(yuè)的路径
     */
    private static final String pubKeyPath = "C:\\Users\\57218\\Desktop\\leyou\\rsa.pub";

    /**
     * 存放私钥(yuè)的路径
     */
    private static final String priKeyPath = "C:\\Users\\57218\\Desktop\\leyou\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        //（公钥路径，私钥路径，服务密钥）
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTU4ODMyMTc0OH0.diF29BrI3MeIIP_gc2jH16KZyGCgQ2MRIN32aaDaPHDSiJrAjzP9XK0h39DRWXBiUiY1FHwtQnLj76rRQvENbHnwjdb1Dkf6pIpo0XIrgagyRESA1Cuq-jbDm0K_rd6ivjtjoB_tKyVV2KizA3_nUQrf0r54EEp0-B7lofbtDG0";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }
}