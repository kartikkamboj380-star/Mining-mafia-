package com.google.android.gms.ads.nativead;

import B4.l;
import L4.p;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.InterfaceC2036Lj;
import com.google.android.gms.internal.ads.InterfaceC2139Nj;
import com.google.android.gms.internal.ads.InterfaceC5154sk;

/* JADX INFO: loaded from: classes2.dex */
public class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f16881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2036Lj f16883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f16884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC2139Nj f16886f;

    public b(Context context) {
        super(context);
    }

    protected final synchronized void a(InterfaceC2036Lj interfaceC2036Lj) {
        this.f16883c = interfaceC2036Lj;
        if (this.f16882b) {
            interfaceC2036Lj.a(this.f16881a);
        }
    }

    protected final synchronized void b(InterfaceC2139Nj interfaceC2139Nj) {
        this.f16886f = interfaceC2139Nj;
        if (this.f16885e) {
            interfaceC2139Nj.a(this.f16884d);
        }
    }

    public l getMediaContent() {
        return this.f16881a;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f16885e = true;
        this.f16884d = scaleType;
        InterfaceC2139Nj interfaceC2139Nj = this.f16886f;
        if (interfaceC2139Nj != null) {
            interfaceC2139Nj.a(scaleType);
        }
    }

    public void setMediaContent(l lVar) {
        boolean zX0;
        this.f16882b = true;
        this.f16881a = lVar;
        InterfaceC2036Lj interfaceC2036Lj = this.f16883c;
        if (interfaceC2036Lj != null) {
            interfaceC2036Lj.a(lVar);
        }
        if (lVar == null) {
            return;
        }
        try {
            InterfaceC5154sk interfaceC5154skZzb = lVar.zzb();
            if (interfaceC5154skZzb != null) {
                if (!lVar.a()) {
                    if (lVar.zza()) {
                        zX0 = interfaceC5154skZzb.x0(com.google.android.gms.dynamic.b.N0(this));
                    }
                    removeAllViews();
                }
                zX0 = interfaceC5154skZzb.R(com.google.android.gms.dynamic.b.N0(this));
                if (zX0) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            p.d("", e10);
        }
    }
}
