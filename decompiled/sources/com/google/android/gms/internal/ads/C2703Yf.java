package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2703Yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3260dg f25658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1772Gh f25659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25660c;

    private C2703Yf() {
        this.f25659b = C1824Hh.y0();
        this.f25660c = false;
        this.f25658a = new C3260dg();
    }

    public static C2703Yf a() {
        return new C2703Yf();
    }

    private final synchronized void d(int i10) {
        C1772Gh c1772Gh = this.f25659b;
        c1772Gh.B();
        c1772Gh.A(K4.F0.X());
        C3134cg c3134cg = new C3134cg(this.f25658a, ((C1824Hh) c1772Gh.w()).i(), null);
        int i11 = i10 - 1;
        c3134cg.b(i11);
        c3134cg.a();
        AbstractC0786o0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    private final synchronized void e(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(AbstractC2035Li0.a().a(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(f(i10).getBytes());
            } catch (IOException unused) {
                AbstractC0786o0.k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    AbstractC0786o0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            AbstractC0786o0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized String f(int i10) {
        C1772Gh c1772Gh;
        c1772Gh = this.f25659b;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", c1772Gh.K(), Long.valueOf(G4.t.o().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(((C1824Hh) c1772Gh.w()).i(), 3));
    }

    public final synchronized void b(InterfaceC2651Xf interfaceC2651Xf) {
        if (this.f25660c) {
            try {
                interfaceC2651Xf.a(this.f25659b);
            } catch (NullPointerException e10) {
                G4.t.l().j(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i10) {
        if (this.f25660c) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29810e6)).booleanValue()) {
                e(i10);
            } else {
                d(i10);
            }
        }
    }

    public C2703Yf(C3260dg c3260dg) {
        this.f25659b = C1824Hh.y0();
        this.f25658a = c3260dg;
        this.f25660c = ((Boolean) H4.B.c().d(AbstractC3892ii.f29799d6)).booleanValue();
    }
}
