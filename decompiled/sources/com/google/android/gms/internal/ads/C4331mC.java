package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4331mC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4459nD f31458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f31459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3628gb0 f31460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1750Fw f31461d;

    public C4331mC(View view, InterfaceC1750Fw interfaceC1750Fw, InterfaceC4459nD interfaceC4459nD, C3628gb0 c3628gb0) {
        this.f31459b = view;
        this.f31461d = interfaceC1750Fw;
        this.f31458a = interfaceC4459nD;
        this.f31460c = c3628gb0;
    }

    public final InterfaceC1750Fw a() {
        return this.f31461d;
    }

    public final View b() {
        return this.f31459b;
    }

    public final InterfaceC4459nD c() {
        return this.f31458a;
    }

    public final C3628gb0 d() {
        return this.f31460c;
    }

    public MG e(Set set) {
        return new MG(set);
    }
}
