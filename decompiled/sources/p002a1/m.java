package p002a1;

import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class m extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ReactApplicationContext f7251h;

    public m(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f7251h = reactApplicationContext;
    }

    @Override // p002a1.n
    protected String b() {
        return null;
    }

    @Override // p002a1.n
    protected String h() {
        return Telephony.Sms.getDefaultSmsPackage(this.f7251h);
    }

    @Override // p002a1.n
    protected String i() {
        return "market://details?id=com.android.mms";
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
