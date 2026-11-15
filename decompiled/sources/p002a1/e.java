package p002a1;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes.dex */
public class e extends o {
    public e(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.facebook.stories.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        String string;
        if (!n.j("appId", readableMap)) {
            throw new IllegalArgumentException("appId was not provided.");
        }
        if (!n.j("backgroundImage", readableMap) && !n.j("backgroundVideo", readableMap) && !n.j("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f7252a.getCurrentActivity();
        if (currentActivity == null) {
            r.a("Something went wrong");
            return;
        }
        this.f7253b.putExtra("com.facebook.platform.extra.APPLICATION_ID", readableMap.getString("appId"));
        this.f7253b.putExtra("bottom_background_color", "#906df4");
        this.f7253b.putExtra("top_background_color", "#837DF4");
        if (n.j("attributionURL", readableMap)) {
            this.f7253b.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (n.j("backgroundTopColor", readableMap)) {
            this.f7253b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (n.j("backgroundBottomColor", readableMap)) {
            this.f7253b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (n.j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        boolean z9 = n.j("backgroundImage", readableMap) || n.j("backgroundVideo", readableMap);
        if (z9) {
            if (n.j("backgroundImage", readableMap)) {
                string = readableMap.getString("backgroundImage");
            } else {
                string = n.j("backgroundVideo", readableMap) ? readableMap.getString("backgroundVideo") : "";
            }
            cl.json.e eVar = new cl.json.e(string, ClipboardModule.MIMETYPE_JPEG, AppStateModule.APP_STATE_BACKGROUND, bool, this.f7252a);
            this.f7253b.setDataAndType(eVar.d(), eVar.c());
            this.f7253b.setFlags(1);
        }
        if (n.j("stickerImage", readableMap)) {
            cl.json.e eVar2 = new cl.json.e(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", bool, this.f7252a);
            if (!z9) {
                this.f7253b.setType("image/*");
            }
            this.f7253b.putExtra("interactive_asset_uri", eVar2.d());
            currentActivity.grantUriPermission("com.facebook.katana", eVar2.d(), 1);
        }
    }

    @Override // p002a1.n
    protected String b() {
        return null;
    }

    @Override // p002a1.n
    protected String h() {
        return "com.facebook.katana";
    }

    @Override // p002a1.n
    protected String i() {
        return "market://details?id=com.facebook.katana";
    }

    @Override // p002a1.o, p002a1.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        q(readableMap);
        p(readableMap);
    }
}
