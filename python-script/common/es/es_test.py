from common.es.client import Client

ES_HOST = "http://es.infwaves.com:9200"
ES_USER = "houshuai0816"
ES_PASS = "Houshuai@0816"

pageSize = 100
index = "idx_spu_logs"


def generate_actions(client, num: int):
    out = []
    print("current pagenum is : %s pagesize is : %s" % (num * pageSize,pageSize))
    data = client.query(index, pageNum=num * pageSize, pageSize=pageSize)
    hits = data['hits']['hits']
    print(len(hits))
    if len(hits) < 1:
        return None
    for item in hits:
        out.append({
            "_index": item['_index'],
            "_id": item['_id'],
            "_type": item['_type'],
            "_source": item['_source']
        })
    return out


def main():
    es_client = Client([ES_HOST], ES_USER, ES_PASS)

    num = 0
    while True:
        data = generate_actions(es_client, num)
        if data is None or len(data) == 0:
            break
        print(data)
        num += 1
    print("query data success ")


if __name__ == "__main__":
    main()
