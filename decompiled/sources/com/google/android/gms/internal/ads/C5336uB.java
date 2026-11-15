package com.google.android.gms.internal.ads;

import K4.C0759b;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5336uB implements InterfaceC2459Tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5142se f33744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f33745c;

    public C5336uB(Context context, C5142se c5142se) {
        this.f33743a = context;
        this.f33744b = c5142se;
        this.f33745c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2459Tn
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(C5714xB c5714xB) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C5394ue c5394ue = c5714xB.f34759f;
        if (c5394ue == null) {
            jSONObject = new JSONObject();
        } else {
            C5142se c5142se = this.f33744b;
            if (c5142se.c() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z9 = c5394ue.f33860a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", c5142se.b()).put("activeViewJSON", c5142se.c()).put("timestamp", c5714xB.f34757d).put("adFormat", c5142se.a()).put("hashCode", c5142se.d()).put("isMraid", false).put("isStopped", false).put("isPaused", c5714xB.f34755b).put("isNative", c5142se.e()).put("isScreenOn", this.f33745c.isInteractive()).put("appMuted", G4.t.m().d()).put("appVolume", G4.t.m().b());
            Context context = this.f33743a;
            jSONObjectPut.put("deviceVolume", C0759b.e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", c5394ue.f33861b).put("isAttachedToWindow", z9);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = c5394ue.f33862c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = c5394ue.f33863d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = c5394ue.f33864e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", c5394ue.f33865f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = c5394ue.f33866g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", c5394ue.f33867h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = c5394ue.f33868i;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", c5714xB.f34754a);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29721W1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c5394ue.f33870k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c5714xB.f34758e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
