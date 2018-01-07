import redis

try:
    conn = redis.StrictRedis(
        host='master',
        port=6379,
        password='88888888',
        ssl=False)
    for i in range (1, 10000):
        conn.set("context1", i)
except Exception as ex:
    print 'Error:', ex
