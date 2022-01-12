
GET _cat/indices?format=json
GET _cat/health?format=json
GET _cat/nodes?format=
GET idx_product/_mapping
GET idx_product/_settings

#更新某记录某字段
POST idx_product/_update/655431680789/
{
  "doc": {
    "variants" : []
  }
}

#嵌套查询
GET idx_product/_search
{
  "query": {
    "nested": {
      "path": "variants",
      "query": {
        "bool": {
          "must": [
            {
              "term": {
                "variants.sku": "dev-OA21110419PKL"
              }
            }
          ]
        }
      }
    }
  }
}

#查询删除
POST idx_product/_delete_by_query
{ 
  "query": {
    "bool": {
      "must": [
        {"terms": {
          "channel_ids": ["4"]
        }}
      ]
    }
  }
}
#查询更新
POST idx_product/_update_by_query
{
  "query": {
    "bool": {
      "must": [
        {"terms": {
          "developer_id": [
            "5","19","20","21","33","101"
          ]
        }}
      ]
    }
  },
  "script": {
    "source": "ctx._source.developType=2",
    "lang": "painless"
  }
}

#利用脚本更新数据
# Too many dynamic script compilations within, max: [75/5m];
# ElasticSearch5分钟内执行脚本编译超过75个，编译太多而拒绝编译。编译是非常耗时的，这是ES的自我保护功能。
POST idx_product/_update_by_query
{
  "query": {
    "bool": {
      "must": [
        {"terms": {
          "spu": ["OA21100911"
          ]
        }}
      ]
    }
  },
  "script": {
    "source": " for(e in ctx._source.channel_skus){    if(e.sku=='OA21100911BKL'){        e.inventory_quantity= 0   } }", 
    "lang": "painless"
  }
}
# 将参数写入params，源码source就不需要重复编译。
GET idx_product/_search
{
    "query": {
        "function_score": {
            "query": {
                "match": { "message": "elasticsearch" }
            },
            "script_score" : {
                "script" : {
                    "params": {
                        "a": 5,
                        "b": 1.2
                    },
                    "source": "params.a / Math.pow(params.b, doc['likes'].value)"
                }
            }
        }
    }
}