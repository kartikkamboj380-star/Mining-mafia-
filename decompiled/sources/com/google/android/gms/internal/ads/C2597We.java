package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2597We extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2077Me f24835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f24840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f24841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f24842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f24843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f24844m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f24845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f24846w;

    public C2597We() {
        C2077Me c2077Me = new C2077Me();
        this.f24832a = false;
        this.f24833b = false;
        this.f24835d = c2077Me;
        this.f24834c = new Object();
        this.f24837f = ((Long) AbstractC2889aj.f26607d.e()).intValue();
        this.f24838g = ((Long) AbstractC2889aj.f26604a.e()).intValue();
        this.f24839h = ((Long) AbstractC2889aj.f26608e.e()).intValue();
        this.f24840i = ((Long) AbstractC2889aj.f26606c.e()).intValue();
        this.f24841j = ((Integer) H4.B.c().d(AbstractC3892ii.f29520C0)).intValue();
        this.f24842k = ((Integer) H4.B.c().d(AbstractC3892ii.f29530D0)).intValue();
        this.f24843l = ((Integer) H4.B.c().d(AbstractC3892ii.f29540E0)).intValue();
        this.f24836e = ((Long) AbstractC2889aj.f26609f.e()).intValue();
        this.f24844m = (String) H4.B.c().d(AbstractC3892ii.f29560G0);
        this.f24845v = ((Boolean) H4.B.c().d(AbstractC3892ii.f29570H0)).booleanValue();
        this.f24846w = ((Boolean) H4.B.c().d(AbstractC3892ii.f29580I0)).booleanValue();
        ((Boolean) H4.B.c().d(AbstractC3892ii.f29590J0)).getClass();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f24834c) {
            try {
                if (this.f24832a) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.a("Content hash thread already started, quitting...");
                } else {
                    this.f24832a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b(View view) {
        try {
            C2026Le c2026Le = new C2026Le(this.f24837f, this.f24838g, this.f24839h, this.f24840i, this.f24841j, this.f24842k, this.f24843l, this.f24846w);
            Context contextE = G4.t.k().e();
            if (contextE != null) {
                String str = this.f24844m;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextE.getResources().getIdentifier((String) H4.B.c().d(AbstractC3892ii.f29550F0), "id", contextE.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            C2545Ve c2545VeC = c(view, c2026Le);
            c2026Le.i();
            if (c2545VeC.f24332a == 0 && c2545VeC.f24333b == 0) {
                return;
            }
            int i10 = c2545VeC.f24333b;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.f24835d.c(c2026Le);
            } else if (c2026Le.l() == 0) {
                return;
            }
            if (this.f24835d.a(c2026Le)) {
                return;
            }
            this.f24835d.c(c2026Le);
        } catch (Exception e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.d("Exception in fetchContentOnUIThread", e10);
            G4.t.l().j(e10, "ContentFetchTask.fetchContent");
        }
    }

    final C2545Ve c(View view, C2026Le c2026Le) {
        if (view == null) {
            return new C2545Ve(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C2545Ve(this, 0, 0);
            }
            c2026Le.g(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C2545Ve(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC1750Fw)) {
            WebView webView = (WebView) view;
            c2026Le.e();
            webView.post(new RunnableC2493Ue(this, c2026Le, webView, globalVisibleRect));
            return new C2545Ve(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C2545Ve(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            C2545Ve c2545VeC = c(viewGroup.getChildAt(i12), c2026Le);
            i10 += c2545VeC.f24332a;
            i11 += c2545VeC.f24333b;
        }
        return new C2545Ve(this, i10, i11);
    }

    final void d(C2026Le c2026Le, WebView webView, String str, boolean z9) {
        C2026Le c2026Le2;
        c2026Le.d();
        try {
            if (TextUtils.isEmpty(str)) {
                c2026Le2 = c2026Le;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f24845v || TextUtils.isEmpty(webView.getTitle())) {
                    c2026Le2 = c2026Le;
                    c2026Le2.f(strOptString, z9, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    c2026Le.f(sb.toString(), z9, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    c2026Le2 = c2026Le;
                }
            }
            if (c2026Le2.a()) {
                this.f24835d.b(c2026Le2);
            }
        } catch (JSONException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.b("Failed to get webview content.", th);
            G4.t.l().j(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.f24834c) {
            this.f24833b = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String string = sb.toString();
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a(string);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2597We.run():void");
    }
}
