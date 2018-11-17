package com.szcoders.springtest.pojo.soundsystem;

import org.springframework.context.annotation.ComponentScan;

/*
@ComponentScan(basePackages = "soundsystem") ：扫描指定包下的
@ComponentScan(basePackageClasses = CDPlayerConfig.class)：扫描这个类对应包下的，可以一个包创建一个空标记出接口，然后就不用担心代码重构问题（改包名什么的）
 */

// 会扫描这个包下的所有类
@ComponentScan
public class CDPlayerConfig {

}
