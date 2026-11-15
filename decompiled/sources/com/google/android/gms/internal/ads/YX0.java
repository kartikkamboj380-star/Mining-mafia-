package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class YX0 implements InterfaceC1899Is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ YX0 f25630a = new YX0();

    private /* synthetic */ YX0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
    public final /* synthetic */ Object apply(Object obj) {
        MZ0 mz0 = (MZ0) obj;
        int i10 = JY0.f19899P;
        String str = mz0.f20864a;
        String str2 = mz0.f20865b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }
}
