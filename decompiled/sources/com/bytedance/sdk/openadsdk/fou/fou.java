package com.bytedance.sdk.openadsdk.fou;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static String kq() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)").toString();
    }

    public static String oq() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
