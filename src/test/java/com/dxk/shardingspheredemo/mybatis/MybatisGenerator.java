package com.dxk.shardingspheredemo.mybatis;

import org.mybatis.generator.api.ShellRunner;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * mybatis代码生成
 * @author chenxy
 */
public class MybatisGenerator {

    public static void main(String[] args) throws UnsupportedEncodingException {
         ShellRunner.main(new String[]{"-configfile",
                 URLDecoder.decode(MybatisGenerator.class.getResource("/generatorConfig.xml").getFile(),"utf-8"),
                 "-overwrite"});
    }
}
