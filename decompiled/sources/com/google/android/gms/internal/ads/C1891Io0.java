package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1891Io0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f19651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f19652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f19653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2978bQ0 f19654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5043rr0 f19655e;

    C1891Io0(Context context, SharedPreferences sharedPreferences, InterfaceC2978bQ0 interfaceC2978bQ0, C5043rr0 c5043rr0) {
        this.f19653c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        AbstractC5025ri0.d(dir, false);
        this.f19651a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        AbstractC5025ri0.d(dir2, true);
        this.f19652b = dir2;
        this.f19654d = interfaceC2978bQ0;
        this.f19655e = c5043rr0;
    }

    private final File d() {
        File file = new File(this.f19651a, Integer.toString(((EnumC2647Xd) this.f19654d.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        int iZza = ((EnumC2647Xd) this.f19654d.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String f() {
        int iZza = ((EnumC2647Xd) this.f19654d.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    public final boolean a(C2456Tl0 c2456Tl0, byte[] bArr, byte[] bArr2) {
        boolean z9;
        String strD0 = c2456Tl0.d0().d0();
        if (!TextUtils.isEmpty(strD0) && bArr2.length != 0) {
            File file = this.f19652b;
            AbstractC5025ri0.e(file);
            file.mkdirs();
            File fileC = AbstractC5025ri0.c(strD0, file);
            fileC.getClass();
            fileC.mkdirs();
            File fileA = AbstractC5025ri0.a(strD0, "pcam.jar", file);
            fileA.getClass();
            if (bArr == null || bArr.length <= 0 || AbstractC5025ri0.b(fileA, bArr)) {
                File fileA2 = AbstractC5025ri0.a(strD0, "pcbc", file);
                fileA2.getClass();
                if (AbstractC5025ri0.b(fileA2, bArr2)) {
                    String strD1 = c2456Tl0.d0().d0();
                    if (TextUtils.isEmpty(strD1)) {
                        z9 = false;
                    } else {
                        File fileA3 = AbstractC5025ri0.a(strD1, "pcam.jar", file);
                        fileA3.getClass();
                        File fileA4 = AbstractC5025ri0.a(strD1, "pcbc", file);
                        fileA4.getClass();
                        File fileA5 = AbstractC5025ri0.a(strD1, "pcam.jar", d());
                        fileA5.getClass();
                        File fileA6 = AbstractC5025ri0.a(strD1, "pcbc", d());
                        fileA6.getClass();
                        if (fileA3.exists() && !fileA3.renameTo(fileA5)) {
                            this.f19655e.b(15318);
                        } else if (fileA4.exists() && fileA4.renameTo(fileA6)) {
                            C2456Tl0 c2456Tl0C = c(1);
                            SharedPreferences.Editor editorEdit = this.f19653c.edit();
                            if (c2456Tl0C != null && !c2456Tl0.d0().d0().equals(c2456Tl0C.d0().d0())) {
                                editorEdit.putString(e(), Hex.bytesToStringLowercase(c2456Tl0C.i()));
                            }
                            editorEdit.putString(f(), Hex.bytesToStringLowercase(c2456Tl0.i()));
                            if (editorEdit.commit()) {
                                z9 = true;
                            } else {
                                this.f19655e.b(15320);
                            }
                        } else {
                            this.f19655e.b(15319);
                        }
                        z9 = false;
                    }
                    HashSet hashSet = new HashSet();
                    C2456Tl0 c2456Tl0C2 = c(1);
                    if (c2456Tl0C2 != null) {
                        hashSet.add(c2456Tl0C2.d0().d0());
                    }
                    C2456Tl0 c2456Tl0C3 = c(2);
                    if (c2456Tl0C3 != null) {
                        hashSet.add(c2456Tl0C3.d0().d0());
                    }
                    File[] fileArrListFiles = d().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileC2 = AbstractC5025ri0.c(name, d());
                                fileC2.getClass();
                                AbstractC5025ri0.e(fileC2);
                            }
                        }
                    }
                    return z9;
                }
            }
        }
        this.f19655e.b(15316);
        return false;
    }

    public final C4774pi0 b(int i10) {
        C2456Tl0 c2456Tl0C = c(1);
        if (c2456Tl0C == null) {
            this.f19655e.b(15315);
            return null;
        }
        String strD0 = c2456Tl0C.d0().d0();
        File fileA = AbstractC5025ri0.a(strD0, "pcam.jar", d());
        fileA.getClass();
        if (!fileA.exists()) {
            fileA = AbstractC5025ri0.a(strD0, "pcam", d());
            fileA.getClass();
        }
        File fileA2 = AbstractC5025ri0.a(strD0, "pcopt", d());
        fileA2.getClass();
        File fileA3 = AbstractC5025ri0.a(strD0, "pcbc", d());
        fileA3.getClass();
        return new C4774pi0(c2456Tl0C.d0(), fileA, fileA3, fileA2);
    }

    public final C2456Tl0 c(int i10) {
        String string = i10 == 1 ? this.f19653c.getString(f(), null) : this.f19653c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
            C2456Tl0 c2456Tl0G0 = C2456Tl0.g0(AbstractC5231tL0.w(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strD0 = c2456Tl0G0.d0().d0();
            File fileA = AbstractC5025ri0.a(strD0, "pcam.jar", d());
            if (fileA == null) {
                throw null;
            }
            if (!fileA.exists() && (fileA = AbstractC5025ri0.a(strD0, "pcam", d())) == null) {
                throw null;
            }
            File fileA2 = AbstractC5025ri0.a(strD0, "pcbc", d());
            if (fileA2 == null) {
                throw null;
            }
            if (fileA.exists() && fileA2.exists()) {
                return c2456Tl0G0;
            }
            return null;
        } catch (C3598gM0 unused) {
            this.f19655e.b(15317);
        }
    }
}
