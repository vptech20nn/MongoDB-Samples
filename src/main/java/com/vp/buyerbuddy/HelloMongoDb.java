package com.vp.buyerbuddy;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class HelloMongoDb 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
			MongoClient mc = new MongoClient("localhost", 27017);
			
			DB db = mc.getDB("buyerbuddy");
			
			DBCollection table = db.getCollection("tarrifs");
			
			DBCursor cur = table.find();
			
			while (cur.hasNext()) {
				System.out.println(cur.next());
			}
			
			mc.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
