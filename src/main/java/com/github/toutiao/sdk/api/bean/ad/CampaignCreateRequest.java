package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CampaignCreateRequest extends BaseModel {
    private Long advertiser_id;
    private String campaign_name;
    private String budget_mode;
    private BigDecimal budget;
    private String landing_type;

}
