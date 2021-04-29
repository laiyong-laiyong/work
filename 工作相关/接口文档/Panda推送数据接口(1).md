## Panda推送数据接口

### 数据推送：

```
method：post

url：/v1/balance-recharge/insert
```

|    字段     |    说明    |  数据类型  | 是否必须 |       tips       |
| :---------: | :--------: | :--------: | :------: | :--------------: |
|   account   |    客户    |   String   |   true   |                  |
| createDate  |  申请时间  |    Date    |   true   |                  |
|  projectId  |   项目号   |   String   |   true   |                  |
| agreementId |   合同号   |   String   |  false   |                  |
|     way     |  考核方式  |   String   |   true   |                  |
|  lingYunAc  |  凌云账号  |   String   |   true   |                  |
|   amount    |    金额    | BigDecimal |   true   | 小数点后保留两位 |
|   Service   | 购买的服务 |    List    |   true   |                  |

Service内部数据结构如下

|   Service    |          |        |      |
| :----------: | :------: | :----: | :--: |
|     keys     |   desc   |  type  | must |
|   service    |  服务名  | String | true |
|   contract   |   折扣   | String | true |
| contractDate | 到期时间 |  Date  | true |

发送示例

```
{
    "account":"客户1",
    "projectId":"P01",
    "createDate":"",
    "way":"云服务",
    "lingYunAc":"sobeyxiaodan",
    "amount":100.05,
    "Service":[{"service":"云服务","contract":"4折","contractDate":"2021-12-12 23:59:59"},{"service":"互动连线","contract":"9折","contractDate":"2021-12-12 23:59:59"},{"service":"直播服务","contract":"5折","contractDate":"2021-12-12 23:59:59"}]
}
```