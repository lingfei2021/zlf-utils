#!/bin/bash
indexName="您的索引名"
newClusterUser="新集群用户名"
newClusterPass="新集群密码"
newClusterHost="新集群host"
oldClusterUser="旧集群用户名"
oldClusterPass="旧集群密码"
# 旧集群host必须是[scheme]://[host]:[port]，例如http://10.37.1.*:9200
oldClusterHost="旧集群host"
curl -u ${newClusterUser}:${newClusterPass} -XPOST "http://${newClusterHost}/_reindex?pretty" -H "Content-Type: application/json" -d'{
    "source": {
        "remote": {
            "host": "'${oldClusterHost}'",
            "username": "'${oldClusterUser}'",
            "password": "'${oldClusterPass}'"
        },
        "index": "'${indexName}'",
        "query": {
            "match_all": {}
        }
    },
    "dest": {
       "index": "'${indexName}'"
    }
}'