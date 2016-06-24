/**
 * GenerateCode.java cn.vko.peixun.core.mybatis.mybatis.plugin Copyright (c)
 * 2016, 北京微课创景教育科技有限公司版权所有.
 */


package site.lovecode.service.plugin;

import org.mybatis.generator.api.ShellRunner;


/**
 * 生成实体类，mapper 和xml文件
 * <p>
 *
 * @author   Administrator
 * @date	 2016年5月5日 
 * @version  1.0.0	 
 */
public class GenerateCode {


	public static void generate( String xml ) {
		String config = IdentityPlugin.class.getClassLoader().getResource(xml).getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}


	/**
	 * 
	 * 选择需要生成的数据库，运行此处main方法生成
	 * 每个xml文件对应一个数据库，只选择要生成的数据库运行即可
	 * <p>
	 * 如果需要选择生成的表，请在在resources修改xml
	 * 
	 * 
	 */
	public static void main( String[] args ) {
		generate("generate-newtest.xml");

	}

}
