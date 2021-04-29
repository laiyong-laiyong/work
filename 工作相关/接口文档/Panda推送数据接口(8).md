## Panda推送数据接口

### 数据推送：

```
method：post
#测试地址：http://114.116.255.147:33559
url：/sobeyMallPanda/V1/balance-recharge
```

|  类型  |    字段     |    说明    |  数据类型  | 是否必须 |                tips                 |
| :----: | :---------: | :--------: | :--------: | :------: | :---------------------------------: |
| header |    token    |  验证使用  |   string   |   true   |           固定值：lingyun           |
|  body  |   shellId   |   申请id   |    int     |   true   |                                     |
|  body  |   account   |    客户    |   String   |   true   |                                     |
|  body  | createDate  |  申请时间  |    Date    |   true   |                                     |
|  body  |  projectId  |   项目号   |   String   |   true   |                                     |
|  body  | projectName |  项目名称  |   String   |   true   |                                     |
|  body  |     way     |  考核方式  |   String   |   true   |            对应考核提成             |
|  body  |  lingYunAc  |  凌云账号  |   String   |   true   |                                     |
|  body  |  recharge   |  结算方式  |    int     |   true   | 0充值(对应预付款)/1额度(对应后付款) |
|  body  |   seller    |  销售人员  |   String   |   true   |                                     |
|  body  |   preSale   |  售前人员  |   String   |   true   |                                     |
|  body  |   amount    |    金额    | BigDecimal |   true   |            小数点后两位             |
|  body  | buyService  | 购买的服务 |   String   |  false   |           字符串包裹List            |

Service内部数据结构如下

|   Service    |            |        |       |
| :----------: | :--------: | :----: | :---: |
|     keys     |    desc    |  type  | must  |
|   service    |   服务名   | String | true  |
| serviceSize  | 预计使用量 | String | true  |
|   contract   |    折扣    | String | false |
| contractDate |  到期时间  |  Date  | false |

发送示例

```
额度
{
    "shellId":1099,
    "account":"A9958",
    "createDate":"",
    "projectId":"P55gfg5",
    "projectName":"N8855", 
    "way":"权限",
    "lingYunAc":"sobeyxiaodan",
    "recharge":1,
    "seller":"S99665",
    "preSale":"PS54555",
    "amount":100.05,
    "buyService":"[{'service':'云服务','serviceSize':'1024Mb','contract':'4折','contractDate':'2021-12-12 23:59:59'},{'service':'互动连线','serviceSize':'512Mb'},{'service':'直播服务','serviceSize':'2048Mb','contract':'5折','contractDate':'2021-12-12 23:59:59'}]"
}
支付
{
	"shellId":990101,
    "account":"A10085",
    "createDate":"",
    "projectId":"P55gfg4",
    "projectName":"N8854", 
    "way":"云服务",
    "lingYunAc":"sobeyxiaodan",
    "recharge":0,
    "seller":"S99665",
    "preSale":"PS54555",
    "amount":100.05
}
```