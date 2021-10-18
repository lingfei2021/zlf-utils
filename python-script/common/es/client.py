from elasticsearch import Elasticsearch, helpers
from elasticsearch.helpers import streaming_bulk

#note that AWS ES will never go higher than 7.10.2,
#and you should keep client versions in synch with 
#the backend versions, otherwise you run the risk
# of hitting incompatibilities

#https://stackoverflow.com/questions/68892291/node-and-elasticsearch-client-the-client-noticed-that-the-server-is-not-a-supp

#then:
#pip3 install elasticsearch==7.10.1 


class Client:

    def __init__(self, urls: [], username: str, password: str):
        self.urls = urls
        if username is None and password is None:
            self.es = self.create_client_no_auth()
        else:
            self.username = username
            self.password = password
            self.es = self.create_client()

    def create_client(self) -> Elasticsearch:
        return Elasticsearch(
            self.urls,
            http_auth=(self.username, self.password)
        )

    def create_client_no_auth(self) -> Elasticsearch:
        return Elasticsearch(
            self.urls
        )

    def insert(self, index: str, doc_id: str, body):
        self.es.index(index=index, id=doc_id, body=body)

    def bulk_insert(self, getData):
        return helpers.bulk(client=self.es, actions=getData)

    def query(self, index: str, pageNum: int, pageSize: int):
        return self.es.search(index=index, from_=pageNum, size=pageSize)

    def update(self, index: str, doc_id: str, body):
        return self.es.update(index=index, id=doc_id, body=body)
