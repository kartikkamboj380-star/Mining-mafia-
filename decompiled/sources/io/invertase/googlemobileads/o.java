package io.invertase.googlemobileads;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.tenjin.android.config.TenjinConsts;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes3.dex */
public class o implements p119l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WritableMap f45319d;

    public o(String str, int i10, String str2, WritableMap writableMap) {
        this.f45316a = str;
        this.f45317b = i10;
        this.f45318c = str2;
        this.f45319d = writableMap;
    }

    @Override // p119l8.a
    public WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("body", this.f45319d);
        writableMapCreateMap.putInt("requestId", this.f45317b);
        writableMapCreateMap.putString(HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, this.f45318c);
        writableMapCreateMap.putString(TenjinConsts.EVENT_NAME, this.f45316a);
        return writableMapCreateMap;
    }

    @Override // p119l8.a
    public String getEventName() {
        return this.f45316a;
    }
}
