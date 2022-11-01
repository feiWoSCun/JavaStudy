package redis.connect;

import redis.clients.jedis.Jedis;

public class jedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.79.133",6379);
        System.out.println(jedis.ping());
        Thread werhgp = new Thread(() -> System.out.println("werhgp"));
    }
}
