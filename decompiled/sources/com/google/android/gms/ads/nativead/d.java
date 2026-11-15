package com.google.android.gms.ads.nativead;

import B4.l;
import H4.B;
import H4.C0654z;
import H4.F1;
import L4.p;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.InterfaceC2036Lj;
import com.google.android.gms.internal.ads.InterfaceC2139Nj;
import com.google.android.gms.internal.ads.InterfaceC3268dk;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f16905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3268dk f16906b;

    public d(Context context) {
        super(context);
        this.f16905a = f(context);
        this.f16906b = g();
    }

    private final void e(String str, View view) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            interfaceC3268dk.E4(str, com.google.android.gms.dynamic.b.N0(view));
        } catch (RemoteException e10) {
            p.d("Unable to call setAssetView on delegate", e10);
        }
    }

    private final FrameLayout f(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final InterfaceC3268dk g() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f16905a;
        return C0654z.b().e(frameLayout.getContext(), this, frameLayout);
    }

    public void a() {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            interfaceC3268dk.zze();
        } catch (RemoteException e10) {
            p.d("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f16905a);
    }

    protected final View b(String str) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk != null) {
            try {
                com.google.android.gms.dynamic.a aVarH = interfaceC3268dk.H(str);
                if (aVarH != null) {
                    return (View) com.google.android.gms.dynamic.b.h0(aVarH);
                }
            } catch (RemoteException e10) {
                p.d("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f16905a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(l lVar) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            if (lVar instanceof F1) {
                interfaceC3268dk.J3(((F1) lVar).c());
            } else if (lVar == null) {
                interfaceC3268dk.J3(null);
            } else {
                p.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            p.d("Unable to call setMediaContent on delegate", e10);
        }
    }

    final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null || scaleType == null) {
            return;
        }
        try {
            interfaceC3268dk.B5(com.google.android.gms.dynamic.b.N0(scaleType));
        } catch (RemoteException e10) {
            p.d("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk != null) {
            if (((Boolean) B.c().d(AbstractC3892ii.Yc)).booleanValue()) {
                try {
                    interfaceC3268dk.G1(com.google.android.gms.dynamic.b.N0(motionEvent));
                } catch (RemoteException e10) {
                    p.d("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        b("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return b("3005");
    }

    public final View getBodyView() {
        return b("3004");
    }

    public final View getCallToActionView() {
        return b("3002");
    }

    public final View getHeadlineView() {
        return b("3001");
    }

    public final View getIconView() {
        return b("3003");
    }

    public final View getImageView() {
        return b("3008");
    }

    public final b getMediaView() {
        View viewB = b("3010");
        if (viewB instanceof b) {
            return (b) viewB;
        }
        if (viewB == null) {
            return null;
        }
        p.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return b("3007");
    }

    public final View getStarRatingView() {
        return b("3009");
    }

    public final View getStoreView() {
        return b("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            interfaceC3268dk.q0(com.google.android.gms.dynamic.b.N0(view), i10);
        } catch (RemoteException e10) {
            p.d("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f16905a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f16905a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        e("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        e("3005", view);
    }

    public final void setBodyView(View view) {
        e("3004", view);
    }

    public final void setCallToActionView(View view) {
        e("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            interfaceC3268dk.e0(com.google.android.gms.dynamic.b.N0(view));
        } catch (RemoteException e10) {
            p.d("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        e("3001", view);
    }

    public final void setIconView(View view) {
        e("3003", view);
    }

    public final void setImageView(View view) {
        e("3008", view);
    }

    public final void setMediaView(b bVar) {
        e("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new InterfaceC2036Lj() { // from class: com.google.android.gms.ads.nativead.f
            @Override // com.google.android.gms.internal.ads.InterfaceC2036Lj
            public final /* synthetic */ void a(l lVar) {
                this.f16908a.c(lVar);
            }
        });
        bVar.b(new InterfaceC2139Nj() { // from class: com.google.android.gms.ads.nativead.e
            @Override // com.google.android.gms.internal.ads.InterfaceC2139Nj
            public final /* synthetic */ void a(ImageView.ScaleType scaleType) {
                this.f16907a.d(scaleType);
            }
        });
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        InterfaceC3268dk interfaceC3268dk = this.f16906b;
        if (interfaceC3268dk == null) {
            return;
        }
        try {
            interfaceC3268dk.W((com.google.android.gms.dynamic.a) nativeAd.n());
        } catch (RemoteException e10) {
            p.d("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        e("3007", view);
    }

    public final void setStarRatingView(View view) {
        e("3009", view);
    }

    public final void setStoreView(View view) {
        e("3006", view);
    }
}
