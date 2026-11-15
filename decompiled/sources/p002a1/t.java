package p002a1;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class t extends o {
    public t(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p002a1.n
    protected String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    @Override // p002a1.n
    protected String h() {
        return "com.twitter.android";
    }

    @Override // p002a1.n
    protected String i() {
        return null;
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
