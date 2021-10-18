from common.mysql.client import Mysql

MYSQL_HOST = "3.14.29.182"
PORT = 3306
USER_NAME = "root"
PASSWORD = "JYFscvVevsANJYmrz9Ud"
DATABASE = "erp_product_analysis"


def query_data(docId: str, mysql_client) -> str:
    cursor = mysql_client.cursor()
    cursor.execute("SELECT `name` FROM product_support_rl r WHERE r.doc_id = %s AND r.has_default = 1", docId)
    data = cursor.fetchone()
    return data


def main():
    mysql_client = Mysql(host=MYSQL_HOST, port=PORT, username=USER_NAME, password=PASSWORD, database=DATABASE)

    data = query_data(637502959011, mysql_client.client)

    if data is not None:
        print("support name = "+data[0])


if __name__ == "__main__":
    main()
