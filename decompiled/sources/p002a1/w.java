package p002a1;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class w extends o {
    public w(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p002a1.n
    protected String b() {
        return null;
    }

    @Override // p002a1.n
    protected String h() {
        return "com.whatsapp";
    }

    @Override // p002a1.n
    protected String i() {
        return "market://details?id=com.whatsapp";
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                m();
                Thread.sleep(10L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        f().setComponent(null);
        m();
    }
}
