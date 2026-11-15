package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3663gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4166kt0 f28752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f28753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1638Ds f28754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4966rF f28755d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28757f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C5050rv f28759h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f28758g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28756e = 0;

    public C3663gt(final Context context, Looper looper, InterfaceC1638Ds interfaceC1638Ds) {
        this.f28752a = AbstractC4670ot0.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.cs
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return AbstractC5304tw.a(context);
            }
        });
        this.f28754c = interfaceC1638Ds;
        this.f28753b = new Handler(looper);
    }

    private final void f() {
        int i10 = this.f28756e;
        if (i10 == 1 || i10 == 0 || this.f28759h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f28752a.zza();
        C5050rv c5050rv = this.f28759h;
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(c5050rv.c());
        } else {
            audioManager.abandonAudioFocus(c5050rv.b());
        }
    }

    private final void g(int i10) {
        if (this.f28756e == i10) {
            return;
        }
        this.f28756e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f28758g != f10) {
            this.f28758g = f10;
            InterfaceC1638Ds interfaceC1638Ds = this.f28754c;
            if (interfaceC1638Ds != null) {
                interfaceC1638Ds.g(f10);
            }
        }
    }

    private final void h(int i10) {
        InterfaceC1638Ds interfaceC1638Ds = this.f28754c;
        if (interfaceC1638Ds != null) {
            interfaceC1638Ds.b(i10);
        }
    }

    public final float a() {
        return this.f28758g;
    }

    public final void b(C4966rF c4966rF) {
        if (Objects.equals(this.f28755d, c4966rF)) {
            return;
        }
        this.f28755d = c4966rF;
        this.f28757f = c4966rF == null ? 0 : 1;
    }

    public final int c(boolean z9, int i10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.f28757f != 1) {
            f();
            g(0);
            return 1;
        }
        if (!z9) {
            int i11 = this.f28756e;
            if (i11 != 1) {
                return i11 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f28756e == 2) {
            return 1;
        }
        if (this.f28759h == null) {
            C1848Ht c1848Ht = new C1848Ht(1);
            C4966rF c4966rF = this.f28755d;
            c4966rF.getClass();
            c1848Ht.b(c4966rF);
            c1848Ht.a(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.Br
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i12) {
                    this.f17717a.e(i12);
                }
            }, this.f28753b);
            this.f28759h = c1848Ht.c();
        }
        AudioManager audioManager = (AudioManager) this.f28752a.zza();
        C5050rv c5050rv = this.f28759h;
        if (Build.VERSION.SDK_INT >= 26) {
            iRequestAudioFocus = audioManager.requestAudioFocus(c5050rv.c());
        } else {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerB = c5050rv.b();
            c5050rv.a();
            iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListenerB, 3, 1);
        }
        if (iRequestAudioFocus == 1) {
            g(2);
            return 1;
        }
        g(1);
        return -1;
    }

    public final void d() {
        this.f28754c = null;
        f();
        g(0);
    }

    final /* synthetic */ void e(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                g(4);
                return;
            } else {
                h(0);
                g(3);
                return;
            }
        }
        if (i10 == -1) {
            h(-1);
            f();
            g(1);
        } else if (i10 == 1) {
            g(2);
            h(1);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i10);
            YU.c("AudioFocusManager", sb.toString());
        }
    }
}
