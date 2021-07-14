#!/bin/bash
echo "第一个参数表示环境(formal,test),第二参数表示镜像名:(produt,workorder,order),第三个参数表示版本";
#判断输入参数长度是否为零
if [ -z "$1" ]; then
    echo "请输入第一个参数";
    exit 0;
fi

if [ -z "$2" ]; then
    echo "请输入第二个参数";
    exit 0;
fi

version=$(date "+%Y-%m-%d-%H-%M");
name="sobeymall$2";
if [ $1 = "formal" ]; then 
	echo "正在打包正式环境,镜像名:${name}";
        docker build -t swr.cn-north-4.myhuaweicloud.com/sobeylingyun/${name}:$3 .;
        docker push swr.cn-north-4.myhuaweicloud.com/sobeylingyun/${name}:$3; 
else 
	echo "正在打包测试环境,镜像名:${name}";
        docker build -t swr.cn-north-4.myhuaweicloud.com/sobey-cloud/${name}:$3 .;
        docker push swr.cn-north-4.myhuaweicloud.com/sobey-cloud/${name}:$3;  

fi	
