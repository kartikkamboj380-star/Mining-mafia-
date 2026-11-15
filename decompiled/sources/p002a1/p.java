package p002a1;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public p(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p002a1.n
    protected String a() {
        return "com.snap.mushroom.MainActivity";
    }

    @Override // p002a1.n
    protected String b() {
        return null;
    }

    @Override // p002a1.n
    protected String h() {
        return "com.snapchat.android";
    }

    @Override // p002a1.n
    protected String i() {
        return "market://details?id=com.snapchat.android";
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
