package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class yyl {
    private static volatile yyl kq;
    private Map<String, Map<String, String>> oq = new ConcurrentHashMap();

    private yyl() {
    }

    public static yyl kq() {
        if (kq == null) {
            synchronized (yyl.class) {
                try {
                    if (kq == null) {
                        kq = new yyl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public boolean bob(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.oq;
        if (map2 == null || !map2.containsKey(str) || (map = this.oq.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public boolean oq(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.oq;
        if (map2 == null || !map2.containsKey(str) || (map = this.oq.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void kq(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.oq;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.oq.put(str, concurrentHashMap);
    }

    public String kq(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.oq;
        if (map2 == null || !map2.containsKey(str) || (map = this.oq.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void kq(String str) {
        Map<String, Map<String, String>> map = this.oq;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.oq.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.oq.remove(str);
        }
    }
}
