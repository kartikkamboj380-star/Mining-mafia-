package com.reactnativecommunity.asyncstorage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    static WritableMap a(String str) {
        return b(str, "Database Error");
    }

    static WritableMap b(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, str2);
        if (str != null) {
            writableMapCreateMap.putString("key", str);
        }
        return writableMapCreateMap;
    }

    static WritableMap c(String str) {
        return b(str, "Invalid key");
    }

    static WritableMap d(String str) {
        return b(str, "Invalid Value");
    }
}
