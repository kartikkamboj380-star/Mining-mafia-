package p002a1;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class g extends o {
    public g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p002a1.n
    protected String b() {
        return "https://plus.google.com/share?url={url}";
    }

    @Override // p002a1.n
    protected String h() {
        return "com.google.android.apps.plus";
    }

    @Override // p002a1.n
    protected String i() {
        return "market://details?id=com.google.android.apps.plus";
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
