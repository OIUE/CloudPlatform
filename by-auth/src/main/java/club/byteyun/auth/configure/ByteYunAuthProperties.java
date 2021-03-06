package club.byteyun.auth.configure;

import club.byteyun.auth.properties.ByteYunClientsProperties;
import club.byteyun.auth.properties.ValidateCodeProperties;
import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @version 1.0
 * @ClassName ByteYunAuthProperties
 * @Description //TODO Auth相关配置类
 * @Date 14:55 2020/4/30
 * @Author lql
 **/
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:by-cloud-auth.properties"})
@ConfigurationProperties(prefix = "by-cloud.auth")
public class ByteYunAuthProperties
{
    private ByteYunClientsProperties[] clients = {}; // 配置以数组的形式容纳多个clients形式的配置
    private int accessTokenValiditySeconds = 60 * 60 * 24; // access_token有效时间
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7; // refresh_token有效时间

    private String anonUrl; //不要认证放行URL

    private ValidateCodeProperties code = new ValidateCodeProperties(); //验证码配置类
}
