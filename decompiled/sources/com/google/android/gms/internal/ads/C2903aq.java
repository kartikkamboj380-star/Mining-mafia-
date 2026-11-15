package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2903aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1750Fw f26649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26650b;

    public C2903aq(InterfaceC1750Fw interfaceC1750Fw, String str) {
        this.f26649a = interfaceC1750Fw;
        this.f26650b = str;
    }

    public final void b(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put(HandleInvocationsFromAdViewer.KEY_ACTION, this.f26650b);
            InterfaceC1750Fw interfaceC1750Fw = this.f26649a;
            if (interfaceC1750Fw != null) {
                interfaceC1750Fw.p("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while dispatching error event.", e10);
        }
    }

    public final void c(String str) {
        try {
            this.f26649a.p("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void d(int i10, int i11, int i12, int i13) {
        try {
            this.f26649a.p("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while dispatching size change.", e10);
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        try {
            this.f26649a.p("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while dispatching default position.", e10);
        }
    }

    public final void f(String str) {
        try {
            this.f26649a.p("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while dispatching state change.", e10);
        }
    }

    public final void g(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.f26649a.p("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            int i15 = AbstractC0786o0.f2696b;
            L4.p.d("Error occurred while obtaining screen information.", e10);
        }
    }
}
