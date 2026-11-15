package io.invertase.firebase.messaging;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static p089i8.b a(String str, Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        writableMapCreateMap.putMap(LogEvent.LEVEL_ERROR, p089i8.m.b(exc));
        return new p089i8.b("messaging_message_send_error", writableMapCreateMap);
    }

    public static p089i8.b b(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        return new p089i8.b("messaging_message_sent", writableMapCreateMap);
    }

    public static p089i8.b c() {
        return new p089i8.b("messaging_message_deleted", Arguments.createMap());
    }

    public static p089i8.b d(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("token", str);
        return new p089i8.b("messaging_token_refresh", writableMapCreateMap);
    }

    static W e(ReadableMap readableMap) {
        W.b bVar = new W.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey(JsonStorageKeyNames.DATA_KEY)) {
            ReadableMap map = readableMap.getMap(JsonStorageKeyNames.DATA_KEY);
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                bVar.a(strNextKey, map.getString(strNextKey));
            }
        }
        return bVar.b();
    }

    public static p089i8.b f(WritableMap writableMap, Boolean bool) {
        return new p089i8.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", writableMap);
    }

    static WritableMap g(W.c cVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            writableMapCreateMap.putString("title", cVar.o());
        }
        if (cVar.q() != null) {
            writableMapCreateMap.putString("titleLocKey", cVar.q());
        }
        if (cVar.p() != null) {
            writableMapCreateMap.putArray("titleLocArgs", Arguments.fromJavaArgs(cVar.p()));
        }
        if (cVar.a() != null) {
            writableMapCreateMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            writableMapCreateMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            writableMapCreateMap.putArray("bodyLocArgs", Arguments.fromJavaArgs(cVar.b()));
        }
        if (cVar.d() != null) {
            writableMapCreateMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            writableMapCreateMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            writableMapCreateMap2.putString("color", cVar.f());
        }
        if (cVar.g() != null) {
            writableMapCreateMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            writableMapCreateMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            writableMapCreateMap2.putString("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            writableMapCreateMap2.putInt("count", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            writableMapCreateMap2.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, cVar.l().intValue());
        }
        if (cVar.m() != null) {
            writableMapCreateMap2.putString("sound", cVar.m());
        }
        if (cVar.n() != null) {
            writableMapCreateMap2.putString("ticker", cVar.n());
        }
        if (cVar.r() != null) {
            writableMapCreateMap2.putInt("visibility", cVar.r().intValue());
        }
        writableMapCreateMap.putMap("android", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static p089i8.b h(W w10, Boolean bool) {
        return new p089i8.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", i(w10));
    }

    static WritableMap i(W w10) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (w10.a() != null) {
            writableMapCreateMap.putString("collapseKey", w10.a());
        }
        if (w10.v() != null) {
            writableMapCreateMap.putString("from", w10.v());
        }
        if (w10.I0() != null) {
            writableMapCreateMap.putString("to", w10.I0());
        }
        if (w10.J() != null) {
            writableMapCreateMap.putString("messageId", w10.J());
        }
        if (w10.Q() != null) {
            writableMapCreateMap.putString("messageType", w10.Q());
        }
        if (w10.j().size() > 0) {
            for (Map.Entry entry : w10.j().entrySet()) {
                writableMapCreateMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        writableMapCreateMap.putMap(JsonStorageKeyNames.DATA_KEY, writableMapCreateMap2);
        writableMapCreateMap.putDouble("ttl", w10.R0());
        writableMapCreateMap.putDouble("sentTime", w10.a0());
        writableMapCreateMap.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, w10.W());
        writableMapCreateMap.putInt("originalPriority", w10.T());
        if (w10.S() != null) {
            writableMapCreateMap.putMap("notification", g(w10.S()));
        }
        return writableMapCreateMap;
    }
}
