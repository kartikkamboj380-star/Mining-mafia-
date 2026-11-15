package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4014jg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5525vg0 f30526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f30527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30528c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f30529d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EnumC4140kg0 f30532g;

    private C4014jg0(C5525vg0 c5525vg0, WebView webView, String str, List list, String str2, String str3, EnumC4140kg0 enumC4140kg0) {
        this.f30526a = c5525vg0;
        this.f30527b = webView;
        this.f30532g = enumC4140kg0;
        this.f30531f = str2;
        this.f30530e = str3;
    }

    public static C4014jg0 a(C5525vg0 c5525vg0, WebView webView, String str, String str2) {
        if (str2 != null) {
            AbstractC3640gh0.d(str2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, "CustomReferenceData is greater than 256 characters");
        }
        return new C4014jg0(c5525vg0, webView, null, null, str, str2, EnumC4140kg0.HTML);
    }

    public static C4014jg0 b(C5525vg0 c5525vg0, WebView webView, String str, String str2) {
        AbstractC3640gh0.d("", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, "CustomReferenceData is greater than 256 characters");
        return new C4014jg0(c5525vg0, webView, null, null, str, "", EnumC4140kg0.JAVASCRIPT);
    }

    public final C5525vg0 c() {
        return this.f30526a;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f30528c);
    }

    public final Map e() {
        return Collections.unmodifiableMap(this.f30529d);
    }

    public final WebView f() {
        return this.f30527b;
    }

    public final String g() {
        return this.f30531f;
    }

    public final String h() {
        return this.f30530e;
    }

    public final EnumC4140kg0 i() {
        return this.f30532g;
    }
}
