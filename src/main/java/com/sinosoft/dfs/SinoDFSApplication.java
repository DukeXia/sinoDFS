package com.sinosoft.dfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SinoDFSApplication {
    public static void main (String [] args) {
        SpringApplication application=new SpringApplication(SinoDFSApplication.class);
//       /**
//         * Banner.Mode.OFF:关闭
//         * Banner.Mode.CONSOLE:控制台输出，默认方式
//         * Banner.Mode.LOG：日志输出方式
//         */
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

    }
}
