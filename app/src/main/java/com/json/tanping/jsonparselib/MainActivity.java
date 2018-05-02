package com.json.tanping.jsonparselib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import gb.tp.gson.BooleanTypeAdapter;
import gb.tp.gson.GsonBuilderFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Gson gson =  GsonBuilderFactory.createDefaultBuild().create();


        String json = "{\t\"statusCode\": 200,\t\"result\": {\t\t\"BaseInfo\": {\t\t\t\"goods_id\": \"495188\",\t\t\t\"goods_sn\": \"196897303\",\t\t\t\"cat_id\": \"473\",\t\t\t\"cat_name\": \"Tops\",\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343347137075.jpg\",\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\"url_mdesc\": \"http://app-yoshop.com.a.s1cg.egomsl.com/mitem/m-description?&goods_id=495188&wid=2&lang=en\",\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773897265288.JPG\",\t\t\t\"brand\": \"icecooream\",\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164206_84260.JPG\",\t\t\t\"group_goods_id\": \"495187\",\t\t\t\"goods_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\"is_delete\": \"0\",\t\t\t\"is_free_shipping\": \"1\",\t\t\t\"goods_weight\": \"0.370\",\t\t\t\"goods_volume_weight\": \"0.370\",\t\t\t\"delivery_time\": \"Processing Time: Ships within 5-10 business days.\",\t\t\t\"img_type\": \"2\",\t\t\t\"img_width\": \"1200\",\t\t\t\"img_height\": \"1596\",\t\t\t\"delivery_level\": \"2\",\t\t\t\"supplier_code\": \"WGC3489\",\t\t\t\"discount\": \"66\",\t\t\t\"show_discount_icon\": \"0\",\t\t\t\"wid\": \"2\",\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\"warehouse_name\": \"Ship from Global\",\t\t\t\"market_price\": \"52.50\",\t\t\t\"shop_price\": \"18.03\",\t\t\t\"goods_number\": \"100\",\t\t\t\"is_on_sale\": \"1\",\t\t\t\"is_app_price\": 0,\t\t\t\"app_save_price\": 0,\t\t\t\"is_promote\": \"\",\t\t\t\"promote_lv\": \"\",\t\t\t\"promote_price\": \"\",\t\t\t\"promote_start_date\": \"\",\t\t\t\"promote_end_date\": \"\",\t\t\t\"promote_remark\": \"\",\t\t\t\"store\": {\t\t\t\t\"id\": \"62\",\t\t\t\t\"code\": \"DP00000062Z\",\t\t\t\t\"name\": \"Clover\",\t\t\t\t\"pic\": \"http://public-yoshop.com.trunk.s1cg.egomsl.com/static/images/pageimg/store/storelogo.png\",\t\t\t\t\"status\": \"1\",\t\t\t\t\"level\": \"5\",\t\t\t\t\"modify\": \"1484303911\",\t\t\t\t\"created\": \"1481609796\"\t\t\t},\t\t\t\"reviewCount\": \"0\",\t\t\t\"avg_rate_all\": \"0.0\",\t\t\t\"is_Collect\": false,\t\t\t\"PicList\": [{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343347137075.jpg\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773897265288.JPG\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164206_84260.JPG\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773897265288.JPG\"\t\t\t},\t\t\t{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343763537875.jpg.webp\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773783924761.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164206_38205.JPG.webp\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773783924761.JPG.webp\"\t\t\t},\t\t\t{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343526586452.jpg.webp\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773852622268.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164206_73687.jpg.webp\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773852622268.jpg.webp\"\t\t\t},\t\t\t{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343546497694.jpg.webp\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773920465042.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164207_53691.JPG.webp\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773920465042.JPG.webp\"\t\t\t},\t\t\t{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343858294915.jpg.webp\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773184509398.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/    20161018164207_44798.JPG.webp\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773184509398.JPG.webp\"\t\t\t},\t\t\t{\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343632490773.jpg.webp\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img/1479262773592122449.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/source-img/20161018164208_89610.JPG.webp\",\t\t\t\t\"goods_img_x\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/goods-img-x/1479262773592122449.JPG.webp\"\t\t\t}],\t\t\t\"NowAttr\": {\t\t\t\t\"Size\": {\t\t\t\t\t\"attr_id\": \"107\",\t\t\t\t\t\"attr_name\": \"3XL\",\t\t\t\t\t\"code\": \"\"\t\t\t\t},\t\t\t\t\"Color\": {\t\t\t\t\t\"attr_id\": \"16\",\t\t\t\t\t\"attr_name\": \"GRAY\",\t\t\t\t\t\"code\": \"#808080\"\t\t\t\t}\t\t\t},\t\t\t\"GoodsAttr\": \"gray/3XL\",\t\t\t\"ChangeAttrList\": {\t\t\t\t\"Color\": [{\t\t\t\t\t\"goods_id\": \"495187\",\t\t\t\t\t\"goods_sn\": \"196897301\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"attr_name\": \"GRAY\",\t\t\t\t\t\"attr_id\": \"16\",\t\t\t\t\t\"type\": \"0\",\t\t\t\t\t\"goods_attr_id\": \"1556060\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751342957079923.jpg\"\t\t\t\t}],\t\t\t\t\"Size\": [{\t\t\t\t\t\"goods_id\": \"495187\",\t\t\t\t\t\"goods_sn\": \"196897301\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"attr_name\": \"5XL\",\t\t\t\t\t\"attr_id\": \"96\",\t\t\t\t\t\"type\": \"1\",\t\t\t\t\t\"goods_attr_id\": \"1556059\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"goods_thumb\": \"yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751342957079923.jpg\"\t\t\t\t},\t\t\t\t{\t\t\t\t\t\"goods_id\": \"495188\",\t\t\t\t\t\"goods_sn\": \"196897303\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"attr_name\": \"3XL\",\t\t\t\t\t\"attr_id\": \"107\",\t\t\t\t\t\"type\": \"1\",\t\t\t\t\t\"goods_attr_id\": \"1556061\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"goods_thumb\": \"yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343347137075.jpg\"\t\t\t\t},\t\t\t\t{\t\t\t\t\t\"goods_id\": \"495189\",\t\t\t\t\t\"goods_sn\": \"196897305\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"attr_name\": \"XL\",\t\t\t\t\t\"attr_id\": \"19\",\t\t\t\t\t\"type\": \"1\",\t\t\t\t\t\"goods_attr_id\": \"1556063\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"goods_thumb\": \"yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751344170561890.jpg\"\t\t\t\t}]\t\t\t},\t\t\t\"GoodsSpecs\": [{\t\t\t\t\"spec_id\": 1,\t\t\t\t\"spec_name\": \"color\",\t\t\t\t\"pdm_spec_id\": 2,\t\t\t\t\"value\": \"gray\",\t\t\t\t\"sort\": 0,\t\t\t\t\"brothers\": [{\t\t\t\t\t\"goods_id\": 495188,\t\t\t\t\t\"goods_sn\": \"196897305\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751344170561890.jpg\",\t\t\t\t\t\"pdm_spec_id\": \"2\",\t\t\t\t\t\"spec_id\": \"1\",\t\t\t\t\t\"spec_name\": \"color\",\t\t\t\t\t\"value\": \"gray\",\t\t\t\t\t\"gs_id\": \"495189_1\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"sku_spec\": \"2-332\",\t\t\t\t\t\"disabled\": 0,\t\t\t\t\t\"checked\": 1\t\t\t\t}]\t\t\t},\t\t\t{\t\t\t\t\"spec_id\": 2,\t\t\t\t\"spec_name\": \"size\",\t\t\t\t\"pdm_spec_id\": 332,\t\t\t\t\"value\": \"3XL\",\t\t\t\t\"sort\": 0,\t\t\t\t\"brothers\": [{\t\t\t\t\t\"goods_id\": 495189,\t\t\t\t\t\"goods_sn\": \"196897305\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751344170561890.jpg\",\t\t\t\t\t\"pdm_spec_id\": \"336\",\t\t\t\t\t\"spec_id\": \"2\",\t\t\t\t\t\"spec_name\": \"size\",\t\t\t\t\t\"value\": \"XL\",\t\t\t\t\t\"gs_id\": \"495189_2\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"sku_spec\": \"2-336\",\t\t\t\t\t\"disabled\": 0,\t\t\t\t\t\"checked\": 0\t\t\t\t},\t\t\t\t{\t\t\t\t\t\"goods_id\": 495188,\t\t\t\t\t\"goods_sn\": \"196897303\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751343347137075.jpg\",\t\t\t\t\t\"pdm_spec_id\": \"332\",\t\t\t\t\t\"spec_id\": \"2\",\t\t\t\t\t\"spec_name\": \"size\",\t\t\t\t\t\"value\": \"3XL\",\t\t\t\t\t\"gs_id\": \"495188_2\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"sku_spec\": \"2-332\",\t\t\t\t\t\"disabled\": 0,\t\t\t\t\t\"checked\": 1\t\t\t\t},\t\t\t\t{\t\t\t\t\t\"goods_id\": 495187,\t\t\t\t\t\"goods_sn\": \"196897301\",\t\t\t\t\t\"url_title\": \"Plus Size Flounced Pinstripe Shirt\",\t\t\t\t\t\"is_delete\": \"0\",\t\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/10/18/thumb-img/1476751342957079923.jpg\",\t\t\t\t\t\"pdm_spec_id\": \"151\",\t\t\t\t\t\"spec_id\": \"2\",\t\t\t\t\t\"spec_name\": \"size\",\t\t\t\t\t\"value\": \"5XL\",\t\t\t\t\t\"gs_id\": \"495187_2\",\t\t\t\t\t\"wid\": \"2\",\t\t\t\t\t\"is_on_sale\": \"1\",\t\t\t\t\t\"warehouse_code\": \"SZ\",\t\t\t\t\t\"sku_spec\": \"2-151\",\t\t\t\t\t\"disabled\": 0,\t\t\t\t\t\"checked\": 0\t\t\t\t}],\t\t\t\t\"size_chart_title\": \"Size C    hart>\",\t\t\t\t\"size_chart_url\": \"http://app-yoshop.com.a.s1cg.egomsl.com/mitem/m-description?&goods_id=495188&wid=2&lang=en\"\t\t\t}],\t\t\t\"GoodsSpecsNames\": \"gray/3XL\",\t\t\t\"url_share\": \"http://public-yoshop.com.trunk.s1cg.egomsl.com/item/plus-size-flounced-pinstripe-shirt-p_495188.html\",\t\t\t\"cod_fee_shipping_tip\": \"\",\t\t\t\"bundledActivity\": []\t\t},\t\t\"recommend\": {\t\t\t\"goodList\": [{\t\t\t\t\"goods_title\": \"测试YS接受多规格-网站默认标题\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 696878,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"230\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/09/20/goods-img-app/1505864396328181085.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/09/20/thumb-img/1505864286643713876.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/09/20/grid-img/1505864396389441485.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/09/20/source-img/20170920153733_74144.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/09/20/source-img/20170920153733_74144.jpg.webp\",\t\t\t\t\"shop_price\": \"34.59\",\t\t\t\t\"market_price\": \"102.1\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"66\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"Stylish Plus Size Flare Sleeve Solid Color V-Neck Blouse For Women\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 515264,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"302\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/01/15/goods-img-app/20160115171826_93840.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/01/15/thumb-img/1452820709442059155.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/01/15/grid-img/1480048844836362843.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/01/15/source-img/20160115171826_93840.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/01/15/source-img/20160115171826_93840.jpg.webp\",\t\t\t\t\"shop_price\": \"16.59\",\t\t\t\t\"market_price\": \"33.43\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"50\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"Stylish Cami Floral Embroidery Women's Sundress\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 696778,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"306\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/03/goods-img-app/1492206951903911227.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/03/thumb-img/1464898137351015876.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/03/grid-img/1492206951370421923.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/03/source-img/20160603120849_49833.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/03/source-img/20160603120849_49833.jpg.webp\",\t\t\t\t\"shop_price\": \"21.05\",\t\t\t\t\"market_price\": \"41.49\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"49\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"义乌义乌义乌义乌义乌义乌1231213\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 696850,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"153\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/08/18/goods-img-app/1503616279775100245.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/08/18/thumb-img/1503023499903786822.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/08/18/grid-img/1503616279147567091.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/08/18/source-img/20170818183124_61125.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Electronic/2017/08/18/source-img/20170818183124_61125.jpg.webp\",\t\t\t\t\"shop_price\": \"191\",\t\t\t\t\"market_price\": \"459.47\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"57\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"Stylish V-Neck Half Sleeve Plus Size Lace Women's Blouse\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 513557,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"306\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/21/goods-img-app/20160621152030_53301.JPG.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.c    om/yoshop/pdm-product-pic/Clothing/2016/06/21/thumb-img/1466464837100854675.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/21/grid-img/1480043293689368041.JPG.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/21/source-img/20160621152030_53301.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/06/21/source-img/20160621152030_53301.JPG.webp\",\t\t\t\t\"shop_price\": \"16.05\",\t\t\t\t\"market_price\": \"37.29\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"56\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"Plus Size Floral High Low Blouse\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 515899,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"306\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/09/30/goods-img-app/20160930152318_10161.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/09/30/thumb-img/1478482439968427417.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/09/30/grid-img/1481221682623386414.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/09/30/source-img/20160930152318_10161.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/09/30/source-img/20160930152318_10161.jpg.webp\",\t\t\t\t\"shop_price\": \"12.68\",\t\t\t\t\"market_price\": \"28.01\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"55\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"Stylish Bell Sleeve Pure Color Plus Size Blouse For Women\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 515254,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"345\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/02/24/goods-img-app/20160224150245_37261.JPG.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/02/24/thumb-img/1456268577960265356.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/02/24/grid-img/1480048818512634170.JPG.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/02/24/source-img/20160224150245_37261.JPG.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2016/02/24/source-img/20160224150245_37261.JPG.webp\",\t\t\t\t\"shop_price\": \"14.96\",\t\t\t\t\"market_price\": \"34.3\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"56\"\t\t\t},\t\t\t{\t\t\t\t\"goods_title\": \"测试多规格优化三期\",\t\t\t\t\"show_discount_icon\": 0,\t\t\t\t\"goods_id\": 696874,\t\t\t\t\"goods_img_w\": \"230\",\t\t\t\t\"goods_img_h\": \"230\",\t\t\t\t\"goods_img\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2017/08/30/goods-img-app/1505848852031949068.jpg.webp\",\t\t\t\t\"goods_thumb\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2017/08/31/thumb-img/1504203575085858573.jpg.webp\",\t\t\t\t\"goods_grid\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2017/08/30/grid-img/1505848852805757823.jpg.webp\",\t\t\t\t\"goods_detail\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2017/08/30/source-img/20170830094159_11820.jpg.webp\",\t\t\t\t\"goods_original\": \"https://gloimg.yoshop.com/yoshop/pdm-product-pic/Clothing/2017/08/30/source-img/20170830094159_11820.jpg.webp\",\t\t\t\t\"shop_price\": \"97.55\",\t\t\t\t\"market_price\": \"222.72\",\t\t\t\t\"wid\": 2,\t\t\t\t\"cutoff\": \"56\"\t\t\t}],\t\t\t\"totalCount\": 8,\t\t\t\"pageCount\": 1,\t\t\t\"pageSize\": 8,\t\t\t\"page\": 1\t\t},\t\t\"paydesc\": \"Pay Within 1 Hour for HUGE 5X Points Reward (50 Points = $1)\"\t},\t\"message\": \"Succuss\"}";


        try {
            DemoBean demoBean =  gson.fromJson(json ,DemoBean.class);
            demoBean.message = "x";
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

        TypeAdapter adapter = gson.getAdapter(DemoBean.class);
        ByteArrayInputStream bis = new ByteArrayInputStream(json.getBytes());
        Reader reader = new BufferedReader(new InputStreamReader(bis));
        com.google.gson.stream.JsonReader jsonReader = gson.newJsonReader(reader);

        try {
            DemoBean result = (DemoBean) adapter.read(jsonReader);
            result.message = "x";
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}