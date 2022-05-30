package com.zlf.utils.java.tools.json;

import com.alibaba.fastjson.JSON;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class JsonTest {

    public static void main(String[] args) {
//        test();
//        test1();
        test2();
    }
    private static void test1(){
        String j = null;
        String s = JSON.toJSONString(j);
        System.out.println(s);
    }

    private static void test(){
        String json = getJson();
        List<AttrVo> attrVos = JSON.parseArray(json, AttrVo.class);
        System.out.println(attrVos.size());

        /**
         * INSERT INTO `ATTRIBUTE_NAME_ITEM` (`id`, `cn_title`, `en_title`)
         * VALUES
         * 	(1727,'Dresses','1727'),
         * 	(1727,'Dresses','1727')
         */

//        String sql = "INSERT INTO `ATTRIBUTE_NAME_ITEM` (`id`, `cn_title`, `en_title`) VALUES ";
        String sql = "INSERT INTO `ATTRIBUTE_VALUE_ITEM` (`name_id`, `cn_title`, `en_title`) VALUES ";
        for (int i = 0; i < attrVos.size(); i++) {
            AttrVo attrVo = attrVos.get(i);
//            System.out.println(attrVo);
//            System.out.println(sql+" ("+(i+1)+", '"+attrVo.getName()+"', '"+attrVo.getEnName()+"');");
            int p = i+1;
            List<AttrVo> children = attrVo.getChildren();
            if(!CollectionUtils.isEmpty(children)){
                for (int i1 = 0; i1 < children.size(); i1++) {
                    AttrVo attrVo1 = children.get(i1);
                    System.out.println(sql+" ("+p+", '"+attrVo1.getName()+"', '"+attrVo1.getEnName()+"');");
                }
            }
        }


    }
    private static String getJson(){
        return "      \n" +
                "[\n" +
                "    {\n" +
                "        \"id\": \"31\",\n" +
                "        \"enName\": \"Details\",\n" +
                "        \"name\": \"细节\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"77\",\n" +
                "                \"enName\": \"Appliques\",\n" +
                "                \"name\": \"贴花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"102\",\n" +
                "                \"enName\": \"Beaded\",\n" +
                "                \"name\": \"钉珠\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"106\",\n" +
                "                \"enName\": \"Belted\",\n" +
                "                \"name\": \"腰带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"131\",\n" +
                "                \"enName\": \"Bow\",\n" +
                "                \"name\": \"蝴蝶结\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"202\",\n" +
                "                \"enName\": \"Contrast Mesh\",\n" +
                "                \"name\": \"网拼接\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"210\",\n" +
                "                \"enName\": \"Corset\",\n" +
                "                \"name\": \"腰封\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"221\",\n" +
                "                \"enName\": \"Criss Cross\",\n" +
                "                \"name\": \"交叉带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"230\",\n" +
                "                \"enName\": \"Cut Out\",\n" +
                "                \"name\": \"镂空\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"250\",\n" +
                "                \"enName\": \"Drawstring\",\n" +
                "                \"name\": \"抽绳\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"258\",\n" +
                "                \"enName\": \"Embroidery\",\n" +
                "                \"name\": \"绣花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"310\",\n" +
                "                \"enName\": \"Fringe\",\n" +
                "                \"name\": \"流苏\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"355\",\n" +
                "                \"enName\": \"High Low\",\n" +
                "                \"name\": \"前短后长\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"386\",\n" +
                "                \"enName\": \"Knot\",\n" +
                "                \"name\": \"打结\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"389\",\n" +
                "                \"enName\": \"Lace Up\",\n" +
                "                \"name\": \"系带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"402\",\n" +
                "                \"enName\": \"Lettuce Trim\",\n" +
                "                \"name\": \"木耳边\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"431\",\n" +
                "                \"enName\": \"Metal\",\n" +
                "                \"name\": \"金属\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"494\",\n" +
                "                \"enName\": \"Patched\",\n" +
                "                \"name\": \"贴布\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"501\",\n" +
                "                \"enName\": \"Pearls\",\n" +
                "                \"name\": \"珍珠\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"519\",\n" +
                "                \"enName\": \"Pleated\",\n" +
                "                \"name\": \"打褶\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"521\",\n" +
                "                \"enName\": \"Pocket\",\n" +
                "                \"name\": \"口袋\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"550\",\n" +
                "                \"enName\": \"Rhinestone\",\n" +
                "                \"name\": \"水钻\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"552\",\n" +
                "                \"enName\": \"Ribbon\",\n" +
                "                \"name\": \"缎带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"554\",\n" +
                "                \"enName\": \"Ripped\",\n" +
                "                \"name\": \"破洞\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"559\",\n" +
                "                \"enName\": \"Round\",\n" +
                "                \"name\": \"圆形\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"565\",\n" +
                "                \"enName\": \"Ruffle\",\n" +
                "                \"name\": \"荷叶边\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"574\",\n" +
                "                \"enName\": \"Scallop\",\n" +
                "                \"name\": \"扇型\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"586\",\n" +
                "                \"enName\": \"Sheer\",\n" +
                "                \"name\": \"透视\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"625\",\n" +
                "                \"enName\": \"Split\",\n" +
                "                \"name\": \"开衩\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"651\",\n" +
                "                \"enName\": \"Studded\",\n" +
                "                \"name\": \"钉扣\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"679\",\n" +
                "                \"enName\": \"Tie Back\",\n" +
                "                \"name\": \"后背系带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"681\",\n" +
                "                \"enName\": \"Tie Neck\",\n" +
                "                \"name\": \"系带领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"705\",\n" +
                "                \"enName\": \"Twist\",\n" +
                "                \"name\": \"扭结\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1082\",\n" +
                "                \"enName\": \"Rib-Knit\",\n" +
                "                \"name\": \"罗纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1083\",\n" +
                "                \"enName\": \"Shoulder Pads\",\n" +
                "                \"name\": \"垫肩\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1087\",\n" +
                "                \"enName\": \"Washed\",\n" +
                "                \"name\": \"水洗牛仔\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1564\",\n" +
                "                \"enName\": \"Shirred\",\n" +
                "                \"name\": \"打揽\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1569\",\n" +
                "                \"enName\": \"Tie Front\",\n" +
                "                \"name\": \"前绑带蝴蝶结\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1570\",\n" +
                "                \"enName\": \"Button Front\",\n" +
                "                \"name\": \"前排扣\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1961\",\n" +
                "                \"enName\": \"Luminous\",\n" +
                "                \"name\": \"发光\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"2464\",\n" +
                "                \"enName\": \"Embellished\",\n" +
                "                \"name\": \"点缀\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"2465\",\n" +
                "                \"enName\": \"Taping Border\",\n" +
                "                \"name\": \"镶边\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"35\",\n" +
                "        \"enName\": \"Occasion\",\n" +
                "        \"name\": \"商品场合\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"240071076\",\n" +
                "                \"enName\": \"Work\",\n" +
                "                \"name\": \"工作\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240071078\",\n" +
                "                \"enName\": \"Vacation\",\n" +
                "                \"name\": \"度假\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240071079\",\n" +
                "                \"enName\": \"Night Out\",\n" +
                "                \"name\": \"夜出\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240071080\",\n" +
                "                \"enName\": \"Party\",\n" +
                "                \"name\": \"派对聚会\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240071082\",\n" +
                "                \"enName\": \"Sports\",\n" +
                "                \"name\": \"运动\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240092266\",\n" +
                "                \"enName\": \"Class\",\n" +
                "                \"name\": \"上学\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240092267\",\n" +
                "                \"enName\": \"WeddingGuest\",\n" +
                "                \"name\": \"出席婚礼\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240092268\",\n" +
                "                \"enName\": \"Comfy\",\n" +
                "                \"name\": \"居家\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"39\",\n" +
                "        \"enName\": \"Fabric\",\n" +
                "        \"name\": \"面料弹性\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"279\",\n" +
                "                \"enName\": \"Non-stretch\",\n" +
                "                \"name\": \"无弹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"280\",\n" +
                "                \"enName\": \"Slight Stretch\",\n" +
                "                \"name\": \"微弹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"281\",\n" +
                "                \"enName\": \"High Stretch\",\n" +
                "                \"name\": \"高弹\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"40\",\n" +
                "        \"enName\": \"Fit Type\",\n" +
                "        \"name\": \"合身类型\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"412\",\n" +
                "                \"enName\": \"Shift\",\n" +
                "                \"name\": \"宽松\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"481\",\n" +
                "                \"enName\": \"Oversized\",\n" +
                "                \"name\": \"大码\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"547\",\n" +
                "                \"enName\": \"Regular Fit\",\n" +
                "                \"name\": \"常规\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"607\",\n" +
                "                \"enName\": \"Skinny\",\n" +
                "                \"name\": \"紧身\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"613\",\n" +
                "                \"enName\": \"Slim Fit\",\n" +
                "                \"name\": \"修身\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"54\",\n" +
                "        \"enName\": \"Length\",\n" +
                "        \"name\": \"长度\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"61\",\n" +
                "                \"enName\": \"Above Knee\",\n" +
                "                \"name\": \"膝上\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"160\",\n" +
                "                \"enName\": \"Capris\",\n" +
                "                \"name\": \"七分裤\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"224\",\n" +
                "                \"enName\": \"Crop\",\n" +
                "                \"name\": \"短款/九分\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"384\",\n" +
                "                \"enName\": \"Knee Length\",\n" +
                "                \"name\": \"及膝\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"424\",\n" +
                "                \"enName\": \"Maxi\",\n" +
                "                \"name\": \"超长\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"436\",\n" +
                "                \"enName\": \"Midi\",\n" +
                "                \"name\": \"中长\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"438\",\n" +
                "                \"enName\": \"Mini\",\n" +
                "                \"name\": \"迷你\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"546\",\n" +
                "                \"enName\": \"Regular\",\n" +
                "                \"name\": \"常规款\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"591\",\n" +
                "                \"enName\": \"Short\",\n" +
                "                \"name\": \"短\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"62\",\n" +
                "        \"enName\": \"Material/Composition\",\n" +
                "        \"name\": \"材质/成分\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"63\",\n" +
                "                \"enName\": \"Acrylic\",\n" +
                "                \"name\": \"腈纶\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"175\",\n" +
                "                \"enName\": \"Chiffon\",\n" +
                "                \"name\": \"雪纺\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"208\",\n" +
                "                \"enName\": \"Corduroy\",\n" +
                "                \"name\": \"灯芯绒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"212\",\n" +
                "                \"enName\": \"Cotton\",\n" +
                "                \"name\": \"棉\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"238\",\n" +
                "                \"enName\": \"Denim\",\n" +
                "                \"name\": \"牛仔布\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"295\",\n" +
                "                \"enName\": \"Flannel\",\n" +
                "                \"name\": \"法兰绒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"300\",\n" +
                "                \"enName\": \"Fleece\",\n" +
                "                \"name\": \"摇粒绒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"388\",\n" +
                "                \"enName\": \"Lace\",\n" +
                "                \"name\": \"蕾丝\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"396\",\n" +
                "                \"enName\": \"Leather Cloak\",\n" +
                "                \"name\": \"仿皮\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"397\",\n" +
                "                \"enName\": \"Faux Leather/PU\",\n" +
                "                \"name\": \"人造皮革/PU\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"429\",\n" +
                "                \"enName\": \"Mesh\",\n" +
                "                \"name\": \"网纱\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"440\",\n" +
                "                \"enName\": \"Modal\",\n" +
                "                \"name\": \"莫代尔\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"526\",\n" +
                "                \"enName\": \"Polyester\",\n" +
                "                \"name\": \"涤纶\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"543\",\n" +
                "                \"enName\": \"Rayon\",\n" +
                "                \"name\": \"人棉\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"573\",\n" +
                "                \"enName\": \"Satin\",\n" +
                "                \"name\": \"色丁\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"621\",\n" +
                "                \"enName\": \"Spandex\",\n" +
                "                \"name\": \"氨纶\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"653\",\n" +
                "                \"enName\": \"Suede\",\n" +
                "                \"name\": \"麂皮绒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"703\",\n" +
                "                \"enName\": \"Tweed\",\n" +
                "                \"name\": \"粗花毛呢\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"871\",\n" +
                "                \"enName\": \"Coral Velvet\",\n" +
                "                \"name\": \"珊瑚绒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1066\",\n" +
                "                \"enName\": \"Tencel\",\n" +
                "                \"name\": \"天丝\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1128\",\n" +
                "                \"enName\": \"Emulation Silk\",\n" +
                "                \"name\": \"仿真丝\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1363\",\n" +
                "                \"enName\": \"Nonwoven Cloth\",\n" +
                "                \"name\": \"无纺布\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1740\",\n" +
                "                \"enName\": \"Sirospun\",\n" +
                "                \"name\": \"赛络纺\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1819\",\n" +
                "                \"enName\": \"Cupro\",\n" +
                "                \"name\": \"铜氨\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1820\",\n" +
                "                \"enName\":\"Nylon\",\n" +
                "                \"name\":\"尼龙\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"66\",\n" +
                "        \"enName\": \"Neckline\",\n" +
                "        \"name\": \"领型\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"84\",\n" +
                "                \"enName\": \"Asymmetrical Neck\",\n" +
                "                \"name\": \"斜肩领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"120\",\n" +
                "                \"enName\": \"Boat Neck\",\n" +
                "                \"name\": \"船领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"188\",\n" +
                "                \"enName\": \"Cocoon\",\n" +
                "                \"name\": \"包领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"198\",\n" +
                "                \"enName\": \"Contrast Collar\",\n" +
                "                \"name\": \"拼接领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"220\",\n" +
                "                \"enName\": \"Crew Neck\",\n" +
                "                \"name\": \"小圆领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"236\",\n" +
                "                \"enName\": \"Deep V Neck\",\n" +
                "                \"name\": \"深V领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"247\",\n" +
                "                \"enName\": \"Drape Neck\",\n" +
                "                \"name\": \"垂领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"346\",\n" +
                "                \"enName\": \"Halter\",\n" +
                "                \"name\": \"挂脖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"352\",\n" +
                "                \"enName\": \"Heart Shape\",\n" +
                "                \"name\": \"心形\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"356\",\n" +
                "                \"enName\": \"High Neck\",\n" +
                "                \"name\": \"高领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"362\",\n" +
                "                \"enName\": \"Hooded\",\n" +
                "                \"name\": \"连帽\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"390\",\n" +
                "                \"enName\": \"Lapel\",\n" +
                "                \"name\": \"西装领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"420\",\n" +
                "                \"enName\": \"Mandarin Collar\",\n" +
                "                \"name\": \"旗袍领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"469\",\n" +
                "                \"enName\": \"Off the Shoulder\",\n" +
                "                \"name\": \"露肩\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"472\",\n" +
                "                \"enName\": \"One Shoulder\",\n" +
                "                \"name\": \"单肩\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"560\",\n" +
                "                \"enName\": \"Round Neck\",\n" +
                "                \"name\": \"圆领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"632\",\n" +
                "                \"enName\": \"Square Neck\",\n" +
                "                \"name\": \"方领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"634\",\n" +
                "                \"enName\": \"Stand Collar\",\n" +
                "                \"name\": \"小立领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"644\",\n" +
                "                \"enName\": \"Strapless\",\n" +
                "                \"name\": \"抹胸\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"646\",\n" +
                "                \"enName\": \"Straps\",\n" +
                "                \"name\": \"背带\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"724\",\n" +
                "                \"enName\": \"V Neck\",\n" +
                "                \"name\": \"v领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"737\",\n" +
                "                \"enName\": \"Waterfall\",\n" +
                "                \"name\": \"大翻领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1071\",\n" +
                "                \"enName\": \"Baseball Collar\",\n" +
                "                \"name\": \"棒球领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1072\",\n" +
                "                \"enName\": \"Sailor Collar\",\n" +
                "                \"name\": \"水手领\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1073\",\n" +
                "                \"enName\": \"Polo\",\n" +
                "                \"name\": \"polo领\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"73\",\n" +
                "        \"enName\": \"Pattern Type\",\n" +
                "        \"name\": \"图案\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"70\",\n" +
                "                \"enName\": \"Animal\",\n" +
                "                \"name\": \"动物\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"163\",\n" +
                "                \"enName\": \"Cartoon\",\n" +
                "                \"name\": \"卡通\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"174\",\n" +
                "                \"enName\": \"Chevron\",\n" +
                "                \"name\": \"波纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"195\",\n" +
                "                \"enName\": \"Colorblock\",\n" +
                "                \"name\": \"撞色\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"226\",\n" +
                "                \"enName\": \"Cross\",\n" +
                "                \"name\": \"交叉\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"240\",\n" +
                "                \"enName\": \"Distressed\",\n" +
                "                \"name\": \"仿旧\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"290\",\n" +
                "                \"enName\": \"Feather\",\n" +
                "                \"name\": \"羽毛\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"293\",\n" +
                "                \"enName\": \"Figure\",\n" +
                "                \"name\": \"人像\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"303\",\n" +
                "                \"enName\": \"Floral\",\n" +
                "                \"name\": \"花朵印花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"316\",\n" +
                "                \"enName\": \"Galaxy\",\n" +
                "                \"name\": \"星空印花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"332\",\n" +
                "                \"enName\": \"Graphic\",\n" +
                "                \"name\": \"绘图\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"351\",\n" +
                "                \"enName\": \"Heart\",\n" +
                "                \"name\": \"心\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"400\",\n" +
                "                \"enName\": \"Leopard\",\n" +
                "                \"name\": \"豹纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"401\",\n" +
                "                \"enName\": \"Letter\",\n" +
                "                \"name\": \"字母\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"495\",\n" +
                "                \"enName\": \"Patchwork\",\n" +
                "                \"name\": \"色块拼接\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"514\",\n" +
                "                \"enName\": \"Plaid\",\n" +
                "                \"name\": \"格子\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"515\",\n" +
                "                \"enName\": \"Plain\",\n" +
                "                \"name\": \"纯色\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"524\",\n" +
                "                \"enName\": \"Polka Dot\",\n" +
                "                \"name\": \"圆点\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"635\",\n" +
                "                \"enName\": \"Star\",\n" +
                "                \"name\": \"星星\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"649\",\n" +
                "                \"enName\": \"Striped\",\n" +
                "                \"name\": \"条纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"680\",\n" +
                "                \"enName\": \"Tie Dye\",\n" +
                "                \"name\": \"扎染\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"766\",\n" +
                "                \"enName\": \"Zebra Print\",\n" +
                "                \"name\": \"斑马纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"899\",\n" +
                "                \"enName\": \"Camo\",\n" +
                "                \"name\": \"迷彩图案\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1131\",\n" +
                "                \"enName\": \"Plants\",\n" +
                "                \"name\": \"植物\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1476\",\n" +
                "                \"enName\": \"Slogan\",\n" +
                "                \"name\": \"标语\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1531\",\n" +
                "                \"enName\": \"Chain Print\",\n" +
                "                \"name\": \"链条印花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1532\",\n" +
                "                \"enName\": \"Scarf Print\",\n" +
                "                \"name\": \"丝巾印花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1559\",\n" +
                "                \"enName\": \"Ditsy Floral\",\n" +
                "                \"name\": \"小碎花\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1636\",\n" +
                "                \"enName\": \"Rainbow Stripe\",\n" +
                "                \"name\": \"彩虹条纹\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1826\",\n" +
                "                \"enName\": \"All Over Print\",\n" +
                "                \"name\": \"全身印花\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"77\",\n" +
                "        \"enName\": \"Season\",\n" +
                "        \"name\": \"季节\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"284\",\n" +
                "                \"enName\": \"Fall\",\n" +
                "                \"name\": \"秋\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"630\",\n" +
                "                \"enName\": \"Spring\",\n" +
                "                \"name\": \"春\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"654\",\n" +
                "                \"enName\": \"Summer\",\n" +
                "                \"name\": \"夏\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"744\",\n" +
                "                \"enName\": \"Winter\",\n" +
                "                \"name\": \"冬\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"90\",\n" +
                "        \"enName\": \"Sleeve Length\",\n" +
                "        \"name\": \"袖长\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"344\",\n" +
                "                \"enName\": \"Half Sleeve\",\n" +
                "                \"name\": \"半袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"409\",\n" +
                "                \"enName\": \"Long Sleeve\",\n" +
                "                \"name\": \"长袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"592\",\n" +
                "                \"enName\": \"Short Sleeve\",\n" +
                "                \"name\": \"短袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"612\",\n" +
                "                \"enName\": \"Sleeveless\",\n" +
                "                \"name\": \"无袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"678\",\n" +
                "                \"enName\": \"Three Quarter Length Sleeve\",\n" +
                "                \"name\": \"七分袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1078\",\n" +
                "                \"enName\": \"Extra-Long Sleeve\",\n" +
                "                \"name\": \"超长袖\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"92\",\n" +
                "        \"enName\": \"Sleeve Type\",\n" +
                "        \"name\": \"袖型\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"100\",\n" +
                "                \"enName\": \"Batwing Sleeve\",\n" +
                "                \"name\": \"蝙蝠袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"104\",\n" +
                "                \"enName\": \"Bell Sleeve\",\n" +
                "                \"name\": \"喇叭袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"111\",\n" +
                "                \"enName\": \"Bishop Sleeve\",\n" +
                "                \"name\": \"灯笼袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"145\",\n" +
                "                \"enName\": \"Butterfly Sleeve\",\n" +
                "                \"name\": \"蝴蝶袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"304\",\n" +
                "                \"enName\": \"Flounce Sleeve\",\n" +
                "                \"name\": \"荷叶袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"541\",\n" +
                "                \"enName\": \"Raglan Sleeve\",\n" +
                "                \"name\": \"插肩袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"557\",\n" +
                "                \"enName\": \"Roll Up Sleeve\",\n" +
                "                \"name\": \"卷袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"627\",\n" +
                "                \"enName\": \"Split Sleeve\",\n" +
                "                \"name\": \"开衩袖\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"892\",\n" +
                "                \"enName\": \"Regular Sleeve\",\n" +
                "                \"name\": \"常规袖\"\n" +
                "            }, {\n" +
                "                \"id\": \"240092847\",\n" +
                "                \"enName\": \"Puff Sleeve\",\n" +
                "                \"name\": \"泡泡袖\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"101\",\n" +
                "        \"enName\": \"Style\",\n" +
                "        \"name\": \"风格\",\n" +
                "        \"children\": [{\n" +
                "                \"id\": \"785\",\n" +
                "                \"enName\": \"Essential\",\n" +
                "                \"name\": \"基础款\"\n" +
                "            }, {\n" +
                "                \"id\": \"786\",\n" +
                "                \"enName\": \"Statement\",\n" +
                "                \"name\": \"时尚款\"\n" +
                "            },{\n" +
                "                \"id\": \"787\",\n" +
                "                \"enName\": \"Party\",\n" +
                "                \"name\": \"派对\"\n" +
                "            },{\n" +
                "                \"id\": \"789\",\n" +
                "                \"enName\": \"Winter Collection\",\n" +
                "                \"name\": \" 冬季款\"\n" +
                "            },{\n" +
                "                \"id\": \"790\",\n" +
                "                \"enName\": \"Sets Collection\",\n" +
                "                \"name\": \"套装\"\n" +
                "            },{\n" +
                "                \"id\": \"791\",\n" +
                "                \"enName\": \"Premium Material\",\n" +
                "                \"name\": \"羊绒和羊毛\"\n" +
                "            },{\n" +
                "                \"id\": \"792\",\n" +
                "                \"enName\": \"Street Essential\",\n" +
                "                \"name\": \"街头休闲\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"109\",\n" +
                "        \"enName\": \"Type\",\n" +
                "        \"name\": \"类型\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"59\",\n" +
                "                \"enName\": \"A Line\",\n" +
                "                \"name\": \"A 字\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"60\",\n" +
                "                \"enName\": \"Abayas\",\n" +
                "                \"name\": \"长袍\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"83\",\n" +
                "                \"enName\": \"Asymmetrical\",\n" +
                "                \"name\": \"不对称\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"107\",\n" +
                "                \"enName\": \"Bermuda\",\n" +
                "                \"name\": \"中裤\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"123\",\n" +
                "                \"enName\": \"Bodycon\",\n" +
                "                \"name\": \"包臀\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"639\",\n" +
                "                \"enName\": \"Stirrup\",\n" +
                "                \"name\": \"踩脚\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"642\",\n" +
                "                \"enName\": \"Straight\",\n" +
                "                \"name\": \"直筒\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"669\",\n" +
                "                \"enName\": \"Tapered/Carrot\",\n" +
                "                \"name\": \"锥形裤\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"685\",\n" +
                "                \"enName\": \"Tights\",\n" +
                "                \"name\": \"紧身裤\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"767\",\n" +
                "                \"enName\": \"Zip Up\",\n" +
                "                \"name\": \"开襟\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"935\",\n" +
                "                \"enName\": \"Circle\",\n" +
                "                \"name\": \"阔摆裙\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1555\",\n" +
                "                \"enName\": \"Unitard\",\n" +
                "                \"name\": \"紧身连体衣型\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1713\",\n" +
                "                \"enName\": \"Lengthening\",\n" +
                "                \"name\": \"加长型\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"113\",\n" +
                "        \"enName\": \"Waist Line\",\n" +
                "        \"name\": \"腰线\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"253\",\n" +
                "                \"enName\": \"Drop Waist\",\n" +
                "                \"name\": \"低腰\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"357\",\n" +
                "                \"enName\": \"High Waist\",\n" +
                "                \"name\": \"高腰\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"454\",\n" +
                "                \"enName\": \"Natural\",\n" +
                "                \"name\": \"常规\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"129\",\n" +
                "        \"enName\": \"Hem Shaped\",\n" +
                "        \"name\": \"下摆形状\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"296\",\n" +
                "                \"enName\": \"Flare Leg\",\n" +
                "                \"name\": \"喇叭褲\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"297\",\n" +
                "                \"enName\": \"Flared\",\n" +
                "                \"name\": \"喇叭状\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"753\",\n" +
                "                \"enName\": \"Wrap\",\n" +
                "                \"name\": \"交叉\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"894\",\n" +
                "                \"enName\": \"Ball Gown\",\n" +
                "                \"name\": \"超大裙摆\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"896\",\n" +
                "                \"enName\": \"Mermaid\",\n" +
                "                \"name\": \"鱼尾\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"897\",\n" +
                "                \"enName\": \"Slit\",\n" +
                "                \"name\": \"开叉\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"921\",\n" +
                "                \"enName\": \"Swallow Tail\",\n" +
                "                \"name\": \"燕尾\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1077\",\n" +
                "                \"enName\": \"Tight Hem\",\n" +
                "                \"name\": \"下摆收口\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"150\",\n" +
                "        \"enName\": \"Placket Type\",\n" +
                "        \"name\": \"门襟类型\",\n" +
                "        \"children\": [\n" +
                "            {\n" +
                "                \"id\": \"534\",\n" +
                "                \"enName\": \"Pullovers\",\n" +
                "                \"name\": \"套头衫\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1075\",\n" +
                "                \"enName\": \"Placket\",\n" +
                "                \"name\": \"开门襟\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1076\",\n" +
                "                \"enName\": \"Half Placket\",\n" +
                "                \"name\": \"半开门襟\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]\n" +
                "\n" +
                "    ";

    }

    private static void test2(){
        List<String> imageInfos = JSON.parseArray("[]", String.class);
        if(!CollectionUtils.isEmpty(imageInfos)){
            System.out.println(imageInfos);
        }
    }
}
