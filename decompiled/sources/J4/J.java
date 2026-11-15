package J4;

import K4.AbstractC0786o0;
import android.content.Context;
import android.text.TextUtils;
import app.notifee.core.event.LogEvent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.ads.AbstractC1845Hr0;
import com.google.android.gms.internal.ads.AbstractC1897Ir0;
import com.google.android.gms.internal.ads.AbstractC2001Kr0;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3410es0;
import com.google.android.gms.internal.ads.AbstractC3662gs0;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3913is0;
import com.google.android.gms.internal.ads.AbstractC4038js0;
import com.google.android.gms.internal.ads.AbstractC5801xs0;
import com.google.android.gms.internal.ads.InterfaceC1750Fw;
import com.google.android.gms.internal.ads.InterfaceC1949Jr0;
import com.google.android.gms.internal.ads.InterfaceC3788hs0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC3788hs0 f2266f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1750Fw f2263c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2265e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2261a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1949Jr0 f2264d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2262b = null;

    private final void l() {
        if (this.f2266f == null) {
            this.f2266f = new H(this);
        }
    }

    private final AbstractC4038js0 m() {
        AbstractC3913is0 abstractC3913is0C = AbstractC4038js0.c();
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.Wc)).booleanValue() || TextUtils.isEmpty(this.f2262b)) {
            String str = this.f2261a;
            if (str != null) {
                abstractC3913is0C.a(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC3913is0C.b(this.f2262b);
        }
        return abstractC3913is0C.c();
    }

    public final synchronized void a(InterfaceC1750Fw interfaceC1750Fw, Context context) {
        this.f2263c = interfaceC1750Fw;
        if (!b(context)) {
            g("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put(HandleInvocationsFromAdViewer.KEY_ACTION, "fetch_completed");
        i("on_play_store_bind", map);
    }

    public final synchronized boolean b(Context context) {
        if (!AbstractC5801xs0.a(context)) {
            return false;
        }
        try {
            this.f2264d = AbstractC2001Kr0.a(context);
        } catch (NullPointerException e10) {
            AbstractC0786o0.k("Error connecting LMD Overlay service");
            G4.t.l().j(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f2264d == null) {
            this.f2265e = false;
            return false;
        }
        l();
        this.f2265e = true;
        return true;
    }

    public final void c(InterfaceC1750Fw interfaceC1750Fw, AbstractC3410es0 abstractC3410es0) {
        if (interfaceC1750Fw == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.f2263c = interfaceC1750Fw;
        if (!this.f2265e && !b(interfaceC1750Fw.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Wc)).booleanValue()) {
            this.f2262b = abstractC3410es0.b();
        }
        l();
        InterfaceC1949Jr0 interfaceC1949Jr0 = this.f2264d;
        if (interfaceC1949Jr0 != null) {
            interfaceC1949Jr0.c(abstractC3410es0, this.f2266f);
        }
    }

    public final void d() {
        InterfaceC1949Jr0 interfaceC1949Jr0;
        if (!this.f2265e || (interfaceC1949Jr0 = this.f2264d) == null) {
            AbstractC0786o0.k("LastMileDelivery not connected");
        } else {
            interfaceC1949Jr0.a(m(), this.f2266f);
            h("onLMDOverlayExpand");
        }
    }

    public final void e() {
        InterfaceC1949Jr0 interfaceC1949Jr0;
        if (!this.f2265e || (interfaceC1949Jr0 = this.f2264d) == null) {
            AbstractC0786o0.k("LastMileDelivery not connected");
        } else {
            interfaceC1949Jr0.b(m(), this.f2266f);
            h("onLMDOverlayCollapse");
        }
    }

    public final void f() {
        InterfaceC1949Jr0 interfaceC1949Jr0;
        if (!this.f2265e || (interfaceC1949Jr0 = this.f2264d) == null) {
            AbstractC0786o0.k("LastMileDelivery not connected");
            return;
        }
        AbstractC1845Hr0 abstractC1845Hr0C = AbstractC1897Ir0.c();
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.Wc)).booleanValue() || TextUtils.isEmpty(this.f2262b)) {
            String str = this.f2261a;
            if (str != null) {
                abstractC1845Hr0C.a(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC1845Hr0C.b(this.f2262b);
        }
        interfaceC1949Jr0.d(abstractC1845Hr0C.c(), this.f2266f);
    }

    final void g(String str, String str2) {
        AbstractC0786o0.k(str);
        if (this.f2263c != null) {
            HashMap map = new HashMap();
            map.put(PglCryptUtils.KEY_MESSAGE, str);
            map.put(HandleInvocationsFromAdViewer.KEY_ACTION, str2);
            i("onError", map);
        }
    }

    final void h(String str) {
        i(str, new HashMap());
    }

    final void i(final String str, final Map map) {
        AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: J4.I
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f2258a.k(str, map);
            }
        });
    }

    final void j(AbstractC3662gs0 abstractC3662gs0) {
        if (!TextUtils.isEmpty(abstractC3662gs0.b())) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.Wc)).booleanValue()) {
                this.f2261a = abstractC3662gs0.b();
            }
        }
        switch (abstractC3662gs0.a()) {
            case 8152:
                h("onLMDOverlayOpened");
                break;
            case 8153:
                h("onLMDOverlayClicked");
                break;
            case 8155:
                h("onLMDOverlayClose");
                break;
            case 8157:
                this.f2261a = null;
                this.f2262b = null;
                this.f2265e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(LogEvent.LEVEL_ERROR, String.valueOf(abstractC3662gs0.a()));
                i("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    final /* synthetic */ void k(String str, Map map) {
        InterfaceC1750Fw interfaceC1750Fw = this.f2263c;
        if (interfaceC1750Fw != null) {
            interfaceC1750Fw.b(str, map);
        }
    }
}
