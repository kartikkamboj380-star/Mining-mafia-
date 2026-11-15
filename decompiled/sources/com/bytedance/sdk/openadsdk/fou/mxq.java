package com.bytedance.sdk.openadsdk.fou;

/* JADX INFO: loaded from: classes.dex */
public class mxq {
    public static String kq() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String oq() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
