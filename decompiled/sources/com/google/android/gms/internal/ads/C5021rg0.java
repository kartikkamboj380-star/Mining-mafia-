package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5021rg0 implements I0.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5273tg0 f32999a;

    C5021rg0(C5273tg0 c5273tg0) {
        Objects.requireNonNull(c5273tg0);
        this.f32999a = c5273tg0;
    }

    @Override // I0.i.a
    public final void onPostMessage(WebView webView, I0.e eVar, Uri uri, boolean z9, I0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(eVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(JsonStorageKeyNames.DATA_KEY).getString("adSessionId");
            if (string.equals("startSession")) {
                this.f32999a.f(string2);
            } else if (string.equals("finishSession")) {
                this.f32999a.g(string2);
            } else {
                AbstractC3386eg0.f28050a.getClass();
            }
        } catch (JSONException e10) {
            AbstractC3263dh0.a("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
