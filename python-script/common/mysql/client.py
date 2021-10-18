import pymysql


class Mysql:
    def __init__(self, host, port, username, password, database):
        self.host = host
        self.port = port
        self.username = username
        self.database = database
        self.password = password
        self.client = self.create_client()

    def create_client(self) -> pymysql.connections:
        return pymysql.connect(host=self.host, port=self.port, user=self.username, password=self.password,
                               database=self.database)

    def close(self):
        self.client.close()
