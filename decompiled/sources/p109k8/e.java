package p109k8;

import com.facebook.react.bridge.WritableMap;
import p119l8.a;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WritableMap f45694b;

    public e(String str, WritableMap writableMap) {
        this.f45693a = str;
        this.f45694b = writableMap;
    }

    @Override // p119l8.a
    public WritableMap a() {
        return this.f45694b;
    }

    @Override // p119l8.a
    public String getEventName() {
        return this.f45693a;
    }
}
