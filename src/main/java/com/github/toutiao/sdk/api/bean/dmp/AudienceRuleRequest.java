package com.github.toutiao.sdk.api.bean.dmp;

import lombok.Data;

import java.util.List;

@Data
public class AudienceRuleRequest {
    Long advertiser_id;
    String tag;
    String name;
    String profile_type;
    List<Object> profiles;

    public static class Pda {
        String behavior_code;
        String days;
        String dpa_id;
    }

    public static class Motor {
        String brand_id;
    }

    public static class Education {
        String education_id;
    }

    public static class Travel {
        String travel_id;
    }
}
