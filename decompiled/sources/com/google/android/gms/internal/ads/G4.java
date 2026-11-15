package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class G4 implements InterfaceC4940r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G4 f18905b = new G4(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G4 f18906c = new G4(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18907a;

    private G4(boolean z9) {
        this.f18907a = z9;
    }

    public final String toString() {
        boolean z9 = !this.f18907a;
        StringBuilder sb = new StringBuilder(String.valueOf(z9).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }
}
