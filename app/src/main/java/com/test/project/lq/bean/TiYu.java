package com.test.project.lq.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/5 0005.
 */

public class TiYu {

    @Override
    public String toString() {
        return "TiYu{" +
                "status=" + status +
                ", total=" + total +
                ", tngou=" + tngou +
                '}';
    }

    /**
     * status : true
     * total : 411
     * tngou : [{"count":90,"description":"第九点联赛中要有国内运动员综合得分的排名，要将排名与其个人荣誉相挂钩，排名要不断更新，不断曝光","fcount":0,"fromname":"中华网","fromurl":"http://news.china.com/domestic/945/20170102/30133436.html","id":14938,"img":"/top/170102/ecaa348c7fbb5fb9812000d5afc2a588.jpg","keywords":"姚明或任篮协主席","rcount":0,"time":1483334067000,"title":"重磅!曝体育总局建议姚明任篮协主席 兼任男篮主帅","topclass":4},{"count":162,"description":"易建联主动要求被裁掉，易建联在湖人队角色与其所期待的有所出入，北京时间10月24日，据湖人内部知情人士透露，目前正在洛杉矶湖人队的中国球员易建联，已经被球队裁掉，目前这则消息尚未对外公布","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161024_8777768.htm","id":13910,"img":"/top/default.jpg","keywords":"易建联主动要求被裁","rcount":0,"time":1477302549000,"title":"易建联主动要求被裁掉 易建联在湖人队角色与其所期待..","topclass":4},{"count":79,"description":"10月22日下午，中国足协官网发布公告宣布里皮正式接手中国男足主教练一职，公告全文如下：按照中国足球协会国家队教练员选聘程序，经双方友好协商，中国足球协会自2016年10月22日起正式聘用马塞洛·里皮先生担任中国国家男子足球队主教练","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161023_8772602.htm","id":13875,"img":"/top/default.jpg","keywords":"里皮出任国足主帅","rcount":0,"time":1477154948000,"title":"里皮出任国足主帅 教练组成员将是其执教广州恒大时的..","topclass":4},{"count":102,"description":"同一单位多人信息泄露；\u201c要钱\u201d男子称部分信息来自快递单新京报记者发现，早在数月前，就有网友称自己遭遇\u201c微信裸聊敲诈\u201d","fcount":0,"fromname":"闽南网","fromurl":"http://www.mnw.cn/news/shehui/1411762.html","id":13818,"img":"/top/161019/ad15a0d4893c9629f55928456fae6e70.jpg","keywords":"校领导裸聊遭敲诈","rcount":0,"time":1476841749000,"title":"校领导裸聊遭敲诈 \"大家好我要火\"不雅照地址链接","topclass":4},{"count":84,"description":"2016年\u201c中国两岸四地大学排名\u201d18日晨如期上线发布，在我国大陆、台湾地区、香港特别行政区和澳门特别行政区的前100所研究型大学中，清华大学（北京）蝉联第一名，北京大学升至第二名，排名第三的是清华大学（新竹），中国科学技术大学位列第四，香港大学和香港中文大学并列第五，其后依次为台湾大学、香港城市大学、浙江大学，沪上排名最高的学府上海交通大学与香港科技大学并列第十","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161018_8759227.htm","id":13809,"img":"/top/default.jpg","keywords":"中国大学排名出炉","rcount":0,"time":1476780548000,"title":"中国大学排名出炉 前十大陆港台平分秋色","topclass":4},{"count":57,"description":"网络配图今天，《郑州高中生驳北大学者：与现实中低俗内容相比，四大名著何其大雅》，呼吁\u201c请多给孩子一些自主选择的权利和空间，让他们自主决定读什么样的书，而不是所谓合适的就是必读书，所谓不合适的就是禁书\u201d，此文引来不少网友点赞","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161018_8758186.htm","id":13804,"img":"/top/default.jpg","keywords":"高中生驳北大学者","rcount":0,"time":1476773347000,"title":"高中生驳北大学者 一次极具意义的发声","topclass":4},{"count":61,"description":"10月17号下午，记者来到南京二十九中学校南门，传达室工作人员电话联系了校务处一位姓时的工作人员，他在电话中解释，家长反映的值早班、替监考、值晚自习等情况是由家委会研究决定的做法，不过具体情况他没有权限接受记者的采访，得由校领导返校后再行决定","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161018_8757069.htm","id":13802,"img":"/top/default.jpg","keywords":"中学家长替老师监考","rcount":0,"time":1476755349000,"title":"中学家长替老师监考 家长:学校的责任为何要推给家长","topclass":4},{"count":113,"description":"今年2月3日，中国足协决定由高洪波担任主教练，带领国足全力备战世预赛，这也是高洪波第二次接手国足，临危受命的他为中国足球带来短暂的甜蜜：在40强赛最后2轮比赛中，他率队取得2连胜，末轮生死战中，更是以2-0击败卡塔尔，最终晋级12强赛","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201610/t20161012_8740814.htm","id":13718,"img":"/top/default.jpg","keywords":"高洪波宣布辞职","rcount":0,"time":1476269350000,"title":"高洪波宣布辞职 客场不敌乌兹别克斯坦后高洪波请辞帅位","topclass":4},{"count":108,"description":"刚刚在里约奥运会中获得金牌的中国女排主教练郎平的女儿白浪，也出现在当天的比赛队伍中","fcount":0,"fromname":"海南网","fromurl":"http://www.hinews.cn/news/system/2016/09/06/030668071.shtml","id":13265,"img":"/top/160906/0a9d4006ae9cd7bfabca59fe444090c9.jpg","keywords":"郎平女儿参加球赛","rcount":0,"time":1473161158000,"title":"郎平女儿参加北美华人排球赛 自称打排球多年十分热爱","topclass":4},{"count":112,"description":"功臣蒿俊闵预感能进球尽管只是替补出场，但是通过在有限的时间内的出色表现，赛后在各大网站的球迷评选中，蒿俊闵被普遍认为是MVP","fcount":0,"fromname":"人们政协网","fromurl":"http://www.rmzxb.com.cn/c/2016-09-02/1013578_2.shtml","id":13181,"img":"/top/default.jpg","keywords":"国足2-3不敌韩国","rcount":0,"time":1472782559000,"title":"国足2-3不敌韩国 结果遗憾\"虽败犹荣\"","topclass":4},{"count":99,"description":"国际奥委会对北京奥运会样本复检中查出3名中国女子举重运动员曹磊、陈燮霞、刘春红兴奋剂阳性","fcount":0,"fromname":"南方网","fromurl":"http://news.southcn.com/china/content/2016-08/25/content_154582062.htm","id":13024,"img":"/top/160825/6218b65eb61e2eb9faa9a6a3b39d04ab.jpg","keywords":"举协回应禁药事件","rcount":0,"time":1472132098000,"title":"举协回应禁药事件(图):积极配合调查 如若违规决不姑息","topclass":4},{"count":183,"description":"原标题：中国奥运代表团访港，奇集全程独家直播中国奥运代表团访港，奇集全程独家直播香港青年联会（下文简称香港青联）将在8月27号中午接待2016里约奥运中国国家金牌运动员代表团，其中香港青联主席吴杰庄博士将作为代表，与运动员们展开近距离的交流，届时奇集微信公众号会对此盛事进行实时直播和现场互动，并且将会发放运动员签名等礼品福利予参与用户","fcount":0,"fromname":"新浪新闻","fromurl":"http://news.sina.com.cn/o/2016-08-25/doc-ifxvitex8942229.shtml","id":13022,"img":"/top/160825/23641d9d49d2889cf5f749d4c172a8ce.jpg","keywords":"奥运代表团将访港","rcount":0,"time":1472117701000,"title":"中国奥运代表团访港,奇集全程独家直播","topclass":4},{"count":75,"description":"p;8月23日，中国女排主教练郎平抵达北京首都国际机场","fcount":0,"fromname":"新华网","fromurl":"http://news.xinhuanet.com/photo/2016-08/24/c_129250878.htm?_t_t_t=0.5344618817325681","id":12995,"img":"/top/default.jpg","keywords":"中国女排回国","rcount":0,"time":1472021299000,"title":"中国女排回国","topclass":4},{"count":75,"description":"当天国际体育仲裁法庭宣布了这一决定后，俄总理梅德韦杰夫通过社交网站表示，这一决定是\u201c无耻的，是对所有残疾人的打击，而不仅仅是对俄罗斯残疾人的打击\u201d","fcount":0,"fromname":"新浪新闻","fromurl":"http://news.sina.com.cn/o/2016-08-24/doc-ifxvctcc8365168.shtml","id":12989,"img":"/top/160824/67618d51b59570707f51a0d4c295baa6.jpg","keywords":"俄罗斯无缘残奥会","rcount":0,"time":1472010497000,"title":"俄残奥委会上诉被驳回无缘里约残奥会 俄各界反应强烈","topclass":4},{"count":67,"description":"原标题：博尔特约会女学生床照曝光[衰]据外媒报道，博尔特与里约当地女学生的亲密床照在网络曝光","fcount":0,"fromname":"新浪新闻","fromurl":"http://news.sina.com.cn/o/2016-08-22/doc-ifxvctcc8237279.shtml","id":12943,"img":"/top/160822/ca996e02ea1b93b6693dd16dc14ded2b.png","keywords":"女生约会博尔特","rcount":0,"time":1471865289000,"title":"博尔特约会女学生床照曝光[衰]","topclass":4},{"count":79,"description":"\u201d闭幕式播放各国奥运健儿拼搏的精彩回顾，唯独没有中国运动员的画面，白岩松说：\u201c难道中国体育代表团没有参加里约奥运会吗","fcount":0,"fromname":"腾讯新闻","fromurl":"http://news.qq.com/a/20160822/025602.htm","id":12940,"img":"/top/160822/77e2c773787fdc7eedf08f6cad413315.jpg","keywords":"奥运短片不见中国","rcount":0,"time":1471858089000,"title":"奥运闭幕式短片没有中国运动员,巴西真的是好小气啊!","topclass":4},{"count":70,"description":"中国代表团旗手为里约奥运会独揽乒乓球女单女团冠军的丁宁，这也是中国乒乓球队第一次有运动员出任旗手","fcount":0,"fromname":"21CN新闻","fromurl":"http://news.21cn.com/social/shixiang/a/2016/0822/08/31455281.shtml","id":12930,"img":"/top/160822/33bb6b6c92189a7af51e10b6d4c64477.jpeg","keywords":"丁宁成闭幕式旗手","rcount":0,"time":1471829287000,"title":"丁宁成闭幕式旗手 中国乒乓球队第一次出任旗手","topclass":4},{"count":71,"description":"比如白岩松在谈到中国女排的时候，说道：\u201c中国女排能获得这块金牌，除了感谢教练和球员们等各方面的努力，还要感谢贝利，赛前他预测塞尔维亚夺得冠军","fcount":0,"fromname":"新浪新闻","fromurl":"http://news.sina.com.cn/c/2016-08-22/doc-ifxvctcc8197218.shtml","id":12929,"img":"/top/160822/40a7c1a137ad725ea6722fae079581ff.jpg","keywords":"里约奥运会闭幕式","rcount":0,"time":1471829287000,"title":"巴西里约奥运会闭幕式 \u201c段子手\u201d白岩松\u201c再出山\u201d","topclass":4},{"count":57,"description":"博尔特被逼婚博尔特的父亲韦尔斯利和母亲珍妮弗在到达里约近距离观看儿子的\u201c演出\u201d的时候也聊上了赶紧回家结婚的话题","fcount":0,"fromname":"齐鲁晚报","fromurl":"http://www.qlwb.com.cn/2016/0821/703317_2.shtml","id":12927,"img":"/top/160822/91eb34743a0bbadee92acb3b0ac47ce5.jpg","keywords":"博尔特被逼婚","rcount":0,"time":1471796889000,"title":"博尔特被逼婚 母亲:都九冠王了赶紧回家结婚生孩子吧(2)","topclass":4},{"count":167,"description":"而林丹已经连夺北京、伦敦两届羽毛球男单金牌，如果这次能击败李宗伟继而进入决赛并夺金，将抒写三连冠的伟业","fcount":0,"fromname":"TechWeb","fromurl":"http://www.techweb.com.cn/onlinegamenews/2016-08-19/2377234.shtml","id":12869,"img":"/top/160819/246f6b3a76553d99f90921080b38a8f3.jpg","keywords":"林丹大战李宗伟","rcount":0,"time":1471606087000,"title":"林丹李宗伟比赛时间 里约奥运羽毛球林李大战半决赛时间","topclass":4}]
     */

    private boolean status;
    private int total;
    private List<TngouBean> tngou;

    public static TiYu objectFromData(String str) {

        return new Gson().fromJson(str, TiYu.class);
    }

    public static TiYu objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TiYu.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TiYu> arrayTYFromData(String str) {

        Type listType = new TypeToken<ArrayList<TiYu>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TiYu> arrayTYFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TiYu>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }
}
