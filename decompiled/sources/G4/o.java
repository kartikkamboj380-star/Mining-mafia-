package G4;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC3127cc0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class o extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f975a;

    o(s sVar) {
        Objects.requireNonNull(sVar);
        this.f975a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.f975a;
        if (sVar.E6() != null) {
            try {
                sVar.E6().j0(AbstractC3127cc0.d(1, null, null));
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.i("#007 Could not call remote method.", e10);
            }
        }
        s sVar2 = this.f975a;
        if (sVar2.E6() != null) {
            try {
                sVar2.E6().G(0);
            } catch (RemoteException e11) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.i("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        s sVar = this.f975a;
        if (str.startsWith(sVar.B6())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (sVar.E6() != null) {
                try {
                    sVar.E6().j0(AbstractC3127cc0.d(3, null, null));
                } catch (RemoteException e10) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e10);
                }
            }
            s sVar2 = this.f975a;
            if (sVar2.E6() != null) {
                try {
                    sVar2.E6().G(3);
                } catch (RemoteException e11) {
                    int i11 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e11);
                }
            }
            this.f975a.z6(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f975a;
            if (sVar3.E6() != null) {
                try {
                    sVar3.E6().j0(AbstractC3127cc0.d(1, null, null));
                } catch (RemoteException e12) {
                    int i12 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e12);
                }
            }
            s sVar4 = this.f975a;
            if (sVar4.E6() != null) {
                try {
                    sVar4.E6().G(0);
                } catch (RemoteException e13) {
                    int i13 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e13);
                }
            }
            this.f975a.z6(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f975a;
            if (sVar5.E6() != null) {
                try {
                    sVar5.E6().b();
                } catch (RemoteException e14) {
                    int i14 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e14);
                }
            }
            s sVar6 = this.f975a;
            sVar6.z6(sVar6.y6(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar7 = this.f975a;
        if (sVar7.E6() != null) {
            try {
                sVar7.E6().c();
                sVar7.E6().zze();
            } catch (RemoteException e15) {
                int i15 = AbstractC0786o0.f2696b;
                L4.p.i("#007 Could not call remote method.", e15);
            }
        }
        this.f975a.C6(str);
        return true;
    }
}
