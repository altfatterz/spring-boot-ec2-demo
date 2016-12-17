package com.example;

/**
 * @author Zoltan Altfatter
 */
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ApplicationInfoBean {

    @Value("${instance-id:N/A}")
    private String instanceId;

    @Value("${public-ipv4:N/A}")
    private String publicIp;

    @Value("${local-ipv4:N/A}")
    private String privateIp;

}