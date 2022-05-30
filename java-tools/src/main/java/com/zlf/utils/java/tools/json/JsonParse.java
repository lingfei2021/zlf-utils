package com.zlf.utils.java.tools.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class JsonParse {

    public static void main(String[] args) {
        test();
    }

    private static void test(){
        List<String> skuList = new ArrayList<>();

        JSONObject jsonObject = JSONObject.parseObject(getJson());
        JSONArray array = jsonObject.getJSONObject("hits").getJSONArray("hits");
        array.stream().forEach(hits -> {
            JSONArray channel_skus = ((JSONObject) hits).getJSONObject("_source").getJSONArray("channel_skus");
            channel_skus.stream().forEach(channel_sku -> {
                Object sku = ((JSONObject) channel_sku).get("sku");
                System.out.println(sku);
                skuList.add(sku.toString());
            });
        });
        System.out.println(StringUtils.join(skuList));
    }

    private static String getJson(){
        return "{\n" +
                "  \"took\" : 15,\n" +
                "  \"timed_out\" : false,\n" +
                "  \"_shards\" : {\n" +
                "    \"total\" : 3,\n" +
                "    \"successful\" : 3,\n" +
                "    \"skipped\" : 0,\n" +
                "    \"failed\" : 0\n" +
                "  },\n" +
                "  \"hits\" : {\n" +
                "    \"total\" : {\n" +
                "      \"value\" : 102,\n" +
                "      \"relation\" : \"eq\"\n" +
                "    },\n" +
                "    \"max_score\" : 1.0112977,\n" +
                "    \"hits\" : [\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"632101642498\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100016RDOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100743\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100743CEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091503\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091503BKOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100714\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100714WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091417\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091417WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654680101173\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091619YWOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091424\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091424BEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110870\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110870BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110870BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110870BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"652227957351\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100792BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100792BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100792BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100792BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100740\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100740WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"658061322025\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101116GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101116GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101116GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110158\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110158BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654614030048\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091439GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091439GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091328\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091328GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091328GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091328GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"653698196291\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100199WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100199WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100720\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100720WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091411\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091411YWOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"656056373964\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100024GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100024GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100024GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"651779092074\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100557BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100557BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100557BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100557BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"655154120955\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101280GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101280GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101280GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657760739129\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101050BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101050BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101050BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21111020\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21111020BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21111020BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21111020BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"647696891163\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100432GYXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100432GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657338121908\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101330OSXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101330OSS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101330OSM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657664377609\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101261BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101261BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101261BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101261BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21120789\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120789BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120789BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120789BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120789BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120789BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"661320090868\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120665BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120665BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120665BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120665BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"631747872114\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100512GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100512GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100512GYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"658265083743\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120712WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120712WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120712WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21120712WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091425\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091425BNOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091425CTOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"650673626627\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091477BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091477BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091418\",\n" +
                "        \"_score\" : 1.0112977,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091418BKOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"659116331888\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101124GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101124GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101124GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100874\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100874OEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100874OES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100874OEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"655481924819\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101411BNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101411BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101411BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101411BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"652480180379\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091630BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091630BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091630BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110670\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091434GYXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091434GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091434GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091434GYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110902\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110902BE2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110166\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110166GN2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110949\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110949BE2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657330342157\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101264OEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110513\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110513GN2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110163\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110163BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091413\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091413ATOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110819\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110819OEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110819OES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110819OEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110819OEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110819OEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654935373076\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101433BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101433BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101433BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"649256848257\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100253WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100253WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100253WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100253WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091389\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091389CYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091389CYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091389CYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"638854420041\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091618WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"626565965614\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100018BKOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100989\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100989BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"652553290199\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091385BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091385BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091385BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"652937727511\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100468BNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100468BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100468BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100468BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110503\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OSXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OSS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OSM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OSL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OSXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110503OS2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100722\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100722WEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"655946797930\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100327BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100327BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110599\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110599WE2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100713\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100713WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100713WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100713WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110966\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YWXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YWS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YWM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YWL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YWXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110966YW2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110165\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110165BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110509\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110509WE2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110500\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110500BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100748\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100748GNOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091412\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091412CEOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110065\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110065BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110998\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110998BEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110998BES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110998BEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110998BEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110998BEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654373338108\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100402YWS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100402YWM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100402YWL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657638047900\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101117BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101117BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101117BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"658950447685\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101239BEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101239BES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101239BEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101239BEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110039\",\n" +
                "        \"_score\" : 1.0093217,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RDXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RDS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RDM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RDL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RDXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110039RD2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654369092135\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100942BNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100942BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100942BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100942BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"656233596745\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100096KIXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100096KIS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100096KIM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100096KIL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"658361789495\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101315OSS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101315OSM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110511\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BKXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110511BK2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657927475916\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101049BNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101049BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101049BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"658095654789\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100820GYXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100820GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100820GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"655786021487\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091560GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091560GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091560GYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110741\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110741GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110741GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110741GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110741GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110741GNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"655765371539\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100029GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100029GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100029GYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110504\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OSXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OSS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OSM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OSL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OSXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110504OS2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"652670291611\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110454GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110454GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110454GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"650128465135\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100282PKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100282PKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100282PKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091415\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091415KIOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091414\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091414BNOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"660330779234\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110604WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110604WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110604WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091421\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091421ATOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100712\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100712YWOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110167\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110167GN2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"622128410169\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091476ATS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091476ATM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091476ATL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"654973709355\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101112GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101112GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101112GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"653654708671\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100428BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100428BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100428BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21100749\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100749BNOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21091431\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091431WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091431WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091431WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091431WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"650445488452\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091621BKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091621BKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091621BKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21091621BKL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657616857115\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100787PKXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100787PKS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100787PKM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110928\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110928GYXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110928GYS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110928GYM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110928GYL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110928GYXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA211229019\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA211229019BKOS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110550\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110550OSXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110550OSS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110550OSM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110550OSL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110550OSXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"OA21110125\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WEXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WES\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110125WE2XL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"653446383637\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101115BNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101115BNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21101115BNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"657760911089\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100721GNXS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100721GNS\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100721GNM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100721GNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21100721GNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"_index\" : \"idx_product\",\n" +
                "        \"_type\" : \"_doc\",\n" +
                "        \"_id\" : \"656368982744\",\n" +
                "        \"_score\" : 1.0025594,\n" +
                "        \"_source\" : {\n" +
                "          \"channel_skus\" : [\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110665BNL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110665BNXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110665WEM\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110665WEL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"sku\" : \"OA21110665WEXL\",\n" +
                "              \"channel_id\" : \"4\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}\n";
    }
}