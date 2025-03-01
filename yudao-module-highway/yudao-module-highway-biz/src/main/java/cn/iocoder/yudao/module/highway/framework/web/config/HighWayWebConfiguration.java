package cn.iocoder.yudao.module.highway.framework.web.config;

import cn.iocoder.yudao.framework.swagger.config.YudaoSwaggerAutoConfiguration;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * highway 模块的 web 组件的 Configuration
 *
 * @author 研制担当
 */
@Configuration(proxyBeanMethods = false)
public class HighWayWebConfiguration {

    /**
     * highway 模块的 API 分组
     */
    @Bean
    public GroupedOpenApi highwayGroupedOpenApi() {
        return YudaoSwaggerAutoConfiguration.buildGroupedOpenApi("highway");
    }

}
