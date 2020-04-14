package com.example.myapplication10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView)findViewById(R.id.listview);
        String[] data={"新闻1","新闻2","新闻3","新闻4","新闻5","新闻6"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
        RightFragment rf_1=(RightFragment)getSupportFragmentManager().findFragmentById(R.id.right_fragment);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        position=position+1;
        TextView textView=findViewById(R.id.textView);
        switch (position){
            case 1:
                textView.setText("　　著名演员林永健，塑造了许多深入人心的角色形象。一开始他因为外貌一度受到戏路上的限制，演了许多小角色。但也是因为有了这些磨练，造就了他稳扎稳打的基本功和对名利的淡泊心态，中年时的爆红可谓大器晚成了。\n"+"李永健很早的时候曾经说过：“人生没有一成不变的成功，只有通过不断拼搏进取，才是人生最完美的境界。”从中可以看出，林永健其实早就看淡了人生中的那些坎坷与艰难的时刻，他的人生信条应该就是，通过不断的努力，来完善提升自己，通过不断的坚持，让自己能够离梦想越来越近，从而达到期望的目标。成功是没有终点的，努力也是。林永健的这种想法，也与他从业多年的经历有关，但不得不说，正是因为这样的经历，才能造就了他今天的成功。现在人到中年，他最大的梦想之一，就是能有一个女儿。");
                break;
            case 2:
                textView.setText("　　35岁的Talibshah Hosini，在其祖国阿富汗是一名电影演员，多饰演硬汉，但他在现实生活中的遭遇，却远比银幕中的他艰难。图为Talibshah Hosini（中）带着妻子与三名年幼的女儿，来到希腊莱斯沃斯岛（Lesbos）申请成为难民。\n"+"自从莫里亚难民营超负荷以后，旁边的橄榄园都成为了一个帐篷城，难民数目有增无减。图为Hosini用手机展示曾饰演过的角色，但他认为没有一个角色的遭遇，比他的现实生活更艰难。");
                break;
            case 3:
                textView.setText("邱淑贞虽然是上世纪的女明星了，但她在大荧幕的经典美艳造型深入人心，又美又飒，又纯又欲。不仅是爸妈那辈痴迷她的颜值，如今90后也被征服！最近她的女儿沈月频上热搜，不管是杂志硬照还是私服都非常美！完全不输邱淑贞本人！");
                break;
            case 4:
                textView.setText("90年后正值巅峰期的周星驰佳作井喷，随便揪出哪一个都是叫好又叫座，而1994年这部《九品芝麻官》是周氏喜剧里除《功夫》以外最多的台词梗电影，凡是有弹幕的网站只要播放这电影，那必然是遮天蔽日的台词梗洗礼。");
                break;
            case 5:
                textView.setText("目前，意大利已成为除中国外新冠病毒疫情最严重国家。\n" +
                        "\n" +
                        "　　意大利时间3月11日晚，意大利总理孔特宣布，全意大利除生活必需品商店和药房以外，其余商店一律关闭，酒吧、餐馆等也将全部关闭。当地时间11日18时，意大利民防部门公布的最新数据显示：在过去一天内，意大利新增新冠肺炎确诊病例2313例，累计确诊新冠肺炎病例12462例。新增死亡病例196例，累计死亡827人。累计治愈1045人。目前意大利现存新冠肺炎病例10590例，其中重症病患1028例。");
                break;
            case 6:
                textView.setText("　明星夫妻档的综艺应该算是众多综艺当中最引人注目的了，因为粉丝们对于明星们的婚姻生活应该是一直都抱有一颗八卦的心，尤其是在明星夫妻们在。撒狗粮的时候更加能够看出来明星夫妻私下生活的甜蜜感，也满足了很多粉丝们对于爱情的种种幻想了，但是要说在众多的明星综艺当中，哪一个卫视做的这种明星综艺最为引人注目的，那一定就是芒果卫视了，芒果卫视的很多明星夫妻综艺收视率都是非常高的");
                break;
            default:
        }
    }
}
