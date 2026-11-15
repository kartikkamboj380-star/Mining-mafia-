package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5273tg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5525vg0 f33453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f33454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5527vh0 f33455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f33456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1927Jg0 f33457e;

    private C5273tg0(C5525vg0 c5525vg0, WebView webView, boolean z9) {
        HashMap map = new HashMap();
        this.f33456d = map;
        this.f33457e = new C1927Jg0();
        AbstractC3640gh0.a();
        this.f33453a = c5525vg0;
        this.f33454b = webView;
        if (c() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC3764hg0) it.next()).b(webView);
            }
            this.f33455c = new C5527vh0(webView);
        }
        if (!I0.j.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        e();
        I0.i.b(this.f33454b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C5021rg0(this));
    }

    public static C5273tg0 a(C5525vg0 c5525vg0, WebView webView, boolean z9) {
        return new C5273tg0(c5525vg0, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e() {
        I0.i.l(this.f33454b, "omidJsSessionService");
    }

    public final void b(InterfaceC5147sg0 interfaceC5147sg0) {
        Iterator it = this.f33456d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3764hg0) it.next()).c();
        }
        Timer timer = new Timer();
        timer.schedule(new C4896qg0(this, interfaceC5147sg0, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final View c() {
        C5527vh0 c5527vh0 = this.f33455c;
        if (c5527vh0 == null) {
            return null;
        }
        return (View) c5527vh0.get();
    }

    public final void d(View view, EnumC4644og0 enumC4644og0, String str) {
        Iterator it = this.f33456d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3764hg0) it.next()).d(view, enumC4644og0, "Ad overlay");
        }
        this.f33457e.b(view, enumC4644og0, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(String str) {
        EnumC4392mg0 enumC4392mg0 = EnumC4392mg0.DEFINED_BY_JAVASCRIPT;
        EnumC4770pg0 enumC4770pg0 = EnumC4770pg0.DEFINED_BY_JAVASCRIPT;
        EnumC5399ug0 enumC5399ug0 = EnumC5399ug0.JAVASCRIPT;
        C4266lg0 c4266lg0 = new C4266lg0(C3889ig0.a(enumC4392mg0, enumC4770pg0, enumC5399ug0, enumC5399ug0, false), C4014jg0.a(this.f33453a, this.f33454b, null, null), str);
        this.f33456d.put(str, c4266lg0);
        c4266lg0.b(c());
        for (C1875Ig0 c1875Ig0 : this.f33457e.a()) {
            c4266lg0.d((View) c1875Ig0.a().get(), c1875Ig0.c(), c1875Ig0.d());
        }
        c4266lg0.a();
    }

    final /* synthetic */ void g(String str) {
        HashMap map = this.f33456d;
        AbstractC3764hg0 abstractC3764hg0 = (AbstractC3764hg0) map.get(str);
        if (abstractC3764hg0 != null) {
            abstractC3764hg0.c();
            map.remove(str);
        }
    }
}
