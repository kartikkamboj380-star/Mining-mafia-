package com.bytedance.sdk.component.adexpress.csi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.dgq.rhi;
import com.bytedance.sdk.component.kq.fax;
import com.bytedance.sdk.component.utils.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static final byte[] csi = new byte[0];
    private static volatile csi dgq = null;
    private static int rhi = 10;
    private static int syt = 10;
    private final AtomicBoolean rjo = new AtomicBoolean(false);
    private List<rhi> kq = new ArrayList();
    private List<rhi> oq = new ArrayList();
    private Map<Integer, bob> bob = new HashMap();
    private Map<Integer, fou> fou = new HashMap();

    private csi() {
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        if (bobVarBob != null) {
            rhi = bobVarBob.nn();
            syt = bobVarBob.ubx();
        }
    }

    public static csi kq() {
        if (dgq == null) {
            synchronized (csi.class) {
                try {
                    if (dgq == null) {
                        dgq = new csi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dgq;
    }

    private void rhi(rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        if (ha.oq(rhiVar.getScene())) {
            ha.kq(rhiVar);
            return;
        }
        if (this.kq.size() >= rhi) {
            try {
                Context context = rhiVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                rhiVar.mxq();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.kq.contains(rhiVar)) {
            return;
        }
        try {
            Context context2 = rhiVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                rhiVar.setRecycler(true);
                this.kq.add(rhiVar);
                bob();
            }
        } catch (Throwable th2) {
            bob();
            th2.getMessage();
        }
    }

    public void bob(rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        ha.oq(rhiVar);
        rhiVar.b_("SDK_INJECT_GLOBAL");
        csi(rhiVar);
        rhi(rhiVar);
    }

    public void csi(rhi rhiVar) {
        WebView webView;
        if (rhiVar == null || (webView = rhiVar.getWebView()) == null) {
            return;
        }
        bob bobVar = this.bob.get(Integer.valueOf(webView.hashCode()));
        if (bobVar != null) {
            bobVar.kq(null);
        }
        rhiVar.b_("SDK_INJECT_GLOBAL");
    }

    public boolean fou(rhi rhiVar) {
        if (rhiVar == null) {
            return false;
        }
        try {
            Context context = rhiVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            rhiVar.mxq();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void oq(rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        ha.oq(rhiVar);
        rhiVar.b_("SDK_INJECT_GLOBAL");
        csi(rhiVar);
        kq(rhiVar);
    }

    public int bob() {
        return this.kq.size();
    }

    public rhi oq(Context context, String str) {
        rhi.bob bobVar = rhi.bob.ADS;
        if (ha.oq(bobVar)) {
            if (!com.bytedance.sdk.component.adexpress.fou.csi.kq(str) || ha.kq(bobVar) > 1) {
                return ha.kq(context, null, 0, bobVar);
            }
            return null;
        }
        if (bob() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.fou.csi.kq(str) && bob() <= 1) {
            bob();
            return null;
        }
        rhi rhiVarRemove = this.kq.remove(0);
        if (rhiVarRemove == null) {
            return null;
        }
        try {
            Context context2 = rhiVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                rhiVarRemove.setRecycler(false);
                bob();
            }
            return rhiVarRemove;
        } catch (Throwable unused) {
            bob();
            return null;
        }
    }

    public int fou() {
        return this.oq.size();
    }

    public rhi kq(Context context, String str) {
        rhi.bob bobVar = rhi.bob.ADS_V3;
        if (ha.oq(bobVar)) {
            if (!com.bytedance.sdk.component.adexpress.fou.csi.kq(str) || ha.kq(bobVar) > 1) {
                return ha.kq(context, null, 0, bobVar);
            }
            return null;
        }
        if (fou() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.fou.csi.kq(str) && fou() <= 1) {
            fou();
            return null;
        }
        rhi rhiVarRemove = this.oq.remove(0);
        if (rhiVarRemove == null) {
            return null;
        }
        try {
            Context context2 = rhiVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                rhiVarRemove.setRecycler(false);
                fou();
            }
            return rhiVarRemove;
        } catch (Throwable unused) {
            fou();
            return null;
        }
    }

    public void oq() {
        for (rhi rhiVar : this.kq) {
            if (rhiVar != null) {
                try {
                    Context context = rhiVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    rhiVar.mxq();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.kq.clear();
        for (rhi rhiVar2 : this.oq) {
            if (rhiVar2 != null) {
                try {
                    Context context2 = rhiVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    rhiVar2.mxq();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.oq.clear();
    }

    public void kq(rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        if (ha.oq(rhiVar.getScene())) {
            ha.kq(rhiVar);
            return;
        }
        if (this.oq.size() >= syt) {
            try {
                Context context = rhiVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                rhiVar.mxq();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.oq.contains(rhiVar)) {
            return;
        }
        try {
            Context context2 = rhiVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                rhiVar.setRecycler(true);
                this.oq.add(rhiVar);
                fou();
            }
        } catch (Throwable th2) {
            fou();
            th2.getMessage();
        }
    }

    public void oq(int i10) {
        synchronized (csi) {
            syt = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void kq(rhi rhiVar, oq oqVar) {
        WebView webView;
        if (rhiVar == null || oqVar == null || (webView = rhiVar.getWebView()) == null) {
            return;
        }
        bob bobVar = this.bob.get(Integer.valueOf(webView.hashCode()));
        if (bobVar != null) {
            bobVar.kq(oqVar);
        } else {
            bobVar = new bob(oqVar);
            this.bob.put(Integer.valueOf(webView.hashCode()), bobVar);
        }
        rhiVar.kq(bobVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void kq(WebView webView, fax faxVar, String str) {
        if (webView == null || faxVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        fou fouVar = this.fou.get(Integer.valueOf(webView.hashCode()));
        if (fouVar != null) {
            fouVar.kq(faxVar);
        } else {
            fouVar = new fou(faxVar);
            this.fou.put(Integer.valueOf(webView.hashCode()), fouVar);
        }
        webView.addJavascriptInterface(fouVar, str);
    }

    public void kq(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        fou fouVar = this.fou.get(Integer.valueOf(webView.hashCode()));
        if (fouVar != null) {
            fouVar.kq(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void kq(int i10) {
        synchronized (csi) {
            rhi = i10;
        }
    }
}
