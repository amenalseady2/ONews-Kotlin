package com.don.onews_kotlin.bean

/**
 * Created by drcom on 2017/3/16.
 */

class HttpResult<T> {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"2a7ba37c540f0b1906e81015e1606ba7","title":"江苏淮安一光头男持铁锤击伤5名路人，已被警方控制","date":"2017-03-16 16:14","category":"头条","author_name":"江苏电视台","url":"http://mini.eastday.com/mobile/170316161440118.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170316/20170316161440_b048a29f16134d34834612ca845c1572_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170316/20170316161440_b048a29f16134d34834612ca845c1572_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170316/20170316161440_b048a29f16134d34834612ca845c1572_3_mwpm_03200403.jpeg"},{"uniquekey":"7dfe147cef444c35c5460fe294a5e1c2","title":"西班牙检获超万支步枪　阻止其落入恐怖分子手中","date":"2017-03-16 16:28","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170316162801148.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170316/20170316162801_b84baef2a6eba09338181667ea72cbba_1_mwpm_03200403.jpeg"},{"uniquekey":"0590b645b79bd675a8349a218dd18cd5","title":"光明网批互动百科造假：知识岂能当生意","date":"2017-03-16 16:14","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/170316161439579.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170316/20170316161439_c5343abbc792fb57f39e0ab885d8dde3_1_mwpm_03200403.jpeg"},{"uniquekey":"8ef20615582c159a82baf52037225ddb","title":"农妇短信辱骂镇领导被拘10日 家里曾被强征耕地","date":"2017-03-16 16:04","category":"头条","author_name":"Btime此刻","url":"http://mini.eastday.com/mobile/170316160428274.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170316/20170316160428_d0a7806dd37f7909b224b59af08312cb_1_mwpm_03200403.png"},{"uniquekey":"8e9440f5484580ceb2d8cf7605e164ac","title":"欧盟药丸？英国脱完苏格兰脱 德法荷也坐不住了","date":"2017-03-16 15:54","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170316155418482.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170316/20170316155418_8208df19992de5005c1e0445e24b0138_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170316/20170316155418_8208df19992de5005c1e0445e24b0138_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170316/20170316155418_8208df19992de5005c1e0445e24b0138_3_mwpm_03200403.jpeg"},{"uniquekey":"46604f94ad6a293a4b2bbc5954c0deb0","title":"揭秘微整形乱象:有学员半年就赚一辆敞篷跑车","date":"2017-03-16 15:44","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170316154406240.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170316/20170316154406_05ab74e1176d1fef76120c95606a380d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170316/20170316154406_05ab74e1176d1fef76120c95606a380d_2_mwpm_03200403.jpeg"},{"uniquekey":"f3e5a930454598a8a7b5e20714e6e477","title":"家乐福过期产品难退货 工作人员:爱去哪告去哪里","date":"2017-03-16 15:36","category":"头条","author_name":"中国质量新闻网","url":"http://mini.eastday.com/mobile/170316153636880.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170316/20170316153636_bcc567437f5e5baf47b7094d478f12ba_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170316/20170316153636_bcc567437f5e5baf47b7094d478f12ba_2_mwpm_03200403.jpeg"},{"uniquekey":"61e664ce3885dbdef84986d00cc7af7c","title":"邱毅：马英九须全力胜诉 否则会有一连串政治追杀","date":"2017-03-16 15:23","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170316152358328.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170316/20170316152358_1003095f8ff798abd34ec34c8a75c558_1_mwpm_03200403.jpeg"},{"uniquekey":"9c6d2e86ffa6d602213fcd016aa04700","title":"柬埔寨副首相索安亲王在北京逝世 享年66岁","date":"2017-03-16 15:23","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170316152313815.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170316/20170316152313_83681970ea4e8ca5b528a9c16986cd83_1_mwpm_03200403.jpeg"},{"uniquekey":"c1607828688e9e0ad1f0eee2ef1830eb","title":"到这个国家旅游要远离女子，不然你会被要求娶两个美女！","date":"2017-03-16 15:21","category":"头条","author_name":"厉害了我的表哥","url":"http://mini.eastday.com/mobile/170316152146964.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170316/20170316_cea800d7c5ed264e9950e45c6705810c_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170316/20170316_91888830d6aede27a6d704e066ea5fb8_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170316/20170316_3ff2a55fbe151d3bd029b68b36676e89_cover_mwpm_03200403.jpeg"},{"uniquekey":"7d241b00f32b0e23ab901741db46533d","title":"老人去\"养生大楼\"似上班 终死在堆满保健品的房间","date":"2017-03-16 15:19","category":"头条","author_name":"冰点周刊","url":"http://mini.eastday.com/mobile/170316151927278.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170316/20170316151927_78166f2c4598c322046f537defe36ed3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170316/20170316151927_78166f2c4598c322046f537defe36ed3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170316/20170316151927_78166f2c4598c322046f537defe36ed3_3_mwpm_03200403.jpeg"},{"uniquekey":"c292ef46c45f7c258cfa15c778198355","title":"直击：全球工厂之富士康的\u201c厂花\u201d","date":"2017-03-16 15:17","category":"头条","author_name":"厉害了我的表哥","url":"http://mini.eastday.com/mobile/170316151756217.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170316/20170316_ae243e7ec9983e98639b1c2b51773f63_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170316/20170316_238a509aea7a4e95e025e15951395a5c_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170316/20170316_8b3f3b72dd971d40765deadc88d8ec52_cover_mwpm_03200403.jpeg"},{"uniquekey":"de5caceda24f026f6968751bfc3e7b92","title":"陈赓为啥不是元帅,大将还只是排第四？","date":"2017-03-16 15:17","category":"头条","author_name":"历史档案揭秘","url":"http://mini.eastday.com/mobile/170316151730949.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170316/20170316151730_857a0e179fbaeb5f9532923ffe7c1f56_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170316/20170316151730_857a0e179fbaeb5f9532923ffe7c1f56_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170316/20170316151730_857a0e179fbaeb5f9532923ffe7c1f56_3_mwpm_03200403.jpeg"},{"uniquekey":"b14981335733e6b07487fd67c3353f16","title":"中外专家展望中国在全球风险治理中的前景 暨\u201c2017全球挑战奖：新形态\u201d中国启动","date":"2017-03-16 15:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170316151452377.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170316/20170316151452_c8a66803662513bcf09d8abcc27b1739_1_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170316/20170316151452_c8a66803662513bcf09d8abcc27b1739_2_mwpm_03200403.png"},{"uniquekey":"58f1f584c0b608c9f4fa29c5904e1aa4","title":"不满英国邮轮撞坏珍贵珊瑚礁 印尼政府愤怒回应不满","date":"2017-03-16 15:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170316151451972.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170316/20170316151451_bdc4ea92533ce8a3f571f1555e406004_1_mwpm_03200403.jpeg"},{"uniquekey":"b5328b09ac3f1237a06f79bdb7817ee2","title":"大咖云集 本周末带你无人机直播\u201c当代中国建筑奇迹\u201d 不见不散","date":"2017-03-16 15:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170316151446091.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170316/20170316151446_a8c46b6d0ecd18242afbce6cf0a08d41_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170316/20170316151446_a8c46b6d0ecd18242afbce6cf0a08d41_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170316/20170316151446_a8c46b6d0ecd18242afbce6cf0a08d41_3_mwpm_03200403.jpeg"},{"uniquekey":"a8e262159839941f4b3b1800c7125a14","title":"罗锦鳞、罗彤：每一个希腊人里面，都有一个中国人","date":"2017-03-16 15:14","category":"头条","author_name":"人民日报中央厨房","url":"http://mini.eastday.com/mobile/170316151443175.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170316/20170316151443_3b7bad34dde45c557dbae010c18c2cd7_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170316/20170316151443_3b7bad34dde45c557dbae010c18c2cd7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170316/20170316151443_3b7bad34dde45c557dbae010c18c2cd7_3_mwpm_03200403.jpeg"},{"uniquekey":"ee6eef712da74da6fcca4da5a9a46d80","title":"两男一女涉旺角暴动被裁定罪名成立 系香港首宗\u201c暴动罪\u201d案件","date":"2017-03-16 15:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170316151442821.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170316/20170316151442_5a72b11996d9106c879a764566372353_1_mwpm_03200403.png"},{"uniquekey":"7fda067623907337b1074f414838f8bf","title":"废弃的老式手机别丢，只要简单几步就能提炼出如此珍贵的宝物！！","date":"2017-03-16 15:14","category":"头条","author_name":"互联网新世界","url":"http://mini.eastday.com/mobile/170316151423498.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170316/20170316_210efd5a978a2929b655809b5f93de7c_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170316/20170316_8028b9e99d4244cb1ddd12dc0973f740_cover_mwpm_03200403.png"},{"uniquekey":"31d0415fe714b0cb3d57dd3b2d3382f2","title":"安徽农妇被人杀害后，埋在家门口沙堆里！凶手竟是自家人！","date":"2017-03-16 15:08","category":"头条","author_name":"安徽经视","url":"http://mini.eastday.com/mobile/170316150858524.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170316/20170316150858_063d90977e4a76f8615976a91b0eba82_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170316/20170316150858_063d90977e4a76f8615976a91b0eba82_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170316/20170316150858_063d90977e4a76f8615976a91b0eba82_3_mwpm_03200403.jpeg"},{"uniquekey":"81b865444b90cfa355e3bd9d2688ad29","title":"禁止生产殡葬用品 见到冥币和纸人、纸马等迷信用品可举报","date":"2017-03-16 14:59","category":"头条","author_name":"东北网","url":"http://mini.eastday.com/mobile/170316145902616.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170316/20170316145902_ec7bf6b0cd922efd3f6d3688b9abebc1_1_mwpm_03200403.jpeg"},{"uniquekey":"79eb6bd1ed5cc3d2735e1461e4d5faf1","title":"培训机构组织教师资格证考试作弊 11人被刑拘","date":"2017-03-16 14:59","category":"头条","author_name":"大洋网","url":"http://mini.eastday.com/mobile/170316145902033.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170316/20170316145902_c36521532a7695b06244a247f961029b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170316/20170316145902_c36521532a7695b06244a247f961029b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170316/20170316145902_c36521532a7695b06244a247f961029b_3_mwpm_03200403.jpeg"},{"uniquekey":"1207f3dec7863aff22bfbfbe32479b83","title":"你加油时可能遇到了假的中石油、中石化","date":"2017-03-16 14:51","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170316145134545.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170316/20170316145134_ceda239717ca3257ba7b8f419e80f415_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170316/20170316145134_ceda239717ca3257ba7b8f419e80f415_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170316/20170316145134_ceda239717ca3257ba7b8f419e80f415_3_mwpm_03200403.jpeg"},{"uniquekey":"ef003fbc5c36025cb93a04628aad7efb","title":"这个烤肉摊火了几十年 四季排队成一景","date":"2017-03-16 14:42","category":"头条","author_name":"青岛新闻网","url":"http://mini.eastday.com/mobile/170316144231980.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170316/20170316144231_8d8d908354355bd8845f3196cf57d64d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170316/20170316144231_8d8d908354355bd8845f3196cf57d64d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170316/20170316144231_8d8d908354355bd8845f3196cf57d64d_3_mwpm_03200403.jpeg"},{"uniquekey":"db8b9f65ca0352c91117ea44086ea61e","title":"实拍那些娶非洲女人的中国男人","date":"2017-03-16 14:41","category":"头条","author_name":"蚂蚁雅黑","url":"http://mini.eastday.com/mobile/170316144118532.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170316/20170316_cd5a7734b76f0f7704cf576330aabbca_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170316/20170316_b4e3b7da46ec122d0d708acb069e6994_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170316/20170316_5cac006dbf3e64b1d67da3c9f0b13bda_cover_mwpm_03200403.jpeg"},{"uniquekey":"f00503fbcd454101d245ad1d14b5d066","title":"排水量10000吨携带128枚导弹，中国同时建造三艘！","date":"2017-03-16 14:39","category":"头条","author_name":"军事纪实","url":"http://mini.eastday.com/mobile/170316143919009.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170316/20170316_dbc7b8ad6f46c7b0a54df6cefa0a541f_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170316/20170316_12681c39c46c5f3d9c198165216a5b01_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170316/20170316_37e2313c8bcf69d46b6cd87f06e4abc0_cover_mwpm_03200403.jpeg"},{"uniquekey":"8193cf744f0290aa199f79e66f58ebc9","title":"安以轩将成为\u201c六月新娘\u201d，但婚戒竟是用这个做的！","date":"2017-03-16 14:37","category":"头条","author_name":"东森新闻云","url":"http://mini.eastday.com/mobile/170316143700177.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170316/20170316143700_f65933ccdabf8d12f2e7da4b8773fad6_1_mwpm_03200403.jpeg"},{"uniquekey":"fc3517efe1746b981064f328a1f7627c","title":"地方交易所整顿进行时：深圳发布17家涉嫌违规交易机构名单","date":"2017-03-16 14:29","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170316142921477.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170316/20170316142921_12c85a38d029da6f2439cd5c4461b225_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170316/20170316142921_12c85a38d029da6f2439cd5c4461b225_3_mwpm_03200403.jpeg"},{"uniquekey":"7f5b9b8fffefe9f4f6387ecfe6cea732","title":"农村常用来喂猪的草，学名叫茜草，也叫抱孙子的救命草","date":"2017-03-16 14:26","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170316142604666.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170316/20170316_333494d76832d41b3f4becbb60c993b6_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170316/20170316_334e30cdaad35805b171064b91ad9d4d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170316/20170316_4eb30c60e814afc77d757d4a7382870b_cover_mwpm_03200403.jpeg"},{"uniquekey":"cf6fc14671cb7d04acbf7d713d79039b","title":"从村头小木匠到如今全国900亿 他20年做到世界第一","date":"2017-03-16 14:24","category":"头条","author_name":"看商界","url":"http://mini.eastday.com/mobile/170316142420757.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170316/20170316142420_df5971e6a1b42bfc56f8a1f4494b3855_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170316/20170316142420_df5971e6a1b42bfc56f8a1f4494b3855_2_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    var reason: String? = null
    var result: T? = null
    var error_code: Int = 0


}