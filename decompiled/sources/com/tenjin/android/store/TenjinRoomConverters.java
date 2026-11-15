package com.tenjin.android.store;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinRoomConverters {
    public static Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    public static String fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new com.google.gson.e().s(map);
    }

    public static Map<String, String> fromString(String str) {
        Type type = new TypeToken<Map<String, String>>() { // from class: com.tenjin.android.store.TenjinRoomConverters.1
        }.getType();
        if (str == null) {
            return null;
        }
        return (Map) new com.google.gson.e().j(str, type);
    }

    public static Date fromTimestamp(Long l10) {
        if (l10 == null) {
            return null;
        }
        return new Date(l10.longValue());
    }
}
