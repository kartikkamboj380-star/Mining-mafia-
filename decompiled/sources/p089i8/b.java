package p089i8;

import com.facebook.react.bridge.WritableMap;
import p099j8.a;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WritableMap f45099b;

    public b(String str, WritableMap writableMap) {
        this.f45098a = str;
        this.f45099b = writableMap;
    }

    @Override // p099j8.a
    public WritableMap a() {
        return this.f45099b;
    }

    @Override // p099j8.a
    public String getEventName() {
        return this.f45098a;
    }
}
