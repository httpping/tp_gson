package com.json.tanping.jsonparselib;

import java.util.List;

public class DemoBean {


    public int statusCode;
    public ResultBean result;
    public String message;

    public static class ResultBean {
        public BaseInfoBean BaseInfo;
        public RecommendBean recommend;
        public String paydesc;

        public static class BaseInfoBean {
            public String goods_id;
            public String goods_sn;
            public String cat_id;
            public String cat_name;
            public String goods_thumb;
            public String url_title;
            public String url_mdesc;
            public String goods_img;
            public String brand;
            public String goods_original;
            public String group_goods_id;
            public String goods_title;
            public String is_delete;
            public String is_free_shipping;
            public String goods_weight;
            public String goods_volume_weight;
            public String delivery_time;
            public String img_type;
            public String img_width;
            public String img_height;
            public String delivery_level;
            public String supplier_code;
            public String discount;
            public String show_discount_icon;
            public String wid;
            public String warehouse_code;
            public String warehouse_name;
            public String market_price;
            public String shop_price;
            public String goods_number;
            public String is_on_sale;
            public int is_app_price;
            public int app_save_price;
            public String is_promote;
            public String promote_lv;
            public String promote_price;
            public String promote_start_date;
            public String promote_end_date;
            public String promote_remark;
            public List<StoreBean> store;
            public String reviewCount;
            public String avg_rate_all;
            public boolean is_Collect;
            public NowAttrBean NowAttr;
            public String GoodsAttr;
            public ChangeAttrListBean ChangeAttrList;
            public String GoodsSpecsNames;
            public String url_share;
            public String cod_fee_shipping_tip;
            public PicListBean  PicList;
            public List<GoodsSpecsBean> GoodsSpecs;
            public List<?> bundledActivity;

            public static class StoreBean {
                public String id;
                public String code;
                public String name;
                public String pic;
                public String status;
                public String level;
                public String modify;
                public String created;
            }

            public static class NowAttrBean {
                public SizeBean Size;
                public ColorBean Color;

                public static class SizeBean {
                    public String attr_id;
                    public String attr_name;
                    public String code;
                }

                public static class ColorBean {
                    public String attr_id;
                    public String attr_name;
                    public String code;
                }
            }

            public static class ChangeAttrListBean {
                public List<ColorBeanX> Color;
                public List<SizeBeanX> Size;

                public static class ColorBeanX {
                    public String goods_id;
                    public String goods_sn;
                    public String url_title;
                    public String is_delete;
                    public String attr_name;
                    public String attr_id;
                    public String type;
                    public String goods_attr_id;
                    public String is_on_sale;
                    public String wid;
                    public String warehouse_code;
                    public String goods_thumb;
                }

                public static class SizeBeanX {
                    public String goods_id;
                    public String goods_sn;
                    public String url_title;
                    public String is_delete;
                    public String attr_name;
                    public String attr_id;
                    public String type;
                    public String goods_attr_id;
                    public String is_on_sale;
                    public String wid;
                    public String warehouse_code;
                    public String goods_thumb;
                }
            }

            public static class PicListBean {
                public String goods_thumb;
                public String goods_img;
                public String goods_original;
                public String goods_img_x;
            }

            public static class GoodsSpecsBean {
                public int spec_id;
                public String spec_name;
                public int pdm_spec_id;
                public String value;
                public int sort;
                public String size_chart_title;
                public String size_chart_url;
                public List<BrothersBean> brothers;

                public static class BrothersBean {
                    public int goods_id;
                    public String goods_sn;
                    public String url_title;
                    public String is_delete;
                    public String goods_thumb;
                    public String pdm_spec_id;
                    public String spec_id;
                    public String spec_name;
                    public String value;
                    public String gs_id;
                    public String wid;
                    public String is_on_sale;
                    public String warehouse_code;
                    public String sku_spec;
                    public int disabled;
                    public int checked;
                }
            }
        }

        public static class RecommendBean {
            public int totalCount;
            public int pageCount;
            public int pageSize;
            public int page;
            public List<GoodListBean> goodList;

            public static class GoodListBean {
                public String goods_title;
                public int show_discount_icon;
                public int goods_id;
                public String goods_img_w;
                public String goods_img_h;
                public String goods_img;
                public String goods_thumb;
                public String goods_grid;
                public String goods_detail;
                public String goods_original;
                public String shop_price;
                public String market_price;
                public int wid;
                public String cutoff;
            }
        }
    }
}
