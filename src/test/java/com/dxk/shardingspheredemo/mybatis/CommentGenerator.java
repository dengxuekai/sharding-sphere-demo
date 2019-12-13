package com.dxk.shardingspheredemo.mybatis;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * 获取数据库字段注释
 * @author chnexy
 */
public class CommentGenerator extends DefaultCommentGenerator {

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remark = introspectedColumn.getRemarks();

        if(StringUtils.isBlank(remark)){
            return ;
        }

        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(remark);
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }
}
