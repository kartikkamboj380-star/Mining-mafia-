package com.google.android.gms.internal.ads;

import H4.C0654z;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2687Xx implements InterfaceC4509nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5911yk0 f25409b;

    C2687Xx(Context context, L4.a aVar) {
        this.f25408a = context;
        int iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f30016x3)).intValue();
        int i10 = 2;
        if (iIntValue != 1) {
            i10 = (iIntValue == 2 || iIntValue != 3) ? 3 : 4;
        }
        C2454Tk0 c2454Tk0H0 = C2506Uk0.h0();
        c2454Tk0H0.A(((Float) H4.B.c().d(AbstractC3892ii.f29543E3)).floatValue());
        C2506Uk0 c2506Uk0 = (C2506Uk0) c2454Tk0H0.w();
        C2558Vk0 c2558Vk0K0 = C2610Wk0.k0();
        c2558Vk0K0.A(((Boolean) H4.B.c().d(AbstractC3892ii.f29553F3)).booleanValue());
        c2558Vk0K0.B(((Long) H4.B.c().d(AbstractC3892ii.f29573H3)).longValue());
        C2610Wk0 c2610Wk0 = (C2610Wk0) c2558Vk0K0.w();
        C1519Bk0 c1519Bk0C0 = C1571Ck0.C0();
        c1519Bk0C0.I(i10);
        c1519Bk0C0.B(aVar.f3097a);
        c1519Bk0C0.A(((Boolean) H4.B.c().d(AbstractC3892ii.f29774b3)).booleanValue());
        c1519Bk0C0.H(((Integer) H4.B.c().d(AbstractC3892ii.f29983u3)).intValue() == -1);
        c1519Bk0C0.G(((Integer) H4.B.c().d(AbstractC3892ii.f30005w3)).intValue());
        c1519Bk0C0.E(((Long) H4.B.c().d(AbstractC3892ii.f29563G3)).longValue());
        c1519Bk0C0.D(((Integer) H4.B.c().d(AbstractC3892ii.f29994v3)).intValue());
        c1519Bk0C0.C(c2506Uk0);
        c1519Bk0C0.F(c2610Wk0);
        C5911yk0 c5911yk0A = C5911yk0.a(context, AbstractC2315Qt.f22473a, (C1571Ck0) c1519Bk0C0.w());
        this.f25409b = c5911yk0A;
        c5911yk0A.b();
    }

    public final String a() {
        int iH = this.f25409b.h() - 1;
        if (iH == 1) {
            return "1.0";
        }
        if (iH != 2) {
            return iH != 3 ? "uns" : "3.0";
        }
        return "2.0";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void c(int i10, int i11, int i12) {
        C0654z.a();
        Context context = this.f25408a;
        float fC = L4.g.c(context, i10);
        C0654z.a();
        float fC2 = L4.g.c(context, i11);
        C5911yk0 c5911yk0 = this.f25409b;
        long j10 = i12;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j10, 0, fC, fC2, 0);
        c5911yk0.g(motionEventObtain);
        motionEventObtain.recycle();
        C0654z.a();
        float fC3 = L4.g.c(context, i10);
        C0654z.a();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j10, 2, fC3, L4.g.c(context, i11), 0);
        c5911yk0.g(motionEventObtain2);
        motionEventObtain2.recycle();
        C0654z.a();
        float fC4 = L4.g.c(context, i10);
        C0654z.a();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j10, 1, fC4, L4.g.c(context, i11), 0);
        c5911yk0.g(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String d(Context context) {
        return this.f25409b.c(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String e(Context context) {
        return this.f25409b.c(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String f(Context context, String str, View view) {
        return this.f25409b.e(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void g(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f25409b.g(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String h(Context context, String str, View view, Activity activity) {
        return this.f25409b.e(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void i(StackTraceElement[] stackTraceElementArr) {
        this.f25409b.f(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void j(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String k(Context context, View view, Activity activity) {
        return this.f25409b.d(context, null, view, activity);
    }
}
