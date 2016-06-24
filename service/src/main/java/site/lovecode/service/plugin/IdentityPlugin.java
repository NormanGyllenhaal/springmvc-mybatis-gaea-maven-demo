package site.lovecode.service.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class IdentityPlugin extends PluginAdapter {

	private final FullyQualifiedJavaType identity = new FullyQualifiedJavaType(
			"cn.vko.peixun.core.common.mybatis.Identity");



	public boolean validate( List<String> warnings ) {
		return true;
	}


	@Override
	public boolean modelBaseRecordClassGenerated( TopLevelClass topLevelClass, IntrospectedTable introspectedTable ) {
		makeIdentity(topLevelClass, introspectedTable);
		return true;
	}


	@Override
	public boolean modelPrimaryKeyClassGenerated( TopLevelClass topLevelClass, IntrospectedTable introspectedTable ) {
		makeIdentity(topLevelClass, introspectedTable);
		return true;
	}


	@Override
	public boolean
			modelRecordWithBLOBsClassGenerated( TopLevelClass topLevelClass, IntrospectedTable introspectedTable ) {
		makeIdentity(topLevelClass, introspectedTable);
		return true;
	}


	protected void makeIdentity( TopLevelClass topLevelClass, IntrospectedTable introspectedTable ) {

	}


}
