package com.bytedance.sdk.openadsdk.fou;

/* JADX INFO: loaded from: classes.dex */
public class wcx extends fou {
    public static String bob() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)").toString();
    }
}
