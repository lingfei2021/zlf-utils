
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